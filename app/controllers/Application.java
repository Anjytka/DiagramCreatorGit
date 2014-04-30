package controllers;

import static play.data.Form.form;

import javax.activation.DataSource;

import models.userModel;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;
import play.api.data.*;
import play.api.data.Forms.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("",form(userModel.class)));
    }
    
    public static Result authorizedIndex(String login) {
    	return ok(index.render(login, form(userModel.class)));
    }
    
    public static Result submit(int step) {
    	if (step == 1) {
			return saveUser();
		} else {
			return authorizeUser();
		}
    }
    
    
    public static Result saveUser() {
    	Form<userModel> loginForm = form(userModel.class).bindFromRequest();
    	if(loginForm.hasErrors()) {
            return badRequest(about.render("ERROR"));
        } else {
        	loginForm.get().save();
            session("email", loginForm.get().email);
            return redirect(
                routes.Application.authorizedIndex(loginForm.get().login)
            );
        }
    }
    
    public static Result authorizeUser() {
    	Form<userModel> loginForm = form(userModel.class).bindFromRequest();
    	if(loginForm.hasErrors()) {
            return badRequest(about.render("ERROR"));
        } else {
        	int userCount = userModel.find.where().like("login",loginForm.get().login)
        										  .findRowCount();
            if (userCount > 0) {
	        	return redirect(
	                routes.Application.authorizedIndex(loginForm.get().login)
	            );	
            } else {
            	return badRequest(about.render("ERROR"));
            }
        }
    }

}
	
package controllers;

import static play.data.Form.form;
import models.userModel;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;
import play.api.data.*;
import play.api.data.Forms.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render(form(userModel.class)));
    }
    
    public static Result saveUser() {
    	Form<userModel> loginForm = form(userModel.class).bindFromRequest();
    	if(loginForm.hasErrors()) {
            return badRequest(about.render("ERROR"));
        } else {
        	loginForm.get().save();
            session("email", loginForm.get().email);
            return redirect(
                routes.Application.index()
            );
        }
    }

}
	
package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.Formats;
import play.data.validation.*;

public class userModel extends Model {
	
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String login;
    
    @Constraints.Email
    public String email;
    
    @Constraints.MinLength(8)
    public String password;
    
    /**
     * Generic query helper for entity Company with id Long
     */
    public static Model.Finder<Long,userModel> find = new Model.Finder<Long,userModel>(Long.class, userModel.class);

    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(userModel c: userModel.find.orderBy("login").findList()) {
            options.put(c.id.toString(), c.email);
        }
        return options;
    }
}

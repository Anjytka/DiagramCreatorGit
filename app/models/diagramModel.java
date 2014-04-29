package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.Formats;
import play.data.validation.*;

public class diagramModel extends Model {
	
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @ManyToOne
    public userModel user;
    
    @Constraints.Required
    public String name;
    
    @Constraints.Required
    public String type;

}

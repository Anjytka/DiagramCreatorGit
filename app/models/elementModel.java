package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.Formats;
import play.data.validation.*;

public class elementModel extends Model {

	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @ManyToOne
    public diagramModel diagram;
    
    @Constraints.Required
    public String type;
    
    @Constraints.Required
    public String text;
	
}

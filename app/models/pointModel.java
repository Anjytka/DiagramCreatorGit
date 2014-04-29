package models;

import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.Formats;
import play.data.validation.*;

public class pointModel extends Model {
	
	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @ManyToOne
    public elementModel element;
    
    @Constraints.Required
    public int coordX;
    
    @Constraints.Required
    public int coordY;

}
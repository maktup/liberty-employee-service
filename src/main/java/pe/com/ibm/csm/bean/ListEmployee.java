package pe.com.ibm.csm.bean;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
 * Employee
 * @author cguerra
 **/
 @Schema( name = "ListEmployee", description = "POJO que representa una lista de la entidad Empleado." )
 @XmlRootElement( name = "ListEmployee" ) 
 public class ListEmployee{   

	    @Schema( required = true )
	    @XmlElement  
	    private List<Employee> listEmployees;
	
	    public List<Employee> getListEmployees(){
		 	   return listEmployees;
	    }
	
	    public void setListEmployees( List<Employee> listEmployees ){
		       this.listEmployees = listEmployees;
	    }
		 
 }

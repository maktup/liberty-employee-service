package pe.com.ibm.csm.service;

import javax.ws.rs.core.Response;

/**
 * EmployeeService
 * @author cguerra
 **/
 public interface EmployeeService{
        
	    public Response getEmpleados();
	    public Response getEmpleadosPorId( String idParam );	   
	   
 }

 
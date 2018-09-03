package book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Book")
public class Book {

	@GET
	@Produces(MediaType.TEXT_XML)  //taking smthing frm client
	public String sayHelloXML(){
		String response="<?xml version='1.0'>" +
	                      "<hello>Hello XML </hello>"  ;
		return response;
	}
	// This method is called if HTML is requested  
	
	@GET  
	  @Produces(MediaType.TEXT_HTML)  
	  public String sayHtmlHello() {  
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
	        + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";  
	  }  
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)  //taking smthing frm client 
	public String sayHelloJSON(){
		String response=null;
		return response;
	}
}

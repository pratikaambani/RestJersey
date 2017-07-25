package com.javatpoint.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/p")
	public String sayPlainTextHello() {

		System.out.println("URL = http://localhost:8080/restfuljersey/rest/hello");
		return "Hello Plain Pratik";
	}

	// This method is called if XML is request
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("/x")
	public String sayXMLHello() {
		System.out.println("Inside xml");
		return "<?xml verson=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	}

	// This method is called if HTML is request
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/h")
	public String sayHtmlHello() {
		System.out.println("Inside HTML");
		return "<html> " + "<title>" + "Hello Jersey" + "</title>" + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>"
				+ "</html> ";
	}

	/*
	 * @GET
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public String sayJSONHello() {
	 * return "{Hi}"; }
	 */
}
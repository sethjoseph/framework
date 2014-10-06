package com.wet.api.examples.tester.jersey.webapp;

import java.util.List;
import java.util.Map.Entry;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(@Context UriInfo ui) {
    	
    	MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
        MultivaluedMap<String, String> pathParams = ui.getPathParameters();
        

        System.out.println("Query Params:");
		for (Entry<String, List<String>> entry : queryParams.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		System.out.println("Path Params:");
		for (Entry<String, List<String>> entry : pathParams.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}


    	
        return "Got it!";
    }
    
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void postIt(String message)
    {
    	System.out.println("Message is: " + message);
    }
}

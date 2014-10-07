package com.wet.api.examples.simple.rest.resources;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wet.api.examples.simple.model.BankThing;
import com.wet.api.examples.simple.service.api.BankThingService;

/**
 * Root resource (exposed at "bank-things" path)
 */
@Named
@Path("/bank-things")
public class BankThingResource 
{
	@Inject
    private BankThingService bankThingService;
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public BankThing getOne(@PathParam("id") String id) 
    {
    	System.out.println("Id: " + id);
    	return bankThingService.findBankThing(id);
    }
}
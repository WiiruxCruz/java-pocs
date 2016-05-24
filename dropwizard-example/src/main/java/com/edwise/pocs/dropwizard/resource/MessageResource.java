package com.edwise.pocs.dropwizard.resource;

import com.edwise.pocs.dropwizard.model.Message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

    @GET
    public Message sayHello(@QueryParam("name") String name) {
        return new Message(String.format("Hello world %s!", name != null ? name : "Nobody"));
    }
}

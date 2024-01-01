package dev.livraria.pessoa;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.*;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class recursosPessoa {

    @GET
    @Produces(MediaType.TEXT_PLAIN)

    public String hello() {
        return "hello world";
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void create(String message){
        System.out.println("Created");
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String update(String message){
        System.out.println("Update");
        return message;
    }

    @DELETE
    public void delete(){
        System.out.println("Delete");
    }

}
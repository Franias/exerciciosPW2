package dev.ifrs.web.user;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import dev.ifrs.interfaceadapters.user.controller.UserControllerInterface;
import dev.ifrs.model.User;

@Path("/user")
public class WS {
    @Inject
    UserControllerInterface userController;

    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public User save(@FormParam("name") String name, @FormParam("password") String password){ //objeto pra apresentar dados DTO entrega o UserDTO exclusivamente para apresentar dados
        try{
        return userController.save(name, password);
        }catch(Exception e){
            throw new WebApplicationException(Status.BAD_REQUEST);
        }
    }
    
}

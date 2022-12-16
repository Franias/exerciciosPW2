package dev.rpmhub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:8070/serviceb")
public interface RemoteInterface {

    @GET
    @Path("/person/{nome}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("nome") String nome);
    
}

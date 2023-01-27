package quarkiverse.pokedex.client.runtime.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import quarkiverse.pokedex.client.runtime.models.berries.Berry;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@RegisterRestClient(configKey="pokemon-api")
@Path("/api/v2")
public interface PokeRestClientBlocking {
    @GET
    @Path("/berry/{id}")
    Berry getBerryById(@PathParam("id") Integer id);
}

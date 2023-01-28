package quarkiverse.pokedex.client.runtime.rest;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import quarkiverse.pokedex.client.runtime.models.berries.Berry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@RegisterRestClient(configKey="pokemon-api")
@Path("/api/v2")
public interface PokeRestClientReactive{

    @GET
    @Path("/berry/{id}")
    Uni<Berry> getBerryById(@PathParam("id") Integer id);
}

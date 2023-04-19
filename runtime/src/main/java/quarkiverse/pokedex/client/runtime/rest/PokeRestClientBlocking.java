package quarkiverse.pokedex.client.runtime.rest;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import quarkiverse.pokedex.client.runtime.models.berries.Berry;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@RegisterRestClient(configKey="pokemon-api")
@Path("/api/v2")
public interface PokeRestClientBlocking {
    @GET
    @Path("/berry/{id}")
    Berry getBerryById(@PathParam("id") Integer id);
}

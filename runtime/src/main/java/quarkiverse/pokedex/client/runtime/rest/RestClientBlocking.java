package quarkiverse.pokedex.client.runtime.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Path;

@Path("/berries")
@RegisterRestClient
public interface RestClientBlocking {
}

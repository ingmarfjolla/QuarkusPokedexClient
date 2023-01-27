package quarkiverse.pokedex.client.runtime;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import quarkiverse.pokedex.client.runtime.models.berries.Berry;
import quarkiverse.pokedex.client.runtime.rest.PokeRestClientBlocking;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PokeClient {
    @RestClient
    PokeRestClientBlocking pokeRestClientBlocking;

    public Berry getBerryById(Integer id){
        return pokeRestClientBlocking.getBerryById(id);
    }
}

package quarkiverse.pokedex.client.runtime;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import quarkiverse.pokedex.client.runtime.models.berries.Berry;
import quarkiverse.pokedex.client.runtime.rest.PokeRestClientReactive;

public class ReactivePokeClient {
    @RestClient
    PokeRestClientReactive pokeRestClientReactive;
    public Uni<Berry> getBerryById(Integer id){
        return pokeRestClientReactive.getBerryById(id);
    }
}

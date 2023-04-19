package quarkiverse.pokedex.client.runtime;

import io.quarkus.cache.CacheResult;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import quarkiverse.pokedex.client.runtime.models.berries.Berry;
import quarkiverse.pokedex.client.runtime.rest.PokeRestClientBlocking;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.net.URI;

@ApplicationScoped
public class PokeClient {
//    private final PokeRestClientBlocking pokeRestClientBlocking;

    @RestClient
    PokeRestClientBlocking pokeRestClientBlocking;


//    public PokeClient(){
//        pokeRestClientBlocking = RestClientBuilder.newBuilder()
//                .baseUri(URI.create("https://pokeapi.co"))
//                .build(PokeRestClientBlocking.class);
//    }

    @CacheResult(cacheName = "rest-client-cache")
    public Berry getBerryById(Integer id){
        return pokeRestClientBlocking.getBerryById(id);
    }
}

package quarkiverse.pokedex.client.runtime;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import quarkiverse.pokedex.client.runtime.models.berries.Berry;
import quarkiverse.pokedex.client.runtime.rest.PokeRestClientBlocking;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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

    public Berry getBerryById(Integer id){
        return pokeRestClientBlocking.getBerryById(id);
    }
}

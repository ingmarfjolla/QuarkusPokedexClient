package quarkiverse.pokedex.client.runtime;

import quarkiverse.pokedex.client.runtime.graphql.GraqphQLClient;
import quarkiverse.pokedex.client.runtime.models.berries.Berry;

import javax.inject.Inject;

public class PokeClientGraphQL {
    @Inject
    GraqphQLClient graqphQLClient;

    public Berry getBerries(){
        return graqphQLClient.allBerries();
    }
}

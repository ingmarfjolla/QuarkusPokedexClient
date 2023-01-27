package quarkiverse.pokedex.client.runtime.graphql;
import io.smallrye.graphql.client.typesafe.api.GraphQLClientApi;
import org.eclipse.microprofile.graphql.Query;
import quarkiverse.pokedex.client.runtime.models.berries.Berry;

@GraphQLClientApi(configKey = "pokemon-api")
public interface GraqphQLClient {

    @Query(value="pokemon_v2_berry")
    Berry allBerries();
}

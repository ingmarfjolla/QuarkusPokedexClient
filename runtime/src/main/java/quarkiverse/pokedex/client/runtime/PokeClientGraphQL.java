package quarkiverse.pokedex.client.runtime;

import io.quarkus.logging.Log;
import io.smallrye.graphql.client.GraphQLClient;
import io.smallrye.graphql.client.Response;
import io.smallrye.graphql.client.core.Document;
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClient;

import jakarta.inject.Inject;
import jakarta.json.JsonObject;

import java.util.concurrent.ExecutionException;

import static io.smallrye.graphql.client.core.Argument.arg;
import static io.smallrye.graphql.client.core.Argument.args;
import static io.smallrye.graphql.client.core.Document.document;
import static io.smallrye.graphql.client.core.Field.field;
import static io.smallrye.graphql.client.core.InputObject.inputObject;
import static io.smallrye.graphql.client.core.InputObjectField.prop;
import static io.smallrye.graphql.client.core.Operation.operation;

public class PokeClientGraphQL {
    @Inject
    @GraphQLClient("pokemon-api")
    DynamicGraphQLClient pokeGraqphQLClient;

    public JsonObject getBerries() throws Exception{
        Document query = document(
            operation(
                    field("pokemon_v2_berry",
                            field("id"),
                            field("item_id"),
                            field("max_harvest"),
                            field("natural_gift_power"),
                            field("natural_gift_type_id"),
                            field("growth_time"),
                            field("berry_firmness_id"))
            )
        );
        Response response = pokeGraqphQLClient.executeSync(query);
        return response.getData();
        //return response.getList(Berry.class,"pokemon_v2_berry");
    }

    public JsonObject getBerryById(Integer id) throws ExecutionException, InterruptedException {
        Document query = document(
                operation(
                        field("pokemon_v2_berry",
                                args(arg("where",
//                        inputObject(prop("id", prop("_eq", 10))))),
                                        inputObject(prop("id", inputObject(prop("_eq", 1)))))),
                                field("id"),
                                field("item_id"),
                                field("max_harvest"),
                                field("natural_gift_power"),
                                field("natural_gift_type_id"),
                                field("growth_time"),
                                field("berry_firmness_id"))
                )
        );
        Response response = pokeGraqphQLClient.executeSync(query);
        Log.info(query);
        Log.info(response);
        return response.getData();
    }
}

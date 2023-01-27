package quarkiverse.pokedex.client.deployment;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import quarkiverse.pokedex.client.runtime.PokeClient;
import quarkiverse.pokedex.client.runtime.PokeClientGraphQL;
import quarkiverse.pokedex.client.runtime.graphql.GraqphQLClient;
import quarkiverse.pokedex.client.runtime.rest.PokeRestClientBlocking;

class PokedexClientProcessor {

    private static final String FEATURE = "pokedex-client";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    public void produceClasses(BuildProducer<AdditionalBeanBuildItem> additionalBeanProducer){
        additionalBeanProducer.produce(AdditionalBeanBuildItem.unremovableOf(PokeClient.class));
        additionalBeanProducer.produce(AdditionalBeanBuildItem.unremovableOf(PokeRestClientBlocking.class));
        additionalBeanProducer.produce(AdditionalBeanBuildItem.unremovableOf(PokeClientGraphQL.class));
        additionalBeanProducer.produce(AdditionalBeanBuildItem.unremovableOf(GraqphQLClient.class));
    }
}

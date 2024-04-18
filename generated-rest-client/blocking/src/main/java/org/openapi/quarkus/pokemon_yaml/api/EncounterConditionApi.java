package org.openapi.quarkus.pokemon_yaml.api;

import org.openapi.quarkus.pokemon_yaml.model.EncounterConditionDetail;
import org.openapi.quarkus.pokemon_yaml.model.PaginatedEncounterConditionSummaryList;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.openapi.quarkus.pokemon_yaml.api.auth.CompositeAuthenticationProvider;
import org.openapi.quarkus.pokemon_yaml.api.auth.AuthenticationPropagationHeadersFactory;

import jakarta.ws.rs.*;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkiverse.openapi.generator.annotations.GeneratedClass;
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;
import io.quarkiverse.openapi.generator.annotations.GeneratedParam;

/**
  * Pokémon API
  * <p>All the Pokémon data you'll ever need in one place,easily accessible through a modern free open-source RESTful API.</p>
  */
@Path("/api/v2/encounter-condition")
@RegisterRestClient( configKey= "org/openapi/quarkus/pokemon_yaml")
@GeneratedClass(value="pokemon.yaml", tag = "EncounterCondition")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface EncounterConditionApi {

     /**
     * Mixin to allow association with separate serializers for list or detail view.
     *
     * @param limit Number of results to return per page.
     * @param offset The initial index from which to return the results.
     */
    @GET
    @Produces({"application/json"})
    @GeneratedMethod ("encounter_condition_list")
    public PaginatedEncounterConditionSummaryList encounterConditionList(
        @GeneratedParam("limit") @QueryParam("limit") Integer limit
, @GeneratedParam("offset") @QueryParam("offset") Integer offset

    );

     /**
     * Mixin to allow association with separate serializers for list or detail view.
     *
     * @param id This parameter can be a string or an integer.
     */
    @GET
    @Path("/{id}/")
    @Produces({"application/json"})
    @GeneratedMethod ("encounter_condition_retrieve")
    public EncounterConditionDetail encounterConditionRetrieve(
        @GeneratedParam("id") @PathParam("id") String id

    );

}

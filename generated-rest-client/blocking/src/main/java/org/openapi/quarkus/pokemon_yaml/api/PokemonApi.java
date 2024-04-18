package org.openapi.quarkus.pokemon_yaml.api;

import org.openapi.quarkus.pokemon_yaml.model.PaginatedPokemonSummaryList;
import org.openapi.quarkus.pokemon_yaml.model.PokemonDetail;
import org.openapi.quarkus.pokemon_yaml.model.PokemonEncountersRetrieve200ResponseInner;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.openapi.quarkus.pokemon_yaml.api.auth.CompositeAuthenticationProvider;
import org.openapi.quarkus.pokemon_yaml.api.auth.AuthenticationPropagationHeadersFactory;

import java.util.List;

import jakarta.ws.rs.*;

import jakarta.enterprise.context.ApplicationScoped;

import io.quarkiverse.openapi.generator.annotations.GeneratedClass;
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod;
import io.quarkiverse.openapi.generator.annotations.GeneratedParam;

/**
  * Pokémon API
  * <p>All the Pokémon data you'll ever need in one place,easily accessible through a modern free open-source RESTful API.</p>
  */
@Path("/api/v2/pokemon")
@RegisterRestClient( configKey= "org/openapi/quarkus/pokemon_yaml")
@GeneratedClass(value="pokemon.yaml", tag = "Pokemon")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface PokemonApi {

     /**
     * Handles Pokemon Encounters as a sub-resource.
     *
     * @param pokemonId 
     */
    @GET
    @Path("/{pokemon_id}/encounters")
    @Produces({"application/json"})
    @GeneratedMethod ("pokemon_encounters_retrieve")
    public List<PokemonEncountersRetrieve200ResponseInner> pokemonEncountersRetrieve(
        @GeneratedParam("pokemon_id") @PathParam("pokemon_id") String pokemonId

    );

     /**
     * Mixin to allow association with separate serializers for list or detail view.
     *
     * @param limit Number of results to return per page.
     * @param offset The initial index from which to return the results.
     */
    @GET
    @Produces({"application/json"})
    @GeneratedMethod ("pokemon_list")
    public PaginatedPokemonSummaryList pokemonList(
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
    @GeneratedMethod ("pokemon_retrieve")
    public PokemonDetail pokemonRetrieve(
        @GeneratedParam("id") @PathParam("id") String id

    );

}

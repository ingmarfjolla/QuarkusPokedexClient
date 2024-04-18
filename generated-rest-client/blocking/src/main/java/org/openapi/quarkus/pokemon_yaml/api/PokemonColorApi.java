package org.openapi.quarkus.pokemon_yaml.api;

import org.openapi.quarkus.pokemon_yaml.model.PaginatedPokemonColorSummaryList;
import org.openapi.quarkus.pokemon_yaml.model.PokemonColorDetail;
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
@Path("/api/v2/pokemon-color")
@RegisterRestClient( configKey= "org/openapi/quarkus/pokemon_yaml")
@GeneratedClass(value="pokemon.yaml", tag = "PokemonColor")
@RegisterProvider(CompositeAuthenticationProvider.class)
@RegisterClientHeaders(AuthenticationPropagationHeadersFactory.class)
@ApplicationScoped
public interface PokemonColorApi {

     /**
     * Mixin to allow association with separate serializers for list or detail view.
     *
     * @param limit Number of results to return per page.
     * @param offset The initial index from which to return the results.
     */
    @GET
    @Produces({"application/json"})
    @GeneratedMethod ("pokemon_color_list")
    public PaginatedPokemonColorSummaryList pokemonColorList(
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
    @GeneratedMethod ("pokemon_color_retrieve")
    public PokemonColorDetail pokemonColorRetrieve(
        @GeneratedParam("id") @PathParam("id") String id

    );

}

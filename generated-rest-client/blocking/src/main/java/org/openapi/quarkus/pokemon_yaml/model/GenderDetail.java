package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GenderDetail  {

    private Integer id;
    private String name;
    private List<GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails = new ArrayList<>();
    private List<PokemonSpeciesSummary> requiredForEvolution = new ArrayList<>();

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }


    /**
    * Get name
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public GenderDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get pokemonSpeciesDetails
    * @return pokemonSpeciesDetails
    **/
    @JsonProperty("pokemon_species_details")
    public List<GenderDetailPokemonSpeciesDetailsInner> getPokemonSpeciesDetails() {
        return pokemonSpeciesDetails;
    }


    /**
    * Get requiredForEvolution
    * @return requiredForEvolution
    **/
    @JsonProperty("required_for_evolution")
    public List<PokemonSpeciesSummary> getRequiredForEvolution() {
        return requiredForEvolution;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenderDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pokemonSpeciesDetails: ").append(toIndentedString(pokemonSpeciesDetails)).append("\n");
        sb.append("    requiredForEvolution: ").append(toIndentedString(requiredForEvolution)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GenderDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("pokemonSpeciesDetails")
        private List<GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails = null;
        @jakarta.ws.rs.QueryParam("requiredForEvolution")
        private List<PokemonSpeciesSummary> requiredForEvolution = null;

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }


        /**
        * Get name
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public GenderDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get pokemonSpeciesDetails
        * @return pokemonSpeciesDetails
        **/
        @JsonProperty("pokemon_species_details")
        public List<GenderDetailPokemonSpeciesDetailsInner> getPokemonSpeciesDetails() {
            return pokemonSpeciesDetails;
        }


        /**
        * Get requiredForEvolution
        * @return requiredForEvolution
        **/
        @JsonProperty("required_for_evolution")
        public List<PokemonSpeciesSummary> getRequiredForEvolution() {
            return requiredForEvolution;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GenderDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    pokemonSpeciesDetails: ").append(toIndentedString(pokemonSpeciesDetails)).append("\n");
            sb.append("    requiredForEvolution: ").append(toIndentedString(requiredForEvolution)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }
}
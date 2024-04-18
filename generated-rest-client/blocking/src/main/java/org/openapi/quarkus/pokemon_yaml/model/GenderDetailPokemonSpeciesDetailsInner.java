package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GenderDetailPokemonSpeciesDetailsInner  {

    private Integer rate;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies;

    /**
    * Get rate
    * @return rate
    **/
    @JsonProperty("rate")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRate() {
        return rate;
    }

    /**
     * Set rate
     **/
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public GenderDetailPokemonSpeciesDetailsInner rate(Integer rate) {
        this.rate = rate;
        return this;
    }

    /**
    * Get pokemonSpecies
    * @return pokemonSpecies
    **/
    @JsonProperty("pokemon_species")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getPokemonSpecies() {
        return pokemonSpecies;
    }

    /**
     * Set pokemonSpecies
     **/
    public void setPokemonSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    public GenderDetailPokemonSpeciesDetailsInner pokemonSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenderDetailPokemonSpeciesDetailsInner {\n");

        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
        
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
    public static class GenderDetailPokemonSpeciesDetailsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("rate")
        private Integer rate;
        @jakarta.ws.rs.QueryParam("pokemonSpecies")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies;

        /**
        * Get rate
        * @return rate
        **/
        @JsonProperty("rate")
        public Integer getRate() {
            return rate;
        }

        /**
         * Set rate
         **/
        public void setRate(Integer rate) {
            this.rate = rate;
        }

        public GenderDetailPokemonSpeciesDetailsInnerQueryParam rate(Integer rate) {
            this.rate = rate;
            return this;
        }

        /**
        * Get pokemonSpecies
        * @return pokemonSpecies
        **/
        @JsonProperty("pokemon_species")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getPokemonSpecies() {
            return pokemonSpecies;
        }

        /**
         * Set pokemonSpecies
         **/
        public void setPokemonSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies) {
            this.pokemonSpecies = pokemonSpecies;
        }

        public GenderDetailPokemonSpeciesDetailsInnerQueryParam pokemonSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies) {
            this.pokemonSpecies = pokemonSpecies;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GenderDetailPokemonSpeciesDetailsInnerQueryParam {\n");

            sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
            sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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
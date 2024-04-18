package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PalParkAreaDetailPokemonEncountersInner  {

    private Integer baseScore;
    private Integer rate;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies;

    /**
    * Get baseScore
    * @return baseScore
    **/
    @JsonProperty("base_score")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getBaseScore() {
        return baseScore;
    }

    /**
     * Set baseScore
     **/
    public void setBaseScore(Integer baseScore) {
        this.baseScore = baseScore;
    }

    public PalParkAreaDetailPokemonEncountersInner baseScore(Integer baseScore) {
        this.baseScore = baseScore;
        return this;
    }

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

    public PalParkAreaDetailPokemonEncountersInner rate(Integer rate) {
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

    public PalParkAreaDetailPokemonEncountersInner pokemonSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PalParkAreaDetailPokemonEncountersInner {\n");

        sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
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
    public static class PalParkAreaDetailPokemonEncountersInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("baseScore")
        private Integer baseScore;
        @jakarta.ws.rs.QueryParam("rate")
        private Integer rate;
        @jakarta.ws.rs.QueryParam("pokemonSpecies")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies;

        /**
        * Get baseScore
        * @return baseScore
        **/
        @JsonProperty("base_score")
        public Integer getBaseScore() {
            return baseScore;
        }

        /**
         * Set baseScore
         **/
        public void setBaseScore(Integer baseScore) {
            this.baseScore = baseScore;
        }

        public PalParkAreaDetailPokemonEncountersInnerQueryParam baseScore(Integer baseScore) {
            this.baseScore = baseScore;
            return this;
        }

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

        public PalParkAreaDetailPokemonEncountersInnerQueryParam rate(Integer rate) {
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

        public PalParkAreaDetailPokemonEncountersInnerQueryParam pokemonSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies) {
            this.pokemonSpecies = pokemonSpecies;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PalParkAreaDetailPokemonEncountersInnerQueryParam {\n");

            sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
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
package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NatureDetailPokeathlonStatChangesInner  {

    private Integer maxChange;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea pokeathlonStat;

    /**
    * Get maxChange
    * @return maxChange
    **/
    @JsonProperty("max_change")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMaxChange() {
        return maxChange;
    }

    /**
     * Set maxChange
     **/
    public void setMaxChange(Integer maxChange) {
        this.maxChange = maxChange;
    }

    public NatureDetailPokeathlonStatChangesInner maxChange(Integer maxChange) {
        this.maxChange = maxChange;
        return this;
    }

    /**
    * Get pokeathlonStat
    * @return pokeathlonStat
    **/
    @JsonProperty("pokeathlon_stat")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getPokeathlonStat() {
        return pokeathlonStat;
    }

    /**
     * Set pokeathlonStat
     **/
    public void setPokeathlonStat(PokemonEncountersRetrieve200ResponseInnerLocationArea pokeathlonStat) {
        this.pokeathlonStat = pokeathlonStat;
    }

    public NatureDetailPokeathlonStatChangesInner pokeathlonStat(PokemonEncountersRetrieve200ResponseInnerLocationArea pokeathlonStat) {
        this.pokeathlonStat = pokeathlonStat;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NatureDetailPokeathlonStatChangesInner {\n");

        sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
        sb.append("    pokeathlonStat: ").append(toIndentedString(pokeathlonStat)).append("\n");
        
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
    public static class NatureDetailPokeathlonStatChangesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("maxChange")
        private Integer maxChange;
        @jakarta.ws.rs.QueryParam("pokeathlonStat")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea pokeathlonStat;

        /**
        * Get maxChange
        * @return maxChange
        **/
        @JsonProperty("max_change")
        public Integer getMaxChange() {
            return maxChange;
        }

        /**
         * Set maxChange
         **/
        public void setMaxChange(Integer maxChange) {
            this.maxChange = maxChange;
        }

        public NatureDetailPokeathlonStatChangesInnerQueryParam maxChange(Integer maxChange) {
            this.maxChange = maxChange;
            return this;
        }

        /**
        * Get pokeathlonStat
        * @return pokeathlonStat
        **/
        @JsonProperty("pokeathlon_stat")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getPokeathlonStat() {
            return pokeathlonStat;
        }

        /**
         * Set pokeathlonStat
         **/
        public void setPokeathlonStat(PokemonEncountersRetrieve200ResponseInnerLocationArea pokeathlonStat) {
            this.pokeathlonStat = pokeathlonStat;
        }

        public NatureDetailPokeathlonStatChangesInnerQueryParam pokeathlonStat(PokemonEncountersRetrieve200ResponseInnerLocationArea pokeathlonStat) {
            this.pokeathlonStat = pokeathlonStat;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NatureDetailPokeathlonStatChangesInnerQueryParam {\n");

            sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
            sb.append("    pokeathlonStat: ").append(toIndentedString(pokeathlonStat)).append("\n");
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
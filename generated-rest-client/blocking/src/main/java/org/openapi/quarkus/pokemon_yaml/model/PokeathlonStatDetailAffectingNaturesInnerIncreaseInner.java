package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokeathlonStatDetailAffectingNaturesInnerIncreaseInner  {

    private Integer maxChange;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea nature;

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

    public PokeathlonStatDetailAffectingNaturesInnerIncreaseInner maxChange(Integer maxChange) {
        this.maxChange = maxChange;
        return this;
    }

    /**
    * Get nature
    * @return nature
    **/
    @JsonProperty("nature")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getNature() {
        return nature;
    }

    /**
     * Set nature
     **/
    public void setNature(PokemonEncountersRetrieve200ResponseInnerLocationArea nature) {
        this.nature = nature;
    }

    public PokeathlonStatDetailAffectingNaturesInnerIncreaseInner nature(PokemonEncountersRetrieve200ResponseInnerLocationArea nature) {
        this.nature = nature;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokeathlonStatDetailAffectingNaturesInnerIncreaseInner {\n");

        sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
        sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
        
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
    public static class PokeathlonStatDetailAffectingNaturesInnerIncreaseInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("maxChange")
        private Integer maxChange;
        @jakarta.ws.rs.QueryParam("nature")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea nature;

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

        public PokeathlonStatDetailAffectingNaturesInnerIncreaseInnerQueryParam maxChange(Integer maxChange) {
            this.maxChange = maxChange;
            return this;
        }

        /**
        * Get nature
        * @return nature
        **/
        @JsonProperty("nature")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getNature() {
            return nature;
        }

        /**
         * Set nature
         **/
        public void setNature(PokemonEncountersRetrieve200ResponseInnerLocationArea nature) {
            this.nature = nature;
        }

        public PokeathlonStatDetailAffectingNaturesInnerIncreaseInnerQueryParam nature(PokemonEncountersRetrieve200ResponseInnerLocationArea nature) {
            this.nature = nature;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokeathlonStatDetailAffectingNaturesInnerIncreaseInnerQueryParam {\n");

            sb.append("    maxChange: ").append(toIndentedString(maxChange)).append("\n");
            sb.append("    nature: ").append(toIndentedString(nature)).append("\n");
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
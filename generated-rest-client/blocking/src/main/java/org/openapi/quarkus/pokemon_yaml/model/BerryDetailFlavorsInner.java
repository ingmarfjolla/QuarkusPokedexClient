package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BerryDetailFlavorsInner  {

    private Integer potency;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea flavor;

    /**
    * Get potency
    * @return potency
    **/
    @JsonProperty("potency")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPotency() {
        return potency;
    }

    /**
     * Set potency
     **/
    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public BerryDetailFlavorsInner potency(Integer potency) {
        this.potency = potency;
        return this;
    }

    /**
    * Get flavor
    * @return flavor
    **/
    @JsonProperty("flavor")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getFlavor() {
        return flavor;
    }

    /**
     * Set flavor
     **/
    public void setFlavor(PokemonEncountersRetrieve200ResponseInnerLocationArea flavor) {
        this.flavor = flavor;
    }

    public BerryDetailFlavorsInner flavor(PokemonEncountersRetrieve200ResponseInnerLocationArea flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BerryDetailFlavorsInner {\n");

        sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        
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
    public static class BerryDetailFlavorsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("potency")
        private Integer potency;
        @jakarta.ws.rs.QueryParam("flavor")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea flavor;

        /**
        * Get potency
        * @return potency
        **/
        @JsonProperty("potency")
        public Integer getPotency() {
            return potency;
        }

        /**
         * Set potency
         **/
        public void setPotency(Integer potency) {
            this.potency = potency;
        }

        public BerryDetailFlavorsInnerQueryParam potency(Integer potency) {
            this.potency = potency;
            return this;
        }

        /**
        * Get flavor
        * @return flavor
        **/
        @JsonProperty("flavor")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getFlavor() {
            return flavor;
        }

        /**
         * Set flavor
         **/
        public void setFlavor(PokemonEncountersRetrieve200ResponseInnerLocationArea flavor) {
            this.flavor = flavor;
        }

        public BerryDetailFlavorsInnerQueryParam flavor(PokemonEncountersRetrieve200ResponseInnerLocationArea flavor) {
            this.flavor = flavor;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BerryDetailFlavorsInnerQueryParam {\n");

            sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
            sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
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
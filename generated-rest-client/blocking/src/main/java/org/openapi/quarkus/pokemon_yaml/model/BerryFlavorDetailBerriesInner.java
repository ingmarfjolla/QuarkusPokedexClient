package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BerryFlavorDetailBerriesInner  {

    private Integer potency;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea berry;

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

    public BerryFlavorDetailBerriesInner potency(Integer potency) {
        this.potency = potency;
        return this;
    }

    /**
    * Get berry
    * @return berry
    **/
    @JsonProperty("berry")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getBerry() {
        return berry;
    }

    /**
     * Set berry
     **/
    public void setBerry(PokemonEncountersRetrieve200ResponseInnerLocationArea berry) {
        this.berry = berry;
    }

    public BerryFlavorDetailBerriesInner berry(PokemonEncountersRetrieve200ResponseInnerLocationArea berry) {
        this.berry = berry;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BerryFlavorDetailBerriesInner {\n");

        sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
        sb.append("    berry: ").append(toIndentedString(berry)).append("\n");
        
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
    public static class BerryFlavorDetailBerriesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("potency")
        private Integer potency;
        @jakarta.ws.rs.QueryParam("berry")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea berry;

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

        public BerryFlavorDetailBerriesInnerQueryParam potency(Integer potency) {
            this.potency = potency;
            return this;
        }

        /**
        * Get berry
        * @return berry
        **/
        @JsonProperty("berry")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getBerry() {
            return berry;
        }

        /**
         * Set berry
         **/
        public void setBerry(PokemonEncountersRetrieve200ResponseInnerLocationArea berry) {
            this.berry = berry;
        }

        public BerryFlavorDetailBerriesInnerQueryParam berry(PokemonEncountersRetrieve200ResponseInnerLocationArea berry) {
            this.berry = berry;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BerryFlavorDetailBerriesInnerQueryParam {\n");

            sb.append("    potency: ").append(toIndentedString(potency)).append("\n");
            sb.append("    berry: ").append(toIndentedString(berry)).append("\n");
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
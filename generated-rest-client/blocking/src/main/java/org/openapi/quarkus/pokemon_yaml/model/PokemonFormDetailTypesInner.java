package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonFormDetailTypesInner  {

    private String slot;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea type;

    /**
    * Get slot
    * @return slot
    **/
    @JsonProperty("slot")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getSlot() {
        return slot;
    }

    /**
     * Set slot
     **/
    public void setSlot(String slot) {
        this.slot = slot;
    }

    public PokemonFormDetailTypesInner slot(String slot) {
        this.slot = slot;
        return this;
    }

    /**
    * Get type
    * @return type
    **/
    @JsonProperty("type")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(PokemonEncountersRetrieve200ResponseInnerLocationArea type) {
        this.type = type;
    }

    public PokemonFormDetailTypesInner type(PokemonEncountersRetrieve200ResponseInnerLocationArea type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonFormDetailTypesInner {\n");

        sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        
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
    public static class PokemonFormDetailTypesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("slot")
        private String slot;
        @jakarta.ws.rs.QueryParam("type")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea type;

        /**
        * Get slot
        * @return slot
        **/
        @JsonProperty("slot")
        public String getSlot() {
            return slot;
        }

        /**
         * Set slot
         **/
        public void setSlot(String slot) {
            this.slot = slot;
        }

        public PokemonFormDetailTypesInnerQueryParam slot(String slot) {
            this.slot = slot;
            return this;
        }

        /**
        * Get type
        * @return type
        **/
        @JsonProperty("type")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(PokemonEncountersRetrieve200ResponseInnerLocationArea type) {
            this.type = type;
        }

        public PokemonFormDetailTypesInnerQueryParam type(PokemonEncountersRetrieve200ResponseInnerLocationArea type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonFormDetailTypesInnerQueryParam {\n");

            sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
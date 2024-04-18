package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetailAbilitiesInner  {

    private Boolean isHidden;
    private Integer slot;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea ability;

    /**
    * Get isHidden
    * @return isHidden
    **/
    @JsonProperty("is_hidden")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * Set isHidden
     **/
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public PokemonDetailAbilitiesInner isHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    /**
    * Get slot
    * @return slot
    **/
    @JsonProperty("slot")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getSlot() {
        return slot;
    }

    /**
     * Set slot
     **/
    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public PokemonDetailAbilitiesInner slot(Integer slot) {
        this.slot = slot;
        return this;
    }

    /**
    * Get ability
    * @return ability
    **/
    @JsonProperty("ability")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getAbility() {
        return ability;
    }

    /**
     * Set ability
     **/
    public void setAbility(PokemonEncountersRetrieve200ResponseInnerLocationArea ability) {
        this.ability = ability;
    }

    public PokemonDetailAbilitiesInner ability(PokemonEncountersRetrieve200ResponseInnerLocationArea ability) {
        this.ability = ability;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailAbilitiesInner {\n");

        sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
        sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
        sb.append("    ability: ").append(toIndentedString(ability)).append("\n");
        
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
    public static class PokemonDetailAbilitiesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("isHidden")
        private Boolean isHidden;
        @jakarta.ws.rs.QueryParam("slot")
        private Integer slot;
        @jakarta.ws.rs.QueryParam("ability")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea ability;

        /**
        * Get isHidden
        * @return isHidden
        **/
        @JsonProperty("is_hidden")
        public Boolean getIsHidden() {
            return isHidden;
        }

        /**
         * Set isHidden
         **/
        public void setIsHidden(Boolean isHidden) {
            this.isHidden = isHidden;
        }

        public PokemonDetailAbilitiesInnerQueryParam isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            return this;
        }

        /**
        * Get slot
        * @return slot
        **/
        @JsonProperty("slot")
        public Integer getSlot() {
            return slot;
        }

        /**
         * Set slot
         **/
        public void setSlot(Integer slot) {
            this.slot = slot;
        }

        public PokemonDetailAbilitiesInnerQueryParam slot(Integer slot) {
            this.slot = slot;
            return this;
        }

        /**
        * Get ability
        * @return ability
        **/
        @JsonProperty("ability")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getAbility() {
            return ability;
        }

        /**
         * Set ability
         **/
        public void setAbility(PokemonEncountersRetrieve200ResponseInnerLocationArea ability) {
            this.ability = ability;
        }

        public PokemonDetailAbilitiesInnerQueryParam ability(PokemonEncountersRetrieve200ResponseInnerLocationArea ability) {
            this.ability = ability;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonDetailAbilitiesInnerQueryParam {\n");

            sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
            sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
            sb.append("    ability: ").append(toIndentedString(ability)).append("\n");
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
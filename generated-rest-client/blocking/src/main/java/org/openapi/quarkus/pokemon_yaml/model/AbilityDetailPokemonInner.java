package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbilityDetailPokemonInner  {

    private Boolean isHidden;
    private Integer slot;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon;

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

    public AbilityDetailPokemonInner isHidden(Boolean isHidden) {
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

    public AbilityDetailPokemonInner slot(Integer slot) {
        this.slot = slot;
        return this;
    }

    /**
    * Get pokemon
    * @return pokemon
    **/
    @JsonProperty("pokemon")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getPokemon() {
        return pokemon;
    }

    /**
     * Set pokemon
     **/
    public void setPokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
        this.pokemon = pokemon;
    }

    public AbilityDetailPokemonInner pokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
        this.pokemon = pokemon;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbilityDetailPokemonInner {\n");

        sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
        sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
        
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
    public static class AbilityDetailPokemonInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("isHidden")
        private Boolean isHidden;
        @jakarta.ws.rs.QueryParam("slot")
        private Integer slot;
        @jakarta.ws.rs.QueryParam("pokemon")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon;

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

        public AbilityDetailPokemonInnerQueryParam isHidden(Boolean isHidden) {
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

        public AbilityDetailPokemonInnerQueryParam slot(Integer slot) {
            this.slot = slot;
            return this;
        }

        /**
        * Get pokemon
        * @return pokemon
        **/
        @JsonProperty("pokemon")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getPokemon() {
            return pokemon;
        }

        /**
         * Set pokemon
         **/
        public void setPokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
            this.pokemon = pokemon;
        }

        public AbilityDetailPokemonInnerQueryParam pokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
            this.pokemon = pokemon;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AbilityDetailPokemonInnerQueryParam {\n");

            sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
            sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
            sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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
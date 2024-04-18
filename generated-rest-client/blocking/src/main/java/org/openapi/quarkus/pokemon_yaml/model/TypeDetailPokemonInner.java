package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TypeDetailPokemonInner  {

    private Integer slot;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon;

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

    public TypeDetailPokemonInner slot(Integer slot) {
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

    public TypeDetailPokemonInner pokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
        this.pokemon = pokemon;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDetailPokemonInner {\n");

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
    public static class TypeDetailPokemonInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("slot")
        private Integer slot;
        @jakarta.ws.rs.QueryParam("pokemon")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon;

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

        public TypeDetailPokemonInnerQueryParam slot(Integer slot) {
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

        public TypeDetailPokemonInnerQueryParam pokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
            this.pokemon = pokemon;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TypeDetailPokemonInnerQueryParam {\n");

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
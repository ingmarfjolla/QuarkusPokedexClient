package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSpeciesDetailVarietiesInner  {

    private Boolean isDefault;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon;

    /**
    * Get isDefault
    * @return isDefault
    **/
    @JsonProperty("is_default")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Set isDefault
     **/
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public PokemonSpeciesDetailVarietiesInner isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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

    public PokemonSpeciesDetailVarietiesInner pokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
        this.pokemon = pokemon;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpeciesDetailVarietiesInner {\n");

        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
    public static class PokemonSpeciesDetailVarietiesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("isDefault")
        private Boolean isDefault;
        @jakarta.ws.rs.QueryParam("pokemon")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon;

        /**
        * Get isDefault
        * @return isDefault
        **/
        @JsonProperty("is_default")
        public Boolean getIsDefault() {
            return isDefault;
        }

        /**
         * Set isDefault
         **/
        public void setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
        }

        public PokemonSpeciesDetailVarietiesInnerQueryParam isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
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

        public PokemonSpeciesDetailVarietiesInnerQueryParam pokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
            this.pokemon = pokemon;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonSpeciesDetailVarietiesInnerQueryParam {\n");

            sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
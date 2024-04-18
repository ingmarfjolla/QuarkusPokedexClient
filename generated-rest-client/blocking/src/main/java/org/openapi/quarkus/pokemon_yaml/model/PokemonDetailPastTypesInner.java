package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetailPastTypesInner  {

    private PokemonEncountersRetrieve200ResponseInnerLocationArea generation;
    private List<PokemonDetailTypesInner> types;

    /**
    * Get generation
    * @return generation
    **/
    @JsonProperty("generation")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getGeneration() {
        return generation;
    }

    /**
     * Set generation
     **/
    public void setGeneration(PokemonEncountersRetrieve200ResponseInnerLocationArea generation) {
        this.generation = generation;
    }

    public PokemonDetailPastTypesInner generation(PokemonEncountersRetrieve200ResponseInnerLocationArea generation) {
        this.generation = generation;
        return this;
    }

    /**
    * Get types
    * @return types
    **/
    @JsonProperty("types")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokemonDetailTypesInner> getTypes() {
        return types;
    }

    /**
     * Set types
     **/
    public void setTypes(List<PokemonDetailTypesInner> types) {
        this.types = types;
    }

    public PokemonDetailPastTypesInner types(List<PokemonDetailTypesInner> types) {
        this.types = types;
        return this;
    }
    public PokemonDetailPastTypesInner addTypesItem(PokemonDetailTypesInner typesItem) {
        if (this.types == null){
            types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailPastTypesInner {\n");

        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        
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
    public static class PokemonDetailPastTypesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("generation")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea generation;
        @jakarta.ws.rs.QueryParam("types")
        private List<PokemonDetailTypesInner> types = null;

        /**
        * Get generation
        * @return generation
        **/
        @JsonProperty("generation")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getGeneration() {
            return generation;
        }

        /**
         * Set generation
         **/
        public void setGeneration(PokemonEncountersRetrieve200ResponseInnerLocationArea generation) {
            this.generation = generation;
        }

        public PokemonDetailPastTypesInnerQueryParam generation(PokemonEncountersRetrieve200ResponseInnerLocationArea generation) {
            this.generation = generation;
            return this;
        }

        /**
        * Get types
        * @return types
        **/
        @JsonProperty("types")
        public List<PokemonDetailTypesInner> getTypes() {
            return types;
        }

        /**
         * Set types
         **/
        public void setTypes(List<PokemonDetailTypesInner> types) {
            this.types = types;
        }

        public PokemonDetailPastTypesInnerQueryParam types(List<PokemonDetailTypesInner> types) {
            this.types = types;
            return this;
        }
        public PokemonDetailPastTypesInnerQueryParam addTypesItem(PokemonDetailTypesInner typesItem) {
            this.types.add(typesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonDetailPastTypesInnerQueryParam {\n");

            sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
            sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
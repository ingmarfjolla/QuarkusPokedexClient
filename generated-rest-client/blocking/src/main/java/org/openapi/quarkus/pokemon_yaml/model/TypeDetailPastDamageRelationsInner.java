package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TypeDetailPastDamageRelationsInner  {

    private PokemonEncountersRetrieve200ResponseInnerLocationArea generation;
    private TypeDetailPastDamageRelationsInnerDamageRelations damageRelations;

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

    public TypeDetailPastDamageRelationsInner generation(PokemonEncountersRetrieve200ResponseInnerLocationArea generation) {
        this.generation = generation;
        return this;
    }

    /**
    * Get damageRelations
    * @return damageRelations
    **/
    @JsonProperty("damage_relations")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public TypeDetailPastDamageRelationsInnerDamageRelations getDamageRelations() {
        return damageRelations;
    }

    /**
     * Set damageRelations
     **/
    public void setDamageRelations(TypeDetailPastDamageRelationsInnerDamageRelations damageRelations) {
        this.damageRelations = damageRelations;
    }

    public TypeDetailPastDamageRelationsInner damageRelations(TypeDetailPastDamageRelationsInnerDamageRelations damageRelations) {
        this.damageRelations = damageRelations;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDetailPastDamageRelationsInner {\n");

        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    damageRelations: ").append(toIndentedString(damageRelations)).append("\n");
        
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
    public static class TypeDetailPastDamageRelationsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("generation")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea generation;
        @jakarta.ws.rs.QueryParam("damageRelations")
        private TypeDetailPastDamageRelationsInnerDamageRelations damageRelations;

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

        public TypeDetailPastDamageRelationsInnerQueryParam generation(PokemonEncountersRetrieve200ResponseInnerLocationArea generation) {
            this.generation = generation;
            return this;
        }

        /**
        * Get damageRelations
        * @return damageRelations
        **/
        @JsonProperty("damage_relations")
        public TypeDetailPastDamageRelationsInnerDamageRelations getDamageRelations() {
            return damageRelations;
        }

        /**
         * Set damageRelations
         **/
        public void setDamageRelations(TypeDetailPastDamageRelationsInnerDamageRelations damageRelations) {
            this.damageRelations = damageRelations;
        }

        public TypeDetailPastDamageRelationsInnerQueryParam damageRelations(TypeDetailPastDamageRelationsInnerDamageRelations damageRelations) {
            this.damageRelations = damageRelations;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TypeDetailPastDamageRelationsInnerQueryParam {\n");

            sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
            sb.append("    damageRelations: ").append(toIndentedString(damageRelations)).append("\n");
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
package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetailPastAbilitiesInner  {

    private PokemonEncountersRetrieve200ResponseInnerLocationArea generation;
    private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> abilities;

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

    public PokemonDetailPastAbilitiesInner generation(PokemonEncountersRetrieve200ResponseInnerLocationArea generation) {
        this.generation = generation;
        return this;
    }

    /**
    * Get abilities
    * @return abilities
    **/
    @JsonProperty("abilities")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getAbilities() {
        return abilities;
    }

    /**
     * Set abilities
     **/
    public void setAbilities(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> abilities) {
        this.abilities = abilities;
    }

    public PokemonDetailPastAbilitiesInner abilities(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> abilities) {
        this.abilities = abilities;
        return this;
    }
    public PokemonDetailPastAbilitiesInner addAbilitiesItem(PokemonEncountersRetrieve200ResponseInnerLocationArea abilitiesItem) {
        if (this.abilities == null){
            abilities = new ArrayList<>();
        }
        this.abilities.add(abilitiesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailPastAbilitiesInner {\n");

        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
        
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
    public static class PokemonDetailPastAbilitiesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("generation")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea generation;
        @jakarta.ws.rs.QueryParam("abilities")
        private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> abilities = null;

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

        public PokemonDetailPastAbilitiesInnerQueryParam generation(PokemonEncountersRetrieve200ResponseInnerLocationArea generation) {
            this.generation = generation;
            return this;
        }

        /**
        * Get abilities
        * @return abilities
        **/
        @JsonProperty("abilities")
        public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getAbilities() {
            return abilities;
        }

        /**
         * Set abilities
         **/
        public void setAbilities(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> abilities) {
            this.abilities = abilities;
        }

        public PokemonDetailPastAbilitiesInnerQueryParam abilities(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> abilities) {
            this.abilities = abilities;
            return this;
        }
        public PokemonDetailPastAbilitiesInnerQueryParam addAbilitiesItem(PokemonEncountersRetrieve200ResponseInnerLocationArea abilitiesItem) {
            this.abilities.add(abilitiesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonDetailPastAbilitiesInnerQueryParam {\n");

            sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
            sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
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
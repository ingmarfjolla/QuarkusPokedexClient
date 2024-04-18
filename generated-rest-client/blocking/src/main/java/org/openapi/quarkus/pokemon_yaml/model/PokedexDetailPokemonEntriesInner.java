package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokedexDetailPokemonEntriesInner  {

    private Integer entryNumber;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies;

    /**
    * Get entryNumber
    * @return entryNumber
    **/
    @JsonProperty("entry_number")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getEntryNumber() {
        return entryNumber;
    }

    /**
     * Set entryNumber
     **/
    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }

    public PokedexDetailPokemonEntriesInner entryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
        return this;
    }

    /**
    * Get pokemonSpecies
    * @return pokemonSpecies
    **/
    @JsonProperty("pokemon_species")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getPokemonSpecies() {
        return pokemonSpecies;
    }

    /**
     * Set pokemonSpecies
     **/
    public void setPokemonSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }

    public PokedexDetailPokemonEntriesInner pokemonSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokedexDetailPokemonEntriesInner {\n");

        sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
        sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
        
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
    public static class PokedexDetailPokemonEntriesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("entryNumber")
        private Integer entryNumber;
        @jakarta.ws.rs.QueryParam("pokemonSpecies")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies;

        /**
        * Get entryNumber
        * @return entryNumber
        **/
        @JsonProperty("entry_number")
        public Integer getEntryNumber() {
            return entryNumber;
        }

        /**
         * Set entryNumber
         **/
        public void setEntryNumber(Integer entryNumber) {
            this.entryNumber = entryNumber;
        }

        public PokedexDetailPokemonEntriesInnerQueryParam entryNumber(Integer entryNumber) {
            this.entryNumber = entryNumber;
            return this;
        }

        /**
        * Get pokemonSpecies
        * @return pokemonSpecies
        **/
        @JsonProperty("pokemon_species")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getPokemonSpecies() {
            return pokemonSpecies;
        }

        /**
         * Set pokemonSpecies
         **/
        public void setPokemonSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies) {
            this.pokemonSpecies = pokemonSpecies;
        }

        public PokedexDetailPokemonEntriesInnerQueryParam pokemonSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemonSpecies) {
            this.pokemonSpecies = pokemonSpecies;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokedexDetailPokemonEntriesInnerQueryParam {\n");

            sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
            sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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
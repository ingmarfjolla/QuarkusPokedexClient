package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDexEntry  {

    private Integer entryNumber;
    private PokedexSummary pokedex;

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

    public PokemonDexEntry entryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
        return this;
    }

    /**
    * Get pokedex
    * @return pokedex
    **/
    @JsonProperty("pokedex")
    public PokedexSummary getPokedex() {
        return pokedex;
    }

    /**
     * Set pokedex
     **/
    public void setPokedex(PokedexSummary pokedex) {
        this.pokedex = pokedex;
    }

    public PokemonDexEntry pokedex(PokedexSummary pokedex) {
        this.pokedex = pokedex;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDexEntry {\n");

        sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
        sb.append("    pokedex: ").append(toIndentedString(pokedex)).append("\n");
        
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
    public static class PokemonDexEntryQueryParam  {

        @jakarta.ws.rs.QueryParam("entryNumber")
        private Integer entryNumber;
        @jakarta.ws.rs.QueryParam("pokedex")
        private PokedexSummary pokedex;

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

        public PokemonDexEntryQueryParam entryNumber(Integer entryNumber) {
            this.entryNumber = entryNumber;
            return this;
        }

        /**
        * Get pokedex
        * @return pokedex
        **/
        @JsonProperty("pokedex")
        public PokedexSummary getPokedex() {
            return pokedex;
        }

        /**
         * Set pokedex
         **/
        public void setPokedex(PokedexSummary pokedex) {
            this.pokedex = pokedex;
        }

        public PokemonDexEntryQueryParam pokedex(PokedexSummary pokedex) {
            this.pokedex = pokedex;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonDexEntryQueryParam {\n");

            sb.append("    entryNumber: ").append(toIndentedString(entryNumber)).append("\n");
            sb.append("    pokedex: ").append(toIndentedString(pokedex)).append("\n");
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
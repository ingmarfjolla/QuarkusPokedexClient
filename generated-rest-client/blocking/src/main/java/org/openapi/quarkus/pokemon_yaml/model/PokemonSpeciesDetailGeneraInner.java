package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSpeciesDetailGeneraInner  {

    private String genus;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea language;

    /**
    * Get genus
    * @return genus
    **/
    @JsonProperty("genus")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getGenus() {
        return genus;
    }

    /**
     * Set genus
     **/
    public void setGenus(String genus) {
        this.genus = genus;
    }

    public PokemonSpeciesDetailGeneraInner genus(String genus) {
        this.genus = genus;
        return this;
    }

    /**
    * Get language
    * @return language
    **/
    @JsonProperty("language")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getLanguage() {
        return language;
    }

    /**
     * Set language
     **/
    public void setLanguage(PokemonEncountersRetrieve200ResponseInnerLocationArea language) {
        this.language = language;
    }

    public PokemonSpeciesDetailGeneraInner language(PokemonEncountersRetrieve200ResponseInnerLocationArea language) {
        this.language = language;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpeciesDetailGeneraInner {\n");

        sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        
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
    public static class PokemonSpeciesDetailGeneraInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("genus")
        private String genus;
        @jakarta.ws.rs.QueryParam("language")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea language;

        /**
        * Get genus
        * @return genus
        **/
        @JsonProperty("genus")
        public String getGenus() {
            return genus;
        }

        /**
         * Set genus
         **/
        public void setGenus(String genus) {
            this.genus = genus;
        }

        public PokemonSpeciesDetailGeneraInnerQueryParam genus(String genus) {
            this.genus = genus;
            return this;
        }

        /**
        * Get language
        * @return language
        **/
        @JsonProperty("language")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getLanguage() {
            return language;
        }

        /**
         * Set language
         **/
        public void setLanguage(PokemonEncountersRetrieve200ResponseInnerLocationArea language) {
            this.language = language;
        }

        public PokemonSpeciesDetailGeneraInnerQueryParam language(PokemonEncountersRetrieve200ResponseInnerLocationArea language) {
            this.language = language;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonSpeciesDetailGeneraInnerQueryParam {\n");

            sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
            sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
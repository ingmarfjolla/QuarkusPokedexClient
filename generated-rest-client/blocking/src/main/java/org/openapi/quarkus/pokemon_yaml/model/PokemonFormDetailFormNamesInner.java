package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonFormDetailFormNamesInner  {

    private String name;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea language;

    /**
    * Get name
    * @return name
    **/
    @JsonProperty("name")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public PokemonFormDetailFormNamesInner name(String name) {
        this.name = name;
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

    public PokemonFormDetailFormNamesInner language(PokemonEncountersRetrieve200ResponseInnerLocationArea language) {
        this.language = language;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonFormDetailFormNamesInner {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    public static class PokemonFormDetailFormNamesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("language")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea language;

        /**
        * Get name
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public PokemonFormDetailFormNamesInnerQueryParam name(String name) {
            this.name = name;
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

        public PokemonFormDetailFormNamesInnerQueryParam language(PokemonEncountersRetrieve200ResponseInnerLocationArea language) {
            this.language = language;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonFormDetailFormNamesInnerQueryParam {\n");

            sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonShapeDetailAwesomeNamesInner  {

    private String awesomeName;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea language;

    /**
    * Get awesomeName
    * @return awesomeName
    **/
    @JsonProperty("awesome_name")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getAwesomeName() {
        return awesomeName;
    }

    /**
     * Set awesomeName
     **/
    public void setAwesomeName(String awesomeName) {
        this.awesomeName = awesomeName;
    }

    public PokemonShapeDetailAwesomeNamesInner awesomeName(String awesomeName) {
        this.awesomeName = awesomeName;
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

    public PokemonShapeDetailAwesomeNamesInner language(PokemonEncountersRetrieve200ResponseInnerLocationArea language) {
        this.language = language;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonShapeDetailAwesomeNamesInner {\n");

        sb.append("    awesomeName: ").append(toIndentedString(awesomeName)).append("\n");
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
    public static class PokemonShapeDetailAwesomeNamesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("awesomeName")
        private String awesomeName;
        @jakarta.ws.rs.QueryParam("language")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea language;

        /**
        * Get awesomeName
        * @return awesomeName
        **/
        @JsonProperty("awesome_name")
        public String getAwesomeName() {
            return awesomeName;
        }

        /**
         * Set awesomeName
         **/
        public void setAwesomeName(String awesomeName) {
            this.awesomeName = awesomeName;
        }

        public PokemonShapeDetailAwesomeNamesInnerQueryParam awesomeName(String awesomeName) {
            this.awesomeName = awesomeName;
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

        public PokemonShapeDetailAwesomeNamesInnerQueryParam language(PokemonEncountersRetrieve200ResponseInnerLocationArea language) {
            this.language = language;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonShapeDetailAwesomeNamesInnerQueryParam {\n");

            sb.append("    awesomeName: ").append(toIndentedString(awesomeName)).append("\n");
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
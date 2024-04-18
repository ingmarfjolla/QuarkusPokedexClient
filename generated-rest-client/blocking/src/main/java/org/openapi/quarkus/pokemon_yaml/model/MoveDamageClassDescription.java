package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveDamageClassDescription  {

    private String description;
    private LanguageSummary language;

    /**
    * Get description
    * @return description
    **/
    @JsonProperty("description")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Set description
     **/
    public void setDescription(String description) {
        this.description = description;
    }

    public MoveDamageClassDescription description(String description) {
        this.description = description;
        return this;
    }

    /**
    * Get language
    * @return language
    **/
    @JsonProperty("language")
    public LanguageSummary getLanguage() {
        return language;
    }

    /**
     * Set language
     **/
    public void setLanguage(LanguageSummary language) {
        this.language = language;
    }

    public MoveDamageClassDescription language(LanguageSummary language) {
        this.language = language;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveDamageClassDescription {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    public static class MoveDamageClassDescriptionQueryParam  {

        @jakarta.ws.rs.QueryParam("description")
        private String description;
        @jakarta.ws.rs.QueryParam("language")
        private LanguageSummary language;

        /**
        * Get description
        * @return description
        **/
        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        /**
         * Set description
         **/
        public void setDescription(String description) {
            this.description = description;
        }

        public MoveDamageClassDescriptionQueryParam description(String description) {
            this.description = description;
            return this;
        }

        /**
        * Get language
        * @return language
        **/
        @JsonProperty("language")
        public LanguageSummary getLanguage() {
            return language;
        }

        /**
         * Set language
         **/
        public void setLanguage(LanguageSummary language) {
            this.language = language;
        }

        public MoveDamageClassDescriptionQueryParam language(LanguageSummary language) {
            this.language = language;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveDamageClassDescriptionQueryParam {\n");

            sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
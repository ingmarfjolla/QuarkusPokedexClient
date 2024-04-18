package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContestEffectFlavorText  {

    private String flavorText;
    private LanguageSummary language;

    /**
    * Get flavorText
    * @return flavorText
    **/
    @JsonProperty("flavor_text")
    public String getFlavorText() {
        return flavorText;
    }

    /**
     * Set flavorText
     **/
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public ContestEffectFlavorText flavorText(String flavorText) {
        this.flavorText = flavorText;
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

    public ContestEffectFlavorText language(LanguageSummary language) {
        this.language = language;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContestEffectFlavorText {\n");

        sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
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
    public static class ContestEffectFlavorTextQueryParam  {

        @jakarta.ws.rs.QueryParam("flavorText")
        private String flavorText;
        @jakarta.ws.rs.QueryParam("language")
        private LanguageSummary language;

        /**
        * Get flavorText
        * @return flavorText
        **/
        @JsonProperty("flavor_text")
        public String getFlavorText() {
            return flavorText;
        }

        /**
         * Set flavorText
         **/
        public void setFlavorText(String flavorText) {
            this.flavorText = flavorText;
        }

        public ContestEffectFlavorTextQueryParam flavorText(String flavorText) {
            this.flavorText = flavorText;
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

        public ContestEffectFlavorTextQueryParam language(LanguageSummary language) {
            this.language = language;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ContestEffectFlavorTextQueryParam {\n");

            sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
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
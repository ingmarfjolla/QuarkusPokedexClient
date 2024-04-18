package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSpeciesFlavorText  {

    private String flavorText;
    private LanguageSummary language;
    private VersionSummary version;

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

    public PokemonSpeciesFlavorText flavorText(String flavorText) {
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

    public PokemonSpeciesFlavorText language(LanguageSummary language) {
        this.language = language;
        return this;
    }

    /**
    * Get version
    * @return version
    **/
    @JsonProperty("version")
    public VersionSummary getVersion() {
        return version;
    }

    /**
     * Set version
     **/
    public void setVersion(VersionSummary version) {
        this.version = version;
    }

    public PokemonSpeciesFlavorText version(VersionSummary version) {
        this.version = version;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpeciesFlavorText {\n");

        sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        
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
    public static class PokemonSpeciesFlavorTextQueryParam  {

        @jakarta.ws.rs.QueryParam("flavorText")
        private String flavorText;
        @jakarta.ws.rs.QueryParam("language")
        private LanguageSummary language;
        @jakarta.ws.rs.QueryParam("version")
        private VersionSummary version;

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

        public PokemonSpeciesFlavorTextQueryParam flavorText(String flavorText) {
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

        public PokemonSpeciesFlavorTextQueryParam language(LanguageSummary language) {
            this.language = language;
            return this;
        }

        /**
        * Get version
        * @return version
        **/
        @JsonProperty("version")
        public VersionSummary getVersion() {
            return version;
        }

        /**
         * Set version
         **/
        public void setVersion(VersionSummary version) {
            this.version = version;
        }

        public PokemonSpeciesFlavorTextQueryParam version(VersionSummary version) {
            this.version = version;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonSpeciesFlavorTextQueryParam {\n");

            sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
            sb.append("    language: ").append(toIndentedString(language)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
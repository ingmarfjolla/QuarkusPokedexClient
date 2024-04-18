package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveEffectChangeEffectText  {

    private String effect;
    private LanguageSummary language;

    /**
    * Get effect
    * @return effect
    **/
    @JsonProperty("effect")
    public String getEffect() {
        return effect;
    }

    /**
     * Set effect
     **/
    public void setEffect(String effect) {
        this.effect = effect;
    }

    public MoveEffectChangeEffectText effect(String effect) {
        this.effect = effect;
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

    public MoveEffectChangeEffectText language(LanguageSummary language) {
        this.language = language;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveEffectChangeEffectText {\n");

        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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
    public static class MoveEffectChangeEffectTextQueryParam  {

        @jakarta.ws.rs.QueryParam("effect")
        private String effect;
        @jakarta.ws.rs.QueryParam("language")
        private LanguageSummary language;

        /**
        * Get effect
        * @return effect
        **/
        @JsonProperty("effect")
        public String getEffect() {
            return effect;
        }

        /**
         * Set effect
         **/
        public void setEffect(String effect) {
            this.effect = effect;
        }

        public MoveEffectChangeEffectTextQueryParam effect(String effect) {
            this.effect = effect;
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

        public MoveEffectChangeEffectTextQueryParam language(LanguageSummary language) {
            this.language = language;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveEffectChangeEffectTextQueryParam {\n");

            sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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
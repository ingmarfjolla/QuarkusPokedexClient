package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveEffectEffectText  {

    private String effect;
    private String shortEffect;
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

    public MoveEffectEffectText effect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
    * Get shortEffect
    * @return shortEffect
    **/
    @JsonProperty("short_effect")
    public String getShortEffect() {
        return shortEffect;
    }

    /**
     * Set shortEffect
     **/
    public void setShortEffect(String shortEffect) {
        this.shortEffect = shortEffect;
    }

    public MoveEffectEffectText shortEffect(String shortEffect) {
        this.shortEffect = shortEffect;
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

    public MoveEffectEffectText language(LanguageSummary language) {
        this.language = language;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveEffectEffectText {\n");

        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    shortEffect: ").append(toIndentedString(shortEffect)).append("\n");
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
    public static class MoveEffectEffectTextQueryParam  {

        @jakarta.ws.rs.QueryParam("effect")
        private String effect;
        @jakarta.ws.rs.QueryParam("shortEffect")
        private String shortEffect;
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

        public MoveEffectEffectTextQueryParam effect(String effect) {
            this.effect = effect;
            return this;
        }

        /**
        * Get shortEffect
        * @return shortEffect
        **/
        @JsonProperty("short_effect")
        public String getShortEffect() {
            return shortEffect;
        }

        /**
         * Set shortEffect
         **/
        public void setShortEffect(String shortEffect) {
            this.shortEffect = shortEffect;
        }

        public MoveEffectEffectTextQueryParam shortEffect(String shortEffect) {
            this.shortEffect = shortEffect;
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

        public MoveEffectEffectTextQueryParam language(LanguageSummary language) {
            this.language = language;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveEffectEffectTextQueryParam {\n");

            sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
            sb.append("    shortEffect: ").append(toIndentedString(shortEffect)).append("\n");
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
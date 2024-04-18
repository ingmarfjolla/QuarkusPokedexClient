package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbilityFlavorText  {

    private String flavorText;
    private LanguageSummary language;
    private VersionGroupSummary versionGroup;

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

    public AbilityFlavorText flavorText(String flavorText) {
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

    public AbilityFlavorText language(LanguageSummary language) {
        this.language = language;
        return this;
    }

    /**
    * Get versionGroup
    * @return versionGroup
    **/
    @JsonProperty("version_group")
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    /**
     * Set versionGroup
     **/
    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    public AbilityFlavorText versionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbilityFlavorText {\n");

        sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        
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
    public static class AbilityFlavorTextQueryParam  {

        @jakarta.ws.rs.QueryParam("flavorText")
        private String flavorText;
        @jakarta.ws.rs.QueryParam("language")
        private LanguageSummary language;
        @jakarta.ws.rs.QueryParam("versionGroup")
        private VersionGroupSummary versionGroup;

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

        public AbilityFlavorTextQueryParam flavorText(String flavorText) {
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

        public AbilityFlavorTextQueryParam language(LanguageSummary language) {
            this.language = language;
            return this;
        }

        /**
        * Get versionGroup
        * @return versionGroup
        **/
        @JsonProperty("version_group")
        public VersionGroupSummary getVersionGroup() {
            return versionGroup;
        }

        /**
         * Set versionGroup
         **/
        public void setVersionGroup(VersionGroupSummary versionGroup) {
            this.versionGroup = versionGroup;
        }

        public AbilityFlavorTextQueryParam versionGroup(VersionGroupSummary versionGroup) {
            this.versionGroup = versionGroup;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AbilityFlavorTextQueryParam {\n");

            sb.append("    flavorText: ").append(toIndentedString(flavorText)).append("\n");
            sb.append("    language: ").append(toIndentedString(language)).append("\n");
            sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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
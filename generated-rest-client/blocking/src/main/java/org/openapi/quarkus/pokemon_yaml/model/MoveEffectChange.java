package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveEffectChange  {

    private VersionGroupSummary versionGroup;
    private List<MoveEffectChangeEffectText> effectEntries = new ArrayList<>();

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

    public MoveEffectChange versionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
        return this;
    }

    /**
    * Get effectEntries
    * @return effectEntries
    **/
    @JsonProperty("effect_entries")
    public List<MoveEffectChangeEffectText> getEffectEntries() {
        return effectEntries;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveEffectChange {\n");

        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        
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
    public static class MoveEffectChangeQueryParam  {

        @jakarta.ws.rs.QueryParam("versionGroup")
        private VersionGroupSummary versionGroup;
        @jakarta.ws.rs.QueryParam("effectEntries")
        private List<MoveEffectChangeEffectText> effectEntries = null;

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

        public MoveEffectChangeQueryParam versionGroup(VersionGroupSummary versionGroup) {
            this.versionGroup = versionGroup;
            return this;
        }

        /**
        * Get effectEntries
        * @return effectEntries
        **/
        @JsonProperty("effect_entries")
        public List<MoveEffectChangeEffectText> getEffectEntries() {
            return effectEntries;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveEffectChangeQueryParam {\n");

            sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
            sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
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
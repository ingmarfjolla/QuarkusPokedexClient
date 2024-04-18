package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveLearnMethodDetail  {

    private Integer id;
    private String name;
    private List<MoveLearnMethodName> names = new ArrayList<>();
    private List<MoveLearnMethodDescription> descriptions = new ArrayList<>();
    private List<VersionGroupSummary> versionGroups = new ArrayList<>();

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }


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

    public MoveLearnMethodDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<MoveLearnMethodName> getNames() {
        return names;
    }


    /**
    * Get descriptions
    * @return descriptions
    **/
    @JsonProperty("descriptions")
    public List<MoveLearnMethodDescription> getDescriptions() {
        return descriptions;
    }


    /**
    * Get versionGroups
    * @return versionGroups
    **/
    @JsonProperty("version_groups")
    public List<VersionGroupSummary> getVersionGroups() {
        return versionGroups;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveLearnMethodDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    versionGroups: ").append(toIndentedString(versionGroups)).append("\n");
        
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
    public static class MoveLearnMethodDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("names")
        private List<MoveLearnMethodName> names = null;
        @jakarta.ws.rs.QueryParam("descriptions")
        private List<MoveLearnMethodDescription> descriptions = null;
        @jakarta.ws.rs.QueryParam("versionGroups")
        private List<VersionGroupSummary> versionGroups = null;

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }


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

        public MoveLearnMethodDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<MoveLearnMethodName> getNames() {
            return names;
        }


        /**
        * Get descriptions
        * @return descriptions
        **/
        @JsonProperty("descriptions")
        public List<MoveLearnMethodDescription> getDescriptions() {
            return descriptions;
        }


        /**
        * Get versionGroups
        * @return versionGroups
        **/
        @JsonProperty("version_groups")
        public List<VersionGroupSummary> getVersionGroups() {
            return versionGroups;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveLearnMethodDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
            sb.append("    versionGroups: ").append(toIndentedString(versionGroups)).append("\n");
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
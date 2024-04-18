package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
 **/
public class VersionDetail  {

    /**
      * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
     **/
    private Integer id;
    /**
      * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
     **/
    private String name;
    /**
      * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
     **/
    private List<VersionName> names = new ArrayList<>();
    /**
      * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
     **/
    private VersionGroupSummary versionGroup;

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

    public VersionDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<VersionName> getNames() {
        return names;
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

    public VersionDetail versionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
    /**
      * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
     **/
    public static class VersionDetailQueryParam  {

        /**
          * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
         **/
        @jakarta.ws.rs.QueryParam("names")
        private List<VersionName> names = null;
        /**
          * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
         **/
        @jakarta.ws.rs.QueryParam("versionGroup")
        private VersionGroupSummary versionGroup;

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

        public VersionDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<VersionName> getNames() {
            return names;
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

        public VersionDetailQueryParam versionGroup(VersionGroupSummary versionGroup) {
            this.versionGroup = versionGroup;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class VersionDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EncounterConditionDetail  {

    private Integer id;
    private String name;
    private List<EncounterConditionValueSummary> values = new ArrayList<>();
    private List<EncounterConditionName> names = new ArrayList<>();

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

    public EncounterConditionDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get values
    * @return values
    **/
    @JsonProperty("values")
    public List<EncounterConditionValueSummary> getValues() {
        return values;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<EncounterConditionName> getNames() {
        return names;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncounterConditionDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        
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
    public static class EncounterConditionDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("values")
        private List<EncounterConditionValueSummary> values = null;
        @jakarta.ws.rs.QueryParam("names")
        private List<EncounterConditionName> names = null;

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

        public EncounterConditionDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get values
        * @return values
        **/
        @JsonProperty("values")
        public List<EncounterConditionValueSummary> getValues() {
            return values;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<EncounterConditionName> getNames() {
            return names;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EncounterConditionDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    values: ").append(toIndentedString(values)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
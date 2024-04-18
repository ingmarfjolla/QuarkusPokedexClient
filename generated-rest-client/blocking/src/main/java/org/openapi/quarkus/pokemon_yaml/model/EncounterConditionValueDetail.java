package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EncounterConditionValueDetail  {

    private Integer id;
    private String name;
    private EncounterConditionSummary condition;
    private List<EncounterConditionValueName> names = new ArrayList<>();

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

    public EncounterConditionValueDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get condition
    * @return condition
    **/
    @JsonProperty("condition")
    public EncounterConditionSummary getCondition() {
        return condition;
    }

    /**
     * Set condition
     **/
    public void setCondition(EncounterConditionSummary condition) {
        this.condition = condition;
    }

    public EncounterConditionValueDetail condition(EncounterConditionSummary condition) {
        this.condition = condition;
        return this;
    }

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<EncounterConditionValueName> getNames() {
        return names;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncounterConditionValueDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
    public static class EncounterConditionValueDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("condition")
        private EncounterConditionSummary condition;
        @jakarta.ws.rs.QueryParam("names")
        private List<EncounterConditionValueName> names = null;

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

        public EncounterConditionValueDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get condition
        * @return condition
        **/
        @JsonProperty("condition")
        public EncounterConditionSummary getCondition() {
            return condition;
        }

        /**
         * Set condition
         **/
        public void setCondition(EncounterConditionSummary condition) {
            this.condition = condition;
        }

        public EncounterConditionValueDetailQueryParam condition(EncounterConditionSummary condition) {
            this.condition = condition;
            return this;
        }

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<EncounterConditionValueName> getNames() {
            return names;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EncounterConditionValueDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
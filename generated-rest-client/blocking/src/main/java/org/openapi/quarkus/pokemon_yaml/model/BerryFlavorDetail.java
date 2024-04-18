package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BerryFlavorDetail  {

    private Integer id;
    private String name;
    private List<BerryFlavorDetailBerriesInner> berries = new ArrayList<>();
    private ContestTypeSummary contestType;
    private List<BerryFlavorName> names = new ArrayList<>();

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

    public BerryFlavorDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get berries
    * @return berries
    **/
    @JsonProperty("berries")
    public List<BerryFlavorDetailBerriesInner> getBerries() {
        return berries;
    }


    /**
    * Get contestType
    * @return contestType
    **/
    @JsonProperty("contest_type")
    public ContestTypeSummary getContestType() {
        return contestType;
    }

    /**
     * Set contestType
     **/
    public void setContestType(ContestTypeSummary contestType) {
        this.contestType = contestType;
    }

    public BerryFlavorDetail contestType(ContestTypeSummary contestType) {
        this.contestType = contestType;
        return this;
    }

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<BerryFlavorName> getNames() {
        return names;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BerryFlavorDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
        sb.append("    contestType: ").append(toIndentedString(contestType)).append("\n");
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
    public static class BerryFlavorDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("berries")
        private List<BerryFlavorDetailBerriesInner> berries = null;
        @jakarta.ws.rs.QueryParam("contestType")
        private ContestTypeSummary contestType;
        @jakarta.ws.rs.QueryParam("names")
        private List<BerryFlavorName> names = null;

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

        public BerryFlavorDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get berries
        * @return berries
        **/
        @JsonProperty("berries")
        public List<BerryFlavorDetailBerriesInner> getBerries() {
            return berries;
        }


        /**
        * Get contestType
        * @return contestType
        **/
        @JsonProperty("contest_type")
        public ContestTypeSummary getContestType() {
            return contestType;
        }

        /**
         * Set contestType
         **/
        public void setContestType(ContestTypeSummary contestType) {
            this.contestType = contestType;
        }

        public BerryFlavorDetailQueryParam contestType(ContestTypeSummary contestType) {
            this.contestType = contestType;
            return this;
        }

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<BerryFlavorName> getNames() {
            return names;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BerryFlavorDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
            sb.append("    contestType: ").append(toIndentedString(contestType)).append("\n");
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
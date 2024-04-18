package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContestTypeDetail  {

    private Integer id;
    private String name;
    private BerryFlavorSummary berryFlavor;
    private List<ContestTypeName> names = new ArrayList<>();

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

    public ContestTypeDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get berryFlavor
    * @return berryFlavor
    **/
    @JsonProperty("berry_flavor")
    public BerryFlavorSummary getBerryFlavor() {
        return berryFlavor;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<ContestTypeName> getNames() {
        return names;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContestTypeDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    berryFlavor: ").append(toIndentedString(berryFlavor)).append("\n");
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
    public static class ContestTypeDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("berryFlavor")
        private BerryFlavorSummary berryFlavor;
        @jakarta.ws.rs.QueryParam("names")
        private List<ContestTypeName> names = null;

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

        public ContestTypeDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get berryFlavor
        * @return berryFlavor
        **/
        @JsonProperty("berry_flavor")
        public BerryFlavorSummary getBerryFlavor() {
            return berryFlavor;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<ContestTypeName> getNames() {
            return names;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ContestTypeDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    berryFlavor: ").append(toIndentedString(berryFlavor)).append("\n");
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
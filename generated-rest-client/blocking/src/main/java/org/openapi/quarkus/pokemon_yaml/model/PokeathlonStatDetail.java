package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokeathlonStatDetail  {

    private Integer id;
    private String name;
    private List<PokeathlonStatDetailAffectingNaturesInner> affectingNatures = new ArrayList<>();
    private List<PokeathlonStatName> names = new ArrayList<>();

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

    public PokeathlonStatDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get affectingNatures
    * @return affectingNatures
    **/
    @JsonProperty("affecting_natures")
    public List<PokeathlonStatDetailAffectingNaturesInner> getAffectingNatures() {
        return affectingNatures;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<PokeathlonStatName> getNames() {
        return names;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokeathlonStatDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    affectingNatures: ").append(toIndentedString(affectingNatures)).append("\n");
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
    public static class PokeathlonStatDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("affectingNatures")
        private List<PokeathlonStatDetailAffectingNaturesInner> affectingNatures = null;
        @jakarta.ws.rs.QueryParam("names")
        private List<PokeathlonStatName> names = null;

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

        public PokeathlonStatDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get affectingNatures
        * @return affectingNatures
        **/
        @JsonProperty("affecting_natures")
        public List<PokeathlonStatDetailAffectingNaturesInner> getAffectingNatures() {
            return affectingNatures;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<PokeathlonStatName> getNames() {
            return names;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokeathlonStatDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    affectingNatures: ").append(toIndentedString(affectingNatures)).append("\n");
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
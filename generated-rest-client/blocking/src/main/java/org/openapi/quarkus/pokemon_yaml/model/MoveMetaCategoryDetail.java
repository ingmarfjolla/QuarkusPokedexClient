package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveMetaCategoryDetail  {

    private Integer id;
    private String name;
    private List<MoveMetaCategoryDescription> descriptions = new ArrayList<>();
    private List<MoveSummary> moves = new ArrayList<>();

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

    public MoveMetaCategoryDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get descriptions
    * @return descriptions
    **/
    @JsonProperty("descriptions")
    public List<MoveMetaCategoryDescription> getDescriptions() {
        return descriptions;
    }


    /**
    * Get moves
    * @return moves
    **/
    @JsonProperty("moves")
    public List<MoveSummary> getMoves() {
        return moves;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveMetaCategoryDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
        
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
    public static class MoveMetaCategoryDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("descriptions")
        private List<MoveMetaCategoryDescription> descriptions = null;
        @jakarta.ws.rs.QueryParam("moves")
        private List<MoveSummary> moves = null;

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

        public MoveMetaCategoryDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get descriptions
        * @return descriptions
        **/
        @JsonProperty("descriptions")
        public List<MoveMetaCategoryDescription> getDescriptions() {
            return descriptions;
        }


        /**
        * Get moves
        * @return moves
        **/
        @JsonProperty("moves")
        public List<MoveSummary> getMoves() {
            return moves;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveMetaCategoryDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
            sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
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
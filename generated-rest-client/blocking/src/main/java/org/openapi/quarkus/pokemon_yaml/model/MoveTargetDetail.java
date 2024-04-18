package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveTargetDetail  {

    private Integer id;
    private String name;
    private List<MoveTargetDescription> descriptions = new ArrayList<>();
    private List<MoveSummary> moves = new ArrayList<>();
    private List<MoveTargetName> names = new ArrayList<>();

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

    public MoveTargetDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get descriptions
    * @return descriptions
    **/
    @JsonProperty("descriptions")
    public List<MoveTargetDescription> getDescriptions() {
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
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<MoveTargetName> getNames() {
        return names;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveTargetDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
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
    public static class MoveTargetDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("descriptions")
        private List<MoveTargetDescription> descriptions = null;
        @jakarta.ws.rs.QueryParam("moves")
        private List<MoveSummary> moves = null;
        @jakarta.ws.rs.QueryParam("names")
        private List<MoveTargetName> names = null;

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

        public MoveTargetDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get descriptions
        * @return descriptions
        **/
        @JsonProperty("descriptions")
        public List<MoveTargetDescription> getDescriptions() {
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
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<MoveTargetName> getNames() {
            return names;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveTargetDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
            sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
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
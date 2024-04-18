package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationGameIndex  {

    private Integer gameIndex;
    private GenerationSummary generation;

    /**
    * Get gameIndex
    * minimum: -2147483648
    * maximum: 2147483647
    * @return gameIndex
    **/
    @JsonProperty("game_index")
    public Integer getGameIndex() {
        return gameIndex;
    }

    /**
     * Set gameIndex
     **/
    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    public LocationGameIndex gameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
        return this;
    }

    /**
    * Get generation
    * @return generation
    **/
    @JsonProperty("generation")
    public GenerationSummary getGeneration() {
        return generation;
    }

    /**
     * Set generation
     **/
    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    public LocationGameIndex generation(GenerationSummary generation) {
        this.generation = generation;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationGameIndex {\n");

        sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        
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
    public static class LocationGameIndexQueryParam  {

        @jakarta.ws.rs.QueryParam("gameIndex")
        private Integer gameIndex;
        @jakarta.ws.rs.QueryParam("generation")
        private GenerationSummary generation;

        /**
        * Get gameIndex
        * minimum: -2147483648
        * maximum: 2147483647
        * @return gameIndex
        **/
        @JsonProperty("game_index")
        public Integer getGameIndex() {
            return gameIndex;
        }

        /**
         * Set gameIndex
         **/
        public void setGameIndex(Integer gameIndex) {
            this.gameIndex = gameIndex;
        }

        public LocationGameIndexQueryParam gameIndex(Integer gameIndex) {
            this.gameIndex = gameIndex;
            return this;
        }

        /**
        * Get generation
        * @return generation
        **/
        @JsonProperty("generation")
        public GenerationSummary getGeneration() {
            return generation;
        }

        /**
         * Set generation
         **/
        public void setGeneration(GenerationSummary generation) {
            this.generation = generation;
        }

        public LocationGameIndexQueryParam generation(GenerationSummary generation) {
            this.generation = generation;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LocationGameIndexQueryParam {\n");

            sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
            sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
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
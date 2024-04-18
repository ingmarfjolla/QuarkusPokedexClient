package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatDetailAffectingMovesIncrease  {

    private Integer change;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea move;

    /**
    * Get change
    * @return change
    **/
    @JsonProperty("change")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getChange() {
        return change;
    }

    /**
     * Set change
     **/
    public void setChange(Integer change) {
        this.change = change;
    }

    public StatDetailAffectingMovesIncrease change(Integer change) {
        this.change = change;
        return this;
    }

    /**
    * Get move
    * @return move
    **/
    @JsonProperty("move")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getMove() {
        return move;
    }

    /**
     * Set move
     **/
    public void setMove(PokemonEncountersRetrieve200ResponseInnerLocationArea move) {
        this.move = move;
    }

    public StatDetailAffectingMovesIncrease move(PokemonEncountersRetrieve200ResponseInnerLocationArea move) {
        this.move = move;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatDetailAffectingMovesIncrease {\n");

        sb.append("    change: ").append(toIndentedString(change)).append("\n");
        sb.append("    move: ").append(toIndentedString(move)).append("\n");
        
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
    public static class StatDetailAffectingMovesIncreaseQueryParam  {

        @jakarta.ws.rs.QueryParam("change")
        private Integer change;
        @jakarta.ws.rs.QueryParam("move")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea move;

        /**
        * Get change
        * @return change
        **/
        @JsonProperty("change")
        public Integer getChange() {
            return change;
        }

        /**
         * Set change
         **/
        public void setChange(Integer change) {
            this.change = change;
        }

        public StatDetailAffectingMovesIncreaseQueryParam change(Integer change) {
            this.change = change;
            return this;
        }

        /**
        * Get move
        * @return move
        **/
        @JsonProperty("move")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getMove() {
            return move;
        }

        /**
         * Set move
         **/
        public void setMove(PokemonEncountersRetrieve200ResponseInnerLocationArea move) {
            this.move = move;
        }

        public StatDetailAffectingMovesIncreaseQueryParam move(PokemonEncountersRetrieve200ResponseInnerLocationArea move) {
            this.move = move;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StatDetailAffectingMovesIncreaseQueryParam {\n");

            sb.append("    change: ").append(toIndentedString(change)).append("\n");
            sb.append("    move: ").append(toIndentedString(move)).append("\n");
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
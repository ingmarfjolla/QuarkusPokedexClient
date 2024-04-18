package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatDetailAffectingMoves  {

    private StatDetailAffectingMovesIncrease increase;
    private StatDetailAffectingMovesIncrease decrease;

    /**
    * Get increase
    * @return increase
    **/
    @JsonProperty("increase")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public StatDetailAffectingMovesIncrease getIncrease() {
        return increase;
    }

    /**
     * Set increase
     **/
    public void setIncrease(StatDetailAffectingMovesIncrease increase) {
        this.increase = increase;
    }

    public StatDetailAffectingMoves increase(StatDetailAffectingMovesIncrease increase) {
        this.increase = increase;
        return this;
    }

    /**
    * Get decrease
    * @return decrease
    **/
    @JsonProperty("decrease")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public StatDetailAffectingMovesIncrease getDecrease() {
        return decrease;
    }

    /**
     * Set decrease
     **/
    public void setDecrease(StatDetailAffectingMovesIncrease decrease) {
        this.decrease = decrease;
    }

    public StatDetailAffectingMoves decrease(StatDetailAffectingMovesIncrease decrease) {
        this.decrease = decrease;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatDetailAffectingMoves {\n");

        sb.append("    increase: ").append(toIndentedString(increase)).append("\n");
        sb.append("    decrease: ").append(toIndentedString(decrease)).append("\n");
        
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
    public static class StatDetailAffectingMovesQueryParam  {

        @jakarta.ws.rs.QueryParam("increase")
        private StatDetailAffectingMovesIncrease increase;
        @jakarta.ws.rs.QueryParam("decrease")
        private StatDetailAffectingMovesIncrease decrease;

        /**
        * Get increase
        * @return increase
        **/
        @JsonProperty("increase")
        public StatDetailAffectingMovesIncrease getIncrease() {
            return increase;
        }

        /**
         * Set increase
         **/
        public void setIncrease(StatDetailAffectingMovesIncrease increase) {
            this.increase = increase;
        }

        public StatDetailAffectingMovesQueryParam increase(StatDetailAffectingMovesIncrease increase) {
            this.increase = increase;
            return this;
        }

        /**
        * Get decrease
        * @return decrease
        **/
        @JsonProperty("decrease")
        public StatDetailAffectingMovesIncrease getDecrease() {
            return decrease;
        }

        /**
         * Set decrease
         **/
        public void setDecrease(StatDetailAffectingMovesIncrease decrease) {
            this.decrease = decrease;
        }

        public StatDetailAffectingMovesQueryParam decrease(StatDetailAffectingMovesIncrease decrease) {
            this.decrease = decrease;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StatDetailAffectingMovesQueryParam {\n");

            sb.append("    increase: ").append(toIndentedString(increase)).append("\n");
            sb.append("    decrease: ").append(toIndentedString(decrease)).append("\n");
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
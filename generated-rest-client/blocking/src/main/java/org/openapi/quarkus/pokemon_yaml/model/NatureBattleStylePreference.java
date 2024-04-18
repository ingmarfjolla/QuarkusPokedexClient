package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NatureBattleStylePreference  {

    private Integer lowHpPreference;
    private Integer highHpPreference;
    private MoveBattleStyleSummary moveBattleStyle;

    /**
    * Get lowHpPreference
    * minimum: -2147483648
    * maximum: 2147483647
    * @return lowHpPreference
    **/
    @JsonProperty("low_hp_preference")
    public Integer getLowHpPreference() {
        return lowHpPreference;
    }

    /**
     * Set lowHpPreference
     **/
    public void setLowHpPreference(Integer lowHpPreference) {
        this.lowHpPreference = lowHpPreference;
    }

    public NatureBattleStylePreference lowHpPreference(Integer lowHpPreference) {
        this.lowHpPreference = lowHpPreference;
        return this;
    }

    /**
    * Get highHpPreference
    * minimum: -2147483648
    * maximum: 2147483647
    * @return highHpPreference
    **/
    @JsonProperty("high_hp_preference")
    public Integer getHighHpPreference() {
        return highHpPreference;
    }

    /**
     * Set highHpPreference
     **/
    public void setHighHpPreference(Integer highHpPreference) {
        this.highHpPreference = highHpPreference;
    }

    public NatureBattleStylePreference highHpPreference(Integer highHpPreference) {
        this.highHpPreference = highHpPreference;
        return this;
    }

    /**
    * Get moveBattleStyle
    * @return moveBattleStyle
    **/
    @JsonProperty("move_battle_style")
    public MoveBattleStyleSummary getMoveBattleStyle() {
        return moveBattleStyle;
    }

    /**
     * Set moveBattleStyle
     **/
    public void setMoveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
        this.moveBattleStyle = moveBattleStyle;
    }

    public NatureBattleStylePreference moveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
        this.moveBattleStyle = moveBattleStyle;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NatureBattleStylePreference {\n");

        sb.append("    lowHpPreference: ").append(toIndentedString(lowHpPreference)).append("\n");
        sb.append("    highHpPreference: ").append(toIndentedString(highHpPreference)).append("\n");
        sb.append("    moveBattleStyle: ").append(toIndentedString(moveBattleStyle)).append("\n");
        
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
    public static class NatureBattleStylePreferenceQueryParam  {

        @jakarta.ws.rs.QueryParam("lowHpPreference")
        private Integer lowHpPreference;
        @jakarta.ws.rs.QueryParam("highHpPreference")
        private Integer highHpPreference;
        @jakarta.ws.rs.QueryParam("moveBattleStyle")
        private MoveBattleStyleSummary moveBattleStyle;

        /**
        * Get lowHpPreference
        * minimum: -2147483648
        * maximum: 2147483647
        * @return lowHpPreference
        **/
        @JsonProperty("low_hp_preference")
        public Integer getLowHpPreference() {
            return lowHpPreference;
        }

        /**
         * Set lowHpPreference
         **/
        public void setLowHpPreference(Integer lowHpPreference) {
            this.lowHpPreference = lowHpPreference;
        }

        public NatureBattleStylePreferenceQueryParam lowHpPreference(Integer lowHpPreference) {
            this.lowHpPreference = lowHpPreference;
            return this;
        }

        /**
        * Get highHpPreference
        * minimum: -2147483648
        * maximum: 2147483647
        * @return highHpPreference
        **/
        @JsonProperty("high_hp_preference")
        public Integer getHighHpPreference() {
            return highHpPreference;
        }

        /**
         * Set highHpPreference
         **/
        public void setHighHpPreference(Integer highHpPreference) {
            this.highHpPreference = highHpPreference;
        }

        public NatureBattleStylePreferenceQueryParam highHpPreference(Integer highHpPreference) {
            this.highHpPreference = highHpPreference;
            return this;
        }

        /**
        * Get moveBattleStyle
        * @return moveBattleStyle
        **/
        @JsonProperty("move_battle_style")
        public MoveBattleStyleSummary getMoveBattleStyle() {
            return moveBattleStyle;
        }

        /**
         * Set moveBattleStyle
         **/
        public void setMoveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
            this.moveBattleStyle = moveBattleStyle;
        }

        public NatureBattleStylePreferenceQueryParam moveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
            this.moveBattleStyle = moveBattleStyle;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NatureBattleStylePreferenceQueryParam {\n");

            sb.append("    lowHpPreference: ").append(toIndentedString(lowHpPreference)).append("\n");
            sb.append("    highHpPreference: ").append(toIndentedString(highHpPreference)).append("\n");
            sb.append("    moveBattleStyle: ").append(toIndentedString(moveBattleStyle)).append("\n");
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
package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonStat  {

    private Integer baseStat;
    private Integer effort;
    private StatSummary stat;

    /**
    * Get baseStat
    * minimum: -2147483648
    * maximum: 2147483647
    * @return baseStat
    **/
    @JsonProperty("base_stat")
    public Integer getBaseStat() {
        return baseStat;
    }

    /**
     * Set baseStat
     **/
    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

    public PokemonStat baseStat(Integer baseStat) {
        this.baseStat = baseStat;
        return this;
    }

    /**
    * Get effort
    * minimum: -2147483648
    * maximum: 2147483647
    * @return effort
    **/
    @JsonProperty("effort")
    public Integer getEffort() {
        return effort;
    }

    /**
     * Set effort
     **/
    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    public PokemonStat effort(Integer effort) {
        this.effort = effort;
        return this;
    }

    /**
    * Get stat
    * @return stat
    **/
    @JsonProperty("stat")
    public StatSummary getStat() {
        return stat;
    }

    /**
     * Set stat
     **/
    public void setStat(StatSummary stat) {
        this.stat = stat;
    }

    public PokemonStat stat(StatSummary stat) {
        this.stat = stat;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonStat {\n");

        sb.append("    baseStat: ").append(toIndentedString(baseStat)).append("\n");
        sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
        sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
        
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
    public static class PokemonStatQueryParam  {

        @jakarta.ws.rs.QueryParam("baseStat")
        private Integer baseStat;
        @jakarta.ws.rs.QueryParam("effort")
        private Integer effort;
        @jakarta.ws.rs.QueryParam("stat")
        private StatSummary stat;

        /**
        * Get baseStat
        * minimum: -2147483648
        * maximum: 2147483647
        * @return baseStat
        **/
        @JsonProperty("base_stat")
        public Integer getBaseStat() {
            return baseStat;
        }

        /**
         * Set baseStat
         **/
        public void setBaseStat(Integer baseStat) {
            this.baseStat = baseStat;
        }

        public PokemonStatQueryParam baseStat(Integer baseStat) {
            this.baseStat = baseStat;
            return this;
        }

        /**
        * Get effort
        * minimum: -2147483648
        * maximum: 2147483647
        * @return effort
        **/
        @JsonProperty("effort")
        public Integer getEffort() {
            return effort;
        }

        /**
         * Set effort
         **/
        public void setEffort(Integer effort) {
            this.effort = effort;
        }

        public PokemonStatQueryParam effort(Integer effort) {
            this.effort = effort;
            return this;
        }

        /**
        * Get stat
        * @return stat
        **/
        @JsonProperty("stat")
        public StatSummary getStat() {
            return stat;
        }

        /**
         * Set stat
         **/
        public void setStat(StatSummary stat) {
            this.stat = stat;
        }

        public PokemonStatQueryParam stat(StatSummary stat) {
            this.stat = stat;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonStatQueryParam {\n");

            sb.append("    baseStat: ").append(toIndentedString(baseStat)).append("\n");
            sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
            sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
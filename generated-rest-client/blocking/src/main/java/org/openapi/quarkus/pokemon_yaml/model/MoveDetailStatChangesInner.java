package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveDetailStatChangesInner  {

    private Integer change;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea stat;

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

    public MoveDetailStatChangesInner change(Integer change) {
        this.change = change;
        return this;
    }

    /**
    * Get stat
    * @return stat
    **/
    @JsonProperty("stat")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getStat() {
        return stat;
    }

    /**
     * Set stat
     **/
    public void setStat(PokemonEncountersRetrieve200ResponseInnerLocationArea stat) {
        this.stat = stat;
    }

    public MoveDetailStatChangesInner stat(PokemonEncountersRetrieve200ResponseInnerLocationArea stat) {
        this.stat = stat;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveDetailStatChangesInner {\n");

        sb.append("    change: ").append(toIndentedString(change)).append("\n");
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
    public static class MoveDetailStatChangesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("change")
        private Integer change;
        @jakarta.ws.rs.QueryParam("stat")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea stat;

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

        public MoveDetailStatChangesInnerQueryParam change(Integer change) {
            this.change = change;
            return this;
        }

        /**
        * Get stat
        * @return stat
        **/
        @JsonProperty("stat")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getStat() {
            return stat;
        }

        /**
         * Set stat
         **/
        public void setStat(PokemonEncountersRetrieve200ResponseInnerLocationArea stat) {
            this.stat = stat;
        }

        public MoveDetailStatChangesInnerQueryParam stat(PokemonEncountersRetrieve200ResponseInnerLocationArea stat) {
            this.stat = stat;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveDetailStatChangesInnerQueryParam {\n");

            sb.append("    change: ").append(toIndentedString(change)).append("\n");
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
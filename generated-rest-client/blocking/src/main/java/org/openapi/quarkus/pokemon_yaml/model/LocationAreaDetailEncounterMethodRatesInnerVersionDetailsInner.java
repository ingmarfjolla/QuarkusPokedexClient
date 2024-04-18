package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner  {

    private Integer rate;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea version;

    /**
    * Get rate
    * @return rate
    **/
    @JsonProperty("rate")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRate() {
        return rate;
    }

    /**
     * Set rate
     **/
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner rate(Integer rate) {
        this.rate = rate;
        return this;
    }

    /**
    * Get version
    * @return version
    **/
    @JsonProperty("version")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getVersion() {
        return version;
    }

    /**
     * Set version
     **/
    public void setVersion(PokemonEncountersRetrieve200ResponseInnerLocationArea version) {
        this.version = version;
    }

    public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner version(PokemonEncountersRetrieve200ResponseInnerLocationArea version) {
        this.version = version;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner {\n");

        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        
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
    public static class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("rate")
        private Integer rate;
        @jakarta.ws.rs.QueryParam("version")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea version;

        /**
        * Get rate
        * @return rate
        **/
        @JsonProperty("rate")
        public Integer getRate() {
            return rate;
        }

        /**
         * Set rate
         **/
        public void setRate(Integer rate) {
            this.rate = rate;
        }

        public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerQueryParam rate(Integer rate) {
            this.rate = rate;
            return this;
        }

        /**
        * Get version
        * @return version
        **/
        @JsonProperty("version")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getVersion() {
            return version;
        }

        /**
         * Set version
         **/
        public void setVersion(PokemonEncountersRetrieve200ResponseInnerLocationArea version) {
            this.version = version;
        }

        public LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerQueryParam version(PokemonEncountersRetrieve200ResponseInnerLocationArea version) {
            this.version = version;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerQueryParam {\n");

            sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
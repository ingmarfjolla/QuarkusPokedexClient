package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSpeciesDetailPalParkEncountersInner  {

    private Integer baseScore;
    private Integer rate;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea area;

    /**
    * Get baseScore
    * @return baseScore
    **/
    @JsonProperty("base_score")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getBaseScore() {
        return baseScore;
    }

    /**
     * Set baseScore
     **/
    public void setBaseScore(Integer baseScore) {
        this.baseScore = baseScore;
    }

    public PokemonSpeciesDetailPalParkEncountersInner baseScore(Integer baseScore) {
        this.baseScore = baseScore;
        return this;
    }

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

    public PokemonSpeciesDetailPalParkEncountersInner rate(Integer rate) {
        this.rate = rate;
        return this;
    }

    /**
    * Get area
    * @return area
    **/
    @JsonProperty("area")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getArea() {
        return area;
    }

    /**
     * Set area
     **/
    public void setArea(PokemonEncountersRetrieve200ResponseInnerLocationArea area) {
        this.area = area;
    }

    public PokemonSpeciesDetailPalParkEncountersInner area(PokemonEncountersRetrieve200ResponseInnerLocationArea area) {
        this.area = area;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpeciesDetailPalParkEncountersInner {\n");

        sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        
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
    public static class PokemonSpeciesDetailPalParkEncountersInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("baseScore")
        private Integer baseScore;
        @jakarta.ws.rs.QueryParam("rate")
        private Integer rate;
        @jakarta.ws.rs.QueryParam("area")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea area;

        /**
        * Get baseScore
        * @return baseScore
        **/
        @JsonProperty("base_score")
        public Integer getBaseScore() {
            return baseScore;
        }

        /**
         * Set baseScore
         **/
        public void setBaseScore(Integer baseScore) {
            this.baseScore = baseScore;
        }

        public PokemonSpeciesDetailPalParkEncountersInnerQueryParam baseScore(Integer baseScore) {
            this.baseScore = baseScore;
            return this;
        }

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

        public PokemonSpeciesDetailPalParkEncountersInnerQueryParam rate(Integer rate) {
            this.rate = rate;
            return this;
        }

        /**
        * Get area
        * @return area
        **/
        @JsonProperty("area")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getArea() {
            return area;
        }

        /**
         * Set area
         **/
        public void setArea(PokemonEncountersRetrieve200ResponseInnerLocationArea area) {
            this.area = area;
        }

        public PokemonSpeciesDetailPalParkEncountersInnerQueryParam area(PokemonEncountersRetrieve200ResponseInnerLocationArea area) {
            this.area = area;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonSpeciesDetailPalParkEncountersInnerQueryParam {\n");

            sb.append("    baseScore: ").append(toIndentedString(baseScore)).append("\n");
            sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
            sb.append("    area: ").append(toIndentedString(area)).append("\n");
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
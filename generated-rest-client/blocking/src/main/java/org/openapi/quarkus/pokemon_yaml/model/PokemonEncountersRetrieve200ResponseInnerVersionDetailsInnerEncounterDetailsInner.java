package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner  {

    private Integer minLevel;
    private Integer maxLevel;
    private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> conditionValues;
    private Integer chance;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea method;

    /**
    * Get minLevel
    * @return minLevel
    **/
    @JsonProperty("min_level")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMinLevel() {
        return minLevel;
    }

    /**
     * Set minLevel
     **/
    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner minLevel(Integer minLevel) {
        this.minLevel = minLevel;
        return this;
    }

    /**
    * Get maxLevel
    * @return maxLevel
    **/
    @JsonProperty("max_level")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMaxLevel() {
        return maxLevel;
    }

    /**
     * Set maxLevel
     **/
    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner maxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
        return this;
    }

    /**
    * Get conditionValues
    * @return conditionValues
    **/
    @JsonProperty("condition_values")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getConditionValues() {
        return conditionValues;
    }

    /**
     * Set conditionValues
     **/
    public void setConditionValues(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> conditionValues) {
        this.conditionValues = conditionValues;
    }

    public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner conditionValues(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> conditionValues) {
        this.conditionValues = conditionValues;
        return this;
    }
    public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner addConditionValuesItem(PokemonEncountersRetrieve200ResponseInnerLocationArea conditionValuesItem) {
        if (this.conditionValues == null){
            conditionValues = new ArrayList<>();
        }
        this.conditionValues.add(conditionValuesItem);
        return this;
    }

    /**
    * Get chance
    * @return chance
    **/
    @JsonProperty("chance")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getChance() {
        return chance;
    }

    /**
     * Set chance
     **/
    public void setChance(Integer chance) {
        this.chance = chance;
    }

    public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner chance(Integer chance) {
        this.chance = chance;
        return this;
    }

    /**
    * Get method
    * @return method
    **/
    @JsonProperty("method")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getMethod() {
        return method;
    }

    /**
     * Set method
     **/
    public void setMethod(PokemonEncountersRetrieve200ResponseInnerLocationArea method) {
        this.method = method;
    }

    public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner method(PokemonEncountersRetrieve200ResponseInnerLocationArea method) {
        this.method = method;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner {\n");

        sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
        sb.append("    maxLevel: ").append(toIndentedString(maxLevel)).append("\n");
        sb.append("    conditionValues: ").append(toIndentedString(conditionValues)).append("\n");
        sb.append("    chance: ").append(toIndentedString(chance)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        
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
    public static class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("minLevel")
        private Integer minLevel;
        @jakarta.ws.rs.QueryParam("maxLevel")
        private Integer maxLevel;
        @jakarta.ws.rs.QueryParam("conditionValues")
        private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> conditionValues = null;
        @jakarta.ws.rs.QueryParam("chance")
        private Integer chance;
        @jakarta.ws.rs.QueryParam("method")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea method;

        /**
        * Get minLevel
        * @return minLevel
        **/
        @JsonProperty("min_level")
        public Integer getMinLevel() {
            return minLevel;
        }

        /**
         * Set minLevel
         **/
        public void setMinLevel(Integer minLevel) {
            this.minLevel = minLevel;
        }

        public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerQueryParam minLevel(Integer minLevel) {
            this.minLevel = minLevel;
            return this;
        }

        /**
        * Get maxLevel
        * @return maxLevel
        **/
        @JsonProperty("max_level")
        public Integer getMaxLevel() {
            return maxLevel;
        }

        /**
         * Set maxLevel
         **/
        public void setMaxLevel(Integer maxLevel) {
            this.maxLevel = maxLevel;
        }

        public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerQueryParam maxLevel(Integer maxLevel) {
            this.maxLevel = maxLevel;
            return this;
        }

        /**
        * Get conditionValues
        * @return conditionValues
        **/
        @JsonProperty("condition_values")
        public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getConditionValues() {
            return conditionValues;
        }

        /**
         * Set conditionValues
         **/
        public void setConditionValues(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> conditionValues) {
            this.conditionValues = conditionValues;
        }

        public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerQueryParam conditionValues(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerQueryParam addConditionValuesItem(PokemonEncountersRetrieve200ResponseInnerLocationArea conditionValuesItem) {
            this.conditionValues.add(conditionValuesItem);
            return this;
        }

        /**
        * Get chance
        * @return chance
        **/
        @JsonProperty("chance")
        public Integer getChance() {
            return chance;
        }

        /**
         * Set chance
         **/
        public void setChance(Integer chance) {
            this.chance = chance;
        }

        public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerQueryParam chance(Integer chance) {
            this.chance = chance;
            return this;
        }

        /**
        * Get method
        * @return method
        **/
        @JsonProperty("method")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getMethod() {
            return method;
        }

        /**
         * Set method
         **/
        public void setMethod(PokemonEncountersRetrieve200ResponseInnerLocationArea method) {
            this.method = method;
        }

        public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerQueryParam method(PokemonEncountersRetrieve200ResponseInnerLocationArea method) {
            this.method = method;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerQueryParam {\n");

            sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
            sb.append("    maxLevel: ").append(toIndentedString(maxLevel)).append("\n");
            sb.append("    conditionValues: ").append(toIndentedString(conditionValues)).append("\n");
            sb.append("    chance: ").append(toIndentedString(chance)).append("\n");
            sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
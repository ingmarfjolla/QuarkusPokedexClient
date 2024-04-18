package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatDetailAffectingNatures  {

    private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> increase;
    private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> decrease;

    /**
    * Get increase
    * @return increase
    **/
    @JsonProperty("increase")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getIncrease() {
        return increase;
    }

    /**
     * Set increase
     **/
    public void setIncrease(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> increase) {
        this.increase = increase;
    }

    public StatDetailAffectingNatures increase(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> increase) {
        this.increase = increase;
        return this;
    }
    public StatDetailAffectingNatures addIncreaseItem(PokemonEncountersRetrieve200ResponseInnerLocationArea increaseItem) {
        if (this.increase == null){
            increase = new ArrayList<>();
        }
        this.increase.add(increaseItem);
        return this;
    }

    /**
    * Get decrease
    * @return decrease
    **/
    @JsonProperty("decrease")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getDecrease() {
        return decrease;
    }

    /**
     * Set decrease
     **/
    public void setDecrease(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> decrease) {
        this.decrease = decrease;
    }

    public StatDetailAffectingNatures decrease(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> decrease) {
        this.decrease = decrease;
        return this;
    }
    public StatDetailAffectingNatures addDecreaseItem(PokemonEncountersRetrieve200ResponseInnerLocationArea decreaseItem) {
        if (this.decrease == null){
            decrease = new ArrayList<>();
        }
        this.decrease.add(decreaseItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatDetailAffectingNatures {\n");

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
    public static class StatDetailAffectingNaturesQueryParam  {

        @jakarta.ws.rs.QueryParam("increase")
        private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> increase = null;
        @jakarta.ws.rs.QueryParam("decrease")
        private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> decrease = null;

        /**
        * Get increase
        * @return increase
        **/
        @JsonProperty("increase")
        public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getIncrease() {
            return increase;
        }

        /**
         * Set increase
         **/
        public void setIncrease(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> increase) {
            this.increase = increase;
        }

        public StatDetailAffectingNaturesQueryParam increase(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> increase) {
            this.increase = increase;
            return this;
        }
        public StatDetailAffectingNaturesQueryParam addIncreaseItem(PokemonEncountersRetrieve200ResponseInnerLocationArea increaseItem) {
            this.increase.add(increaseItem);
            return this;
        }

        /**
        * Get decrease
        * @return decrease
        **/
        @JsonProperty("decrease")
        public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getDecrease() {
            return decrease;
        }

        /**
         * Set decrease
         **/
        public void setDecrease(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> decrease) {
            this.decrease = decrease;
        }

        public StatDetailAffectingNaturesQueryParam decrease(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> decrease) {
            this.decrease = decrease;
            return this;
        }
        public StatDetailAffectingNaturesQueryParam addDecreaseItem(PokemonEncountersRetrieve200ResponseInnerLocationArea decreaseItem) {
            this.decrease.add(decreaseItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StatDetailAffectingNaturesQueryParam {\n");

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
package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokeathlonStatDetailAffectingNaturesInner  {

    private List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> increase;
    private List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> decrease;

    /**
    * Get increase
    * @return increase
    **/
    @JsonProperty("increase")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> getIncrease() {
        return increase;
    }

    /**
     * Set increase
     **/
    public void setIncrease(List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> increase) {
        this.increase = increase;
    }

    public PokeathlonStatDetailAffectingNaturesInner increase(List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> increase) {
        this.increase = increase;
        return this;
    }
    public PokeathlonStatDetailAffectingNaturesInner addIncreaseItem(PokeathlonStatDetailAffectingNaturesInnerIncreaseInner increaseItem) {
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
    public List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> getDecrease() {
        return decrease;
    }

    /**
     * Set decrease
     **/
    public void setDecrease(List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> decrease) {
        this.decrease = decrease;
    }

    public PokeathlonStatDetailAffectingNaturesInner decrease(List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> decrease) {
        this.decrease = decrease;
        return this;
    }
    public PokeathlonStatDetailAffectingNaturesInner addDecreaseItem(PokeathlonStatDetailAffectingNaturesInnerIncreaseInner decreaseItem) {
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
        sb.append("class PokeathlonStatDetailAffectingNaturesInner {\n");

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
    public static class PokeathlonStatDetailAffectingNaturesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("increase")
        private List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> increase = null;
        @jakarta.ws.rs.QueryParam("decrease")
        private List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> decrease = null;

        /**
        * Get increase
        * @return increase
        **/
        @JsonProperty("increase")
        public List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> getIncrease() {
            return increase;
        }

        /**
         * Set increase
         **/
        public void setIncrease(List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> increase) {
            this.increase = increase;
        }

        public PokeathlonStatDetailAffectingNaturesInnerQueryParam increase(List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> increase) {
            this.increase = increase;
            return this;
        }
        public PokeathlonStatDetailAffectingNaturesInnerQueryParam addIncreaseItem(PokeathlonStatDetailAffectingNaturesInnerIncreaseInner increaseItem) {
            this.increase.add(increaseItem);
            return this;
        }

        /**
        * Get decrease
        * @return decrease
        **/
        @JsonProperty("decrease")
        public List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> getDecrease() {
            return decrease;
        }

        /**
         * Set decrease
         **/
        public void setDecrease(List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> decrease) {
            this.decrease = decrease;
        }

        public PokeathlonStatDetailAffectingNaturesInnerQueryParam decrease(List<PokeathlonStatDetailAffectingNaturesInnerIncreaseInner> decrease) {
            this.decrease = decrease;
            return this;
        }
        public PokeathlonStatDetailAffectingNaturesInnerQueryParam addDecreaseItem(PokeathlonStatDetailAffectingNaturesInnerIncreaseInner decreaseItem) {
            this.decrease.add(decreaseItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokeathlonStatDetailAffectingNaturesInnerQueryParam {\n");

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
package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EvolutionChainDetail  {

    private Integer id;
    private ItemSummary babyTriggerItem;
    private EvolutionChainDetailChain chain;

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }


    /**
    * Get babyTriggerItem
    * @return babyTriggerItem
    **/
    @JsonProperty("baby_trigger_item")
    public ItemSummary getBabyTriggerItem() {
        return babyTriggerItem;
    }

    /**
     * Set babyTriggerItem
     **/
    public void setBabyTriggerItem(ItemSummary babyTriggerItem) {
        this.babyTriggerItem = babyTriggerItem;
    }

    public EvolutionChainDetail babyTriggerItem(ItemSummary babyTriggerItem) {
        this.babyTriggerItem = babyTriggerItem;
        return this;
    }

    /**
    * Get chain
    * @return chain
    **/
    @JsonProperty("chain")
    public EvolutionChainDetailChain getChain() {
        return chain;
    }

    /**
     * Set chain
     **/
    public void setChain(EvolutionChainDetailChain chain) {
        this.chain = chain;
    }

    public EvolutionChainDetail chain(EvolutionChainDetailChain chain) {
        this.chain = chain;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvolutionChainDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    babyTriggerItem: ").append(toIndentedString(babyTriggerItem)).append("\n");
        sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
        
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
    public static class EvolutionChainDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("babyTriggerItem")
        private ItemSummary babyTriggerItem;
        @jakarta.ws.rs.QueryParam("chain")
        private EvolutionChainDetailChain chain;

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }


        /**
        * Get babyTriggerItem
        * @return babyTriggerItem
        **/
        @JsonProperty("baby_trigger_item")
        public ItemSummary getBabyTriggerItem() {
            return babyTriggerItem;
        }

        /**
         * Set babyTriggerItem
         **/
        public void setBabyTriggerItem(ItemSummary babyTriggerItem) {
            this.babyTriggerItem = babyTriggerItem;
        }

        public EvolutionChainDetailQueryParam babyTriggerItem(ItemSummary babyTriggerItem) {
            this.babyTriggerItem = babyTriggerItem;
            return this;
        }

        /**
        * Get chain
        * @return chain
        **/
        @JsonProperty("chain")
        public EvolutionChainDetailChain getChain() {
            return chain;
        }

        /**
         * Set chain
         **/
        public void setChain(EvolutionChainDetailChain chain) {
            this.chain = chain;
        }

        public EvolutionChainDetailQueryParam chain(EvolutionChainDetailChain chain) {
            this.chain = chain;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EvolutionChainDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    babyTriggerItem: ").append(toIndentedString(babyTriggerItem)).append("\n");
            sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
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
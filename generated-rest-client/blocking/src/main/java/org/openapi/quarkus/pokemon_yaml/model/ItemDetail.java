package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDetail  {

    private Integer id;
    private String name;
    private Integer cost;
    private Integer flingPower;
    private ItemFlingEffectSummary flingEffect;
    private List<ItemAttributeSummary> attributes = new ArrayList<>();
    private ItemCategorySummary category;
    private List<ItemEffectText> effectEntries = new ArrayList<>();
    private List<ItemFlavorText> flavorTextEntries = new ArrayList<>();
    private List<ItemGameIndex> gameIndices = new ArrayList<>();
    private List<ItemName> names = new ArrayList<>();
    private List<ItemDetailHeldByPokemonInner> heldByPokemon = new ArrayList<>();
    private ItemDetailSprites sprites;
    private EvolutionChainSummary babyTriggerFor;
    private List<ItemDetailMachinesInner> machines = new ArrayList<>();

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }


    /**
    * Get name
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public ItemDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get cost
    * minimum: -2147483648
    * maximum: 2147483647
    * @return cost
    **/
    @JsonProperty("cost")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCost() {
        return cost;
    }

    /**
     * Set cost
     **/
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public ItemDetail cost(Integer cost) {
        this.cost = cost;
        return this;
    }

    /**
    * Get flingPower
    * minimum: -2147483648
    * maximum: 2147483647
    * @return flingPower
    **/
    @JsonProperty("fling_power")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFlingPower() {
        return flingPower;
    }

    /**
     * Set flingPower
     **/
    public void setFlingPower(Integer flingPower) {
        this.flingPower = flingPower;
    }

    public ItemDetail flingPower(Integer flingPower) {
        this.flingPower = flingPower;
        return this;
    }

    /**
    * Get flingEffect
    * @return flingEffect
    **/
    @JsonProperty("fling_effect")
    public ItemFlingEffectSummary getFlingEffect() {
        return flingEffect;
    }

    /**
     * Set flingEffect
     **/
    public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
        this.flingEffect = flingEffect;
    }

    public ItemDetail flingEffect(ItemFlingEffectSummary flingEffect) {
        this.flingEffect = flingEffect;
        return this;
    }

    /**
    * Get attributes
    * @return attributes
    **/
    @JsonProperty("attributes")
    public List<ItemAttributeSummary> getAttributes() {
        return attributes;
    }


    /**
    * Get category
    * @return category
    **/
    @JsonProperty("category")
    public ItemCategorySummary getCategory() {
        return category;
    }

    /**
     * Set category
     **/
    public void setCategory(ItemCategorySummary category) {
        this.category = category;
    }

    public ItemDetail category(ItemCategorySummary category) {
        this.category = category;
        return this;
    }

    /**
    * Get effectEntries
    * @return effectEntries
    **/
    @JsonProperty("effect_entries")
    public List<ItemEffectText> getEffectEntries() {
        return effectEntries;
    }


    /**
    * Get flavorTextEntries
    * @return flavorTextEntries
    **/
    @JsonProperty("flavor_text_entries")
    public List<ItemFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }


    /**
    * Get gameIndices
    * @return gameIndices
    **/
    @JsonProperty("game_indices")
    public List<ItemGameIndex> getGameIndices() {
        return gameIndices;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<ItemName> getNames() {
        return names;
    }


    /**
    * Get heldByPokemon
    * @return heldByPokemon
    **/
    @JsonProperty("held_by_pokemon")
    public List<ItemDetailHeldByPokemonInner> getHeldByPokemon() {
        return heldByPokemon;
    }


    /**
    * Get sprites
    * @return sprites
    **/
    @JsonProperty("sprites")
    public ItemDetailSprites getSprites() {
        return sprites;
    }

    /**
     * Set sprites
     **/
    public void setSprites(ItemDetailSprites sprites) {
        this.sprites = sprites;
    }

    public ItemDetail sprites(ItemDetailSprites sprites) {
        this.sprites = sprites;
        return this;
    }

    /**
    * Get babyTriggerFor
    * @return babyTriggerFor
    **/
    @JsonProperty("baby_trigger_for")
    public EvolutionChainSummary getBabyTriggerFor() {
        return babyTriggerFor;
    }


    /**
    * Get machines
    * @return machines
    **/
    @JsonProperty("machines")
    public List<ItemDetailMachinesInner> getMachines() {
        return machines;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb.append("    flingPower: ").append(toIndentedString(flingPower)).append("\n");
        sb.append("    flingEffect: ").append(toIndentedString(flingEffect)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
        sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    heldByPokemon: ").append(toIndentedString(heldByPokemon)).append("\n");
        sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
        sb.append("    babyTriggerFor: ").append(toIndentedString(babyTriggerFor)).append("\n");
        sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
        
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
    public static class ItemDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("cost")
        private Integer cost;
        @jakarta.ws.rs.QueryParam("flingPower")
        private Integer flingPower;
        @jakarta.ws.rs.QueryParam("flingEffect")
        private ItemFlingEffectSummary flingEffect;
        @jakarta.ws.rs.QueryParam("attributes")
        private List<ItemAttributeSummary> attributes = null;
        @jakarta.ws.rs.QueryParam("category")
        private ItemCategorySummary category;
        @jakarta.ws.rs.QueryParam("effectEntries")
        private List<ItemEffectText> effectEntries = null;
        @jakarta.ws.rs.QueryParam("flavorTextEntries")
        private List<ItemFlavorText> flavorTextEntries = null;
        @jakarta.ws.rs.QueryParam("gameIndices")
        private List<ItemGameIndex> gameIndices = null;
        @jakarta.ws.rs.QueryParam("names")
        private List<ItemName> names = null;
        @jakarta.ws.rs.QueryParam("heldByPokemon")
        private List<ItemDetailHeldByPokemonInner> heldByPokemon = null;
        @jakarta.ws.rs.QueryParam("sprites")
        private ItemDetailSprites sprites;
        @jakarta.ws.rs.QueryParam("babyTriggerFor")
        private EvolutionChainSummary babyTriggerFor;
        @jakarta.ws.rs.QueryParam("machines")
        private List<ItemDetailMachinesInner> machines = null;

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }


        /**
        * Get name
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public ItemDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get cost
        * minimum: -2147483648
        * maximum: 2147483647
        * @return cost
        **/
        @JsonProperty("cost")
        public Integer getCost() {
            return cost;
        }

        /**
         * Set cost
         **/
        public void setCost(Integer cost) {
            this.cost = cost;
        }

        public ItemDetailQueryParam cost(Integer cost) {
            this.cost = cost;
            return this;
        }

        /**
        * Get flingPower
        * minimum: -2147483648
        * maximum: 2147483647
        * @return flingPower
        **/
        @JsonProperty("fling_power")
        public Integer getFlingPower() {
            return flingPower;
        }

        /**
         * Set flingPower
         **/
        public void setFlingPower(Integer flingPower) {
            this.flingPower = flingPower;
        }

        public ItemDetailQueryParam flingPower(Integer flingPower) {
            this.flingPower = flingPower;
            return this;
        }

        /**
        * Get flingEffect
        * @return flingEffect
        **/
        @JsonProperty("fling_effect")
        public ItemFlingEffectSummary getFlingEffect() {
            return flingEffect;
        }

        /**
         * Set flingEffect
         **/
        public void setFlingEffect(ItemFlingEffectSummary flingEffect) {
            this.flingEffect = flingEffect;
        }

        public ItemDetailQueryParam flingEffect(ItemFlingEffectSummary flingEffect) {
            this.flingEffect = flingEffect;
            return this;
        }

        /**
        * Get attributes
        * @return attributes
        **/
        @JsonProperty("attributes")
        public List<ItemAttributeSummary> getAttributes() {
            return attributes;
        }


        /**
        * Get category
        * @return category
        **/
        @JsonProperty("category")
        public ItemCategorySummary getCategory() {
            return category;
        }

        /**
         * Set category
         **/
        public void setCategory(ItemCategorySummary category) {
            this.category = category;
        }

        public ItemDetailQueryParam category(ItemCategorySummary category) {
            this.category = category;
            return this;
        }

        /**
        * Get effectEntries
        * @return effectEntries
        **/
        @JsonProperty("effect_entries")
        public List<ItemEffectText> getEffectEntries() {
            return effectEntries;
        }


        /**
        * Get flavorTextEntries
        * @return flavorTextEntries
        **/
        @JsonProperty("flavor_text_entries")
        public List<ItemFlavorText> getFlavorTextEntries() {
            return flavorTextEntries;
        }


        /**
        * Get gameIndices
        * @return gameIndices
        **/
        @JsonProperty("game_indices")
        public List<ItemGameIndex> getGameIndices() {
            return gameIndices;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<ItemName> getNames() {
            return names;
        }


        /**
        * Get heldByPokemon
        * @return heldByPokemon
        **/
        @JsonProperty("held_by_pokemon")
        public List<ItemDetailHeldByPokemonInner> getHeldByPokemon() {
            return heldByPokemon;
        }


        /**
        * Get sprites
        * @return sprites
        **/
        @JsonProperty("sprites")
        public ItemDetailSprites getSprites() {
            return sprites;
        }

        /**
         * Set sprites
         **/
        public void setSprites(ItemDetailSprites sprites) {
            this.sprites = sprites;
        }

        public ItemDetailQueryParam sprites(ItemDetailSprites sprites) {
            this.sprites = sprites;
            return this;
        }

        /**
        * Get babyTriggerFor
        * @return babyTriggerFor
        **/
        @JsonProperty("baby_trigger_for")
        public EvolutionChainSummary getBabyTriggerFor() {
            return babyTriggerFor;
        }


        /**
        * Get machines
        * @return machines
        **/
        @JsonProperty("machines")
        public List<ItemDetailMachinesInner> getMachines() {
            return machines;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ItemDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
            sb.append("    flingPower: ").append(toIndentedString(flingPower)).append("\n");
            sb.append("    flingEffect: ").append(toIndentedString(flingEffect)).append("\n");
            sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
            sb.append("    category: ").append(toIndentedString(category)).append("\n");
            sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
            sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
            sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    heldByPokemon: ").append(toIndentedString(heldByPokemon)).append("\n");
            sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
            sb.append("    babyTriggerFor: ").append(toIndentedString(babyTriggerFor)).append("\n");
            sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
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
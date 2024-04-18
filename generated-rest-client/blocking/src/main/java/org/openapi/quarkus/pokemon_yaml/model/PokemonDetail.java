package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetail  {

    private Integer id;
    private String name;
    private Integer baseExperience;
    private Integer height;
    private Boolean isDefault;
    private Integer order;
    private Integer weight;
    private List<PokemonDetailAbilitiesInner> abilities = new ArrayList<>();
    private List<PokemonDetailPastAbilitiesInner> pastAbilities = new ArrayList<>();
    private List<PokemonFormSummary> forms = new ArrayList<>();
    private List<PokemonGameIndex> gameIndices = new ArrayList<>();
    private List<PokemonDetailHeldItemsInner> heldItems = new ArrayList<>();
    private String locationAreaEncounters;
    private List<PokemonDetailMovesInner> moves = new ArrayList<>();
    private PokemonSpeciesSummary species;
    private String sprites;
    private String cries;
    private List<PokemonStat> stats = new ArrayList<>();
    private List<PokemonDetailTypesInner> types = new ArrayList<>();
    private List<PokemonDetailPastTypesInner> pastTypes = new ArrayList<>();

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

    public PokemonDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get baseExperience
    * minimum: -2147483648
    * maximum: 2147483647
    * @return baseExperience
    **/
    @JsonProperty("base_experience")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getBaseExperience() {
        return baseExperience;
    }

    /**
     * Set baseExperience
     **/
    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    public PokemonDetail baseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
        return this;
    }

    /**
    * Get height
    * minimum: -2147483648
    * maximum: 2147483647
    * @return height
    **/
    @JsonProperty("height")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getHeight() {
        return height;
    }

    /**
     * Set height
     **/
    public void setHeight(Integer height) {
        this.height = height;
    }

    public PokemonDetail height(Integer height) {
        this.height = height;
        return this;
    }

    /**
    * Get isDefault
    * @return isDefault
    **/
    @JsonProperty("is_default")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Set isDefault
     **/
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public PokemonDetail isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
    * Get order
    * minimum: -2147483648
    * maximum: 2147483647
    * @return order
    **/
    @JsonProperty("order")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOrder() {
        return order;
    }

    /**
     * Set order
     **/
    public void setOrder(Integer order) {
        this.order = order;
    }

    public PokemonDetail order(Integer order) {
        this.order = order;
        return this;
    }

    /**
    * Get weight
    * minimum: -2147483648
    * maximum: 2147483647
    * @return weight
    **/
    @JsonProperty("weight")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getWeight() {
        return weight;
    }

    /**
     * Set weight
     **/
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public PokemonDetail weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
    * Get abilities
    * @return abilities
    **/
    @JsonProperty("abilities")
    public List<PokemonDetailAbilitiesInner> getAbilities() {
        return abilities;
    }


    /**
    * Get pastAbilities
    * @return pastAbilities
    **/
    @JsonProperty("past_abilities")
    public List<PokemonDetailPastAbilitiesInner> getPastAbilities() {
        return pastAbilities;
    }


    /**
    * Get forms
    * @return forms
    **/
    @JsonProperty("forms")
    public List<PokemonFormSummary> getForms() {
        return forms;
    }


    /**
    * Get gameIndices
    * @return gameIndices
    **/
    @JsonProperty("game_indices")
    public List<PokemonGameIndex> getGameIndices() {
        return gameIndices;
    }


    /**
    * Get heldItems
    * @return heldItems
    **/
    @JsonProperty("held_items")
    public List<PokemonDetailHeldItemsInner> getHeldItems() {
        return heldItems;
    }


    /**
    * Get locationAreaEncounters
    * @return locationAreaEncounters
    **/
    @JsonProperty("location_area_encounters")
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }


    /**
    * Get moves
    * @return moves
    **/
    @JsonProperty("moves")
    public List<PokemonDetailMovesInner> getMoves() {
        return moves;
    }


    /**
    * Get species
    * @return species
    **/
    @JsonProperty("species")
    public PokemonSpeciesSummary getSpecies() {
        return species;
    }

    /**
     * Set species
     **/
    public void setSpecies(PokemonSpeciesSummary species) {
        this.species = species;
    }

    public PokemonDetail species(PokemonSpeciesSummary species) {
        this.species = species;
        return this;
    }

    /**
    * Get sprites
    * @return sprites
    **/
    @JsonProperty("sprites")
    public String getSprites() {
        return sprites;
    }


    /**
    * Get cries
    * @return cries
    **/
    @JsonProperty("cries")
    public String getCries() {
        return cries;
    }


    /**
    * Get stats
    * @return stats
    **/
    @JsonProperty("stats")
    public List<PokemonStat> getStats() {
        return stats;
    }


    /**
    * Get types
    * @return types
    **/
    @JsonProperty("types")
    public List<PokemonDetailTypesInner> getTypes() {
        return types;
    }


    /**
    * Get pastTypes
    * @return pastTypes
    **/
    @JsonProperty("past_types")
    public List<PokemonDetailPastTypesInner> getPastTypes() {
        return pastTypes;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    baseExperience: ").append(toIndentedString(baseExperience)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
        sb.append("    pastAbilities: ").append(toIndentedString(pastAbilities)).append("\n");
        sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
        sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
        sb.append("    heldItems: ").append(toIndentedString(heldItems)).append("\n");
        sb.append("    locationAreaEncounters: ").append(toIndentedString(locationAreaEncounters)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
        sb.append("    species: ").append(toIndentedString(species)).append("\n");
        sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
        sb.append("    cries: ").append(toIndentedString(cries)).append("\n");
        sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    pastTypes: ").append(toIndentedString(pastTypes)).append("\n");
        
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
    public static class PokemonDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("baseExperience")
        private Integer baseExperience;
        @jakarta.ws.rs.QueryParam("height")
        private Integer height;
        @jakarta.ws.rs.QueryParam("isDefault")
        private Boolean isDefault;
        @jakarta.ws.rs.QueryParam("order")
        private Integer order;
        @jakarta.ws.rs.QueryParam("weight")
        private Integer weight;
        @jakarta.ws.rs.QueryParam("abilities")
        private List<PokemonDetailAbilitiesInner> abilities = null;
        @jakarta.ws.rs.QueryParam("pastAbilities")
        private List<PokemonDetailPastAbilitiesInner> pastAbilities = null;
        @jakarta.ws.rs.QueryParam("forms")
        private List<PokemonFormSummary> forms = null;
        @jakarta.ws.rs.QueryParam("gameIndices")
        private List<PokemonGameIndex> gameIndices = null;
        @jakarta.ws.rs.QueryParam("heldItems")
        private List<PokemonDetailHeldItemsInner> heldItems = null;
        @jakarta.ws.rs.QueryParam("locationAreaEncounters")
        private String locationAreaEncounters;
        @jakarta.ws.rs.QueryParam("moves")
        private List<PokemonDetailMovesInner> moves = null;
        @jakarta.ws.rs.QueryParam("species")
        private PokemonSpeciesSummary species;
        @jakarta.ws.rs.QueryParam("sprites")
        private String sprites;
        @jakarta.ws.rs.QueryParam("cries")
        private String cries;
        @jakarta.ws.rs.QueryParam("stats")
        private List<PokemonStat> stats = null;
        @jakarta.ws.rs.QueryParam("types")
        private List<PokemonDetailTypesInner> types = null;
        @jakarta.ws.rs.QueryParam("pastTypes")
        private List<PokemonDetailPastTypesInner> pastTypes = null;

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

        public PokemonDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get baseExperience
        * minimum: -2147483648
        * maximum: 2147483647
        * @return baseExperience
        **/
        @JsonProperty("base_experience")
        public Integer getBaseExperience() {
            return baseExperience;
        }

        /**
         * Set baseExperience
         **/
        public void setBaseExperience(Integer baseExperience) {
            this.baseExperience = baseExperience;
        }

        public PokemonDetailQueryParam baseExperience(Integer baseExperience) {
            this.baseExperience = baseExperience;
            return this;
        }

        /**
        * Get height
        * minimum: -2147483648
        * maximum: 2147483647
        * @return height
        **/
        @JsonProperty("height")
        public Integer getHeight() {
            return height;
        }

        /**
         * Set height
         **/
        public void setHeight(Integer height) {
            this.height = height;
        }

        public PokemonDetailQueryParam height(Integer height) {
            this.height = height;
            return this;
        }

        /**
        * Get isDefault
        * @return isDefault
        **/
        @JsonProperty("is_default")
        public Boolean getIsDefault() {
            return isDefault;
        }

        /**
         * Set isDefault
         **/
        public void setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
        }

        public PokemonDetailQueryParam isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
        * Get order
        * minimum: -2147483648
        * maximum: 2147483647
        * @return order
        **/
        @JsonProperty("order")
        public Integer getOrder() {
            return order;
        }

        /**
         * Set order
         **/
        public void setOrder(Integer order) {
            this.order = order;
        }

        public PokemonDetailQueryParam order(Integer order) {
            this.order = order;
            return this;
        }

        /**
        * Get weight
        * minimum: -2147483648
        * maximum: 2147483647
        * @return weight
        **/
        @JsonProperty("weight")
        public Integer getWeight() {
            return weight;
        }

        /**
         * Set weight
         **/
        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public PokemonDetailQueryParam weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        /**
        * Get abilities
        * @return abilities
        **/
        @JsonProperty("abilities")
        public List<PokemonDetailAbilitiesInner> getAbilities() {
            return abilities;
        }


        /**
        * Get pastAbilities
        * @return pastAbilities
        **/
        @JsonProperty("past_abilities")
        public List<PokemonDetailPastAbilitiesInner> getPastAbilities() {
            return pastAbilities;
        }


        /**
        * Get forms
        * @return forms
        **/
        @JsonProperty("forms")
        public List<PokemonFormSummary> getForms() {
            return forms;
        }


        /**
        * Get gameIndices
        * @return gameIndices
        **/
        @JsonProperty("game_indices")
        public List<PokemonGameIndex> getGameIndices() {
            return gameIndices;
        }


        /**
        * Get heldItems
        * @return heldItems
        **/
        @JsonProperty("held_items")
        public List<PokemonDetailHeldItemsInner> getHeldItems() {
            return heldItems;
        }


        /**
        * Get locationAreaEncounters
        * @return locationAreaEncounters
        **/
        @JsonProperty("location_area_encounters")
        public String getLocationAreaEncounters() {
            return locationAreaEncounters;
        }


        /**
        * Get moves
        * @return moves
        **/
        @JsonProperty("moves")
        public List<PokemonDetailMovesInner> getMoves() {
            return moves;
        }


        /**
        * Get species
        * @return species
        **/
        @JsonProperty("species")
        public PokemonSpeciesSummary getSpecies() {
            return species;
        }

        /**
         * Set species
         **/
        public void setSpecies(PokemonSpeciesSummary species) {
            this.species = species;
        }

        public PokemonDetailQueryParam species(PokemonSpeciesSummary species) {
            this.species = species;
            return this;
        }

        /**
        * Get sprites
        * @return sprites
        **/
        @JsonProperty("sprites")
        public String getSprites() {
            return sprites;
        }


        /**
        * Get cries
        * @return cries
        **/
        @JsonProperty("cries")
        public String getCries() {
            return cries;
        }


        /**
        * Get stats
        * @return stats
        **/
        @JsonProperty("stats")
        public List<PokemonStat> getStats() {
            return stats;
        }


        /**
        * Get types
        * @return types
        **/
        @JsonProperty("types")
        public List<PokemonDetailTypesInner> getTypes() {
            return types;
        }


        /**
        * Get pastTypes
        * @return pastTypes
        **/
        @JsonProperty("past_types")
        public List<PokemonDetailPastTypesInner> getPastTypes() {
            return pastTypes;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    baseExperience: ").append(toIndentedString(baseExperience)).append("\n");
            sb.append("    height: ").append(toIndentedString(height)).append("\n");
            sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
            sb.append("    order: ").append(toIndentedString(order)).append("\n");
            sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
            sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
            sb.append("    pastAbilities: ").append(toIndentedString(pastAbilities)).append("\n");
            sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
            sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
            sb.append("    heldItems: ").append(toIndentedString(heldItems)).append("\n");
            sb.append("    locationAreaEncounters: ").append(toIndentedString(locationAreaEncounters)).append("\n");
            sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
            sb.append("    species: ").append(toIndentedString(species)).append("\n");
            sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
            sb.append("    cries: ").append(toIndentedString(cries)).append("\n");
            sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
            sb.append("    types: ").append(toIndentedString(types)).append("\n");
            sb.append("    pastTypes: ").append(toIndentedString(pastTypes)).append("\n");
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
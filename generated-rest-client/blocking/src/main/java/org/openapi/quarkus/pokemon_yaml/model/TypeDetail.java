package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Serializer for the Type resource
 **/
public class TypeDetail  {

    /**
      * Serializer for the Type resource
     **/
    private Integer id;
    /**
      * Serializer for the Type resource
     **/
    private String name;
    /**
      * Serializer for the Type resource
     **/
    private TypeDetailDamageRelations damageRelations;
    /**
      * Serializer for the Type resource
     **/
    private List<TypeDetailPastDamageRelationsInner> pastDamageRelations = new ArrayList<>();
    /**
      * Serializer for the Type resource
     **/
    private List<TypeGameIndex> gameIndices = new ArrayList<>();
    /**
      * Serializer for the Type resource
     **/
    private GenerationSummary generation;
    /**
      * Serializer for the Type resource
     **/
    private MoveDamageClassSummary moveDamageClass;
    /**
      * Serializer for the Type resource
     **/
    private List<AbilityName> names = new ArrayList<>();
    /**
      * Serializer for the Type resource
     **/
    private List<TypeDetailPokemonInner> pokemon = new ArrayList<>();
    /**
      * Serializer for the Type resource
     **/
    private List<MoveSummary> moves = new ArrayList<>();

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

    public TypeDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get damageRelations
    * @return damageRelations
    **/
    @JsonProperty("damage_relations")
    public TypeDetailDamageRelations getDamageRelations() {
        return damageRelations;
    }

    /**
     * Set damageRelations
     **/
    public void setDamageRelations(TypeDetailDamageRelations damageRelations) {
        this.damageRelations = damageRelations;
    }

    public TypeDetail damageRelations(TypeDetailDamageRelations damageRelations) {
        this.damageRelations = damageRelations;
        return this;
    }

    /**
    * Get pastDamageRelations
    * @return pastDamageRelations
    **/
    @JsonProperty("past_damage_relations")
    public List<TypeDetailPastDamageRelationsInner> getPastDamageRelations() {
        return pastDamageRelations;
    }


    /**
    * Get gameIndices
    * @return gameIndices
    **/
    @JsonProperty("game_indices")
    public List<TypeGameIndex> getGameIndices() {
        return gameIndices;
    }


    /**
    * Get generation
    * @return generation
    **/
    @JsonProperty("generation")
    public GenerationSummary getGeneration() {
        return generation;
    }

    /**
     * Set generation
     **/
    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    public TypeDetail generation(GenerationSummary generation) {
        this.generation = generation;
        return this;
    }

    /**
    * Get moveDamageClass
    * @return moveDamageClass
    **/
    @JsonProperty("move_damage_class")
    public MoveDamageClassSummary getMoveDamageClass() {
        return moveDamageClass;
    }

    /**
     * Set moveDamageClass
     **/
    public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
    }

    public TypeDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
        return this;
    }

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<AbilityName> getNames() {
        return names;
    }


    /**
    * Get pokemon
    * @return pokemon
    **/
    @JsonProperty("pokemon")
    public List<TypeDetailPokemonInner> getPokemon() {
        return pokemon;
    }


    /**
    * Get moves
    * @return moves
    **/
    @JsonProperty("moves")
    public List<MoveSummary> getMoves() {
        return moves;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    damageRelations: ").append(toIndentedString(damageRelations)).append("\n");
        sb.append("    pastDamageRelations: ").append(toIndentedString(pastDamageRelations)).append("\n");
        sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    moveDamageClass: ").append(toIndentedString(moveDamageClass)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
        
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
    /**
      * Serializer for the Type resource
     **/
    public static class TypeDetailQueryParam  {

        /**
          * Serializer for the Type resource
         **/
        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        /**
          * Serializer for the Type resource
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
          * Serializer for the Type resource
         **/
        @jakarta.ws.rs.QueryParam("damageRelations")
        private TypeDetailDamageRelations damageRelations;
        /**
          * Serializer for the Type resource
         **/
        @jakarta.ws.rs.QueryParam("pastDamageRelations")
        private List<TypeDetailPastDamageRelationsInner> pastDamageRelations = null;
        /**
          * Serializer for the Type resource
         **/
        @jakarta.ws.rs.QueryParam("gameIndices")
        private List<TypeGameIndex> gameIndices = null;
        /**
          * Serializer for the Type resource
         **/
        @jakarta.ws.rs.QueryParam("generation")
        private GenerationSummary generation;
        /**
          * Serializer for the Type resource
         **/
        @jakarta.ws.rs.QueryParam("moveDamageClass")
        private MoveDamageClassSummary moveDamageClass;
        /**
          * Serializer for the Type resource
         **/
        @jakarta.ws.rs.QueryParam("names")
        private List<AbilityName> names = null;
        /**
          * Serializer for the Type resource
         **/
        @jakarta.ws.rs.QueryParam("pokemon")
        private List<TypeDetailPokemonInner> pokemon = null;
        /**
          * Serializer for the Type resource
         **/
        @jakarta.ws.rs.QueryParam("moves")
        private List<MoveSummary> moves = null;

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

        public TypeDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get damageRelations
        * @return damageRelations
        **/
        @JsonProperty("damage_relations")
        public TypeDetailDamageRelations getDamageRelations() {
            return damageRelations;
        }

        /**
         * Set damageRelations
         **/
        public void setDamageRelations(TypeDetailDamageRelations damageRelations) {
            this.damageRelations = damageRelations;
        }

        public TypeDetailQueryParam damageRelations(TypeDetailDamageRelations damageRelations) {
            this.damageRelations = damageRelations;
            return this;
        }

        /**
        * Get pastDamageRelations
        * @return pastDamageRelations
        **/
        @JsonProperty("past_damage_relations")
        public List<TypeDetailPastDamageRelationsInner> getPastDamageRelations() {
            return pastDamageRelations;
        }


        /**
        * Get gameIndices
        * @return gameIndices
        **/
        @JsonProperty("game_indices")
        public List<TypeGameIndex> getGameIndices() {
            return gameIndices;
        }


        /**
        * Get generation
        * @return generation
        **/
        @JsonProperty("generation")
        public GenerationSummary getGeneration() {
            return generation;
        }

        /**
         * Set generation
         **/
        public void setGeneration(GenerationSummary generation) {
            this.generation = generation;
        }

        public TypeDetailQueryParam generation(GenerationSummary generation) {
            this.generation = generation;
            return this;
        }

        /**
        * Get moveDamageClass
        * @return moveDamageClass
        **/
        @JsonProperty("move_damage_class")
        public MoveDamageClassSummary getMoveDamageClass() {
            return moveDamageClass;
        }

        /**
         * Set moveDamageClass
         **/
        public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
            this.moveDamageClass = moveDamageClass;
        }

        public TypeDetailQueryParam moveDamageClass(MoveDamageClassSummary moveDamageClass) {
            this.moveDamageClass = moveDamageClass;
            return this;
        }

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<AbilityName> getNames() {
            return names;
        }


        /**
        * Get pokemon
        * @return pokemon
        **/
        @JsonProperty("pokemon")
        public List<TypeDetailPokemonInner> getPokemon() {
            return pokemon;
        }


        /**
        * Get moves
        * @return moves
        **/
        @JsonProperty("moves")
        public List<MoveSummary> getMoves() {
            return moves;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TypeDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    damageRelations: ").append(toIndentedString(damageRelations)).append("\n");
            sb.append("    pastDamageRelations: ").append(toIndentedString(pastDamageRelations)).append("\n");
            sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
            sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
            sb.append("    moveDamageClass: ").append(toIndentedString(moveDamageClass)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
            sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
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
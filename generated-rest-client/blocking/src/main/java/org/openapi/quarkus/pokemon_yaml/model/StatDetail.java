package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatDetail  {

    private Integer id;
    private String name;
    private Integer gameIndex;
    private Boolean isBattleOnly;
    private StatDetailAffectingMoves affectingMoves;
    private StatDetailAffectingNatures affectingNatures;
    private List<CharacteristicSummary> characteristics = new ArrayList<>();
    private MoveDamageClassSummary moveDamageClass;
    private List<StatName> names = new ArrayList<>();

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

    public StatDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get gameIndex
    * minimum: -2147483648
    * maximum: 2147483647
    * @return gameIndex
    **/
    @JsonProperty("game_index")
    public Integer getGameIndex() {
        return gameIndex;
    }

    /**
     * Set gameIndex
     **/
    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    public StatDetail gameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
        return this;
    }

    /**
    * Get isBattleOnly
    * @return isBattleOnly
    **/
    @JsonProperty("is_battle_only")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsBattleOnly() {
        return isBattleOnly;
    }

    /**
     * Set isBattleOnly
     **/
    public void setIsBattleOnly(Boolean isBattleOnly) {
        this.isBattleOnly = isBattleOnly;
    }

    public StatDetail isBattleOnly(Boolean isBattleOnly) {
        this.isBattleOnly = isBattleOnly;
        return this;
    }

    /**
    * Get affectingMoves
    * @return affectingMoves
    **/
    @JsonProperty("affecting_moves")
    public StatDetailAffectingMoves getAffectingMoves() {
        return affectingMoves;
    }

    /**
     * Set affectingMoves
     **/
    public void setAffectingMoves(StatDetailAffectingMoves affectingMoves) {
        this.affectingMoves = affectingMoves;
    }

    public StatDetail affectingMoves(StatDetailAffectingMoves affectingMoves) {
        this.affectingMoves = affectingMoves;
        return this;
    }

    /**
    * Get affectingNatures
    * @return affectingNatures
    **/
    @JsonProperty("affecting_natures")
    public StatDetailAffectingNatures getAffectingNatures() {
        return affectingNatures;
    }

    /**
     * Set affectingNatures
     **/
    public void setAffectingNatures(StatDetailAffectingNatures affectingNatures) {
        this.affectingNatures = affectingNatures;
    }

    public StatDetail affectingNatures(StatDetailAffectingNatures affectingNatures) {
        this.affectingNatures = affectingNatures;
        return this;
    }

    /**
    * Get characteristics
    * @return characteristics
    **/
    @JsonProperty("characteristics")
    public List<CharacteristicSummary> getCharacteristics() {
        return characteristics;
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

    public StatDetail moveDamageClass(MoveDamageClassSummary moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
        return this;
    }

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<StatName> getNames() {
        return names;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
        sb.append("    isBattleOnly: ").append(toIndentedString(isBattleOnly)).append("\n");
        sb.append("    affectingMoves: ").append(toIndentedString(affectingMoves)).append("\n");
        sb.append("    affectingNatures: ").append(toIndentedString(affectingNatures)).append("\n");
        sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
        sb.append("    moveDamageClass: ").append(toIndentedString(moveDamageClass)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        
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
    public static class StatDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("gameIndex")
        private Integer gameIndex;
        @jakarta.ws.rs.QueryParam("isBattleOnly")
        private Boolean isBattleOnly;
        @jakarta.ws.rs.QueryParam("affectingMoves")
        private StatDetailAffectingMoves affectingMoves;
        @jakarta.ws.rs.QueryParam("affectingNatures")
        private StatDetailAffectingNatures affectingNatures;
        @jakarta.ws.rs.QueryParam("characteristics")
        private List<CharacteristicSummary> characteristics = null;
        @jakarta.ws.rs.QueryParam("moveDamageClass")
        private MoveDamageClassSummary moveDamageClass;
        @jakarta.ws.rs.QueryParam("names")
        private List<StatName> names = null;

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

        public StatDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get gameIndex
        * minimum: -2147483648
        * maximum: 2147483647
        * @return gameIndex
        **/
        @JsonProperty("game_index")
        public Integer getGameIndex() {
            return gameIndex;
        }

        /**
         * Set gameIndex
         **/
        public void setGameIndex(Integer gameIndex) {
            this.gameIndex = gameIndex;
        }

        public StatDetailQueryParam gameIndex(Integer gameIndex) {
            this.gameIndex = gameIndex;
            return this;
        }

        /**
        * Get isBattleOnly
        * @return isBattleOnly
        **/
        @JsonProperty("is_battle_only")
        public Boolean getIsBattleOnly() {
            return isBattleOnly;
        }

        /**
         * Set isBattleOnly
         **/
        public void setIsBattleOnly(Boolean isBattleOnly) {
            this.isBattleOnly = isBattleOnly;
        }

        public StatDetailQueryParam isBattleOnly(Boolean isBattleOnly) {
            this.isBattleOnly = isBattleOnly;
            return this;
        }

        /**
        * Get affectingMoves
        * @return affectingMoves
        **/
        @JsonProperty("affecting_moves")
        public StatDetailAffectingMoves getAffectingMoves() {
            return affectingMoves;
        }

        /**
         * Set affectingMoves
         **/
        public void setAffectingMoves(StatDetailAffectingMoves affectingMoves) {
            this.affectingMoves = affectingMoves;
        }

        public StatDetailQueryParam affectingMoves(StatDetailAffectingMoves affectingMoves) {
            this.affectingMoves = affectingMoves;
            return this;
        }

        /**
        * Get affectingNatures
        * @return affectingNatures
        **/
        @JsonProperty("affecting_natures")
        public StatDetailAffectingNatures getAffectingNatures() {
            return affectingNatures;
        }

        /**
         * Set affectingNatures
         **/
        public void setAffectingNatures(StatDetailAffectingNatures affectingNatures) {
            this.affectingNatures = affectingNatures;
        }

        public StatDetailQueryParam affectingNatures(StatDetailAffectingNatures affectingNatures) {
            this.affectingNatures = affectingNatures;
            return this;
        }

        /**
        * Get characteristics
        * @return characteristics
        **/
        @JsonProperty("characteristics")
        public List<CharacteristicSummary> getCharacteristics() {
            return characteristics;
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

        public StatDetailQueryParam moveDamageClass(MoveDamageClassSummary moveDamageClass) {
            this.moveDamageClass = moveDamageClass;
            return this;
        }

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<StatName> getNames() {
            return names;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class StatDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
            sb.append("    isBattleOnly: ").append(toIndentedString(isBattleOnly)).append("\n");
            sb.append("    affectingMoves: ").append(toIndentedString(affectingMoves)).append("\n");
            sb.append("    affectingNatures: ").append(toIndentedString(affectingNatures)).append("\n");
            sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
            sb.append("    moveDamageClass: ").append(toIndentedString(moveDamageClass)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
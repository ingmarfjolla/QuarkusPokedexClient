package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetailMovesInnerVersionGroupDetailsInner  {

    private Integer levelLearnedAt;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea moveLearnMethod;

    /**
    * Get levelLearnedAt
    * @return levelLearnedAt
    **/
    @JsonProperty("level_learned_at")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    /**
     * Set levelLearnedAt
     **/
    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    public PokemonDetailMovesInnerVersionGroupDetailsInner levelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
        return this;
    }

    /**
    * Get versionGroup
    * @return versionGroup
    **/
    @JsonProperty("version_group")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getVersionGroup() {
        return versionGroup;
    }

    /**
     * Set versionGroup
     **/
    public void setVersionGroup(PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup) {
        this.versionGroup = versionGroup;
    }

    public PokemonDetailMovesInnerVersionGroupDetailsInner versionGroup(PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup) {
        this.versionGroup = versionGroup;
        return this;
    }

    /**
    * Get moveLearnMethod
    * @return moveLearnMethod
    **/
    @JsonProperty("move_learn_method")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getMoveLearnMethod() {
        return moveLearnMethod;
    }

    /**
     * Set moveLearnMethod
     **/
    public void setMoveLearnMethod(PokemonEncountersRetrieve200ResponseInnerLocationArea moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public PokemonDetailMovesInnerVersionGroupDetailsInner moveLearnMethod(PokemonEncountersRetrieve200ResponseInnerLocationArea moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailMovesInnerVersionGroupDetailsInner {\n");

        sb.append("    levelLearnedAt: ").append(toIndentedString(levelLearnedAt)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("    moveLearnMethod: ").append(toIndentedString(moveLearnMethod)).append("\n");
        
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
    public static class PokemonDetailMovesInnerVersionGroupDetailsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("levelLearnedAt")
        private Integer levelLearnedAt;
        @jakarta.ws.rs.QueryParam("versionGroup")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup;
        @jakarta.ws.rs.QueryParam("moveLearnMethod")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea moveLearnMethod;

        /**
        * Get levelLearnedAt
        * @return levelLearnedAt
        **/
        @JsonProperty("level_learned_at")
        public Integer getLevelLearnedAt() {
            return levelLearnedAt;
        }

        /**
         * Set levelLearnedAt
         **/
        public void setLevelLearnedAt(Integer levelLearnedAt) {
            this.levelLearnedAt = levelLearnedAt;
        }

        public PokemonDetailMovesInnerVersionGroupDetailsInnerQueryParam levelLearnedAt(Integer levelLearnedAt) {
            this.levelLearnedAt = levelLearnedAt;
            return this;
        }

        /**
        * Get versionGroup
        * @return versionGroup
        **/
        @JsonProperty("version_group")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getVersionGroup() {
            return versionGroup;
        }

        /**
         * Set versionGroup
         **/
        public void setVersionGroup(PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup) {
            this.versionGroup = versionGroup;
        }

        public PokemonDetailMovesInnerVersionGroupDetailsInnerQueryParam versionGroup(PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup) {
            this.versionGroup = versionGroup;
            return this;
        }

        /**
        * Get moveLearnMethod
        * @return moveLearnMethod
        **/
        @JsonProperty("move_learn_method")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getMoveLearnMethod() {
            return moveLearnMethod;
        }

        /**
         * Set moveLearnMethod
         **/
        public void setMoveLearnMethod(PokemonEncountersRetrieve200ResponseInnerLocationArea moveLearnMethod) {
            this.moveLearnMethod = moveLearnMethod;
        }

        public PokemonDetailMovesInnerVersionGroupDetailsInnerQueryParam moveLearnMethod(PokemonEncountersRetrieve200ResponseInnerLocationArea moveLearnMethod) {
            this.moveLearnMethod = moveLearnMethod;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonDetailMovesInnerVersionGroupDetailsInnerQueryParam {\n");

            sb.append("    levelLearnedAt: ").append(toIndentedString(levelLearnedAt)).append("\n");
            sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
            sb.append("    moveLearnMethod: ").append(toIndentedString(moveLearnMethod)).append("\n");
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
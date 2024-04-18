package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveDetailContestCombosNormal  {

    private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useBefore;
    private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useAfter;

    /**
    * Get useBefore
    * @return useBefore
    **/
    @JsonProperty("use_before")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getUseBefore() {
        return useBefore;
    }

    /**
     * Set useBefore
     **/
    public void setUseBefore(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useBefore) {
        this.useBefore = useBefore;
    }

    public MoveDetailContestCombosNormal useBefore(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useBefore) {
        this.useBefore = useBefore;
        return this;
    }
    public MoveDetailContestCombosNormal addUseBeforeItem(PokemonEncountersRetrieve200ResponseInnerLocationArea useBeforeItem) {
        if (this.useBefore == null){
            useBefore = new ArrayList<>();
        }
        this.useBefore.add(useBeforeItem);
        return this;
    }

    /**
    * Get useAfter
    * @return useAfter
    **/
    @JsonProperty("use_after")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getUseAfter() {
        return useAfter;
    }

    /**
     * Set useAfter
     **/
    public void setUseAfter(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useAfter) {
        this.useAfter = useAfter;
    }

    public MoveDetailContestCombosNormal useAfter(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useAfter) {
        this.useAfter = useAfter;
        return this;
    }
    public MoveDetailContestCombosNormal addUseAfterItem(PokemonEncountersRetrieve200ResponseInnerLocationArea useAfterItem) {
        if (this.useAfter == null){
            useAfter = new ArrayList<>();
        }
        this.useAfter.add(useAfterItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveDetailContestCombosNormal {\n");

        sb.append("    useBefore: ").append(toIndentedString(useBefore)).append("\n");
        sb.append("    useAfter: ").append(toIndentedString(useAfter)).append("\n");
        
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
    public static class MoveDetailContestCombosNormalQueryParam  {

        @jakarta.ws.rs.QueryParam("useBefore")
        private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useBefore = null;
        @jakarta.ws.rs.QueryParam("useAfter")
        private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useAfter = null;

        /**
        * Get useBefore
        * @return useBefore
        **/
        @JsonProperty("use_before")
        public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getUseBefore() {
            return useBefore;
        }

        /**
         * Set useBefore
         **/
        public void setUseBefore(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useBefore) {
            this.useBefore = useBefore;
        }

        public MoveDetailContestCombosNormalQueryParam useBefore(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useBefore) {
            this.useBefore = useBefore;
            return this;
        }
        public MoveDetailContestCombosNormalQueryParam addUseBeforeItem(PokemonEncountersRetrieve200ResponseInnerLocationArea useBeforeItem) {
            this.useBefore.add(useBeforeItem);
            return this;
        }

        /**
        * Get useAfter
        * @return useAfter
        **/
        @JsonProperty("use_after")
        public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getUseAfter() {
            return useAfter;
        }

        /**
         * Set useAfter
         **/
        public void setUseAfter(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useAfter) {
            this.useAfter = useAfter;
        }

        public MoveDetailContestCombosNormalQueryParam useAfter(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> useAfter) {
            this.useAfter = useAfter;
            return this;
        }
        public MoveDetailContestCombosNormalQueryParam addUseAfterItem(PokemonEncountersRetrieve200ResponseInnerLocationArea useAfterItem) {
            this.useAfter.add(useAfterItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveDetailContestCombosNormalQueryParam {\n");

            sb.append("    useBefore: ").append(toIndentedString(useBefore)).append("\n");
            sb.append("    useAfter: ").append(toIndentedString(useAfter)).append("\n");
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
package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetailMovesInner  {

    private PokemonEncountersRetrieve200ResponseInnerLocationArea move;
    private List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails;

    /**
    * Get move
    * @return move
    **/
    @JsonProperty("move")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getMove() {
        return move;
    }

    /**
     * Set move
     **/
    public void setMove(PokemonEncountersRetrieve200ResponseInnerLocationArea move) {
        this.move = move;
    }

    public PokemonDetailMovesInner move(PokemonEncountersRetrieve200ResponseInnerLocationArea move) {
        this.move = move;
        return this;
    }

    /**
    * Get versionGroupDetails
    * @return versionGroupDetails
    **/
    @JsonProperty("version_group_details")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokemonDetailMovesInnerVersionGroupDetailsInner> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    /**
     * Set versionGroupDetails
     **/
    public void setVersionGroupDetails(List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }

    public PokemonDetailMovesInner versionGroupDetails(List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
        return this;
    }
    public PokemonDetailMovesInner addVersionGroupDetailsItem(PokemonDetailMovesInnerVersionGroupDetailsInner versionGroupDetailsItem) {
        if (this.versionGroupDetails == null){
            versionGroupDetails = new ArrayList<>();
        }
        this.versionGroupDetails.add(versionGroupDetailsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonDetailMovesInner {\n");

        sb.append("    move: ").append(toIndentedString(move)).append("\n");
        sb.append("    versionGroupDetails: ").append(toIndentedString(versionGroupDetails)).append("\n");
        
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
    public static class PokemonDetailMovesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("move")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea move;
        @jakarta.ws.rs.QueryParam("versionGroupDetails")
        private List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails = null;

        /**
        * Get move
        * @return move
        **/
        @JsonProperty("move")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getMove() {
            return move;
        }

        /**
         * Set move
         **/
        public void setMove(PokemonEncountersRetrieve200ResponseInnerLocationArea move) {
            this.move = move;
        }

        public PokemonDetailMovesInnerQueryParam move(PokemonEncountersRetrieve200ResponseInnerLocationArea move) {
            this.move = move;
            return this;
        }

        /**
        * Get versionGroupDetails
        * @return versionGroupDetails
        **/
        @JsonProperty("version_group_details")
        public List<PokemonDetailMovesInnerVersionGroupDetailsInner> getVersionGroupDetails() {
            return versionGroupDetails;
        }

        /**
         * Set versionGroupDetails
         **/
        public void setVersionGroupDetails(List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
            this.versionGroupDetails = versionGroupDetails;
        }

        public PokemonDetailMovesInnerQueryParam versionGroupDetails(List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
            this.versionGroupDetails = versionGroupDetails;
            return this;
        }
        public PokemonDetailMovesInnerQueryParam addVersionGroupDetailsItem(PokemonDetailMovesInnerVersionGroupDetailsInner versionGroupDetailsItem) {
            this.versionGroupDetails.add(versionGroupDetailsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonDetailMovesInnerQueryParam {\n");

            sb.append("    move: ").append(toIndentedString(move)).append("\n");
            sb.append("    versionGroupDetails: ").append(toIndentedString(versionGroupDetails)).append("\n");
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
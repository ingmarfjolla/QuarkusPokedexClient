package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EvolutionChainDetailChain  {

    private Boolean isBaby;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea species;
    private List<EvolutionChainDetailChainEvolutionDetailsInner> evolutionDetails;
    private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> evolvesTo;

    /**
    * Get isBaby
    * @return isBaby
    **/
    @JsonProperty("is_baby")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsBaby() {
        return isBaby;
    }

    /**
     * Set isBaby
     **/
    public void setIsBaby(Boolean isBaby) {
        this.isBaby = isBaby;
    }

    public EvolutionChainDetailChain isBaby(Boolean isBaby) {
        this.isBaby = isBaby;
        return this;
    }

    /**
    * Get species
    * @return species
    **/
    @JsonProperty("species")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getSpecies() {
        return species;
    }

    /**
     * Set species
     **/
    public void setSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea species) {
        this.species = species;
    }

    public EvolutionChainDetailChain species(PokemonEncountersRetrieve200ResponseInnerLocationArea species) {
        this.species = species;
        return this;
    }

    /**
    * Get evolutionDetails
    * @return evolutionDetails
    **/
    @JsonProperty("evolution_details")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<EvolutionChainDetailChainEvolutionDetailsInner> getEvolutionDetails() {
        return evolutionDetails;
    }

    /**
     * Set evolutionDetails
     **/
    public void setEvolutionDetails(List<EvolutionChainDetailChainEvolutionDetailsInner> evolutionDetails) {
        this.evolutionDetails = evolutionDetails;
    }

    public EvolutionChainDetailChain evolutionDetails(List<EvolutionChainDetailChainEvolutionDetailsInner> evolutionDetails) {
        this.evolutionDetails = evolutionDetails;
        return this;
    }
    public EvolutionChainDetailChain addEvolutionDetailsItem(EvolutionChainDetailChainEvolutionDetailsInner evolutionDetailsItem) {
        if (this.evolutionDetails == null){
            evolutionDetails = new ArrayList<>();
        }
        this.evolutionDetails.add(evolutionDetailsItem);
        return this;
    }

    /**
    * Get evolvesTo
    * @return evolvesTo
    **/
    @JsonProperty("evolves_to")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getEvolvesTo() {
        return evolvesTo;
    }

    /**
     * Set evolvesTo
     **/
    public void setEvolvesTo(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> evolvesTo) {
        this.evolvesTo = evolvesTo;
    }

    public EvolutionChainDetailChain evolvesTo(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> evolvesTo) {
        this.evolvesTo = evolvesTo;
        return this;
    }
    public EvolutionChainDetailChain addEvolvesToItem(PokemonEncountersRetrieve200ResponseInnerLocationArea evolvesToItem) {
        if (this.evolvesTo == null){
            evolvesTo = new ArrayList<>();
        }
        this.evolvesTo.add(evolvesToItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvolutionChainDetailChain {\n");

        sb.append("    isBaby: ").append(toIndentedString(isBaby)).append("\n");
        sb.append("    species: ").append(toIndentedString(species)).append("\n");
        sb.append("    evolutionDetails: ").append(toIndentedString(evolutionDetails)).append("\n");
        sb.append("    evolvesTo: ").append(toIndentedString(evolvesTo)).append("\n");
        
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
    public static class EvolutionChainDetailChainQueryParam  {

        @jakarta.ws.rs.QueryParam("isBaby")
        private Boolean isBaby;
        @jakarta.ws.rs.QueryParam("species")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea species;
        @jakarta.ws.rs.QueryParam("evolutionDetails")
        private List<EvolutionChainDetailChainEvolutionDetailsInner> evolutionDetails = null;
        @jakarta.ws.rs.QueryParam("evolvesTo")
        private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> evolvesTo = null;

        /**
        * Get isBaby
        * @return isBaby
        **/
        @JsonProperty("is_baby")
        public Boolean getIsBaby() {
            return isBaby;
        }

        /**
         * Set isBaby
         **/
        public void setIsBaby(Boolean isBaby) {
            this.isBaby = isBaby;
        }

        public EvolutionChainDetailChainQueryParam isBaby(Boolean isBaby) {
            this.isBaby = isBaby;
            return this;
        }

        /**
        * Get species
        * @return species
        **/
        @JsonProperty("species")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getSpecies() {
            return species;
        }

        /**
         * Set species
         **/
        public void setSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea species) {
            this.species = species;
        }

        public EvolutionChainDetailChainQueryParam species(PokemonEncountersRetrieve200ResponseInnerLocationArea species) {
            this.species = species;
            return this;
        }

        /**
        * Get evolutionDetails
        * @return evolutionDetails
        **/
        @JsonProperty("evolution_details")
        public List<EvolutionChainDetailChainEvolutionDetailsInner> getEvolutionDetails() {
            return evolutionDetails;
        }

        /**
         * Set evolutionDetails
         **/
        public void setEvolutionDetails(List<EvolutionChainDetailChainEvolutionDetailsInner> evolutionDetails) {
            this.evolutionDetails = evolutionDetails;
        }

        public EvolutionChainDetailChainQueryParam evolutionDetails(List<EvolutionChainDetailChainEvolutionDetailsInner> evolutionDetails) {
            this.evolutionDetails = evolutionDetails;
            return this;
        }
        public EvolutionChainDetailChainQueryParam addEvolutionDetailsItem(EvolutionChainDetailChainEvolutionDetailsInner evolutionDetailsItem) {
            this.evolutionDetails.add(evolutionDetailsItem);
            return this;
        }

        /**
        * Get evolvesTo
        * @return evolvesTo
        **/
        @JsonProperty("evolves_to")
        public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getEvolvesTo() {
            return evolvesTo;
        }

        /**
         * Set evolvesTo
         **/
        public void setEvolvesTo(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> evolvesTo) {
            this.evolvesTo = evolvesTo;
        }

        public EvolutionChainDetailChainQueryParam evolvesTo(List<PokemonEncountersRetrieve200ResponseInnerLocationArea> evolvesTo) {
            this.evolvesTo = evolvesTo;
            return this;
        }
        public EvolutionChainDetailChainQueryParam addEvolvesToItem(PokemonEncountersRetrieve200ResponseInnerLocationArea evolvesToItem) {
            this.evolvesTo.add(evolvesToItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EvolutionChainDetailChainQueryParam {\n");

            sb.append("    isBaby: ").append(toIndentedString(isBaby)).append("\n");
            sb.append("    species: ").append(toIndentedString(species)).append("\n");
            sb.append("    evolutionDetails: ").append(toIndentedString(evolutionDetails)).append("\n");
            sb.append("    evolvesTo: ").append(toIndentedString(evolvesTo)).append("\n");
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
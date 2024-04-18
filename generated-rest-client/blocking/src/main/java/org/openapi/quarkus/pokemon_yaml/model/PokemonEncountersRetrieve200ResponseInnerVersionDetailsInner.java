package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner  {

    private PokemonEncountersRetrieve200ResponseInnerLocationArea version;
    private Integer maxChance;
    private List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails;

    /**
    * Get version
    * @return version
    **/
    @JsonProperty("version")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getVersion() {
        return version;
    }

    /**
     * Set version
     **/
    public void setVersion(PokemonEncountersRetrieve200ResponseInnerLocationArea version) {
        this.version = version;
    }

    public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner version(PokemonEncountersRetrieve200ResponseInnerLocationArea version) {
        this.version = version;
        return this;
    }

    /**
    * Get maxChance
    * @return maxChance
    **/
    @JsonProperty("max_chance")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMaxChance() {
        return maxChance;
    }

    /**
     * Set maxChance
     **/
    public void setMaxChance(Integer maxChance) {
        this.maxChance = maxChance;
    }

    public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner maxChance(Integer maxChance) {
        this.maxChance = maxChance;
        return this;
    }

    /**
    * Get encounterDetails
    * @return encounterDetails
    **/
    @JsonProperty("encounter_details")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> getEncounterDetails() {
        return encounterDetails;
    }

    /**
     * Set encounterDetails
     **/
    public void setEncounterDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails) {
        this.encounterDetails = encounterDetails;
    }

    public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner encounterDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails) {
        this.encounterDetails = encounterDetails;
        return this;
    }
    public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner addEncounterDetailsItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner encounterDetailsItem) {
        if (this.encounterDetails == null){
            encounterDetails = new ArrayList<>();
        }
        this.encounterDetails.add(encounterDetailsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner {\n");

        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    maxChance: ").append(toIndentedString(maxChance)).append("\n");
        sb.append("    encounterDetails: ").append(toIndentedString(encounterDetails)).append("\n");
        
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
    public static class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("version")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea version;
        @jakarta.ws.rs.QueryParam("maxChance")
        private Integer maxChance;
        @jakarta.ws.rs.QueryParam("encounterDetails")
        private List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails = null;

        /**
        * Get version
        * @return version
        **/
        @JsonProperty("version")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getVersion() {
            return version;
        }

        /**
         * Set version
         **/
        public void setVersion(PokemonEncountersRetrieve200ResponseInnerLocationArea version) {
            this.version = version;
        }

        public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerQueryParam version(PokemonEncountersRetrieve200ResponseInnerLocationArea version) {
            this.version = version;
            return this;
        }

        /**
        * Get maxChance
        * @return maxChance
        **/
        @JsonProperty("max_chance")
        public Integer getMaxChance() {
            return maxChance;
        }

        /**
         * Set maxChance
         **/
        public void setMaxChance(Integer maxChance) {
            this.maxChance = maxChance;
        }

        public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerQueryParam maxChance(Integer maxChance) {
            this.maxChance = maxChance;
            return this;
        }

        /**
        * Get encounterDetails
        * @return encounterDetails
        **/
        @JsonProperty("encounter_details")
        public List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> getEncounterDetails() {
            return encounterDetails;
        }

        /**
         * Set encounterDetails
         **/
        public void setEncounterDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails) {
            this.encounterDetails = encounterDetails;
        }

        public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerQueryParam encounterDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails) {
            this.encounterDetails = encounterDetails;
            return this;
        }
        public PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerQueryParam addEncounterDetailsItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner encounterDetailsItem) {
            this.encounterDetails.add(encounterDetailsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerQueryParam {\n");

            sb.append("    version: ").append(toIndentedString(version)).append("\n");
            sb.append("    maxChance: ").append(toIndentedString(maxChance)).append("\n");
            sb.append("    encounterDetails: ").append(toIndentedString(encounterDetails)).append("\n");
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
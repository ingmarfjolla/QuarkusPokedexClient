package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationAreaDetailEncounterMethodRatesInner  {

    private PokemonEncountersRetrieve200ResponseInnerLocationArea encounterMethod;
    private List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails;

    /**
    * Get encounterMethod
    * @return encounterMethod
    **/
    @JsonProperty("encounter_method")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getEncounterMethod() {
        return encounterMethod;
    }

    /**
     * Set encounterMethod
     **/
    public void setEncounterMethod(PokemonEncountersRetrieve200ResponseInnerLocationArea encounterMethod) {
        this.encounterMethod = encounterMethod;
    }

    public LocationAreaDetailEncounterMethodRatesInner encounterMethod(PokemonEncountersRetrieve200ResponseInnerLocationArea encounterMethod) {
        this.encounterMethod = encounterMethod;
        return this;
    }

    /**
    * Get versionDetails
    * @return versionDetails
    **/
    @JsonProperty("version_details")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> getVersionDetails() {
        return versionDetails;
    }

    /**
     * Set versionDetails
     **/
    public void setVersionDetails(List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
        this.versionDetails = versionDetails;
    }

    public LocationAreaDetailEncounterMethodRatesInner versionDetails(List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
        this.versionDetails = versionDetails;
        return this;
    }
    public LocationAreaDetailEncounterMethodRatesInner addVersionDetailsItem(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner versionDetailsItem) {
        if (this.versionDetails == null){
            versionDetails = new ArrayList<>();
        }
        this.versionDetails.add(versionDetailsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaDetailEncounterMethodRatesInner {\n");

        sb.append("    encounterMethod: ").append(toIndentedString(encounterMethod)).append("\n");
        sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
        
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
    public static class LocationAreaDetailEncounterMethodRatesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("encounterMethod")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea encounterMethod;
        @jakarta.ws.rs.QueryParam("versionDetails")
        private List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails = null;

        /**
        * Get encounterMethod
        * @return encounterMethod
        **/
        @JsonProperty("encounter_method")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getEncounterMethod() {
            return encounterMethod;
        }

        /**
         * Set encounterMethod
         **/
        public void setEncounterMethod(PokemonEncountersRetrieve200ResponseInnerLocationArea encounterMethod) {
            this.encounterMethod = encounterMethod;
        }

        public LocationAreaDetailEncounterMethodRatesInnerQueryParam encounterMethod(PokemonEncountersRetrieve200ResponseInnerLocationArea encounterMethod) {
            this.encounterMethod = encounterMethod;
            return this;
        }

        /**
        * Get versionDetails
        * @return versionDetails
        **/
        @JsonProperty("version_details")
        public List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> getVersionDetails() {
            return versionDetails;
        }

        /**
         * Set versionDetails
         **/
        public void setVersionDetails(List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
            this.versionDetails = versionDetails;
        }

        public LocationAreaDetailEncounterMethodRatesInnerQueryParam versionDetails(List<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> versionDetails) {
            this.versionDetails = versionDetails;
            return this;
        }
        public LocationAreaDetailEncounterMethodRatesInnerQueryParam addVersionDetailsItem(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner versionDetailsItem) {
            this.versionDetails.add(versionDetailsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LocationAreaDetailEncounterMethodRatesInnerQueryParam {\n");

            sb.append("    encounterMethod: ").append(toIndentedString(encounterMethod)).append("\n");
            sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
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
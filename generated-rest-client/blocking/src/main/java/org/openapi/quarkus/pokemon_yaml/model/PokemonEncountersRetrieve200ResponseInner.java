package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonEncountersRetrieve200ResponseInner  {

    private PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea;
    private List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails;

    /**
    * Get locationArea
    * @return locationArea
    **/
    @JsonProperty("location_area")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getLocationArea() {
        return locationArea;
    }

    /**
     * Set locationArea
     **/
    public void setLocationArea(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea) {
        this.locationArea = locationArea;
    }

    public PokemonEncountersRetrieve200ResponseInner locationArea(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea) {
        this.locationArea = locationArea;
        return this;
    }

    /**
    * Get versionDetails
    * @return versionDetails
    **/
    @JsonProperty("version_details")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> getVersionDetails() {
        return versionDetails;
    }

    /**
     * Set versionDetails
     **/
    public void setVersionDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
        this.versionDetails = versionDetails;
    }

    public PokemonEncountersRetrieve200ResponseInner versionDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
        this.versionDetails = versionDetails;
        return this;
    }
    public PokemonEncountersRetrieve200ResponseInner addVersionDetailsItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner versionDetailsItem) {
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
        sb.append("class PokemonEncountersRetrieve200ResponseInner {\n");

        sb.append("    locationArea: ").append(toIndentedString(locationArea)).append("\n");
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
    public static class PokemonEncountersRetrieve200ResponseInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("locationArea")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea;
        @jakarta.ws.rs.QueryParam("versionDetails")
        private List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails = null;

        /**
        * Get locationArea
        * @return locationArea
        **/
        @JsonProperty("location_area")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getLocationArea() {
            return locationArea;
        }

        /**
         * Set locationArea
         **/
        public void setLocationArea(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea) {
            this.locationArea = locationArea;
        }

        public PokemonEncountersRetrieve200ResponseInnerQueryParam locationArea(PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea) {
            this.locationArea = locationArea;
            return this;
        }

        /**
        * Get versionDetails
        * @return versionDetails
        **/
        @JsonProperty("version_details")
        public List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> getVersionDetails() {
            return versionDetails;
        }

        /**
         * Set versionDetails
         **/
        public void setVersionDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
            this.versionDetails = versionDetails;
        }

        public PokemonEncountersRetrieve200ResponseInnerQueryParam versionDetails(List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails) {
            this.versionDetails = versionDetails;
            return this;
        }
        public PokemonEncountersRetrieve200ResponseInnerQueryParam addVersionDetailsItem(PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner versionDetailsItem) {
            this.versionDetails.add(versionDetailsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonEncountersRetrieve200ResponseInnerQueryParam {\n");

            sb.append("    locationArea: ").append(toIndentedString(locationArea)).append("\n");
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
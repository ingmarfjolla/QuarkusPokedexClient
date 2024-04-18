package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetailHeldItemsInner  {

    private PokemonEncountersRetrieve200ResponseInnerLocationArea item;
    private List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails;

    /**
    * Get item
    * @return item
    **/
    @JsonProperty("item")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getItem() {
        return item;
    }

    /**
     * Set item
     **/
    public void setItem(PokemonEncountersRetrieve200ResponseInnerLocationArea item) {
        this.item = item;
    }

    public PokemonDetailHeldItemsInner item(PokemonEncountersRetrieve200ResponseInnerLocationArea item) {
        this.item = item;
        return this;
    }

    /**
    * Get versionDetails
    * @return versionDetails
    **/
    @JsonProperty("version_details")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<ItemDetailHeldByPokemonInnerVersionDetailsInner> getVersionDetails() {
        return versionDetails;
    }

    /**
     * Set versionDetails
     **/
    public void setVersionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
        this.versionDetails = versionDetails;
    }

    public PokemonDetailHeldItemsInner versionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
        this.versionDetails = versionDetails;
        return this;
    }
    public PokemonDetailHeldItemsInner addVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
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
        sb.append("class PokemonDetailHeldItemsInner {\n");

        sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
    public static class PokemonDetailHeldItemsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("item")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea item;
        @jakarta.ws.rs.QueryParam("versionDetails")
        private List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails = null;

        /**
        * Get item
        * @return item
        **/
        @JsonProperty("item")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getItem() {
            return item;
        }

        /**
         * Set item
         **/
        public void setItem(PokemonEncountersRetrieve200ResponseInnerLocationArea item) {
            this.item = item;
        }

        public PokemonDetailHeldItemsInnerQueryParam item(PokemonEncountersRetrieve200ResponseInnerLocationArea item) {
            this.item = item;
            return this;
        }

        /**
        * Get versionDetails
        * @return versionDetails
        **/
        @JsonProperty("version_details")
        public List<ItemDetailHeldByPokemonInnerVersionDetailsInner> getVersionDetails() {
            return versionDetails;
        }

        /**
         * Set versionDetails
         **/
        public void setVersionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
            this.versionDetails = versionDetails;
        }

        public PokemonDetailHeldItemsInnerQueryParam versionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
            this.versionDetails = versionDetails;
            return this;
        }
        public PokemonDetailHeldItemsInnerQueryParam addVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
            this.versionDetails.add(versionDetailsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonDetailHeldItemsInnerQueryParam {\n");

            sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
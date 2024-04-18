package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDetailHeldByPokemonInner  {

    private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon;
    private List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails;

    /**
    * Get pokemon
    * @return pokemon
    **/
    @JsonProperty("pokemon")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getPokemon() {
        return pokemon;
    }

    /**
     * Set pokemon
     **/
    public void setPokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
        this.pokemon = pokemon;
    }

    public ItemDetailHeldByPokemonInner pokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
        this.pokemon = pokemon;
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

    public ItemDetailHeldByPokemonInner versionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
        this.versionDetails = versionDetails;
        return this;
    }
    public ItemDetailHeldByPokemonInner addVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
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
        sb.append("class ItemDetailHeldByPokemonInner {\n");

        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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
    public static class ItemDetailHeldByPokemonInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("pokemon")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon;
        @jakarta.ws.rs.QueryParam("versionDetails")
        private List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails = null;

        /**
        * Get pokemon
        * @return pokemon
        **/
        @JsonProperty("pokemon")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getPokemon() {
            return pokemon;
        }

        /**
         * Set pokemon
         **/
        public void setPokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
            this.pokemon = pokemon;
        }

        public ItemDetailHeldByPokemonInnerQueryParam pokemon(PokemonEncountersRetrieve200ResponseInnerLocationArea pokemon) {
            this.pokemon = pokemon;
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

        public ItemDetailHeldByPokemonInnerQueryParam versionDetails(List<ItemDetailHeldByPokemonInnerVersionDetailsInner> versionDetails) {
            this.versionDetails = versionDetails;
            return this;
        }
        public ItemDetailHeldByPokemonInnerQueryParam addVersionDetailsItem(ItemDetailHeldByPokemonInnerVersionDetailsInner versionDetailsItem) {
            this.versionDetails.add(versionDetailsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ItemDetailHeldByPokemonInnerQueryParam {\n");

            sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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
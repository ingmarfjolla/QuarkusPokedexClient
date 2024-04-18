package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDetailHeldByPokemonInnerVersionDetailsInner  {

    private Integer rarity;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea version;

    /**
    * Get rarity
    * @return rarity
    **/
    @JsonProperty("rarity")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRarity() {
        return rarity;
    }

    /**
     * Set rarity
     **/
    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public ItemDetailHeldByPokemonInnerVersionDetailsInner rarity(Integer rarity) {
        this.rarity = rarity;
        return this;
    }

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

    public ItemDetailHeldByPokemonInnerVersionDetailsInner version(PokemonEncountersRetrieve200ResponseInnerLocationArea version) {
        this.version = version;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemDetailHeldByPokemonInnerVersionDetailsInner {\n");

        sb.append("    rarity: ").append(toIndentedString(rarity)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        
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
    public static class ItemDetailHeldByPokemonInnerVersionDetailsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("rarity")
        private Integer rarity;
        @jakarta.ws.rs.QueryParam("version")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea version;

        /**
        * Get rarity
        * @return rarity
        **/
        @JsonProperty("rarity")
        public Integer getRarity() {
            return rarity;
        }

        /**
         * Set rarity
         **/
        public void setRarity(Integer rarity) {
            this.rarity = rarity;
        }

        public ItemDetailHeldByPokemonInnerVersionDetailsInnerQueryParam rarity(Integer rarity) {
            this.rarity = rarity;
            return this;
        }

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

        public ItemDetailHeldByPokemonInnerVersionDetailsInnerQueryParam version(PokemonEncountersRetrieve200ResponseInnerLocationArea version) {
            this.version = version;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ItemDetailHeldByPokemonInnerVersionDetailsInnerQueryParam {\n");

            sb.append("    rarity: ").append(toIndentedString(rarity)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
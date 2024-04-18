package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PalParkAreaDetail  {

    private Integer id;
    private String name;
    private List<PalParkAreaName> names = new ArrayList<>();
    private List<PalParkAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }


    /**
    * Get name
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public PalParkAreaDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<PalParkAreaName> getNames() {
        return names;
    }


    /**
    * Get pokemonEncounters
    * @return pokemonEncounters
    **/
    @JsonProperty("pokemon_encounters")
    public List<PalParkAreaDetailPokemonEncountersInner> getPokemonEncounters() {
        return pokemonEncounters;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PalParkAreaDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemonEncounters: ").append(toIndentedString(pokemonEncounters)).append("\n");
        
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
    public static class PalParkAreaDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("names")
        private List<PalParkAreaName> names = null;
        @jakarta.ws.rs.QueryParam("pokemonEncounters")
        private List<PalParkAreaDetailPokemonEncountersInner> pokemonEncounters = null;

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }


        /**
        * Get name
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public PalParkAreaDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<PalParkAreaName> getNames() {
            return names;
        }


        /**
        * Get pokemonEncounters
        * @return pokemonEncounters
        **/
        @JsonProperty("pokemon_encounters")
        public List<PalParkAreaDetailPokemonEncountersInner> getPokemonEncounters() {
            return pokemonEncounters;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PalParkAreaDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    pokemonEncounters: ").append(toIndentedString(pokemonEncounters)).append("\n");
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
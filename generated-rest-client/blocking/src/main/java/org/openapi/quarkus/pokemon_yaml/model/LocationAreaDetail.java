package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationAreaDetail  {

    private Integer id;
    private String name;
    private Integer gameIndex;
    private List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates = new ArrayList<>();
    private LocationSummary location;
    private List<LocationAreaName> names = new ArrayList<>();
    private List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();

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

    public LocationAreaDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get gameIndex
    * minimum: -2147483648
    * maximum: 2147483647
    * @return gameIndex
    **/
    @JsonProperty("game_index")
    public Integer getGameIndex() {
        return gameIndex;
    }

    /**
     * Set gameIndex
     **/
    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    public LocationAreaDetail gameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
        return this;
    }

    /**
    * Get encounterMethodRates
    * @return encounterMethodRates
    **/
    @JsonProperty("encounter_method_rates")
    public List<LocationAreaDetailEncounterMethodRatesInner> getEncounterMethodRates() {
        return encounterMethodRates;
    }


    /**
    * Get location
    * @return location
    **/
    @JsonProperty("location")
    public LocationSummary getLocation() {
        return location;
    }

    /**
     * Set location
     **/
    public void setLocation(LocationSummary location) {
        this.location = location;
    }

    public LocationAreaDetail location(LocationSummary location) {
        this.location = location;
        return this;
    }

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<LocationAreaName> getNames() {
        return names;
    }


    /**
    * Get pokemonEncounters
    * @return pokemonEncounters
    **/
    @JsonProperty("pokemon_encounters")
    public List<LocationAreaDetailPokemonEncountersInner> getPokemonEncounters() {
        return pokemonEncounters;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationAreaDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
        sb.append("    encounterMethodRates: ").append(toIndentedString(encounterMethodRates)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
    public static class LocationAreaDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("gameIndex")
        private Integer gameIndex;
        @jakarta.ws.rs.QueryParam("encounterMethodRates")
        private List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates = null;
        @jakarta.ws.rs.QueryParam("location")
        private LocationSummary location;
        @jakarta.ws.rs.QueryParam("names")
        private List<LocationAreaName> names = null;
        @jakarta.ws.rs.QueryParam("pokemonEncounters")
        private List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters = null;

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

        public LocationAreaDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get gameIndex
        * minimum: -2147483648
        * maximum: 2147483647
        * @return gameIndex
        **/
        @JsonProperty("game_index")
        public Integer getGameIndex() {
            return gameIndex;
        }

        /**
         * Set gameIndex
         **/
        public void setGameIndex(Integer gameIndex) {
            this.gameIndex = gameIndex;
        }

        public LocationAreaDetailQueryParam gameIndex(Integer gameIndex) {
            this.gameIndex = gameIndex;
            return this;
        }

        /**
        * Get encounterMethodRates
        * @return encounterMethodRates
        **/
        @JsonProperty("encounter_method_rates")
        public List<LocationAreaDetailEncounterMethodRatesInner> getEncounterMethodRates() {
            return encounterMethodRates;
        }


        /**
        * Get location
        * @return location
        **/
        @JsonProperty("location")
        public LocationSummary getLocation() {
            return location;
        }

        /**
         * Set location
         **/
        public void setLocation(LocationSummary location) {
            this.location = location;
        }

        public LocationAreaDetailQueryParam location(LocationSummary location) {
            this.location = location;
            return this;
        }

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<LocationAreaName> getNames() {
            return names;
        }


        /**
        * Get pokemonEncounters
        * @return pokemonEncounters
        **/
        @JsonProperty("pokemon_encounters")
        public List<LocationAreaDetailPokemonEncountersInner> getPokemonEncounters() {
            return pokemonEncounters;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LocationAreaDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
            sb.append("    encounterMethodRates: ").append(toIndentedString(encounterMethodRates)).append("\n");
            sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonShapeDetail  {

    private Integer id;
    private String name;
    private List<PokemonShapeDetailAwesomeNamesInner> awesomeNames = new ArrayList<>();
    private List<PokemonFormDetailFormNamesInner> names = new ArrayList<>();
    private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

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

    public PokemonShapeDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get awesomeNames
    * @return awesomeNames
    **/
    @JsonProperty("awesome_names")
    public List<PokemonShapeDetailAwesomeNamesInner> getAwesomeNames() {
        return awesomeNames;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<PokemonFormDetailFormNamesInner> getNames() {
        return names;
    }


    /**
    * Get pokemonSpecies
    * @return pokemonSpecies
    **/
    @JsonProperty("pokemon_species")
    public List<PokemonSpeciesSummary> getPokemonSpecies() {
        return pokemonSpecies;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonShapeDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    awesomeNames: ").append(toIndentedString(awesomeNames)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
        
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
    public static class PokemonShapeDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("awesomeNames")
        private List<PokemonShapeDetailAwesomeNamesInner> awesomeNames = null;
        @jakarta.ws.rs.QueryParam("names")
        private List<PokemonFormDetailFormNamesInner> names = null;
        @jakarta.ws.rs.QueryParam("pokemonSpecies")
        private List<PokemonSpeciesSummary> pokemonSpecies = null;

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

        public PokemonShapeDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get awesomeNames
        * @return awesomeNames
        **/
        @JsonProperty("awesome_names")
        public List<PokemonShapeDetailAwesomeNamesInner> getAwesomeNames() {
            return awesomeNames;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<PokemonFormDetailFormNamesInner> getNames() {
            return names;
        }


        /**
        * Get pokemonSpecies
        * @return pokemonSpecies
        **/
        @JsonProperty("pokemon_species")
        public List<PokemonSpeciesSummary> getPokemonSpecies() {
            return pokemonSpecies;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonShapeDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    awesomeNames: ").append(toIndentedString(awesomeNames)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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
package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GenerationDetail  {

    private Integer id;
    private String name;
    private List<AbilitySummary> abilities = new ArrayList<>();
    private RegionSummary mainRegion;
    private List<MoveSummary> moves = new ArrayList<>();
    private List<GenerationName> names = new ArrayList<>();
    private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();
    private List<TypeSummary> types = new ArrayList<>();
    private List<VersionGroupSummary> versionGroups = new ArrayList<>();

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

    public GenerationDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get abilities
    * @return abilities
    **/
    @JsonProperty("abilities")
    public List<AbilitySummary> getAbilities() {
        return abilities;
    }


    /**
    * Get mainRegion
    * @return mainRegion
    **/
    @JsonProperty("main_region")
    public RegionSummary getMainRegion() {
        return mainRegion;
    }

    /**
     * Set mainRegion
     **/
    public void setMainRegion(RegionSummary mainRegion) {
        this.mainRegion = mainRegion;
    }

    public GenerationDetail mainRegion(RegionSummary mainRegion) {
        this.mainRegion = mainRegion;
        return this;
    }

    /**
    * Get moves
    * @return moves
    **/
    @JsonProperty("moves")
    public List<MoveSummary> getMoves() {
        return moves;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<GenerationName> getNames() {
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
    * Get types
    * @return types
    **/
    @JsonProperty("types")
    public List<TypeSummary> getTypes() {
        return types;
    }


    /**
    * Get versionGroups
    * @return versionGroups
    **/
    @JsonProperty("version_groups")
    public List<VersionGroupSummary> getVersionGroups() {
        return versionGroups;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerationDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
        sb.append("    mainRegion: ").append(toIndentedString(mainRegion)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    versionGroups: ").append(toIndentedString(versionGroups)).append("\n");
        
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
    public static class GenerationDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("abilities")
        private List<AbilitySummary> abilities = null;
        @jakarta.ws.rs.QueryParam("mainRegion")
        private RegionSummary mainRegion;
        @jakarta.ws.rs.QueryParam("moves")
        private List<MoveSummary> moves = null;
        @jakarta.ws.rs.QueryParam("names")
        private List<GenerationName> names = null;
        @jakarta.ws.rs.QueryParam("pokemonSpecies")
        private List<PokemonSpeciesSummary> pokemonSpecies = null;
        @jakarta.ws.rs.QueryParam("types")
        private List<TypeSummary> types = null;
        @jakarta.ws.rs.QueryParam("versionGroups")
        private List<VersionGroupSummary> versionGroups = null;

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

        public GenerationDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get abilities
        * @return abilities
        **/
        @JsonProperty("abilities")
        public List<AbilitySummary> getAbilities() {
            return abilities;
        }


        /**
        * Get mainRegion
        * @return mainRegion
        **/
        @JsonProperty("main_region")
        public RegionSummary getMainRegion() {
            return mainRegion;
        }

        /**
         * Set mainRegion
         **/
        public void setMainRegion(RegionSummary mainRegion) {
            this.mainRegion = mainRegion;
        }

        public GenerationDetailQueryParam mainRegion(RegionSummary mainRegion) {
            this.mainRegion = mainRegion;
            return this;
        }

        /**
        * Get moves
        * @return moves
        **/
        @JsonProperty("moves")
        public List<MoveSummary> getMoves() {
            return moves;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<GenerationName> getNames() {
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
        * Get types
        * @return types
        **/
        @JsonProperty("types")
        public List<TypeSummary> getTypes() {
            return types;
        }


        /**
        * Get versionGroups
        * @return versionGroups
        **/
        @JsonProperty("version_groups")
        public List<VersionGroupSummary> getVersionGroups() {
            return versionGroups;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GenerationDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
            sb.append("    mainRegion: ").append(toIndentedString(mainRegion)).append("\n");
            sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
            sb.append("    types: ").append(toIndentedString(types)).append("\n");
            sb.append("    versionGroups: ").append(toIndentedString(versionGroups)).append("\n");
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
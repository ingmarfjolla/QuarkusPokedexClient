package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegionDetail  {

    private Integer id;
    private String name;
    private List<LocationSummary> locations = new ArrayList<>();
    private GenerationSummary mainGeneration;
    private List<RegionName> names = new ArrayList<>();
    private List<PokedexSummary> pokedexes = new ArrayList<>();
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

    public RegionDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get locations
    * @return locations
    **/
    @JsonProperty("locations")
    public List<LocationSummary> getLocations() {
        return locations;
    }


    /**
    * Get mainGeneration
    * @return mainGeneration
    **/
    @JsonProperty("main_generation")
    public GenerationSummary getMainGeneration() {
        return mainGeneration;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<RegionName> getNames() {
        return names;
    }


    /**
    * Get pokedexes
    * @return pokedexes
    **/
    @JsonProperty("pokedexes")
    public List<PokedexSummary> getPokedexes() {
        return pokedexes;
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
        sb.append("class RegionDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
        sb.append("    mainGeneration: ").append(toIndentedString(mainGeneration)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokedexes: ").append(toIndentedString(pokedexes)).append("\n");
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
    public static class RegionDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("locations")
        private List<LocationSummary> locations = null;
        @jakarta.ws.rs.QueryParam("mainGeneration")
        private GenerationSummary mainGeneration;
        @jakarta.ws.rs.QueryParam("names")
        private List<RegionName> names = null;
        @jakarta.ws.rs.QueryParam("pokedexes")
        private List<PokedexSummary> pokedexes = null;
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

        public RegionDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get locations
        * @return locations
        **/
        @JsonProperty("locations")
        public List<LocationSummary> getLocations() {
            return locations;
        }


        /**
        * Get mainGeneration
        * @return mainGeneration
        **/
        @JsonProperty("main_generation")
        public GenerationSummary getMainGeneration() {
            return mainGeneration;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<RegionName> getNames() {
            return names;
        }


        /**
        * Get pokedexes
        * @return pokedexes
        **/
        @JsonProperty("pokedexes")
        public List<PokedexSummary> getPokedexes() {
            return pokedexes;
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
            sb.append("class RegionDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
            sb.append("    mainGeneration: ").append(toIndentedString(mainGeneration)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    pokedexes: ").append(toIndentedString(pokedexes)).append("\n");
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
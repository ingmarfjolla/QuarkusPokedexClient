package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokedexDetail  {

    private Integer id;
    private String name;
    private Boolean isMainSeries;
    private List<PokedexDescription> descriptions = new ArrayList<>();
    private List<PokedexName> names = new ArrayList<>();
    private List<PokedexDetailPokemonEntriesInner> pokemonEntries = new ArrayList<>();
    private RegionSummary region;
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

    public PokedexDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get isMainSeries
    * @return isMainSeries
    **/
    @JsonProperty("is_main_series")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsMainSeries() {
        return isMainSeries;
    }

    /**
     * Set isMainSeries
     **/
    public void setIsMainSeries(Boolean isMainSeries) {
        this.isMainSeries = isMainSeries;
    }

    public PokedexDetail isMainSeries(Boolean isMainSeries) {
        this.isMainSeries = isMainSeries;
        return this;
    }

    /**
    * Get descriptions
    * @return descriptions
    **/
    @JsonProperty("descriptions")
    public List<PokedexDescription> getDescriptions() {
        return descriptions;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<PokedexName> getNames() {
        return names;
    }


    /**
    * Get pokemonEntries
    * @return pokemonEntries
    **/
    @JsonProperty("pokemon_entries")
    public List<PokedexDetailPokemonEntriesInner> getPokemonEntries() {
        return pokemonEntries;
    }


    /**
    * Get region
    * @return region
    **/
    @JsonProperty("region")
    public RegionSummary getRegion() {
        return region;
    }

    /**
     * Set region
     **/
    public void setRegion(RegionSummary region) {
        this.region = region;
    }

    public PokedexDetail region(RegionSummary region) {
        this.region = region;
        return this;
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
        sb.append("class PokedexDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isMainSeries: ").append(toIndentedString(isMainSeries)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemonEntries: ").append(toIndentedString(pokemonEntries)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
    public static class PokedexDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("isMainSeries")
        private Boolean isMainSeries;
        @jakarta.ws.rs.QueryParam("descriptions")
        private List<PokedexDescription> descriptions = null;
        @jakarta.ws.rs.QueryParam("names")
        private List<PokedexName> names = null;
        @jakarta.ws.rs.QueryParam("pokemonEntries")
        private List<PokedexDetailPokemonEntriesInner> pokemonEntries = null;
        @jakarta.ws.rs.QueryParam("region")
        private RegionSummary region;
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

        public PokedexDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get isMainSeries
        * @return isMainSeries
        **/
        @JsonProperty("is_main_series")
        public Boolean getIsMainSeries() {
            return isMainSeries;
        }

        /**
         * Set isMainSeries
         **/
        public void setIsMainSeries(Boolean isMainSeries) {
            this.isMainSeries = isMainSeries;
        }

        public PokedexDetailQueryParam isMainSeries(Boolean isMainSeries) {
            this.isMainSeries = isMainSeries;
            return this;
        }

        /**
        * Get descriptions
        * @return descriptions
        **/
        @JsonProperty("descriptions")
        public List<PokedexDescription> getDescriptions() {
            return descriptions;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<PokedexName> getNames() {
            return names;
        }


        /**
        * Get pokemonEntries
        * @return pokemonEntries
        **/
        @JsonProperty("pokemon_entries")
        public List<PokedexDetailPokemonEntriesInner> getPokemonEntries() {
            return pokemonEntries;
        }


        /**
        * Get region
        * @return region
        **/
        @JsonProperty("region")
        public RegionSummary getRegion() {
            return region;
        }

        /**
         * Set region
         **/
        public void setRegion(RegionSummary region) {
            this.region = region;
        }

        public PokedexDetailQueryParam region(RegionSummary region) {
            this.region = region;
            return this;
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
            sb.append("class PokedexDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    isMainSeries: ").append(toIndentedString(isMainSeries)).append("\n");
            sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    pokemonEntries: ").append(toIndentedString(pokemonEntries)).append("\n");
            sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
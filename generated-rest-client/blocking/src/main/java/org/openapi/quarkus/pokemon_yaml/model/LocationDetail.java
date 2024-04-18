package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationDetail  {

    private Integer id;
    private String name;
    private RegionSummary region;
    private List<LocationName> names = new ArrayList<>();
    private List<LocationGameIndex> gameIndices = new ArrayList<>();
    private List<LocationAreaSummary> areas = new ArrayList<>();

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

    public LocationDetail name(String name) {
        this.name = name;
        return this;
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

    public LocationDetail region(RegionSummary region) {
        this.region = region;
        return this;
    }

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<LocationName> getNames() {
        return names;
    }


    /**
    * Get gameIndices
    * @return gameIndices
    **/
    @JsonProperty("game_indices")
    public List<LocationGameIndex> getGameIndices() {
        return gameIndices;
    }


    /**
    * Get areas
    * @return areas
    **/
    @JsonProperty("areas")
    public List<LocationAreaSummary> getAreas() {
        return areas;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
        sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
        
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
    public static class LocationDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("region")
        private RegionSummary region;
        @jakarta.ws.rs.QueryParam("names")
        private List<LocationName> names = null;
        @jakarta.ws.rs.QueryParam("gameIndices")
        private List<LocationGameIndex> gameIndices = null;
        @jakarta.ws.rs.QueryParam("areas")
        private List<LocationAreaSummary> areas = null;

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

        public LocationDetailQueryParam name(String name) {
            this.name = name;
            return this;
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

        public LocationDetailQueryParam region(RegionSummary region) {
            this.region = region;
            return this;
        }

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<LocationName> getNames() {
            return names;
        }


        /**
        * Get gameIndices
        * @return gameIndices
        **/
        @JsonProperty("game_indices")
        public List<LocationGameIndex> getGameIndices() {
            return gameIndices;
        }


        /**
        * Get areas
        * @return areas
        **/
        @JsonProperty("areas")
        public List<LocationAreaSummary> getAreas() {
            return areas;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LocationDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    region: ").append(toIndentedString(region)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
            sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
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
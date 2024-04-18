package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionGroupDetail  {

    private Integer id;
    private String name;
    private Integer order;
    private GenerationSummary generation;
    private List<MoveLearnMethodSummary> moveLearnMethods = new ArrayList<>();
    private List<PokedexSummary> pokedexes = new ArrayList<>();
    private List<RegionSummary> regions = new ArrayList<>();
    private List<VersionSummary> versions = new ArrayList<>();

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

    public VersionGroupDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get order
    * minimum: -2147483648
    * maximum: 2147483647
    * @return order
    **/
    @JsonProperty("order")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOrder() {
        return order;
    }

    /**
     * Set order
     **/
    public void setOrder(Integer order) {
        this.order = order;
    }

    public VersionGroupDetail order(Integer order) {
        this.order = order;
        return this;
    }

    /**
    * Get generation
    * @return generation
    **/
    @JsonProperty("generation")
    public GenerationSummary getGeneration() {
        return generation;
    }

    /**
     * Set generation
     **/
    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    public VersionGroupDetail generation(GenerationSummary generation) {
        this.generation = generation;
        return this;
    }

    /**
    * Get moveLearnMethods
    * @return moveLearnMethods
    **/
    @JsonProperty("move_learn_methods")
    public List<MoveLearnMethodSummary> getMoveLearnMethods() {
        return moveLearnMethods;
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
    * Get regions
    * @return regions
    **/
    @JsonProperty("regions")
    public List<RegionSummary> getRegions() {
        return regions;
    }


    /**
    * Get versions
    * @return versions
    **/
    @JsonProperty("versions")
    public List<VersionSummary> getVersions() {
        return versions;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionGroupDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    moveLearnMethods: ").append(toIndentedString(moveLearnMethods)).append("\n");
        sb.append("    pokedexes: ").append(toIndentedString(pokedexes)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
        
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
    public static class VersionGroupDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("order")
        private Integer order;
        @jakarta.ws.rs.QueryParam("generation")
        private GenerationSummary generation;
        @jakarta.ws.rs.QueryParam("moveLearnMethods")
        private List<MoveLearnMethodSummary> moveLearnMethods = null;
        @jakarta.ws.rs.QueryParam("pokedexes")
        private List<PokedexSummary> pokedexes = null;
        @jakarta.ws.rs.QueryParam("regions")
        private List<RegionSummary> regions = null;
        @jakarta.ws.rs.QueryParam("versions")
        private List<VersionSummary> versions = null;

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

        public VersionGroupDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get order
        * minimum: -2147483648
        * maximum: 2147483647
        * @return order
        **/
        @JsonProperty("order")
        public Integer getOrder() {
            return order;
        }

        /**
         * Set order
         **/
        public void setOrder(Integer order) {
            this.order = order;
        }

        public VersionGroupDetailQueryParam order(Integer order) {
            this.order = order;
            return this;
        }

        /**
        * Get generation
        * @return generation
        **/
        @JsonProperty("generation")
        public GenerationSummary getGeneration() {
            return generation;
        }

        /**
         * Set generation
         **/
        public void setGeneration(GenerationSummary generation) {
            this.generation = generation;
        }

        public VersionGroupDetailQueryParam generation(GenerationSummary generation) {
            this.generation = generation;
            return this;
        }

        /**
        * Get moveLearnMethods
        * @return moveLearnMethods
        **/
        @JsonProperty("move_learn_methods")
        public List<MoveLearnMethodSummary> getMoveLearnMethods() {
            return moveLearnMethods;
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
        * Get regions
        * @return regions
        **/
        @JsonProperty("regions")
        public List<RegionSummary> getRegions() {
            return regions;
        }


        /**
        * Get versions
        * @return versions
        **/
        @JsonProperty("versions")
        public List<VersionSummary> getVersions() {
            return versions;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class VersionGroupDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    order: ").append(toIndentedString(order)).append("\n");
            sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
            sb.append("    moveLearnMethods: ").append(toIndentedString(moveLearnMethods)).append("\n");
            sb.append("    pokedexes: ").append(toIndentedString(pokedexes)).append("\n");
            sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
            sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
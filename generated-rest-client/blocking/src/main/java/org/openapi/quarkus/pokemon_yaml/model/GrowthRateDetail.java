package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GrowthRateDetail  {

    private Integer id;
    private String name;
    private String formula;
    private List<GrowthRateDescription> descriptions = new ArrayList<>();
    private List<Experience> levels = new ArrayList<>();
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

    public GrowthRateDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get formula
    * @return formula
    **/
    @JsonProperty("formula")
    public String getFormula() {
        return formula;
    }

    /**
     * Set formula
     **/
    public void setFormula(String formula) {
        this.formula = formula;
    }

    public GrowthRateDetail formula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
    * Get descriptions
    * @return descriptions
    **/
    @JsonProperty("descriptions")
    public List<GrowthRateDescription> getDescriptions() {
        return descriptions;
    }


    /**
    * Get levels
    * @return levels
    **/
    @JsonProperty("levels")
    public List<Experience> getLevels() {
        return levels;
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
        sb.append("class GrowthRateDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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
    public static class GrowthRateDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("formula")
        private String formula;
        @jakarta.ws.rs.QueryParam("descriptions")
        private List<GrowthRateDescription> descriptions = null;
        @jakarta.ws.rs.QueryParam("levels")
        private List<Experience> levels = null;
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

        public GrowthRateDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get formula
        * @return formula
        **/
        @JsonProperty("formula")
        public String getFormula() {
            return formula;
        }

        /**
         * Set formula
         **/
        public void setFormula(String formula) {
            this.formula = formula;
        }

        public GrowthRateDetailQueryParam formula(String formula) {
            this.formula = formula;
            return this;
        }

        /**
        * Get descriptions
        * @return descriptions
        **/
        @JsonProperty("descriptions")
        public List<GrowthRateDescription> getDescriptions() {
            return descriptions;
        }


        /**
        * Get levels
        * @return levels
        **/
        @JsonProperty("levels")
        public List<Experience> getLevels() {
            return levels;
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
            sb.append("class GrowthRateDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
            sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
            sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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
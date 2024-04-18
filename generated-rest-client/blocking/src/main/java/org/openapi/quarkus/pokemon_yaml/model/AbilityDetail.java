package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbilityDetail  {

    private Integer id;
    private String name;
    private Boolean isMainSeries;
    private GenerationSummary generation;
    private List<AbilityName> names = new ArrayList<>();
    private List<AbilityEffectText> effectEntries = new ArrayList<>();
    private List<AbilityChange> effectChanges = new ArrayList<>();
    private List<AbilityFlavorText> flavorTextEntries = new ArrayList<>();
    private List<AbilityDetailPokemonInner> pokemon = new ArrayList<>();

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

    public AbilityDetail name(String name) {
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

    public AbilityDetail isMainSeries(Boolean isMainSeries) {
        this.isMainSeries = isMainSeries;
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

    public AbilityDetail generation(GenerationSummary generation) {
        this.generation = generation;
        return this;
    }

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<AbilityName> getNames() {
        return names;
    }


    /**
    * Get effectEntries
    * @return effectEntries
    **/
    @JsonProperty("effect_entries")
    public List<AbilityEffectText> getEffectEntries() {
        return effectEntries;
    }


    /**
    * Get effectChanges
    * @return effectChanges
    **/
    @JsonProperty("effect_changes")
    public List<AbilityChange> getEffectChanges() {
        return effectChanges;
    }


    /**
    * Get flavorTextEntries
    * @return flavorTextEntries
    **/
    @JsonProperty("flavor_text_entries")
    public List<AbilityFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }


    /**
    * Get pokemon
    * @return pokemon
    **/
    @JsonProperty("pokemon")
    public List<AbilityDetailPokemonInner> getPokemon() {
        return pokemon;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbilityDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isMainSeries: ").append(toIndentedString(isMainSeries)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
        
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
    public static class AbilityDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("isMainSeries")
        private Boolean isMainSeries;
        @jakarta.ws.rs.QueryParam("generation")
        private GenerationSummary generation;
        @jakarta.ws.rs.QueryParam("names")
        private List<AbilityName> names = null;
        @jakarta.ws.rs.QueryParam("effectEntries")
        private List<AbilityEffectText> effectEntries = null;
        @jakarta.ws.rs.QueryParam("effectChanges")
        private List<AbilityChange> effectChanges = null;
        @jakarta.ws.rs.QueryParam("flavorTextEntries")
        private List<AbilityFlavorText> flavorTextEntries = null;
        @jakarta.ws.rs.QueryParam("pokemon")
        private List<AbilityDetailPokemonInner> pokemon = null;

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

        public AbilityDetailQueryParam name(String name) {
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

        public AbilityDetailQueryParam isMainSeries(Boolean isMainSeries) {
            this.isMainSeries = isMainSeries;
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

        public AbilityDetailQueryParam generation(GenerationSummary generation) {
            this.generation = generation;
            return this;
        }

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<AbilityName> getNames() {
            return names;
        }


        /**
        * Get effectEntries
        * @return effectEntries
        **/
        @JsonProperty("effect_entries")
        public List<AbilityEffectText> getEffectEntries() {
            return effectEntries;
        }


        /**
        * Get effectChanges
        * @return effectChanges
        **/
        @JsonProperty("effect_changes")
        public List<AbilityChange> getEffectChanges() {
            return effectChanges;
        }


        /**
        * Get flavorTextEntries
        * @return flavorTextEntries
        **/
        @JsonProperty("flavor_text_entries")
        public List<AbilityFlavorText> getFlavorTextEntries() {
            return flavorTextEntries;
        }


        /**
        * Get pokemon
        * @return pokemon
        **/
        @JsonProperty("pokemon")
        public List<AbilityDetailPokemonInner> getPokemon() {
            return pokemon;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AbilityDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    isMainSeries: ").append(toIndentedString(isMainSeries)).append("\n");
            sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
            sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
            sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
            sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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
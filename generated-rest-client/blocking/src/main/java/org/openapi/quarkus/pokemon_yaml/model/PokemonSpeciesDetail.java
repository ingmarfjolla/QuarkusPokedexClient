package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSpeciesDetail  {

    private Integer id;
    private String name;
    private Integer order;
    private Integer genderRate;
    private Integer captureRate;
    private Integer baseHappiness;
    private Boolean isBaby;
    private Boolean isLegendary;
    private Boolean isMythical;
    private Integer hatchCounter;
    private Boolean hasGenderDifferences;
    private Boolean formsSwitchable;
    private GrowthRateSummary growthRate;
    private List<PokemonDexEntry> pokedexNumbers = new ArrayList<>();
    private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> eggGroups = new ArrayList<>();
    private PokemonColorSummary color;
    private PokemonShapeSummary shape;
    private PokemonSpeciesSummary evolvesFromSpecies;
    private EvolutionChainSummary evolutionChain;
    private PokemonHabitatSummary habitat;
    private GenerationSummary generation;
    private List<PokemonFormDetailFormNamesInner> names = new ArrayList<>();
    private List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters = new ArrayList<>();
    private List<PokemonSpeciesDescription> formDescriptions = new ArrayList<>();
    private List<PokemonSpeciesFlavorText> flavorTextEntries = new ArrayList<>();
    private List<PokemonSpeciesDetailGeneraInner> genera = new ArrayList<>();
    private List<PokemonSpeciesDetailVarietiesInner> varieties = new ArrayList<>();

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

    public PokemonSpeciesDetail name(String name) {
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

    public PokemonSpeciesDetail order(Integer order) {
        this.order = order;
        return this;
    }

    /**
    * Get genderRate
    * minimum: -2147483648
    * maximum: 2147483647
    * @return genderRate
    **/
    @JsonProperty("gender_rate")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getGenderRate() {
        return genderRate;
    }

    /**
     * Set genderRate
     **/
    public void setGenderRate(Integer genderRate) {
        this.genderRate = genderRate;
    }

    public PokemonSpeciesDetail genderRate(Integer genderRate) {
        this.genderRate = genderRate;
        return this;
    }

    /**
    * Get captureRate
    * minimum: -2147483648
    * maximum: 2147483647
    * @return captureRate
    **/
    @JsonProperty("capture_rate")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCaptureRate() {
        return captureRate;
    }

    /**
     * Set captureRate
     **/
    public void setCaptureRate(Integer captureRate) {
        this.captureRate = captureRate;
    }

    public PokemonSpeciesDetail captureRate(Integer captureRate) {
        this.captureRate = captureRate;
        return this;
    }

    /**
    * Get baseHappiness
    * minimum: -2147483648
    * maximum: 2147483647
    * @return baseHappiness
    **/
    @JsonProperty("base_happiness")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getBaseHappiness() {
        return baseHappiness;
    }

    /**
     * Set baseHappiness
     **/
    public void setBaseHappiness(Integer baseHappiness) {
        this.baseHappiness = baseHappiness;
    }

    public PokemonSpeciesDetail baseHappiness(Integer baseHappiness) {
        this.baseHappiness = baseHappiness;
        return this;
    }

    /**
    * Get isBaby
    * @return isBaby
    **/
    @JsonProperty("is_baby")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsBaby() {
        return isBaby;
    }

    /**
     * Set isBaby
     **/
    public void setIsBaby(Boolean isBaby) {
        this.isBaby = isBaby;
    }

    public PokemonSpeciesDetail isBaby(Boolean isBaby) {
        this.isBaby = isBaby;
        return this;
    }

    /**
    * Get isLegendary
    * @return isLegendary
    **/
    @JsonProperty("is_legendary")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsLegendary() {
        return isLegendary;
    }

    /**
     * Set isLegendary
     **/
    public void setIsLegendary(Boolean isLegendary) {
        this.isLegendary = isLegendary;
    }

    public PokemonSpeciesDetail isLegendary(Boolean isLegendary) {
        this.isLegendary = isLegendary;
        return this;
    }

    /**
    * Get isMythical
    * @return isMythical
    **/
    @JsonProperty("is_mythical")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsMythical() {
        return isMythical;
    }

    /**
     * Set isMythical
     **/
    public void setIsMythical(Boolean isMythical) {
        this.isMythical = isMythical;
    }

    public PokemonSpeciesDetail isMythical(Boolean isMythical) {
        this.isMythical = isMythical;
        return this;
    }

    /**
    * Get hatchCounter
    * minimum: -2147483648
    * maximum: 2147483647
    * @return hatchCounter
    **/
    @JsonProperty("hatch_counter")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getHatchCounter() {
        return hatchCounter;
    }

    /**
     * Set hatchCounter
     **/
    public void setHatchCounter(Integer hatchCounter) {
        this.hatchCounter = hatchCounter;
    }

    public PokemonSpeciesDetail hatchCounter(Integer hatchCounter) {
        this.hatchCounter = hatchCounter;
        return this;
    }

    /**
    * Get hasGenderDifferences
    * @return hasGenderDifferences
    **/
    @JsonProperty("has_gender_differences")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getHasGenderDifferences() {
        return hasGenderDifferences;
    }

    /**
     * Set hasGenderDifferences
     **/
    public void setHasGenderDifferences(Boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
    }

    public PokemonSpeciesDetail hasGenderDifferences(Boolean hasGenderDifferences) {
        this.hasGenderDifferences = hasGenderDifferences;
        return this;
    }

    /**
    * Get formsSwitchable
    * @return formsSwitchable
    **/
    @JsonProperty("forms_switchable")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getFormsSwitchable() {
        return formsSwitchable;
    }

    /**
     * Set formsSwitchable
     **/
    public void setFormsSwitchable(Boolean formsSwitchable) {
        this.formsSwitchable = formsSwitchable;
    }

    public PokemonSpeciesDetail formsSwitchable(Boolean formsSwitchable) {
        this.formsSwitchable = formsSwitchable;
        return this;
    }

    /**
    * Get growthRate
    * @return growthRate
    **/
    @JsonProperty("growth_rate")
    public GrowthRateSummary getGrowthRate() {
        return growthRate;
    }

    /**
     * Set growthRate
     **/
    public void setGrowthRate(GrowthRateSummary growthRate) {
        this.growthRate = growthRate;
    }

    public PokemonSpeciesDetail growthRate(GrowthRateSummary growthRate) {
        this.growthRate = growthRate;
        return this;
    }

    /**
    * Get pokedexNumbers
    * @return pokedexNumbers
    **/
    @JsonProperty("pokedex_numbers")
    public List<PokemonDexEntry> getPokedexNumbers() {
        return pokedexNumbers;
    }


    /**
    * Get eggGroups
    * @return eggGroups
    **/
    @JsonProperty("egg_groups")
    public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getEggGroups() {
        return eggGroups;
    }


    /**
    * Get color
    * @return color
    **/
    @JsonProperty("color")
    public PokemonColorSummary getColor() {
        return color;
    }

    /**
     * Set color
     **/
    public void setColor(PokemonColorSummary color) {
        this.color = color;
    }

    public PokemonSpeciesDetail color(PokemonColorSummary color) {
        this.color = color;
        return this;
    }

    /**
    * Get shape
    * @return shape
    **/
    @JsonProperty("shape")
    public PokemonShapeSummary getShape() {
        return shape;
    }

    /**
     * Set shape
     **/
    public void setShape(PokemonShapeSummary shape) {
        this.shape = shape;
    }

    public PokemonSpeciesDetail shape(PokemonShapeSummary shape) {
        this.shape = shape;
        return this;
    }

    /**
    * Get evolvesFromSpecies
    * @return evolvesFromSpecies
    **/
    @JsonProperty("evolves_from_species")
    public PokemonSpeciesSummary getEvolvesFromSpecies() {
        return evolvesFromSpecies;
    }

    /**
     * Set evolvesFromSpecies
     **/
    public void setEvolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
        this.evolvesFromSpecies = evolvesFromSpecies;
    }

    public PokemonSpeciesDetail evolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
        this.evolvesFromSpecies = evolvesFromSpecies;
        return this;
    }

    /**
    * Get evolutionChain
    * @return evolutionChain
    **/
    @JsonProperty("evolution_chain")
    public EvolutionChainSummary getEvolutionChain() {
        return evolutionChain;
    }

    /**
     * Set evolutionChain
     **/
    public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
        this.evolutionChain = evolutionChain;
    }

    public PokemonSpeciesDetail evolutionChain(EvolutionChainSummary evolutionChain) {
        this.evolutionChain = evolutionChain;
        return this;
    }

    /**
    * Get habitat
    * @return habitat
    **/
    @JsonProperty("habitat")
    public PokemonHabitatSummary getHabitat() {
        return habitat;
    }

    /**
     * Set habitat
     **/
    public void setHabitat(PokemonHabitatSummary habitat) {
        this.habitat = habitat;
    }

    public PokemonSpeciesDetail habitat(PokemonHabitatSummary habitat) {
        this.habitat = habitat;
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

    public PokemonSpeciesDetail generation(GenerationSummary generation) {
        this.generation = generation;
        return this;
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
    * Get palParkEncounters
    * @return palParkEncounters
    **/
    @JsonProperty("pal_park_encounters")
    public List<PokemonSpeciesDetailPalParkEncountersInner> getPalParkEncounters() {
        return palParkEncounters;
    }


    /**
    * Get formDescriptions
    * @return formDescriptions
    **/
    @JsonProperty("form_descriptions")
    public List<PokemonSpeciesDescription> getFormDescriptions() {
        return formDescriptions;
    }


    /**
    * Get flavorTextEntries
    * @return flavorTextEntries
    **/
    @JsonProperty("flavor_text_entries")
    public List<PokemonSpeciesFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }


    /**
    * Get genera
    * @return genera
    **/
    @JsonProperty("genera")
    public List<PokemonSpeciesDetailGeneraInner> getGenera() {
        return genera;
    }


    /**
    * Get varieties
    * @return varieties
    **/
    @JsonProperty("varieties")
    public List<PokemonSpeciesDetailVarietiesInner> getVarieties() {
        return varieties;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonSpeciesDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    genderRate: ").append(toIndentedString(genderRate)).append("\n");
        sb.append("    captureRate: ").append(toIndentedString(captureRate)).append("\n");
        sb.append("    baseHappiness: ").append(toIndentedString(baseHappiness)).append("\n");
        sb.append("    isBaby: ").append(toIndentedString(isBaby)).append("\n");
        sb.append("    isLegendary: ").append(toIndentedString(isLegendary)).append("\n");
        sb.append("    isMythical: ").append(toIndentedString(isMythical)).append("\n");
        sb.append("    hatchCounter: ").append(toIndentedString(hatchCounter)).append("\n");
        sb.append("    hasGenderDifferences: ").append(toIndentedString(hasGenderDifferences)).append("\n");
        sb.append("    formsSwitchable: ").append(toIndentedString(formsSwitchable)).append("\n");
        sb.append("    growthRate: ").append(toIndentedString(growthRate)).append("\n");
        sb.append("    pokedexNumbers: ").append(toIndentedString(pokedexNumbers)).append("\n");
        sb.append("    eggGroups: ").append(toIndentedString(eggGroups)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
        sb.append("    evolvesFromSpecies: ").append(toIndentedString(evolvesFromSpecies)).append("\n");
        sb.append("    evolutionChain: ").append(toIndentedString(evolutionChain)).append("\n");
        sb.append("    habitat: ").append(toIndentedString(habitat)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    palParkEncounters: ").append(toIndentedString(palParkEncounters)).append("\n");
        sb.append("    formDescriptions: ").append(toIndentedString(formDescriptions)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
        sb.append("    genera: ").append(toIndentedString(genera)).append("\n");
        sb.append("    varieties: ").append(toIndentedString(varieties)).append("\n");
        
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
    public static class PokemonSpeciesDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("order")
        private Integer order;
        @jakarta.ws.rs.QueryParam("genderRate")
        private Integer genderRate;
        @jakarta.ws.rs.QueryParam("captureRate")
        private Integer captureRate;
        @jakarta.ws.rs.QueryParam("baseHappiness")
        private Integer baseHappiness;
        @jakarta.ws.rs.QueryParam("isBaby")
        private Boolean isBaby;
        @jakarta.ws.rs.QueryParam("isLegendary")
        private Boolean isLegendary;
        @jakarta.ws.rs.QueryParam("isMythical")
        private Boolean isMythical;
        @jakarta.ws.rs.QueryParam("hatchCounter")
        private Integer hatchCounter;
        @jakarta.ws.rs.QueryParam("hasGenderDifferences")
        private Boolean hasGenderDifferences;
        @jakarta.ws.rs.QueryParam("formsSwitchable")
        private Boolean formsSwitchable;
        @jakarta.ws.rs.QueryParam("growthRate")
        private GrowthRateSummary growthRate;
        @jakarta.ws.rs.QueryParam("pokedexNumbers")
        private List<PokemonDexEntry> pokedexNumbers = null;
        @jakarta.ws.rs.QueryParam("eggGroups")
        private List<PokemonEncountersRetrieve200ResponseInnerLocationArea> eggGroups = null;
        @jakarta.ws.rs.QueryParam("color")
        private PokemonColorSummary color;
        @jakarta.ws.rs.QueryParam("shape")
        private PokemonShapeSummary shape;
        @jakarta.ws.rs.QueryParam("evolvesFromSpecies")
        private PokemonSpeciesSummary evolvesFromSpecies;
        @jakarta.ws.rs.QueryParam("evolutionChain")
        private EvolutionChainSummary evolutionChain;
        @jakarta.ws.rs.QueryParam("habitat")
        private PokemonHabitatSummary habitat;
        @jakarta.ws.rs.QueryParam("generation")
        private GenerationSummary generation;
        @jakarta.ws.rs.QueryParam("names")
        private List<PokemonFormDetailFormNamesInner> names = null;
        @jakarta.ws.rs.QueryParam("palParkEncounters")
        private List<PokemonSpeciesDetailPalParkEncountersInner> palParkEncounters = null;
        @jakarta.ws.rs.QueryParam("formDescriptions")
        private List<PokemonSpeciesDescription> formDescriptions = null;
        @jakarta.ws.rs.QueryParam("flavorTextEntries")
        private List<PokemonSpeciesFlavorText> flavorTextEntries = null;
        @jakarta.ws.rs.QueryParam("genera")
        private List<PokemonSpeciesDetailGeneraInner> genera = null;
        @jakarta.ws.rs.QueryParam("varieties")
        private List<PokemonSpeciesDetailVarietiesInner> varieties = null;

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

        public PokemonSpeciesDetailQueryParam name(String name) {
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

        public PokemonSpeciesDetailQueryParam order(Integer order) {
            this.order = order;
            return this;
        }

        /**
        * Get genderRate
        * minimum: -2147483648
        * maximum: 2147483647
        * @return genderRate
        **/
        @JsonProperty("gender_rate")
        public Integer getGenderRate() {
            return genderRate;
        }

        /**
         * Set genderRate
         **/
        public void setGenderRate(Integer genderRate) {
            this.genderRate = genderRate;
        }

        public PokemonSpeciesDetailQueryParam genderRate(Integer genderRate) {
            this.genderRate = genderRate;
            return this;
        }

        /**
        * Get captureRate
        * minimum: -2147483648
        * maximum: 2147483647
        * @return captureRate
        **/
        @JsonProperty("capture_rate")
        public Integer getCaptureRate() {
            return captureRate;
        }

        /**
         * Set captureRate
         **/
        public void setCaptureRate(Integer captureRate) {
            this.captureRate = captureRate;
        }

        public PokemonSpeciesDetailQueryParam captureRate(Integer captureRate) {
            this.captureRate = captureRate;
            return this;
        }

        /**
        * Get baseHappiness
        * minimum: -2147483648
        * maximum: 2147483647
        * @return baseHappiness
        **/
        @JsonProperty("base_happiness")
        public Integer getBaseHappiness() {
            return baseHappiness;
        }

        /**
         * Set baseHappiness
         **/
        public void setBaseHappiness(Integer baseHappiness) {
            this.baseHappiness = baseHappiness;
        }

        public PokemonSpeciesDetailQueryParam baseHappiness(Integer baseHappiness) {
            this.baseHappiness = baseHappiness;
            return this;
        }

        /**
        * Get isBaby
        * @return isBaby
        **/
        @JsonProperty("is_baby")
        public Boolean getIsBaby() {
            return isBaby;
        }

        /**
         * Set isBaby
         **/
        public void setIsBaby(Boolean isBaby) {
            this.isBaby = isBaby;
        }

        public PokemonSpeciesDetailQueryParam isBaby(Boolean isBaby) {
            this.isBaby = isBaby;
            return this;
        }

        /**
        * Get isLegendary
        * @return isLegendary
        **/
        @JsonProperty("is_legendary")
        public Boolean getIsLegendary() {
            return isLegendary;
        }

        /**
         * Set isLegendary
         **/
        public void setIsLegendary(Boolean isLegendary) {
            this.isLegendary = isLegendary;
        }

        public PokemonSpeciesDetailQueryParam isLegendary(Boolean isLegendary) {
            this.isLegendary = isLegendary;
            return this;
        }

        /**
        * Get isMythical
        * @return isMythical
        **/
        @JsonProperty("is_mythical")
        public Boolean getIsMythical() {
            return isMythical;
        }

        /**
         * Set isMythical
         **/
        public void setIsMythical(Boolean isMythical) {
            this.isMythical = isMythical;
        }

        public PokemonSpeciesDetailQueryParam isMythical(Boolean isMythical) {
            this.isMythical = isMythical;
            return this;
        }

        /**
        * Get hatchCounter
        * minimum: -2147483648
        * maximum: 2147483647
        * @return hatchCounter
        **/
        @JsonProperty("hatch_counter")
        public Integer getHatchCounter() {
            return hatchCounter;
        }

        /**
         * Set hatchCounter
         **/
        public void setHatchCounter(Integer hatchCounter) {
            this.hatchCounter = hatchCounter;
        }

        public PokemonSpeciesDetailQueryParam hatchCounter(Integer hatchCounter) {
            this.hatchCounter = hatchCounter;
            return this;
        }

        /**
        * Get hasGenderDifferences
        * @return hasGenderDifferences
        **/
        @JsonProperty("has_gender_differences")
        public Boolean getHasGenderDifferences() {
            return hasGenderDifferences;
        }

        /**
         * Set hasGenderDifferences
         **/
        public void setHasGenderDifferences(Boolean hasGenderDifferences) {
            this.hasGenderDifferences = hasGenderDifferences;
        }

        public PokemonSpeciesDetailQueryParam hasGenderDifferences(Boolean hasGenderDifferences) {
            this.hasGenderDifferences = hasGenderDifferences;
            return this;
        }

        /**
        * Get formsSwitchable
        * @return formsSwitchable
        **/
        @JsonProperty("forms_switchable")
        public Boolean getFormsSwitchable() {
            return formsSwitchable;
        }

        /**
         * Set formsSwitchable
         **/
        public void setFormsSwitchable(Boolean formsSwitchable) {
            this.formsSwitchable = formsSwitchable;
        }

        public PokemonSpeciesDetailQueryParam formsSwitchable(Boolean formsSwitchable) {
            this.formsSwitchable = formsSwitchable;
            return this;
        }

        /**
        * Get growthRate
        * @return growthRate
        **/
        @JsonProperty("growth_rate")
        public GrowthRateSummary getGrowthRate() {
            return growthRate;
        }

        /**
         * Set growthRate
         **/
        public void setGrowthRate(GrowthRateSummary growthRate) {
            this.growthRate = growthRate;
        }

        public PokemonSpeciesDetailQueryParam growthRate(GrowthRateSummary growthRate) {
            this.growthRate = growthRate;
            return this;
        }

        /**
        * Get pokedexNumbers
        * @return pokedexNumbers
        **/
        @JsonProperty("pokedex_numbers")
        public List<PokemonDexEntry> getPokedexNumbers() {
            return pokedexNumbers;
        }


        /**
        * Get eggGroups
        * @return eggGroups
        **/
        @JsonProperty("egg_groups")
        public List<PokemonEncountersRetrieve200ResponseInnerLocationArea> getEggGroups() {
            return eggGroups;
        }


        /**
        * Get color
        * @return color
        **/
        @JsonProperty("color")
        public PokemonColorSummary getColor() {
            return color;
        }

        /**
         * Set color
         **/
        public void setColor(PokemonColorSummary color) {
            this.color = color;
        }

        public PokemonSpeciesDetailQueryParam color(PokemonColorSummary color) {
            this.color = color;
            return this;
        }

        /**
        * Get shape
        * @return shape
        **/
        @JsonProperty("shape")
        public PokemonShapeSummary getShape() {
            return shape;
        }

        /**
         * Set shape
         **/
        public void setShape(PokemonShapeSummary shape) {
            this.shape = shape;
        }

        public PokemonSpeciesDetailQueryParam shape(PokemonShapeSummary shape) {
            this.shape = shape;
            return this;
        }

        /**
        * Get evolvesFromSpecies
        * @return evolvesFromSpecies
        **/
        @JsonProperty("evolves_from_species")
        public PokemonSpeciesSummary getEvolvesFromSpecies() {
            return evolvesFromSpecies;
        }

        /**
         * Set evolvesFromSpecies
         **/
        public void setEvolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
            this.evolvesFromSpecies = evolvesFromSpecies;
        }

        public PokemonSpeciesDetailQueryParam evolvesFromSpecies(PokemonSpeciesSummary evolvesFromSpecies) {
            this.evolvesFromSpecies = evolvesFromSpecies;
            return this;
        }

        /**
        * Get evolutionChain
        * @return evolutionChain
        **/
        @JsonProperty("evolution_chain")
        public EvolutionChainSummary getEvolutionChain() {
            return evolutionChain;
        }

        /**
         * Set evolutionChain
         **/
        public void setEvolutionChain(EvolutionChainSummary evolutionChain) {
            this.evolutionChain = evolutionChain;
        }

        public PokemonSpeciesDetailQueryParam evolutionChain(EvolutionChainSummary evolutionChain) {
            this.evolutionChain = evolutionChain;
            return this;
        }

        /**
        * Get habitat
        * @return habitat
        **/
        @JsonProperty("habitat")
        public PokemonHabitatSummary getHabitat() {
            return habitat;
        }

        /**
         * Set habitat
         **/
        public void setHabitat(PokemonHabitatSummary habitat) {
            this.habitat = habitat;
        }

        public PokemonSpeciesDetailQueryParam habitat(PokemonHabitatSummary habitat) {
            this.habitat = habitat;
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

        public PokemonSpeciesDetailQueryParam generation(GenerationSummary generation) {
            this.generation = generation;
            return this;
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
        * Get palParkEncounters
        * @return palParkEncounters
        **/
        @JsonProperty("pal_park_encounters")
        public List<PokemonSpeciesDetailPalParkEncountersInner> getPalParkEncounters() {
            return palParkEncounters;
        }


        /**
        * Get formDescriptions
        * @return formDescriptions
        **/
        @JsonProperty("form_descriptions")
        public List<PokemonSpeciesDescription> getFormDescriptions() {
            return formDescriptions;
        }


        /**
        * Get flavorTextEntries
        * @return flavorTextEntries
        **/
        @JsonProperty("flavor_text_entries")
        public List<PokemonSpeciesFlavorText> getFlavorTextEntries() {
            return flavorTextEntries;
        }


        /**
        * Get genera
        * @return genera
        **/
        @JsonProperty("genera")
        public List<PokemonSpeciesDetailGeneraInner> getGenera() {
            return genera;
        }


        /**
        * Get varieties
        * @return varieties
        **/
        @JsonProperty("varieties")
        public List<PokemonSpeciesDetailVarietiesInner> getVarieties() {
            return varieties;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonSpeciesDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    order: ").append(toIndentedString(order)).append("\n");
            sb.append("    genderRate: ").append(toIndentedString(genderRate)).append("\n");
            sb.append("    captureRate: ").append(toIndentedString(captureRate)).append("\n");
            sb.append("    baseHappiness: ").append(toIndentedString(baseHappiness)).append("\n");
            sb.append("    isBaby: ").append(toIndentedString(isBaby)).append("\n");
            sb.append("    isLegendary: ").append(toIndentedString(isLegendary)).append("\n");
            sb.append("    isMythical: ").append(toIndentedString(isMythical)).append("\n");
            sb.append("    hatchCounter: ").append(toIndentedString(hatchCounter)).append("\n");
            sb.append("    hasGenderDifferences: ").append(toIndentedString(hasGenderDifferences)).append("\n");
            sb.append("    formsSwitchable: ").append(toIndentedString(formsSwitchable)).append("\n");
            sb.append("    growthRate: ").append(toIndentedString(growthRate)).append("\n");
            sb.append("    pokedexNumbers: ").append(toIndentedString(pokedexNumbers)).append("\n");
            sb.append("    eggGroups: ").append(toIndentedString(eggGroups)).append("\n");
            sb.append("    color: ").append(toIndentedString(color)).append("\n");
            sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
            sb.append("    evolvesFromSpecies: ").append(toIndentedString(evolvesFromSpecies)).append("\n");
            sb.append("    evolutionChain: ").append(toIndentedString(evolutionChain)).append("\n");
            sb.append("    habitat: ").append(toIndentedString(habitat)).append("\n");
            sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    palParkEncounters: ").append(toIndentedString(palParkEncounters)).append("\n");
            sb.append("    formDescriptions: ").append(toIndentedString(formDescriptions)).append("\n");
            sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
            sb.append("    genera: ").append(toIndentedString(genera)).append("\n");
            sb.append("    varieties: ").append(toIndentedString(varieties)).append("\n");
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
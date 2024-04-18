package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EvolutionChainDetailChainEvolutionDetailsInner  {

    private PokemonEncountersRetrieve200ResponseInnerLocationArea item;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea trigger;
    private Object gender = null;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea heldItem;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea knownMove;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea knownMoveType;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea location;
    private Integer minLevel;
    private Integer minHappiness;
    private Integer minBeauty;
    private Integer minAffection;
    private Boolean needsOverworldRain;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea partySpecies;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea partyType;
    private Integer relativePhysicalStats;
    private String timeOfDay;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea tradeSpecies;
    private Boolean turnUpsideDown;

    /**
    * Get item
    * @return item
    **/
    @JsonProperty("item")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getItem() {
        return item;
    }

    /**
     * Set item
     **/
    public void setItem(PokemonEncountersRetrieve200ResponseInnerLocationArea item) {
        this.item = item;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner item(PokemonEncountersRetrieve200ResponseInnerLocationArea item) {
        this.item = item;
        return this;
    }

    /**
    * Get trigger
    * @return trigger
    **/
    @JsonProperty("trigger")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getTrigger() {
        return trigger;
    }

    /**
     * Set trigger
     **/
    public void setTrigger(PokemonEncountersRetrieve200ResponseInnerLocationArea trigger) {
        this.trigger = trigger;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner trigger(PokemonEncountersRetrieve200ResponseInnerLocationArea trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
    * Get gender
    * @return gender
    **/
    @JsonProperty("gender")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getGender() {
        return gender;
    }

    /**
     * Set gender
     **/
    public void setGender(Object gender) {
        this.gender = gender;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner gender(Object gender) {
        this.gender = gender;
        return this;
    }

    /**
    * Get heldItem
    * @return heldItem
    **/
    @JsonProperty("held_item")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getHeldItem() {
        return heldItem;
    }

    /**
     * Set heldItem
     **/
    public void setHeldItem(PokemonEncountersRetrieve200ResponseInnerLocationArea heldItem) {
        this.heldItem = heldItem;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner heldItem(PokemonEncountersRetrieve200ResponseInnerLocationArea heldItem) {
        this.heldItem = heldItem;
        return this;
    }

    /**
    * Get knownMove
    * @return knownMove
    **/
    @JsonProperty("known_move")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getKnownMove() {
        return knownMove;
    }

    /**
     * Set knownMove
     **/
    public void setKnownMove(PokemonEncountersRetrieve200ResponseInnerLocationArea knownMove) {
        this.knownMove = knownMove;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner knownMove(PokemonEncountersRetrieve200ResponseInnerLocationArea knownMove) {
        this.knownMove = knownMove;
        return this;
    }

    /**
    * Get knownMoveType
    * @return knownMoveType
    **/
    @JsonProperty("known_move_type")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getKnownMoveType() {
        return knownMoveType;
    }

    /**
     * Set knownMoveType
     **/
    public void setKnownMoveType(PokemonEncountersRetrieve200ResponseInnerLocationArea knownMoveType) {
        this.knownMoveType = knownMoveType;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner knownMoveType(PokemonEncountersRetrieve200ResponseInnerLocationArea knownMoveType) {
        this.knownMoveType = knownMoveType;
        return this;
    }

    /**
    * Get location
    * @return location
    **/
    @JsonProperty("location")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getLocation() {
        return location;
    }

    /**
     * Set location
     **/
    public void setLocation(PokemonEncountersRetrieve200ResponseInnerLocationArea location) {
        this.location = location;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner location(PokemonEncountersRetrieve200ResponseInnerLocationArea location) {
        this.location = location;
        return this;
    }

    /**
    * Get minLevel
    * @return minLevel
    **/
    @JsonProperty("min_level")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMinLevel() {
        return minLevel;
    }

    /**
     * Set minLevel
     **/
    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner minLevel(Integer minLevel) {
        this.minLevel = minLevel;
        return this;
    }

    /**
    * Get minHappiness
    * @return minHappiness
    **/
    @JsonProperty("min_happiness")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMinHappiness() {
        return minHappiness;
    }

    /**
     * Set minHappiness
     **/
    public void setMinHappiness(Integer minHappiness) {
        this.minHappiness = minHappiness;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner minHappiness(Integer minHappiness) {
        this.minHappiness = minHappiness;
        return this;
    }

    /**
    * Get minBeauty
    * @return minBeauty
    **/
    @JsonProperty("min_beauty")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMinBeauty() {
        return minBeauty;
    }

    /**
     * Set minBeauty
     **/
    public void setMinBeauty(Integer minBeauty) {
        this.minBeauty = minBeauty;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner minBeauty(Integer minBeauty) {
        this.minBeauty = minBeauty;
        return this;
    }

    /**
    * Get minAffection
    * @return minAffection
    **/
    @JsonProperty("min_affection")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMinAffection() {
        return minAffection;
    }

    /**
     * Set minAffection
     **/
    public void setMinAffection(Integer minAffection) {
        this.minAffection = minAffection;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner minAffection(Integer minAffection) {
        this.minAffection = minAffection;
        return this;
    }

    /**
    * Get needsOverworldRain
    * @return needsOverworldRain
    **/
    @JsonProperty("needs_overworld_rain")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getNeedsOverworldRain() {
        return needsOverworldRain;
    }

    /**
     * Set needsOverworldRain
     **/
    public void setNeedsOverworldRain(Boolean needsOverworldRain) {
        this.needsOverworldRain = needsOverworldRain;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner needsOverworldRain(Boolean needsOverworldRain) {
        this.needsOverworldRain = needsOverworldRain;
        return this;
    }

    /**
    * Get partySpecies
    * @return partySpecies
    **/
    @JsonProperty("party_species")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getPartySpecies() {
        return partySpecies;
    }

    /**
     * Set partySpecies
     **/
    public void setPartySpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea partySpecies) {
        this.partySpecies = partySpecies;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner partySpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea partySpecies) {
        this.partySpecies = partySpecies;
        return this;
    }

    /**
    * Get partyType
    * @return partyType
    **/
    @JsonProperty("party_type")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getPartyType() {
        return partyType;
    }

    /**
     * Set partyType
     **/
    public void setPartyType(PokemonEncountersRetrieve200ResponseInnerLocationArea partyType) {
        this.partyType = partyType;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner partyType(PokemonEncountersRetrieve200ResponseInnerLocationArea partyType) {
        this.partyType = partyType;
        return this;
    }

    /**
    * Get relativePhysicalStats
    * @return relativePhysicalStats
    **/
    @JsonProperty("relative_physical_stats")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getRelativePhysicalStats() {
        return relativePhysicalStats;
    }

    /**
     * Set relativePhysicalStats
     **/
    public void setRelativePhysicalStats(Integer relativePhysicalStats) {
        this.relativePhysicalStats = relativePhysicalStats;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner relativePhysicalStats(Integer relativePhysicalStats) {
        this.relativePhysicalStats = relativePhysicalStats;
        return this;
    }

    /**
    * Get timeOfDay
    * @return timeOfDay
    **/
    @JsonProperty("time_of_day")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * Set timeOfDay
     **/
    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner timeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
        return this;
    }

    /**
    * Get tradeSpecies
    * @return tradeSpecies
    **/
    @JsonProperty("trade_species")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getTradeSpecies() {
        return tradeSpecies;
    }

    /**
     * Set tradeSpecies
     **/
    public void setTradeSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea tradeSpecies) {
        this.tradeSpecies = tradeSpecies;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner tradeSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea tradeSpecies) {
        this.tradeSpecies = tradeSpecies;
        return this;
    }

    /**
    * Get turnUpsideDown
    * @return turnUpsideDown
    **/
    @JsonProperty("turn_upside_down")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getTurnUpsideDown() {
        return turnUpsideDown;
    }

    /**
     * Set turnUpsideDown
     **/
    public void setTurnUpsideDown(Boolean turnUpsideDown) {
        this.turnUpsideDown = turnUpsideDown;
    }

    public EvolutionChainDetailChainEvolutionDetailsInner turnUpsideDown(Boolean turnUpsideDown) {
        this.turnUpsideDown = turnUpsideDown;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvolutionChainDetailChainEvolutionDetailsInner {\n");

        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    heldItem: ").append(toIndentedString(heldItem)).append("\n");
        sb.append("    knownMove: ").append(toIndentedString(knownMove)).append("\n");
        sb.append("    knownMoveType: ").append(toIndentedString(knownMoveType)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
        sb.append("    minHappiness: ").append(toIndentedString(minHappiness)).append("\n");
        sb.append("    minBeauty: ").append(toIndentedString(minBeauty)).append("\n");
        sb.append("    minAffection: ").append(toIndentedString(minAffection)).append("\n");
        sb.append("    needsOverworldRain: ").append(toIndentedString(needsOverworldRain)).append("\n");
        sb.append("    partySpecies: ").append(toIndentedString(partySpecies)).append("\n");
        sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
        sb.append("    relativePhysicalStats: ").append(toIndentedString(relativePhysicalStats)).append("\n");
        sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
        sb.append("    tradeSpecies: ").append(toIndentedString(tradeSpecies)).append("\n");
        sb.append("    turnUpsideDown: ").append(toIndentedString(turnUpsideDown)).append("\n");
        
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
    public static class EvolutionChainDetailChainEvolutionDetailsInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("item")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea item;
        @jakarta.ws.rs.QueryParam("trigger")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea trigger;
        @jakarta.ws.rs.QueryParam("gender")
        private Object gender = null;
        @jakarta.ws.rs.QueryParam("heldItem")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea heldItem;
        @jakarta.ws.rs.QueryParam("knownMove")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea knownMove;
        @jakarta.ws.rs.QueryParam("knownMoveType")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea knownMoveType;
        @jakarta.ws.rs.QueryParam("location")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea location;
        @jakarta.ws.rs.QueryParam("minLevel")
        private Integer minLevel;
        @jakarta.ws.rs.QueryParam("minHappiness")
        private Integer minHappiness;
        @jakarta.ws.rs.QueryParam("minBeauty")
        private Integer minBeauty;
        @jakarta.ws.rs.QueryParam("minAffection")
        private Integer minAffection;
        @jakarta.ws.rs.QueryParam("needsOverworldRain")
        private Boolean needsOverworldRain;
        @jakarta.ws.rs.QueryParam("partySpecies")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea partySpecies;
        @jakarta.ws.rs.QueryParam("partyType")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea partyType;
        @jakarta.ws.rs.QueryParam("relativePhysicalStats")
        private Integer relativePhysicalStats;
        @jakarta.ws.rs.QueryParam("timeOfDay")
        private String timeOfDay;
        @jakarta.ws.rs.QueryParam("tradeSpecies")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea tradeSpecies;
        @jakarta.ws.rs.QueryParam("turnUpsideDown")
        private Boolean turnUpsideDown;

        /**
        * Get item
        * @return item
        **/
        @JsonProperty("item")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getItem() {
            return item;
        }

        /**
         * Set item
         **/
        public void setItem(PokemonEncountersRetrieve200ResponseInnerLocationArea item) {
            this.item = item;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam item(PokemonEncountersRetrieve200ResponseInnerLocationArea item) {
            this.item = item;
            return this;
        }

        /**
        * Get trigger
        * @return trigger
        **/
        @JsonProperty("trigger")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getTrigger() {
            return trigger;
        }

        /**
         * Set trigger
         **/
        public void setTrigger(PokemonEncountersRetrieve200ResponseInnerLocationArea trigger) {
            this.trigger = trigger;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam trigger(PokemonEncountersRetrieve200ResponseInnerLocationArea trigger) {
            this.trigger = trigger;
            return this;
        }

        /**
        * Get gender
        * @return gender
        **/
        @JsonProperty("gender")
        public Object getGender() {
            return gender;
        }

        /**
         * Set gender
         **/
        public void setGender(Object gender) {
            this.gender = gender;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam gender(Object gender) {
            this.gender = gender;
            return this;
        }

        /**
        * Get heldItem
        * @return heldItem
        **/
        @JsonProperty("held_item")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getHeldItem() {
            return heldItem;
        }

        /**
         * Set heldItem
         **/
        public void setHeldItem(PokemonEncountersRetrieve200ResponseInnerLocationArea heldItem) {
            this.heldItem = heldItem;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam heldItem(PokemonEncountersRetrieve200ResponseInnerLocationArea heldItem) {
            this.heldItem = heldItem;
            return this;
        }

        /**
        * Get knownMove
        * @return knownMove
        **/
        @JsonProperty("known_move")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getKnownMove() {
            return knownMove;
        }

        /**
         * Set knownMove
         **/
        public void setKnownMove(PokemonEncountersRetrieve200ResponseInnerLocationArea knownMove) {
            this.knownMove = knownMove;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam knownMove(PokemonEncountersRetrieve200ResponseInnerLocationArea knownMove) {
            this.knownMove = knownMove;
            return this;
        }

        /**
        * Get knownMoveType
        * @return knownMoveType
        **/
        @JsonProperty("known_move_type")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getKnownMoveType() {
            return knownMoveType;
        }

        /**
         * Set knownMoveType
         **/
        public void setKnownMoveType(PokemonEncountersRetrieve200ResponseInnerLocationArea knownMoveType) {
            this.knownMoveType = knownMoveType;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam knownMoveType(PokemonEncountersRetrieve200ResponseInnerLocationArea knownMoveType) {
            this.knownMoveType = knownMoveType;
            return this;
        }

        /**
        * Get location
        * @return location
        **/
        @JsonProperty("location")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getLocation() {
            return location;
        }

        /**
         * Set location
         **/
        public void setLocation(PokemonEncountersRetrieve200ResponseInnerLocationArea location) {
            this.location = location;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam location(PokemonEncountersRetrieve200ResponseInnerLocationArea location) {
            this.location = location;
            return this;
        }

        /**
        * Get minLevel
        * @return minLevel
        **/
        @JsonProperty("min_level")
        public Integer getMinLevel() {
            return minLevel;
        }

        /**
         * Set minLevel
         **/
        public void setMinLevel(Integer minLevel) {
            this.minLevel = minLevel;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam minLevel(Integer minLevel) {
            this.minLevel = minLevel;
            return this;
        }

        /**
        * Get minHappiness
        * @return minHappiness
        **/
        @JsonProperty("min_happiness")
        public Integer getMinHappiness() {
            return minHappiness;
        }

        /**
         * Set minHappiness
         **/
        public void setMinHappiness(Integer minHappiness) {
            this.minHappiness = minHappiness;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam minHappiness(Integer minHappiness) {
            this.minHappiness = minHappiness;
            return this;
        }

        /**
        * Get minBeauty
        * @return minBeauty
        **/
        @JsonProperty("min_beauty")
        public Integer getMinBeauty() {
            return minBeauty;
        }

        /**
         * Set minBeauty
         **/
        public void setMinBeauty(Integer minBeauty) {
            this.minBeauty = minBeauty;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam minBeauty(Integer minBeauty) {
            this.minBeauty = minBeauty;
            return this;
        }

        /**
        * Get minAffection
        * @return minAffection
        **/
        @JsonProperty("min_affection")
        public Integer getMinAffection() {
            return minAffection;
        }

        /**
         * Set minAffection
         **/
        public void setMinAffection(Integer minAffection) {
            this.minAffection = minAffection;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam minAffection(Integer minAffection) {
            this.minAffection = minAffection;
            return this;
        }

        /**
        * Get needsOverworldRain
        * @return needsOverworldRain
        **/
        @JsonProperty("needs_overworld_rain")
        public Boolean getNeedsOverworldRain() {
            return needsOverworldRain;
        }

        /**
         * Set needsOverworldRain
         **/
        public void setNeedsOverworldRain(Boolean needsOverworldRain) {
            this.needsOverworldRain = needsOverworldRain;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam needsOverworldRain(Boolean needsOverworldRain) {
            this.needsOverworldRain = needsOverworldRain;
            return this;
        }

        /**
        * Get partySpecies
        * @return partySpecies
        **/
        @JsonProperty("party_species")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getPartySpecies() {
            return partySpecies;
        }

        /**
         * Set partySpecies
         **/
        public void setPartySpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea partySpecies) {
            this.partySpecies = partySpecies;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam partySpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea partySpecies) {
            this.partySpecies = partySpecies;
            return this;
        }

        /**
        * Get partyType
        * @return partyType
        **/
        @JsonProperty("party_type")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getPartyType() {
            return partyType;
        }

        /**
         * Set partyType
         **/
        public void setPartyType(PokemonEncountersRetrieve200ResponseInnerLocationArea partyType) {
            this.partyType = partyType;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam partyType(PokemonEncountersRetrieve200ResponseInnerLocationArea partyType) {
            this.partyType = partyType;
            return this;
        }

        /**
        * Get relativePhysicalStats
        * @return relativePhysicalStats
        **/
        @JsonProperty("relative_physical_stats")
        public Integer getRelativePhysicalStats() {
            return relativePhysicalStats;
        }

        /**
         * Set relativePhysicalStats
         **/
        public void setRelativePhysicalStats(Integer relativePhysicalStats) {
            this.relativePhysicalStats = relativePhysicalStats;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam relativePhysicalStats(Integer relativePhysicalStats) {
            this.relativePhysicalStats = relativePhysicalStats;
            return this;
        }

        /**
        * Get timeOfDay
        * @return timeOfDay
        **/
        @JsonProperty("time_of_day")
        public String getTimeOfDay() {
            return timeOfDay;
        }

        /**
         * Set timeOfDay
         **/
        public void setTimeOfDay(String timeOfDay) {
            this.timeOfDay = timeOfDay;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam timeOfDay(String timeOfDay) {
            this.timeOfDay = timeOfDay;
            return this;
        }

        /**
        * Get tradeSpecies
        * @return tradeSpecies
        **/
        @JsonProperty("trade_species")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getTradeSpecies() {
            return tradeSpecies;
        }

        /**
         * Set tradeSpecies
         **/
        public void setTradeSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea tradeSpecies) {
            this.tradeSpecies = tradeSpecies;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam tradeSpecies(PokemonEncountersRetrieve200ResponseInnerLocationArea tradeSpecies) {
            this.tradeSpecies = tradeSpecies;
            return this;
        }

        /**
        * Get turnUpsideDown
        * @return turnUpsideDown
        **/
        @JsonProperty("turn_upside_down")
        public Boolean getTurnUpsideDown() {
            return turnUpsideDown;
        }

        /**
         * Set turnUpsideDown
         **/
        public void setTurnUpsideDown(Boolean turnUpsideDown) {
            this.turnUpsideDown = turnUpsideDown;
        }

        public EvolutionChainDetailChainEvolutionDetailsInnerQueryParam turnUpsideDown(Boolean turnUpsideDown) {
            this.turnUpsideDown = turnUpsideDown;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EvolutionChainDetailChainEvolutionDetailsInnerQueryParam {\n");

            sb.append("    item: ").append(toIndentedString(item)).append("\n");
            sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
            sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
            sb.append("    heldItem: ").append(toIndentedString(heldItem)).append("\n");
            sb.append("    knownMove: ").append(toIndentedString(knownMove)).append("\n");
            sb.append("    knownMoveType: ").append(toIndentedString(knownMoveType)).append("\n");
            sb.append("    location: ").append(toIndentedString(location)).append("\n");
            sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
            sb.append("    minHappiness: ").append(toIndentedString(minHappiness)).append("\n");
            sb.append("    minBeauty: ").append(toIndentedString(minBeauty)).append("\n");
            sb.append("    minAffection: ").append(toIndentedString(minAffection)).append("\n");
            sb.append("    needsOverworldRain: ").append(toIndentedString(needsOverworldRain)).append("\n");
            sb.append("    partySpecies: ").append(toIndentedString(partySpecies)).append("\n");
            sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
            sb.append("    relativePhysicalStats: ").append(toIndentedString(relativePhysicalStats)).append("\n");
            sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
            sb.append("    tradeSpecies: ").append(toIndentedString(tradeSpecies)).append("\n");
            sb.append("    turnUpsideDown: ").append(toIndentedString(turnUpsideDown)).append("\n");
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
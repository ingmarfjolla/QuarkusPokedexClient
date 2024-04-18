package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveMeta  {

    private MoveMetaAilmentSummary ailment;
    private MoveMetaCategorySummary category;
    private Integer minHits;
    private Integer maxHits;
    private Integer minTurns;
    private Integer maxTurns;
    private Integer drain;
    private Integer healing;
    private Integer critRate;
    private Integer ailmentChance;
    private Integer flinchChance;
    private Integer statChance;

    /**
    * Get ailment
    * @return ailment
    **/
    @JsonProperty("ailment")
    public MoveMetaAilmentSummary getAilment() {
        return ailment;
    }

    /**
     * Set ailment
     **/
    public void setAilment(MoveMetaAilmentSummary ailment) {
        this.ailment = ailment;
    }

    public MoveMeta ailment(MoveMetaAilmentSummary ailment) {
        this.ailment = ailment;
        return this;
    }

    /**
    * Get category
    * @return category
    **/
    @JsonProperty("category")
    public MoveMetaCategorySummary getCategory() {
        return category;
    }

    /**
     * Set category
     **/
    public void setCategory(MoveMetaCategorySummary category) {
        this.category = category;
    }

    public MoveMeta category(MoveMetaCategorySummary category) {
        this.category = category;
        return this;
    }

    /**
    * Get minHits
    * minimum: -2147483648
    * maximum: 2147483647
    * @return minHits
    **/
    @JsonProperty("min_hits")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMinHits() {
        return minHits;
    }

    /**
     * Set minHits
     **/
    public void setMinHits(Integer minHits) {
        this.minHits = minHits;
    }

    public MoveMeta minHits(Integer minHits) {
        this.minHits = minHits;
        return this;
    }

    /**
    * Get maxHits
    * minimum: -2147483648
    * maximum: 2147483647
    * @return maxHits
    **/
    @JsonProperty("max_hits")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMaxHits() {
        return maxHits;
    }

    /**
     * Set maxHits
     **/
    public void setMaxHits(Integer maxHits) {
        this.maxHits = maxHits;
    }

    public MoveMeta maxHits(Integer maxHits) {
        this.maxHits = maxHits;
        return this;
    }

    /**
    * Get minTurns
    * minimum: -2147483648
    * maximum: 2147483647
    * @return minTurns
    **/
    @JsonProperty("min_turns")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMinTurns() {
        return minTurns;
    }

    /**
     * Set minTurns
     **/
    public void setMinTurns(Integer minTurns) {
        this.minTurns = minTurns;
    }

    public MoveMeta minTurns(Integer minTurns) {
        this.minTurns = minTurns;
        return this;
    }

    /**
    * Get maxTurns
    * minimum: -2147483648
    * maximum: 2147483647
    * @return maxTurns
    **/
    @JsonProperty("max_turns")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getMaxTurns() {
        return maxTurns;
    }

    /**
     * Set maxTurns
     **/
    public void setMaxTurns(Integer maxTurns) {
        this.maxTurns = maxTurns;
    }

    public MoveMeta maxTurns(Integer maxTurns) {
        this.maxTurns = maxTurns;
        return this;
    }

    /**
    * Get drain
    * minimum: -2147483648
    * maximum: 2147483647
    * @return drain
    **/
    @JsonProperty("drain")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getDrain() {
        return drain;
    }

    /**
     * Set drain
     **/
    public void setDrain(Integer drain) {
        this.drain = drain;
    }

    public MoveMeta drain(Integer drain) {
        this.drain = drain;
        return this;
    }

    /**
    * Get healing
    * minimum: -2147483648
    * maximum: 2147483647
    * @return healing
    **/
    @JsonProperty("healing")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getHealing() {
        return healing;
    }

    /**
     * Set healing
     **/
    public void setHealing(Integer healing) {
        this.healing = healing;
    }

    public MoveMeta healing(Integer healing) {
        this.healing = healing;
        return this;
    }

    /**
    * Get critRate
    * minimum: -2147483648
    * maximum: 2147483647
    * @return critRate
    **/
    @JsonProperty("crit_rate")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCritRate() {
        return critRate;
    }

    /**
     * Set critRate
     **/
    public void setCritRate(Integer critRate) {
        this.critRate = critRate;
    }

    public MoveMeta critRate(Integer critRate) {
        this.critRate = critRate;
        return this;
    }

    /**
    * Get ailmentChance
    * minimum: -2147483648
    * maximum: 2147483647
    * @return ailmentChance
    **/
    @JsonProperty("ailment_chance")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getAilmentChance() {
        return ailmentChance;
    }

    /**
     * Set ailmentChance
     **/
    public void setAilmentChance(Integer ailmentChance) {
        this.ailmentChance = ailmentChance;
    }

    public MoveMeta ailmentChance(Integer ailmentChance) {
        this.ailmentChance = ailmentChance;
        return this;
    }

    /**
    * Get flinchChance
    * minimum: -2147483648
    * maximum: 2147483647
    * @return flinchChance
    **/
    @JsonProperty("flinch_chance")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFlinchChance() {
        return flinchChance;
    }

    /**
     * Set flinchChance
     **/
    public void setFlinchChance(Integer flinchChance) {
        this.flinchChance = flinchChance;
    }

    public MoveMeta flinchChance(Integer flinchChance) {
        this.flinchChance = flinchChance;
        return this;
    }

    /**
    * Get statChance
    * minimum: -2147483648
    * maximum: 2147483647
    * @return statChance
    **/
    @JsonProperty("stat_chance")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getStatChance() {
        return statChance;
    }

    /**
     * Set statChance
     **/
    public void setStatChance(Integer statChance) {
        this.statChance = statChance;
    }

    public MoveMeta statChance(Integer statChance) {
        this.statChance = statChance;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveMeta {\n");

        sb.append("    ailment: ").append(toIndentedString(ailment)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    minHits: ").append(toIndentedString(minHits)).append("\n");
        sb.append("    maxHits: ").append(toIndentedString(maxHits)).append("\n");
        sb.append("    minTurns: ").append(toIndentedString(minTurns)).append("\n");
        sb.append("    maxTurns: ").append(toIndentedString(maxTurns)).append("\n");
        sb.append("    drain: ").append(toIndentedString(drain)).append("\n");
        sb.append("    healing: ").append(toIndentedString(healing)).append("\n");
        sb.append("    critRate: ").append(toIndentedString(critRate)).append("\n");
        sb.append("    ailmentChance: ").append(toIndentedString(ailmentChance)).append("\n");
        sb.append("    flinchChance: ").append(toIndentedString(flinchChance)).append("\n");
        sb.append("    statChance: ").append(toIndentedString(statChance)).append("\n");
        
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
    public static class MoveMetaQueryParam  {

        @jakarta.ws.rs.QueryParam("ailment")
        private MoveMetaAilmentSummary ailment;
        @jakarta.ws.rs.QueryParam("category")
        private MoveMetaCategorySummary category;
        @jakarta.ws.rs.QueryParam("minHits")
        private Integer minHits;
        @jakarta.ws.rs.QueryParam("maxHits")
        private Integer maxHits;
        @jakarta.ws.rs.QueryParam("minTurns")
        private Integer minTurns;
        @jakarta.ws.rs.QueryParam("maxTurns")
        private Integer maxTurns;
        @jakarta.ws.rs.QueryParam("drain")
        private Integer drain;
        @jakarta.ws.rs.QueryParam("healing")
        private Integer healing;
        @jakarta.ws.rs.QueryParam("critRate")
        private Integer critRate;
        @jakarta.ws.rs.QueryParam("ailmentChance")
        private Integer ailmentChance;
        @jakarta.ws.rs.QueryParam("flinchChance")
        private Integer flinchChance;
        @jakarta.ws.rs.QueryParam("statChance")
        private Integer statChance;

        /**
        * Get ailment
        * @return ailment
        **/
        @JsonProperty("ailment")
        public MoveMetaAilmentSummary getAilment() {
            return ailment;
        }

        /**
         * Set ailment
         **/
        public void setAilment(MoveMetaAilmentSummary ailment) {
            this.ailment = ailment;
        }

        public MoveMetaQueryParam ailment(MoveMetaAilmentSummary ailment) {
            this.ailment = ailment;
            return this;
        }

        /**
        * Get category
        * @return category
        **/
        @JsonProperty("category")
        public MoveMetaCategorySummary getCategory() {
            return category;
        }

        /**
         * Set category
         **/
        public void setCategory(MoveMetaCategorySummary category) {
            this.category = category;
        }

        public MoveMetaQueryParam category(MoveMetaCategorySummary category) {
            this.category = category;
            return this;
        }

        /**
        * Get minHits
        * minimum: -2147483648
        * maximum: 2147483647
        * @return minHits
        **/
        @JsonProperty("min_hits")
        public Integer getMinHits() {
            return minHits;
        }

        /**
         * Set minHits
         **/
        public void setMinHits(Integer minHits) {
            this.minHits = minHits;
        }

        public MoveMetaQueryParam minHits(Integer minHits) {
            this.minHits = minHits;
            return this;
        }

        /**
        * Get maxHits
        * minimum: -2147483648
        * maximum: 2147483647
        * @return maxHits
        **/
        @JsonProperty("max_hits")
        public Integer getMaxHits() {
            return maxHits;
        }

        /**
         * Set maxHits
         **/
        public void setMaxHits(Integer maxHits) {
            this.maxHits = maxHits;
        }

        public MoveMetaQueryParam maxHits(Integer maxHits) {
            this.maxHits = maxHits;
            return this;
        }

        /**
        * Get minTurns
        * minimum: -2147483648
        * maximum: 2147483647
        * @return minTurns
        **/
        @JsonProperty("min_turns")
        public Integer getMinTurns() {
            return minTurns;
        }

        /**
         * Set minTurns
         **/
        public void setMinTurns(Integer minTurns) {
            this.minTurns = minTurns;
        }

        public MoveMetaQueryParam minTurns(Integer minTurns) {
            this.minTurns = minTurns;
            return this;
        }

        /**
        * Get maxTurns
        * minimum: -2147483648
        * maximum: 2147483647
        * @return maxTurns
        **/
        @JsonProperty("max_turns")
        public Integer getMaxTurns() {
            return maxTurns;
        }

        /**
         * Set maxTurns
         **/
        public void setMaxTurns(Integer maxTurns) {
            this.maxTurns = maxTurns;
        }

        public MoveMetaQueryParam maxTurns(Integer maxTurns) {
            this.maxTurns = maxTurns;
            return this;
        }

        /**
        * Get drain
        * minimum: -2147483648
        * maximum: 2147483647
        * @return drain
        **/
        @JsonProperty("drain")
        public Integer getDrain() {
            return drain;
        }

        /**
         * Set drain
         **/
        public void setDrain(Integer drain) {
            this.drain = drain;
        }

        public MoveMetaQueryParam drain(Integer drain) {
            this.drain = drain;
            return this;
        }

        /**
        * Get healing
        * minimum: -2147483648
        * maximum: 2147483647
        * @return healing
        **/
        @JsonProperty("healing")
        public Integer getHealing() {
            return healing;
        }

        /**
         * Set healing
         **/
        public void setHealing(Integer healing) {
            this.healing = healing;
        }

        public MoveMetaQueryParam healing(Integer healing) {
            this.healing = healing;
            return this;
        }

        /**
        * Get critRate
        * minimum: -2147483648
        * maximum: 2147483647
        * @return critRate
        **/
        @JsonProperty("crit_rate")
        public Integer getCritRate() {
            return critRate;
        }

        /**
         * Set critRate
         **/
        public void setCritRate(Integer critRate) {
            this.critRate = critRate;
        }

        public MoveMetaQueryParam critRate(Integer critRate) {
            this.critRate = critRate;
            return this;
        }

        /**
        * Get ailmentChance
        * minimum: -2147483648
        * maximum: 2147483647
        * @return ailmentChance
        **/
        @JsonProperty("ailment_chance")
        public Integer getAilmentChance() {
            return ailmentChance;
        }

        /**
         * Set ailmentChance
         **/
        public void setAilmentChance(Integer ailmentChance) {
            this.ailmentChance = ailmentChance;
        }

        public MoveMetaQueryParam ailmentChance(Integer ailmentChance) {
            this.ailmentChance = ailmentChance;
            return this;
        }

        /**
        * Get flinchChance
        * minimum: -2147483648
        * maximum: 2147483647
        * @return flinchChance
        **/
        @JsonProperty("flinch_chance")
        public Integer getFlinchChance() {
            return flinchChance;
        }

        /**
         * Set flinchChance
         **/
        public void setFlinchChance(Integer flinchChance) {
            this.flinchChance = flinchChance;
        }

        public MoveMetaQueryParam flinchChance(Integer flinchChance) {
            this.flinchChance = flinchChance;
            return this;
        }

        /**
        * Get statChance
        * minimum: -2147483648
        * maximum: 2147483647
        * @return statChance
        **/
        @JsonProperty("stat_chance")
        public Integer getStatChance() {
            return statChance;
        }

        /**
         * Set statChance
         **/
        public void setStatChance(Integer statChance) {
            this.statChance = statChance;
        }

        public MoveMetaQueryParam statChance(Integer statChance) {
            this.statChance = statChance;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveMetaQueryParam {\n");

            sb.append("    ailment: ").append(toIndentedString(ailment)).append("\n");
            sb.append("    category: ").append(toIndentedString(category)).append("\n");
            sb.append("    minHits: ").append(toIndentedString(minHits)).append("\n");
            sb.append("    maxHits: ").append(toIndentedString(maxHits)).append("\n");
            sb.append("    minTurns: ").append(toIndentedString(minTurns)).append("\n");
            sb.append("    maxTurns: ").append(toIndentedString(maxTurns)).append("\n");
            sb.append("    drain: ").append(toIndentedString(drain)).append("\n");
            sb.append("    healing: ").append(toIndentedString(healing)).append("\n");
            sb.append("    critRate: ").append(toIndentedString(critRate)).append("\n");
            sb.append("    ailmentChance: ").append(toIndentedString(ailmentChance)).append("\n");
            sb.append("    flinchChance: ").append(toIndentedString(flinchChance)).append("\n");
            sb.append("    statChance: ").append(toIndentedString(statChance)).append("\n");
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
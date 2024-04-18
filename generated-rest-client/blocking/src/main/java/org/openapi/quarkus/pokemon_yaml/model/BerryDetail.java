package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BerryDetail  {

    private Integer id;
    private String name;
    private Integer growthTime;
    private Integer maxHarvest;
    private Integer naturalGiftPower;
    private Integer size;
    private Integer smoothness;
    private Integer soilDryness;
    private BerryFirmnessSummary firmness;
    private List<BerryDetailFlavorsInner> flavors = new ArrayList<>();
    private ItemSummary item;
    private TypeSummary naturalGiftType;

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

    public BerryDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get growthTime
    * minimum: -2147483648
    * maximum: 2147483647
    * @return growthTime
    **/
    @JsonProperty("growth_time")
    public Integer getGrowthTime() {
        return growthTime;
    }

    /**
     * Set growthTime
     **/
    public void setGrowthTime(Integer growthTime) {
        this.growthTime = growthTime;
    }

    public BerryDetail growthTime(Integer growthTime) {
        this.growthTime = growthTime;
        return this;
    }

    /**
    * Get maxHarvest
    * minimum: -2147483648
    * maximum: 2147483647
    * @return maxHarvest
    **/
    @JsonProperty("max_harvest")
    public Integer getMaxHarvest() {
        return maxHarvest;
    }

    /**
     * Set maxHarvest
     **/
    public void setMaxHarvest(Integer maxHarvest) {
        this.maxHarvest = maxHarvest;
    }

    public BerryDetail maxHarvest(Integer maxHarvest) {
        this.maxHarvest = maxHarvest;
        return this;
    }

    /**
    * Get naturalGiftPower
    * minimum: -2147483648
    * maximum: 2147483647
    * @return naturalGiftPower
    **/
    @JsonProperty("natural_gift_power")
    public Integer getNaturalGiftPower() {
        return naturalGiftPower;
    }

    /**
     * Set naturalGiftPower
     **/
    public void setNaturalGiftPower(Integer naturalGiftPower) {
        this.naturalGiftPower = naturalGiftPower;
    }

    public BerryDetail naturalGiftPower(Integer naturalGiftPower) {
        this.naturalGiftPower = naturalGiftPower;
        return this;
    }

    /**
    * Get size
    * minimum: -2147483648
    * maximum: 2147483647
    * @return size
    **/
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * Set size
     **/
    public void setSize(Integer size) {
        this.size = size;
    }

    public BerryDetail size(Integer size) {
        this.size = size;
        return this;
    }

    /**
    * Get smoothness
    * minimum: -2147483648
    * maximum: 2147483647
    * @return smoothness
    **/
    @JsonProperty("smoothness")
    public Integer getSmoothness() {
        return smoothness;
    }

    /**
     * Set smoothness
     **/
    public void setSmoothness(Integer smoothness) {
        this.smoothness = smoothness;
    }

    public BerryDetail smoothness(Integer smoothness) {
        this.smoothness = smoothness;
        return this;
    }

    /**
    * Get soilDryness
    * minimum: -2147483648
    * maximum: 2147483647
    * @return soilDryness
    **/
    @JsonProperty("soil_dryness")
    public Integer getSoilDryness() {
        return soilDryness;
    }

    /**
     * Set soilDryness
     **/
    public void setSoilDryness(Integer soilDryness) {
        this.soilDryness = soilDryness;
    }

    public BerryDetail soilDryness(Integer soilDryness) {
        this.soilDryness = soilDryness;
        return this;
    }

    /**
    * Get firmness
    * @return firmness
    **/
    @JsonProperty("firmness")
    public BerryFirmnessSummary getFirmness() {
        return firmness;
    }

    /**
     * Set firmness
     **/
    public void setFirmness(BerryFirmnessSummary firmness) {
        this.firmness = firmness;
    }

    public BerryDetail firmness(BerryFirmnessSummary firmness) {
        this.firmness = firmness;
        return this;
    }

    /**
    * Get flavors
    * @return flavors
    **/
    @JsonProperty("flavors")
    public List<BerryDetailFlavorsInner> getFlavors() {
        return flavors;
    }


    /**
    * Get item
    * @return item
    **/
    @JsonProperty("item")
    public ItemSummary getItem() {
        return item;
    }

    /**
     * Set item
     **/
    public void setItem(ItemSummary item) {
        this.item = item;
    }

    public BerryDetail item(ItemSummary item) {
        this.item = item;
        return this;
    }

    /**
    * Get naturalGiftType
    * @return naturalGiftType
    **/
    @JsonProperty("natural_gift_type")
    public TypeSummary getNaturalGiftType() {
        return naturalGiftType;
    }

    /**
     * Set naturalGiftType
     **/
    public void setNaturalGiftType(TypeSummary naturalGiftType) {
        this.naturalGiftType = naturalGiftType;
    }

    public BerryDetail naturalGiftType(TypeSummary naturalGiftType) {
        this.naturalGiftType = naturalGiftType;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BerryDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    growthTime: ").append(toIndentedString(growthTime)).append("\n");
        sb.append("    maxHarvest: ").append(toIndentedString(maxHarvest)).append("\n");
        sb.append("    naturalGiftPower: ").append(toIndentedString(naturalGiftPower)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    smoothness: ").append(toIndentedString(smoothness)).append("\n");
        sb.append("    soilDryness: ").append(toIndentedString(soilDryness)).append("\n");
        sb.append("    firmness: ").append(toIndentedString(firmness)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    naturalGiftType: ").append(toIndentedString(naturalGiftType)).append("\n");
        
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
    public static class BerryDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("growthTime")
        private Integer growthTime;
        @jakarta.ws.rs.QueryParam("maxHarvest")
        private Integer maxHarvest;
        @jakarta.ws.rs.QueryParam("naturalGiftPower")
        private Integer naturalGiftPower;
        @jakarta.ws.rs.QueryParam("size")
        private Integer size;
        @jakarta.ws.rs.QueryParam("smoothness")
        private Integer smoothness;
        @jakarta.ws.rs.QueryParam("soilDryness")
        private Integer soilDryness;
        @jakarta.ws.rs.QueryParam("firmness")
        private BerryFirmnessSummary firmness;
        @jakarta.ws.rs.QueryParam("flavors")
        private List<BerryDetailFlavorsInner> flavors = null;
        @jakarta.ws.rs.QueryParam("item")
        private ItemSummary item;
        @jakarta.ws.rs.QueryParam("naturalGiftType")
        private TypeSummary naturalGiftType;

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

        public BerryDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get growthTime
        * minimum: -2147483648
        * maximum: 2147483647
        * @return growthTime
        **/
        @JsonProperty("growth_time")
        public Integer getGrowthTime() {
            return growthTime;
        }

        /**
         * Set growthTime
         **/
        public void setGrowthTime(Integer growthTime) {
            this.growthTime = growthTime;
        }

        public BerryDetailQueryParam growthTime(Integer growthTime) {
            this.growthTime = growthTime;
            return this;
        }

        /**
        * Get maxHarvest
        * minimum: -2147483648
        * maximum: 2147483647
        * @return maxHarvest
        **/
        @JsonProperty("max_harvest")
        public Integer getMaxHarvest() {
            return maxHarvest;
        }

        /**
         * Set maxHarvest
         **/
        public void setMaxHarvest(Integer maxHarvest) {
            this.maxHarvest = maxHarvest;
        }

        public BerryDetailQueryParam maxHarvest(Integer maxHarvest) {
            this.maxHarvest = maxHarvest;
            return this;
        }

        /**
        * Get naturalGiftPower
        * minimum: -2147483648
        * maximum: 2147483647
        * @return naturalGiftPower
        **/
        @JsonProperty("natural_gift_power")
        public Integer getNaturalGiftPower() {
            return naturalGiftPower;
        }

        /**
         * Set naturalGiftPower
         **/
        public void setNaturalGiftPower(Integer naturalGiftPower) {
            this.naturalGiftPower = naturalGiftPower;
        }

        public BerryDetailQueryParam naturalGiftPower(Integer naturalGiftPower) {
            this.naturalGiftPower = naturalGiftPower;
            return this;
        }

        /**
        * Get size
        * minimum: -2147483648
        * maximum: 2147483647
        * @return size
        **/
        @JsonProperty("size")
        public Integer getSize() {
            return size;
        }

        /**
         * Set size
         **/
        public void setSize(Integer size) {
            this.size = size;
        }

        public BerryDetailQueryParam size(Integer size) {
            this.size = size;
            return this;
        }

        /**
        * Get smoothness
        * minimum: -2147483648
        * maximum: 2147483647
        * @return smoothness
        **/
        @JsonProperty("smoothness")
        public Integer getSmoothness() {
            return smoothness;
        }

        /**
         * Set smoothness
         **/
        public void setSmoothness(Integer smoothness) {
            this.smoothness = smoothness;
        }

        public BerryDetailQueryParam smoothness(Integer smoothness) {
            this.smoothness = smoothness;
            return this;
        }

        /**
        * Get soilDryness
        * minimum: -2147483648
        * maximum: 2147483647
        * @return soilDryness
        **/
        @JsonProperty("soil_dryness")
        public Integer getSoilDryness() {
            return soilDryness;
        }

        /**
         * Set soilDryness
         **/
        public void setSoilDryness(Integer soilDryness) {
            this.soilDryness = soilDryness;
        }

        public BerryDetailQueryParam soilDryness(Integer soilDryness) {
            this.soilDryness = soilDryness;
            return this;
        }

        /**
        * Get firmness
        * @return firmness
        **/
        @JsonProperty("firmness")
        public BerryFirmnessSummary getFirmness() {
            return firmness;
        }

        /**
         * Set firmness
         **/
        public void setFirmness(BerryFirmnessSummary firmness) {
            this.firmness = firmness;
        }

        public BerryDetailQueryParam firmness(BerryFirmnessSummary firmness) {
            this.firmness = firmness;
            return this;
        }

        /**
        * Get flavors
        * @return flavors
        **/
        @JsonProperty("flavors")
        public List<BerryDetailFlavorsInner> getFlavors() {
            return flavors;
        }


        /**
        * Get item
        * @return item
        **/
        @JsonProperty("item")
        public ItemSummary getItem() {
            return item;
        }

        /**
         * Set item
         **/
        public void setItem(ItemSummary item) {
            this.item = item;
        }

        public BerryDetailQueryParam item(ItemSummary item) {
            this.item = item;
            return this;
        }

        /**
        * Get naturalGiftType
        * @return naturalGiftType
        **/
        @JsonProperty("natural_gift_type")
        public TypeSummary getNaturalGiftType() {
            return naturalGiftType;
        }

        /**
         * Set naturalGiftType
         **/
        public void setNaturalGiftType(TypeSummary naturalGiftType) {
            this.naturalGiftType = naturalGiftType;
        }

        public BerryDetailQueryParam naturalGiftType(TypeSummary naturalGiftType) {
            this.naturalGiftType = naturalGiftType;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BerryDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    growthTime: ").append(toIndentedString(growthTime)).append("\n");
            sb.append("    maxHarvest: ").append(toIndentedString(maxHarvest)).append("\n");
            sb.append("    naturalGiftPower: ").append(toIndentedString(naturalGiftPower)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    smoothness: ").append(toIndentedString(smoothness)).append("\n");
            sb.append("    soilDryness: ").append(toIndentedString(soilDryness)).append("\n");
            sb.append("    firmness: ").append(toIndentedString(firmness)).append("\n");
            sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
            sb.append("    item: ").append(toIndentedString(item)).append("\n");
            sb.append("    naturalGiftType: ").append(toIndentedString(naturalGiftType)).append("\n");
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
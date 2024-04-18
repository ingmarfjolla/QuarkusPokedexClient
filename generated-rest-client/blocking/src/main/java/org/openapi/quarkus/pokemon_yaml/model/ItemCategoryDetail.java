package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemCategoryDetail  {

    private Integer id;
    private String name;
    private List<ItemSummary> items = new ArrayList<>();
    private List<ItemCategoryName> names = new ArrayList<>();
    private ItemPocketSummary pocket;

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

    public ItemCategoryDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get items
    * @return items
    **/
    @JsonProperty("items")
    public List<ItemSummary> getItems() {
        return items;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<ItemCategoryName> getNames() {
        return names;
    }


    /**
    * Get pocket
    * @return pocket
    **/
    @JsonProperty("pocket")
    public ItemPocketSummary getPocket() {
        return pocket;
    }

    /**
     * Set pocket
     **/
    public void setPocket(ItemPocketSummary pocket) {
        this.pocket = pocket;
    }

    public ItemCategoryDetail pocket(ItemPocketSummary pocket) {
        this.pocket = pocket;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemCategoryDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pocket: ").append(toIndentedString(pocket)).append("\n");
        
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
    public static class ItemCategoryDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("items")
        private List<ItemSummary> items = null;
        @jakarta.ws.rs.QueryParam("names")
        private List<ItemCategoryName> names = null;
        @jakarta.ws.rs.QueryParam("pocket")
        private ItemPocketSummary pocket;

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

        public ItemCategoryDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get items
        * @return items
        **/
        @JsonProperty("items")
        public List<ItemSummary> getItems() {
            return items;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<ItemCategoryName> getNames() {
            return names;
        }


        /**
        * Get pocket
        * @return pocket
        **/
        @JsonProperty("pocket")
        public ItemPocketSummary getPocket() {
            return pocket;
        }

        /**
         * Set pocket
         **/
        public void setPocket(ItemPocketSummary pocket) {
            this.pocket = pocket;
        }

        public ItemCategoryDetailQueryParam pocket(ItemPocketSummary pocket) {
            this.pocket = pocket;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ItemCategoryDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    items: ").append(toIndentedString(items)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    pocket: ").append(toIndentedString(pocket)).append("\n");
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
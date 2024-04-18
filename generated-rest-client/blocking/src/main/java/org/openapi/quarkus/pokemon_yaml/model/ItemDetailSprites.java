package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDetailSprites  {

    private String _default;

    /**
    * Get _default
    * @return _default
    **/
    @JsonProperty("default")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getDefault() {
        return _default;
    }

    /**
     * Set _default
     **/
    public void setDefault(String _default) {
        this._default = _default;
    }

    public ItemDetailSprites _default(String _default) {
        this._default = _default;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemDetailSprites {\n");

        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        
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
    public static class ItemDetailSpritesQueryParam  {

        @jakarta.ws.rs.QueryParam("_default")
        private String _default;

        /**
        * Get _default
        * @return _default
        **/
        @JsonProperty("default")
        public String getDefault() {
            return _default;
        }

        /**
         * Set _default
         **/
        public void setDefault(String _default) {
            this._default = _default;
        }

        public ItemDetailSpritesQueryParam _default(String _default) {
            this._default = _default;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ItemDetailSpritesQueryParam {\n");

            sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
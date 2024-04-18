package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveDetailContestCombos  {

    private MoveDetailContestCombosNormal normal;
    private MoveDetailContestCombosNormal _super;

    /**
    * Get normal
    * @return normal
    **/
    @JsonProperty("normal")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public MoveDetailContestCombosNormal getNormal() {
        return normal;
    }

    /**
     * Set normal
     **/
    public void setNormal(MoveDetailContestCombosNormal normal) {
        this.normal = normal;
    }

    public MoveDetailContestCombos normal(MoveDetailContestCombosNormal normal) {
        this.normal = normal;
        return this;
    }

    /**
    * Get _super
    * @return _super
    **/
    @JsonProperty("super")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public MoveDetailContestCombosNormal getSuper() {
        return _super;
    }

    /**
     * Set _super
     **/
    public void setSuper(MoveDetailContestCombosNormal _super) {
        this._super = _super;
    }

    public MoveDetailContestCombos _super(MoveDetailContestCombosNormal _super) {
        this._super = _super;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveDetailContestCombos {\n");

        sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
        sb.append("    _super: ").append(toIndentedString(_super)).append("\n");
        
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
    public static class MoveDetailContestCombosQueryParam  {

        @jakarta.ws.rs.QueryParam("normal")
        private MoveDetailContestCombosNormal normal;
        @jakarta.ws.rs.QueryParam("_super")
        private MoveDetailContestCombosNormal _super;

        /**
        * Get normal
        * @return normal
        **/
        @JsonProperty("normal")
        public MoveDetailContestCombosNormal getNormal() {
            return normal;
        }

        /**
         * Set normal
         **/
        public void setNormal(MoveDetailContestCombosNormal normal) {
            this.normal = normal;
        }

        public MoveDetailContestCombosQueryParam normal(MoveDetailContestCombosNormal normal) {
            this.normal = normal;
            return this;
        }

        /**
        * Get _super
        * @return _super
        **/
        @JsonProperty("super")
        public MoveDetailContestCombosNormal getSuper() {
            return _super;
        }

        /**
         * Set _super
         **/
        public void setSuper(MoveDetailContestCombosNormal _super) {
            this._super = _super;
        }

        public MoveDetailContestCombosQueryParam _super(MoveDetailContestCombosNormal _super) {
            this._super = _super;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveDetailContestCombosQueryParam {\n");

            sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
            sb.append("    _super: ").append(toIndentedString(_super)).append("\n");
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
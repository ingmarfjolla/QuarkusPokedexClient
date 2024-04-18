package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TypeDetailPastDamageRelationsInnerDamageRelations  {

    private PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageTo;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageTo;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageTo;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageFrom;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageFrom;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageFrom;

    /**
    * Get noDamageTo
    * @return noDamageTo
    **/
    @JsonProperty("no_damage_to")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getNoDamageTo() {
        return noDamageTo;
    }

    /**
     * Set noDamageTo
     **/
    public void setNoDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageTo) {
        this.noDamageTo = noDamageTo;
    }

    public TypeDetailPastDamageRelationsInnerDamageRelations noDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageTo) {
        this.noDamageTo = noDamageTo;
        return this;
    }

    /**
    * Get halfDamageTo
    * @return halfDamageTo
    **/
    @JsonProperty("half_damage_to")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getHalfDamageTo() {
        return halfDamageTo;
    }

    /**
     * Set halfDamageTo
     **/
    public void setHalfDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageTo) {
        this.halfDamageTo = halfDamageTo;
    }

    public TypeDetailPastDamageRelationsInnerDamageRelations halfDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageTo) {
        this.halfDamageTo = halfDamageTo;
        return this;
    }

    /**
    * Get doubleDamageTo
    * @return doubleDamageTo
    **/
    @JsonProperty("double_damage_to")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getDoubleDamageTo() {
        return doubleDamageTo;
    }

    /**
     * Set doubleDamageTo
     **/
    public void setDoubleDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageTo) {
        this.doubleDamageTo = doubleDamageTo;
    }

    public TypeDetailPastDamageRelationsInnerDamageRelations doubleDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageTo) {
        this.doubleDamageTo = doubleDamageTo;
        return this;
    }

    /**
    * Get noDamageFrom
    * @return noDamageFrom
    **/
    @JsonProperty("no_damage_from")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getNoDamageFrom() {
        return noDamageFrom;
    }

    /**
     * Set noDamageFrom
     **/
    public void setNoDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageFrom) {
        this.noDamageFrom = noDamageFrom;
    }

    public TypeDetailPastDamageRelationsInnerDamageRelations noDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageFrom) {
        this.noDamageFrom = noDamageFrom;
        return this;
    }

    /**
    * Get halfDamageFrom
    * @return halfDamageFrom
    **/
    @JsonProperty("half_damage_from")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getHalfDamageFrom() {
        return halfDamageFrom;
    }

    /**
     * Set halfDamageFrom
     **/
    public void setHalfDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageFrom) {
        this.halfDamageFrom = halfDamageFrom;
    }

    public TypeDetailPastDamageRelationsInnerDamageRelations halfDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageFrom) {
        this.halfDamageFrom = halfDamageFrom;
        return this;
    }

    /**
    * Get doubleDamageFrom
    * @return doubleDamageFrom
    **/
    @JsonProperty("double_damage_from")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getDoubleDamageFrom() {
        return doubleDamageFrom;
    }

    /**
     * Set doubleDamageFrom
     **/
    public void setDoubleDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageFrom) {
        this.doubleDamageFrom = doubleDamageFrom;
    }

    public TypeDetailPastDamageRelationsInnerDamageRelations doubleDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageFrom) {
        this.doubleDamageFrom = doubleDamageFrom;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDetailPastDamageRelationsInnerDamageRelations {\n");

        sb.append("    noDamageTo: ").append(toIndentedString(noDamageTo)).append("\n");
        sb.append("    halfDamageTo: ").append(toIndentedString(halfDamageTo)).append("\n");
        sb.append("    doubleDamageTo: ").append(toIndentedString(doubleDamageTo)).append("\n");
        sb.append("    noDamageFrom: ").append(toIndentedString(noDamageFrom)).append("\n");
        sb.append("    halfDamageFrom: ").append(toIndentedString(halfDamageFrom)).append("\n");
        sb.append("    doubleDamageFrom: ").append(toIndentedString(doubleDamageFrom)).append("\n");
        
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
    public static class TypeDetailPastDamageRelationsInnerDamageRelationsQueryParam  {

        @jakarta.ws.rs.QueryParam("noDamageTo")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageTo;
        @jakarta.ws.rs.QueryParam("halfDamageTo")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageTo;
        @jakarta.ws.rs.QueryParam("doubleDamageTo")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageTo;
        @jakarta.ws.rs.QueryParam("noDamageFrom")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageFrom;
        @jakarta.ws.rs.QueryParam("halfDamageFrom")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageFrom;
        @jakarta.ws.rs.QueryParam("doubleDamageFrom")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageFrom;

        /**
        * Get noDamageTo
        * @return noDamageTo
        **/
        @JsonProperty("no_damage_to")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getNoDamageTo() {
            return noDamageTo;
        }

        /**
         * Set noDamageTo
         **/
        public void setNoDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageTo) {
            this.noDamageTo = noDamageTo;
        }

        public TypeDetailPastDamageRelationsInnerDamageRelationsQueryParam noDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageTo) {
            this.noDamageTo = noDamageTo;
            return this;
        }

        /**
        * Get halfDamageTo
        * @return halfDamageTo
        **/
        @JsonProperty("half_damage_to")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getHalfDamageTo() {
            return halfDamageTo;
        }

        /**
         * Set halfDamageTo
         **/
        public void setHalfDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageTo) {
            this.halfDamageTo = halfDamageTo;
        }

        public TypeDetailPastDamageRelationsInnerDamageRelationsQueryParam halfDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageTo) {
            this.halfDamageTo = halfDamageTo;
            return this;
        }

        /**
        * Get doubleDamageTo
        * @return doubleDamageTo
        **/
        @JsonProperty("double_damage_to")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getDoubleDamageTo() {
            return doubleDamageTo;
        }

        /**
         * Set doubleDamageTo
         **/
        public void setDoubleDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageTo) {
            this.doubleDamageTo = doubleDamageTo;
        }

        public TypeDetailPastDamageRelationsInnerDamageRelationsQueryParam doubleDamageTo(PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageTo) {
            this.doubleDamageTo = doubleDamageTo;
            return this;
        }

        /**
        * Get noDamageFrom
        * @return noDamageFrom
        **/
        @JsonProperty("no_damage_from")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getNoDamageFrom() {
            return noDamageFrom;
        }

        /**
         * Set noDamageFrom
         **/
        public void setNoDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageFrom) {
            this.noDamageFrom = noDamageFrom;
        }

        public TypeDetailPastDamageRelationsInnerDamageRelationsQueryParam noDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea noDamageFrom) {
            this.noDamageFrom = noDamageFrom;
            return this;
        }

        /**
        * Get halfDamageFrom
        * @return halfDamageFrom
        **/
        @JsonProperty("half_damage_from")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getHalfDamageFrom() {
            return halfDamageFrom;
        }

        /**
         * Set halfDamageFrom
         **/
        public void setHalfDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageFrom) {
            this.halfDamageFrom = halfDamageFrom;
        }

        public TypeDetailPastDamageRelationsInnerDamageRelationsQueryParam halfDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea halfDamageFrom) {
            this.halfDamageFrom = halfDamageFrom;
            return this;
        }

        /**
        * Get doubleDamageFrom
        * @return doubleDamageFrom
        **/
        @JsonProperty("double_damage_from")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getDoubleDamageFrom() {
            return doubleDamageFrom;
        }

        /**
         * Set doubleDamageFrom
         **/
        public void setDoubleDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageFrom) {
            this.doubleDamageFrom = doubleDamageFrom;
        }

        public TypeDetailPastDamageRelationsInnerDamageRelationsQueryParam doubleDamageFrom(PokemonEncountersRetrieve200ResponseInnerLocationArea doubleDamageFrom) {
            this.doubleDamageFrom = doubleDamageFrom;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TypeDetailPastDamageRelationsInnerDamageRelationsQueryParam {\n");

            sb.append("    noDamageTo: ").append(toIndentedString(noDamageTo)).append("\n");
            sb.append("    halfDamageTo: ").append(toIndentedString(halfDamageTo)).append("\n");
            sb.append("    doubleDamageTo: ").append(toIndentedString(doubleDamageTo)).append("\n");
            sb.append("    noDamageFrom: ").append(toIndentedString(noDamageFrom)).append("\n");
            sb.append("    halfDamageFrom: ").append(toIndentedString(halfDamageFrom)).append("\n");
            sb.append("    doubleDamageFrom: ").append(toIndentedString(doubleDamageFrom)).append("\n");
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
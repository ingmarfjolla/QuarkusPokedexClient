package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveChange  {

    private Integer accuracy;
    private Integer power;
    private Integer pp;
    private Integer effectChance;
    private String effectEntries;
    private TypeSummary type;
    private VersionGroupSummary versionGroup;

    /**
    * Get accuracy
    * minimum: -2147483648
    * maximum: 2147483647
    * @return accuracy
    **/
    @JsonProperty("accuracy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getAccuracy() {
        return accuracy;
    }

    /**
     * Set accuracy
     **/
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public MoveChange accuracy(Integer accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
    * Get power
    * minimum: -2147483648
    * maximum: 2147483647
    * @return power
    **/
    @JsonProperty("power")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPower() {
        return power;
    }

    /**
     * Set power
     **/
    public void setPower(Integer power) {
        this.power = power;
    }

    public MoveChange power(Integer power) {
        this.power = power;
        return this;
    }

    /**
    * Get pp
    * minimum: -2147483648
    * maximum: 2147483647
    * @return pp
    **/
    @JsonProperty("pp")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPp() {
        return pp;
    }

    /**
     * Set pp
     **/
    public void setPp(Integer pp) {
        this.pp = pp;
    }

    public MoveChange pp(Integer pp) {
        this.pp = pp;
        return this;
    }

    /**
    * Get effectChance
    * @return effectChance
    **/
    @JsonProperty("effect_chance")
    public Integer getEffectChance() {
        return effectChance;
    }

    /**
     * Set effectChance
     **/
    public void setEffectChance(Integer effectChance) {
        this.effectChance = effectChance;
    }

    public MoveChange effectChance(Integer effectChance) {
        this.effectChance = effectChance;
        return this;
    }

    /**
    * Get effectEntries
    * @return effectEntries
    **/
    @JsonProperty("effect_entries")
    public String getEffectEntries() {
        return effectEntries;
    }


    /**
    * Get type
    * @return type
    **/
    @JsonProperty("type")
    public TypeSummary getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(TypeSummary type) {
        this.type = type;
    }

    public MoveChange type(TypeSummary type) {
        this.type = type;
        return this;
    }

    /**
    * Get versionGroup
    * @return versionGroup
    **/
    @JsonProperty("version_group")
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    /**
     * Set versionGroup
     **/
    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    public MoveChange versionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveChange {\n");

        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
        sb.append("    power: ").append(toIndentedString(power)).append("\n");
        sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
        sb.append("    effectChance: ").append(toIndentedString(effectChance)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        
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
    public static class MoveChangeQueryParam  {

        @jakarta.ws.rs.QueryParam("accuracy")
        private Integer accuracy;
        @jakarta.ws.rs.QueryParam("power")
        private Integer power;
        @jakarta.ws.rs.QueryParam("pp")
        private Integer pp;
        @jakarta.ws.rs.QueryParam("effectChance")
        private Integer effectChance;
        @jakarta.ws.rs.QueryParam("effectEntries")
        private String effectEntries;
        @jakarta.ws.rs.QueryParam("type")
        private TypeSummary type;
        @jakarta.ws.rs.QueryParam("versionGroup")
        private VersionGroupSummary versionGroup;

        /**
        * Get accuracy
        * minimum: -2147483648
        * maximum: 2147483647
        * @return accuracy
        **/
        @JsonProperty("accuracy")
        public Integer getAccuracy() {
            return accuracy;
        }

        /**
         * Set accuracy
         **/
        public void setAccuracy(Integer accuracy) {
            this.accuracy = accuracy;
        }

        public MoveChangeQueryParam accuracy(Integer accuracy) {
            this.accuracy = accuracy;
            return this;
        }

        /**
        * Get power
        * minimum: -2147483648
        * maximum: 2147483647
        * @return power
        **/
        @JsonProperty("power")
        public Integer getPower() {
            return power;
        }

        /**
         * Set power
         **/
        public void setPower(Integer power) {
            this.power = power;
        }

        public MoveChangeQueryParam power(Integer power) {
            this.power = power;
            return this;
        }

        /**
        * Get pp
        * minimum: -2147483648
        * maximum: 2147483647
        * @return pp
        **/
        @JsonProperty("pp")
        public Integer getPp() {
            return pp;
        }

        /**
         * Set pp
         **/
        public void setPp(Integer pp) {
            this.pp = pp;
        }

        public MoveChangeQueryParam pp(Integer pp) {
            this.pp = pp;
            return this;
        }

        /**
        * Get effectChance
        * @return effectChance
        **/
        @JsonProperty("effect_chance")
        public Integer getEffectChance() {
            return effectChance;
        }

        /**
         * Set effectChance
         **/
        public void setEffectChance(Integer effectChance) {
            this.effectChance = effectChance;
        }

        public MoveChangeQueryParam effectChance(Integer effectChance) {
            this.effectChance = effectChance;
            return this;
        }

        /**
        * Get effectEntries
        * @return effectEntries
        **/
        @JsonProperty("effect_entries")
        public String getEffectEntries() {
            return effectEntries;
        }


        /**
        * Get type
        * @return type
        **/
        @JsonProperty("type")
        public TypeSummary getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(TypeSummary type) {
            this.type = type;
        }

        public MoveChangeQueryParam type(TypeSummary type) {
            this.type = type;
            return this;
        }

        /**
        * Get versionGroup
        * @return versionGroup
        **/
        @JsonProperty("version_group")
        public VersionGroupSummary getVersionGroup() {
            return versionGroup;
        }

        /**
         * Set versionGroup
         **/
        public void setVersionGroup(VersionGroupSummary versionGroup) {
            this.versionGroup = versionGroup;
        }

        public MoveChangeQueryParam versionGroup(VersionGroupSummary versionGroup) {
            this.versionGroup = versionGroup;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveChangeQueryParam {\n");

            sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
            sb.append("    power: ").append(toIndentedString(power)).append("\n");
            sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
            sb.append("    effectChance: ").append(toIndentedString(effectChance)).append("\n");
            sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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
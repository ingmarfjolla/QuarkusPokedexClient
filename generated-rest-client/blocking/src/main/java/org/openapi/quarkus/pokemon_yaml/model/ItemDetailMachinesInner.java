package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDetailMachinesInner  {

    private String machine;
    private PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup;

    /**
    * Get machine
    * @return machine
    **/
    @JsonProperty("machine")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getMachine() {
        return machine;
    }

    /**
     * Set machine
     **/
    public void setMachine(String machine) {
        this.machine = machine;
    }

    public ItemDetailMachinesInner machine(String machine) {
        this.machine = machine;
        return this;
    }

    /**
    * Get versionGroup
    * @return versionGroup
    **/
    @JsonProperty("version_group")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public PokemonEncountersRetrieve200ResponseInnerLocationArea getVersionGroup() {
        return versionGroup;
    }

    /**
     * Set versionGroup
     **/
    public void setVersionGroup(PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup) {
        this.versionGroup = versionGroup;
    }

    public ItemDetailMachinesInner versionGroup(PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup) {
        this.versionGroup = versionGroup;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemDetailMachinesInner {\n");

        sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
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
    public static class ItemDetailMachinesInnerQueryParam  {

        @jakarta.ws.rs.QueryParam("machine")
        private String machine;
        @jakarta.ws.rs.QueryParam("versionGroup")
        private PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup;

        /**
        * Get machine
        * @return machine
        **/
        @JsonProperty("machine")
        public String getMachine() {
            return machine;
        }

        /**
         * Set machine
         **/
        public void setMachine(String machine) {
            this.machine = machine;
        }

        public ItemDetailMachinesInnerQueryParam machine(String machine) {
            this.machine = machine;
            return this;
        }

        /**
        * Get versionGroup
        * @return versionGroup
        **/
        @JsonProperty("version_group")
        public PokemonEncountersRetrieve200ResponseInnerLocationArea getVersionGroup() {
            return versionGroup;
        }

        /**
         * Set versionGroup
         **/
        public void setVersionGroup(PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup) {
            this.versionGroup = versionGroup;
        }

        public ItemDetailMachinesInnerQueryParam versionGroup(PokemonEncountersRetrieve200ResponseInnerLocationArea versionGroup) {
            this.versionGroup = versionGroup;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ItemDetailMachinesInnerQueryParam {\n");

            sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
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
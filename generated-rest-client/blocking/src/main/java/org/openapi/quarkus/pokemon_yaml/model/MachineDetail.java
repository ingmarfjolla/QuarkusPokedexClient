package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MachineDetail  {

    private Integer id;
    private ItemSummary item;
    private VersionGroupSummary versionGroup;
    private MoveSummary move;

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
    public Integer getId() {
        return id;
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

    public MachineDetail item(ItemSummary item) {
        this.item = item;
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

    public MachineDetail versionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
        return this;
    }

    /**
    * Get move
    * @return move
    **/
    @JsonProperty("move")
    public MoveSummary getMove() {
        return move;
    }

    /**
     * Set move
     **/
    public void setMove(MoveSummary move) {
        this.move = move;
    }

    public MachineDetail move(MoveSummary move) {
        this.move = move;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MachineDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("    move: ").append(toIndentedString(move)).append("\n");
        
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
    public static class MachineDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("item")
        private ItemSummary item;
        @jakarta.ws.rs.QueryParam("versionGroup")
        private VersionGroupSummary versionGroup;
        @jakarta.ws.rs.QueryParam("move")
        private MoveSummary move;

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
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

        public MachineDetailQueryParam item(ItemSummary item) {
            this.item = item;
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

        public MachineDetailQueryParam versionGroup(VersionGroupSummary versionGroup) {
            this.versionGroup = versionGroup;
            return this;
        }

        /**
        * Get move
        * @return move
        **/
        @JsonProperty("move")
        public MoveSummary getMove() {
            return move;
        }

        /**
         * Set move
         **/
        public void setMove(MoveSummary move) {
            this.move = move;
        }

        public MachineDetailQueryParam move(MoveSummary move) {
            this.move = move;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MachineDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    item: ").append(toIndentedString(item)).append("\n");
            sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
            sb.append("    move: ").append(toIndentedString(move)).append("\n");
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
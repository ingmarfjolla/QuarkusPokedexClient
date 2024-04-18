package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SuperContestEffectDetail  {

    private Integer id;
    private Integer appeal;
    private List<SuperContestEffectFlavorText> flavorTextEntries = new ArrayList<>();
    private List<MoveSummary> moves = new ArrayList<>();

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }


    /**
    * Get appeal
    * minimum: -2147483648
    * maximum: 2147483647
    * @return appeal
    **/
    @JsonProperty("appeal")
    public Integer getAppeal() {
        return appeal;
    }

    /**
     * Set appeal
     **/
    public void setAppeal(Integer appeal) {
        this.appeal = appeal;
    }

    public SuperContestEffectDetail appeal(Integer appeal) {
        this.appeal = appeal;
        return this;
    }

    /**
    * Get flavorTextEntries
    * @return flavorTextEntries
    **/
    @JsonProperty("flavor_text_entries")
    public List<SuperContestEffectFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }


    /**
    * Get moves
    * @return moves
    **/
    @JsonProperty("moves")
    public List<MoveSummary> getMoves() {
        return moves;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SuperContestEffectDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appeal: ").append(toIndentedString(appeal)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
        
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
    public static class SuperContestEffectDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("appeal")
        private Integer appeal;
        @jakarta.ws.rs.QueryParam("flavorTextEntries")
        private List<SuperContestEffectFlavorText> flavorTextEntries = null;
        @jakarta.ws.rs.QueryParam("moves")
        private List<MoveSummary> moves = null;

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }


        /**
        * Get appeal
        * minimum: -2147483648
        * maximum: 2147483647
        * @return appeal
        **/
        @JsonProperty("appeal")
        public Integer getAppeal() {
            return appeal;
        }

        /**
         * Set appeal
         **/
        public void setAppeal(Integer appeal) {
            this.appeal = appeal;
        }

        public SuperContestEffectDetailQueryParam appeal(Integer appeal) {
            this.appeal = appeal;
            return this;
        }

        /**
        * Get flavorTextEntries
        * @return flavorTextEntries
        **/
        @JsonProperty("flavor_text_entries")
        public List<SuperContestEffectFlavorText> getFlavorTextEntries() {
            return flavorTextEntries;
        }


        /**
        * Get moves
        * @return moves
        **/
        @JsonProperty("moves")
        public List<MoveSummary> getMoves() {
            return moves;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SuperContestEffectDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    appeal: ").append(toIndentedString(appeal)).append("\n");
            sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
            sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
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
package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContestEffectDetail  {

    private Integer id;
    private Integer appeal;
    private Integer jam;
    private List<ContestEffectEffectText> effectEntries = new ArrayList<>();
    private List<ContestEffectFlavorText> flavorTextEntries = new ArrayList<>();

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

    public ContestEffectDetail appeal(Integer appeal) {
        this.appeal = appeal;
        return this;
    }

    /**
    * Get jam
    * minimum: -2147483648
    * maximum: 2147483647
    * @return jam
    **/
    @JsonProperty("jam")
    public Integer getJam() {
        return jam;
    }

    /**
     * Set jam
     **/
    public void setJam(Integer jam) {
        this.jam = jam;
    }

    public ContestEffectDetail jam(Integer jam) {
        this.jam = jam;
        return this;
    }

    /**
    * Get effectEntries
    * @return effectEntries
    **/
    @JsonProperty("effect_entries")
    public List<ContestEffectEffectText> getEffectEntries() {
        return effectEntries;
    }


    /**
    * Get flavorTextEntries
    * @return flavorTextEntries
    **/
    @JsonProperty("flavor_text_entries")
    public List<ContestEffectFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContestEffectDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appeal: ").append(toIndentedString(appeal)).append("\n");
        sb.append("    jam: ").append(toIndentedString(jam)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
        
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
    public static class ContestEffectDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("appeal")
        private Integer appeal;
        @jakarta.ws.rs.QueryParam("jam")
        private Integer jam;
        @jakarta.ws.rs.QueryParam("effectEntries")
        private List<ContestEffectEffectText> effectEntries = null;
        @jakarta.ws.rs.QueryParam("flavorTextEntries")
        private List<ContestEffectFlavorText> flavorTextEntries = null;

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

        public ContestEffectDetailQueryParam appeal(Integer appeal) {
            this.appeal = appeal;
            return this;
        }

        /**
        * Get jam
        * minimum: -2147483648
        * maximum: 2147483647
        * @return jam
        **/
        @JsonProperty("jam")
        public Integer getJam() {
            return jam;
        }

        /**
         * Set jam
         **/
        public void setJam(Integer jam) {
            this.jam = jam;
        }

        public ContestEffectDetailQueryParam jam(Integer jam) {
            this.jam = jam;
            return this;
        }

        /**
        * Get effectEntries
        * @return effectEntries
        **/
        @JsonProperty("effect_entries")
        public List<ContestEffectEffectText> getEffectEntries() {
            return effectEntries;
        }


        /**
        * Get flavorTextEntries
        * @return flavorTextEntries
        **/
        @JsonProperty("flavor_text_entries")
        public List<ContestEffectFlavorText> getFlavorTextEntries() {
            return flavorTextEntries;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ContestEffectDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    appeal: ").append(toIndentedString(appeal)).append("\n");
            sb.append("    jam: ").append(toIndentedString(jam)).append("\n");
            sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
            sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
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
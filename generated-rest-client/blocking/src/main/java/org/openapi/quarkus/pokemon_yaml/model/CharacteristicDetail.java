package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacteristicDetail  {

    private Integer id;
    private Integer geneModulo;
    private List<Integer> possibleValues = new ArrayList<>();
    private StatSummary highestStat;
    private List<CharacteristicDescription> descriptions = new ArrayList<>();

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }


    /**
    * Get geneModulo
    * @return geneModulo
    **/
    @JsonProperty("gene_modulo")
    public Integer getGeneModulo() {
        return geneModulo;
    }

    /**
     * Set geneModulo
     **/
    public void setGeneModulo(Integer geneModulo) {
        this.geneModulo = geneModulo;
    }

    public CharacteristicDetail geneModulo(Integer geneModulo) {
        this.geneModulo = geneModulo;
        return this;
    }

    /**
    * Get possibleValues
    * @return possibleValues
    **/
    @JsonProperty("possible_values")
    public List<Integer> getPossibleValues() {
        return possibleValues;
    }


    /**
    * Get highestStat
    * @return highestStat
    **/
    @JsonProperty("highest_stat")
    public StatSummary getHighestStat() {
        return highestStat;
    }

    /**
     * Set highestStat
     **/
    public void setHighestStat(StatSummary highestStat) {
        this.highestStat = highestStat;
    }

    public CharacteristicDetail highestStat(StatSummary highestStat) {
        this.highestStat = highestStat;
        return this;
    }

    /**
    * Get descriptions
    * @return descriptions
    **/
    @JsonProperty("descriptions")
    public List<CharacteristicDescription> getDescriptions() {
        return descriptions;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacteristicDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    geneModulo: ").append(toIndentedString(geneModulo)).append("\n");
        sb.append("    possibleValues: ").append(toIndentedString(possibleValues)).append("\n");
        sb.append("    highestStat: ").append(toIndentedString(highestStat)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        
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
    public static class CharacteristicDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("geneModulo")
        private Integer geneModulo;
        @jakarta.ws.rs.QueryParam("possibleValues")
        private List<Integer> possibleValues = null;
        @jakarta.ws.rs.QueryParam("highestStat")
        private StatSummary highestStat;
        @jakarta.ws.rs.QueryParam("descriptions")
        private List<CharacteristicDescription> descriptions = null;

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }


        /**
        * Get geneModulo
        * @return geneModulo
        **/
        @JsonProperty("gene_modulo")
        public Integer getGeneModulo() {
            return geneModulo;
        }

        /**
         * Set geneModulo
         **/
        public void setGeneModulo(Integer geneModulo) {
            this.geneModulo = geneModulo;
        }

        public CharacteristicDetailQueryParam geneModulo(Integer geneModulo) {
            this.geneModulo = geneModulo;
            return this;
        }

        /**
        * Get possibleValues
        * @return possibleValues
        **/
        @JsonProperty("possible_values")
        public List<Integer> getPossibleValues() {
            return possibleValues;
        }


        /**
        * Get highestStat
        * @return highestStat
        **/
        @JsonProperty("highest_stat")
        public StatSummary getHighestStat() {
            return highestStat;
        }

        /**
         * Set highestStat
         **/
        public void setHighestStat(StatSummary highestStat) {
            this.highestStat = highestStat;
        }

        public CharacteristicDetailQueryParam highestStat(StatSummary highestStat) {
            this.highestStat = highestStat;
            return this;
        }

        /**
        * Get descriptions
        * @return descriptions
        **/
        @JsonProperty("descriptions")
        public List<CharacteristicDescription> getDescriptions() {
            return descriptions;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CharacteristicDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    geneModulo: ").append(toIndentedString(geneModulo)).append("\n");
            sb.append("    possibleValues: ").append(toIndentedString(possibleValues)).append("\n");
            sb.append("    highestStat: ").append(toIndentedString(highestStat)).append("\n");
            sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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
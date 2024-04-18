package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaginatedSuperContestEffectSummaryList  {

    private Integer count;
    private URI next;
    private URI previous;
    private List<SuperContestEffectSummary> results;

    /**
    * Get count
    * @return count
    **/
    @JsonProperty("count")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getCount() {
        return count;
    }

    /**
     * Set count
     **/
    public void setCount(Integer count) {
        this.count = count;
    }

    public PaginatedSuperContestEffectSummaryList count(Integer count) {
        this.count = count;
        return this;
    }

    /**
    * Get next
    * @return next
    **/
    @JsonProperty("next")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public URI getNext() {
        return next;
    }

    /**
     * Set next
     **/
    public void setNext(URI next) {
        this.next = next;
    }

    public PaginatedSuperContestEffectSummaryList next(URI next) {
        this.next = next;
        return this;
    }

    /**
    * Get previous
    * @return previous
    **/
    @JsonProperty("previous")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public URI getPrevious() {
        return previous;
    }

    /**
     * Set previous
     **/
    public void setPrevious(URI previous) {
        this.previous = previous;
    }

    public PaginatedSuperContestEffectSummaryList previous(URI previous) {
        this.previous = previous;
        return this;
    }

    /**
    * Get results
    * @return results
    **/
    @JsonProperty("results")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<SuperContestEffectSummary> getResults() {
        return results;
    }

    /**
     * Set results
     **/
    public void setResults(List<SuperContestEffectSummary> results) {
        this.results = results;
    }

    public PaginatedSuperContestEffectSummaryList results(List<SuperContestEffectSummary> results) {
        this.results = results;
        return this;
    }
    public PaginatedSuperContestEffectSummaryList addResultsItem(SuperContestEffectSummary resultsItem) {
        if (this.results == null){
            results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaginatedSuperContestEffectSummaryList {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
        sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        
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
    public static class PaginatedSuperContestEffectSummaryListQueryParam  {

        @jakarta.ws.rs.QueryParam("count")
        private Integer count;
        @jakarta.ws.rs.QueryParam("next")
        private URI next;
        @jakarta.ws.rs.QueryParam("previous")
        private URI previous;
        @jakarta.ws.rs.QueryParam("results")
        private List<SuperContestEffectSummary> results = null;

        /**
        * Get count
        * @return count
        **/
        @JsonProperty("count")
        public Integer getCount() {
            return count;
        }

        /**
         * Set count
         **/
        public void setCount(Integer count) {
            this.count = count;
        }

        public PaginatedSuperContestEffectSummaryListQueryParam count(Integer count) {
            this.count = count;
            return this;
        }

        /**
        * Get next
        * @return next
        **/
        @JsonProperty("next")
        public URI getNext() {
            return next;
        }

        /**
         * Set next
         **/
        public void setNext(URI next) {
            this.next = next;
        }

        public PaginatedSuperContestEffectSummaryListQueryParam next(URI next) {
            this.next = next;
            return this;
        }

        /**
        * Get previous
        * @return previous
        **/
        @JsonProperty("previous")
        public URI getPrevious() {
            return previous;
        }

        /**
         * Set previous
         **/
        public void setPrevious(URI previous) {
            this.previous = previous;
        }

        public PaginatedSuperContestEffectSummaryListQueryParam previous(URI previous) {
            this.previous = previous;
            return this;
        }

        /**
        * Get results
        * @return results
        **/
        @JsonProperty("results")
        public List<SuperContestEffectSummary> getResults() {
            return results;
        }

        /**
         * Set results
         **/
        public void setResults(List<SuperContestEffectSummary> results) {
            this.results = results;
        }

        public PaginatedSuperContestEffectSummaryListQueryParam results(List<SuperContestEffectSummary> results) {
            this.results = results;
            return this;
        }
        public PaginatedSuperContestEffectSummaryListQueryParam addResultsItem(SuperContestEffectSummary resultsItem) {
            this.results.add(resultsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PaginatedSuperContestEffectSummaryListQueryParam {\n");

            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    next: ").append(toIndentedString(next)).append("\n");
            sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
            sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
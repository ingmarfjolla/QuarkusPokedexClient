package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Experience  {

    private Integer level;
    private Integer experience;

    /**
    * Get level
    * minimum: -2147483648
    * maximum: 2147483647
    * @return level
    **/
    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    /**
     * Set level
     **/
    public void setLevel(Integer level) {
        this.level = level;
    }

    public Experience level(Integer level) {
        this.level = level;
        return this;
    }

    /**
    * Get experience
    * minimum: -2147483648
    * maximum: 2147483647
    * @return experience
    **/
    @JsonProperty("experience")
    public Integer getExperience() {
        return experience;
    }

    /**
     * Set experience
     **/
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Experience experience(Integer experience) {
        this.experience = experience;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Experience {\n");

        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
        
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
    public static class ExperienceQueryParam  {

        @jakarta.ws.rs.QueryParam("level")
        private Integer level;
        @jakarta.ws.rs.QueryParam("experience")
        private Integer experience;

        /**
        * Get level
        * minimum: -2147483648
        * maximum: 2147483647
        * @return level
        **/
        @JsonProperty("level")
        public Integer getLevel() {
            return level;
        }

        /**
         * Set level
         **/
        public void setLevel(Integer level) {
            this.level = level;
        }

        public ExperienceQueryParam level(Integer level) {
            this.level = level;
            return this;
        }

        /**
        * Get experience
        * minimum: -2147483648
        * maximum: 2147483647
        * @return experience
        **/
        @JsonProperty("experience")
        public Integer getExperience() {
            return experience;
        }

        /**
         * Set experience
         **/
        public void setExperience(Integer experience) {
            this.experience = experience;
        }

        public ExperienceQueryParam experience(Integer experience) {
            this.experience = experience;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ExperienceQueryParam {\n");

            sb.append("    level: ").append(toIndentedString(level)).append("\n");
            sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
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
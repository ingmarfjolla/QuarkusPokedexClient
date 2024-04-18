package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LanguageDetail  {

    private Integer id;
    private String name;
    private Boolean official;
    private String iso639;
    private String iso3166;
    private List<LanguageName> names = new ArrayList<>();

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }


    /**
    * Get name
    * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public LanguageDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get official
    * @return official
    **/
    @JsonProperty("official")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getOfficial() {
        return official;
    }

    /**
     * Set official
     **/
    public void setOfficial(Boolean official) {
        this.official = official;
    }

    public LanguageDetail official(Boolean official) {
        this.official = official;
        return this;
    }

    /**
    * Get iso639
    * @return iso639
    **/
    @JsonProperty("iso639")
    public String getIso639() {
        return iso639;
    }

    /**
     * Set iso639
     **/
    public void setIso639(String iso639) {
        this.iso639 = iso639;
    }

    public LanguageDetail iso639(String iso639) {
        this.iso639 = iso639;
        return this;
    }

    /**
    * Get iso3166
    * @return iso3166
    **/
    @JsonProperty("iso3166")
    public String getIso3166() {
        return iso3166;
    }

    /**
     * Set iso3166
     **/
    public void setIso3166(String iso3166) {
        this.iso3166 = iso3166;
    }

    public LanguageDetail iso3166(String iso3166) {
        this.iso3166 = iso3166;
        return this;
    }

    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<LanguageName> getNames() {
        return names;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LanguageDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    official: ").append(toIndentedString(official)).append("\n");
        sb.append("    iso639: ").append(toIndentedString(iso639)).append("\n");
        sb.append("    iso3166: ").append(toIndentedString(iso3166)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        
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
    public static class LanguageDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("official")
        private Boolean official;
        @jakarta.ws.rs.QueryParam("iso639")
        private String iso639;
        @jakarta.ws.rs.QueryParam("iso3166")
        private String iso3166;
        @jakarta.ws.rs.QueryParam("names")
        private List<LanguageName> names = null;

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public Integer getId() {
            return id;
        }


        /**
        * Get name
        * @return name
        **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public LanguageDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get official
        * @return official
        **/
        @JsonProperty("official")
        public Boolean getOfficial() {
            return official;
        }

        /**
         * Set official
         **/
        public void setOfficial(Boolean official) {
            this.official = official;
        }

        public LanguageDetailQueryParam official(Boolean official) {
            this.official = official;
            return this;
        }

        /**
        * Get iso639
        * @return iso639
        **/
        @JsonProperty("iso639")
        public String getIso639() {
            return iso639;
        }

        /**
         * Set iso639
         **/
        public void setIso639(String iso639) {
            this.iso639 = iso639;
        }

        public LanguageDetailQueryParam iso639(String iso639) {
            this.iso639 = iso639;
            return this;
        }

        /**
        * Get iso3166
        * @return iso3166
        **/
        @JsonProperty("iso3166")
        public String getIso3166() {
            return iso3166;
        }

        /**
         * Set iso3166
         **/
        public void setIso3166(String iso3166) {
            this.iso3166 = iso3166;
        }

        public LanguageDetailQueryParam iso3166(String iso3166) {
            this.iso3166 = iso3166;
            return this;
        }

        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<LanguageName> getNames() {
            return names;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LanguageDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    official: ").append(toIndentedString(official)).append("\n");
            sb.append("    iso639: ").append(toIndentedString(iso639)).append("\n");
            sb.append("    iso3166: ").append(toIndentedString(iso3166)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
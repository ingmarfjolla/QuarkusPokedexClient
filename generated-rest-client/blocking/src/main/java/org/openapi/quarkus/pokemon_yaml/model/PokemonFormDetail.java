package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonFormDetail  {

    private Integer id;
    private String name;
    private Integer order;
    private Integer formOrder;
    private Boolean isDefault;
    private Boolean isBattleOnly;
    private Boolean isMega;
    private String formName;
    private PokemonSummary pokemon;
    private String sprites;
    private VersionGroupSummary versionGroup;
    private List<PokemonFormDetailFormNamesInner> formNames = new ArrayList<>();
    private List<PokemonFormDetailFormNamesInner> names = new ArrayList<>();
    private List<PokemonFormDetailTypesInner> types = new ArrayList<>();

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

    public PokemonFormDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get order
    * minimum: -2147483648
    * maximum: 2147483647
    * @return order
    **/
    @JsonProperty("order")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getOrder() {
        return order;
    }

    /**
     * Set order
     **/
    public void setOrder(Integer order) {
        this.order = order;
    }

    public PokemonFormDetail order(Integer order) {
        this.order = order;
        return this;
    }

    /**
    * Get formOrder
    * minimum: -2147483648
    * maximum: 2147483647
    * @return formOrder
    **/
    @JsonProperty("form_order")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getFormOrder() {
        return formOrder;
    }

    /**
     * Set formOrder
     **/
    public void setFormOrder(Integer formOrder) {
        this.formOrder = formOrder;
    }

    public PokemonFormDetail formOrder(Integer formOrder) {
        this.formOrder = formOrder;
        return this;
    }

    /**
    * Get isDefault
    * @return isDefault
    **/
    @JsonProperty("is_default")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Set isDefault
     **/
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public PokemonFormDetail isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
    * Get isBattleOnly
    * @return isBattleOnly
    **/
    @JsonProperty("is_battle_only")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsBattleOnly() {
        return isBattleOnly;
    }

    /**
     * Set isBattleOnly
     **/
    public void setIsBattleOnly(Boolean isBattleOnly) {
        this.isBattleOnly = isBattleOnly;
    }

    public PokemonFormDetail isBattleOnly(Boolean isBattleOnly) {
        this.isBattleOnly = isBattleOnly;
        return this;
    }

    /**
    * Get isMega
    * @return isMega
    **/
    @JsonProperty("is_mega")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Boolean getIsMega() {
        return isMega;
    }

    /**
     * Set isMega
     **/
    public void setIsMega(Boolean isMega) {
        this.isMega = isMega;
    }

    public PokemonFormDetail isMega(Boolean isMega) {
        this.isMega = isMega;
        return this;
    }

    /**
    * Get formName
    * @return formName
    **/
    @JsonProperty("form_name")
    public String getFormName() {
        return formName;
    }

    /**
     * Set formName
     **/
    public void setFormName(String formName) {
        this.formName = formName;
    }

    public PokemonFormDetail formName(String formName) {
        this.formName = formName;
        return this;
    }

    /**
    * Get pokemon
    * @return pokemon
    **/
    @JsonProperty("pokemon")
    public PokemonSummary getPokemon() {
        return pokemon;
    }

    /**
     * Set pokemon
     **/
    public void setPokemon(PokemonSummary pokemon) {
        this.pokemon = pokemon;
    }

    public PokemonFormDetail pokemon(PokemonSummary pokemon) {
        this.pokemon = pokemon;
        return this;
    }

    /**
    * Get sprites
    * @return sprites
    **/
    @JsonProperty("sprites")
    public String getSprites() {
        return sprites;
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

    public PokemonFormDetail versionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
        return this;
    }

    /**
    * Get formNames
    * @return formNames
    **/
    @JsonProperty("form_names")
    public List<PokemonFormDetailFormNamesInner> getFormNames() {
        return formNames;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<PokemonFormDetailFormNamesInner> getNames() {
        return names;
    }


    /**
    * Get types
    * @return types
    **/
    @JsonProperty("types")
    public List<PokemonFormDetailTypesInner> getTypes() {
        return types;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PokemonFormDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    formOrder: ").append(toIndentedString(formOrder)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    isBattleOnly: ").append(toIndentedString(isBattleOnly)).append("\n");
        sb.append("    isMega: ").append(toIndentedString(isMega)).append("\n");
        sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
        sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("    formNames: ").append(toIndentedString(formNames)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        
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
    public static class PokemonFormDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("order")
        private Integer order;
        @jakarta.ws.rs.QueryParam("formOrder")
        private Integer formOrder;
        @jakarta.ws.rs.QueryParam("isDefault")
        private Boolean isDefault;
        @jakarta.ws.rs.QueryParam("isBattleOnly")
        private Boolean isBattleOnly;
        @jakarta.ws.rs.QueryParam("isMega")
        private Boolean isMega;
        @jakarta.ws.rs.QueryParam("formName")
        private String formName;
        @jakarta.ws.rs.QueryParam("pokemon")
        private PokemonSummary pokemon;
        @jakarta.ws.rs.QueryParam("sprites")
        private String sprites;
        @jakarta.ws.rs.QueryParam("versionGroup")
        private VersionGroupSummary versionGroup;
        @jakarta.ws.rs.QueryParam("formNames")
        private List<PokemonFormDetailFormNamesInner> formNames = null;
        @jakarta.ws.rs.QueryParam("names")
        private List<PokemonFormDetailFormNamesInner> names = null;
        @jakarta.ws.rs.QueryParam("types")
        private List<PokemonFormDetailTypesInner> types = null;

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

        public PokemonFormDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get order
        * minimum: -2147483648
        * maximum: 2147483647
        * @return order
        **/
        @JsonProperty("order")
        public Integer getOrder() {
            return order;
        }

        /**
         * Set order
         **/
        public void setOrder(Integer order) {
            this.order = order;
        }

        public PokemonFormDetailQueryParam order(Integer order) {
            this.order = order;
            return this;
        }

        /**
        * Get formOrder
        * minimum: -2147483648
        * maximum: 2147483647
        * @return formOrder
        **/
        @JsonProperty("form_order")
        public Integer getFormOrder() {
            return formOrder;
        }

        /**
         * Set formOrder
         **/
        public void setFormOrder(Integer formOrder) {
            this.formOrder = formOrder;
        }

        public PokemonFormDetailQueryParam formOrder(Integer formOrder) {
            this.formOrder = formOrder;
            return this;
        }

        /**
        * Get isDefault
        * @return isDefault
        **/
        @JsonProperty("is_default")
        public Boolean getIsDefault() {
            return isDefault;
        }

        /**
         * Set isDefault
         **/
        public void setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
        }

        public PokemonFormDetailQueryParam isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
        * Get isBattleOnly
        * @return isBattleOnly
        **/
        @JsonProperty("is_battle_only")
        public Boolean getIsBattleOnly() {
            return isBattleOnly;
        }

        /**
         * Set isBattleOnly
         **/
        public void setIsBattleOnly(Boolean isBattleOnly) {
            this.isBattleOnly = isBattleOnly;
        }

        public PokemonFormDetailQueryParam isBattleOnly(Boolean isBattleOnly) {
            this.isBattleOnly = isBattleOnly;
            return this;
        }

        /**
        * Get isMega
        * @return isMega
        **/
        @JsonProperty("is_mega")
        public Boolean getIsMega() {
            return isMega;
        }

        /**
         * Set isMega
         **/
        public void setIsMega(Boolean isMega) {
            this.isMega = isMega;
        }

        public PokemonFormDetailQueryParam isMega(Boolean isMega) {
            this.isMega = isMega;
            return this;
        }

        /**
        * Get formName
        * @return formName
        **/
        @JsonProperty("form_name")
        public String getFormName() {
            return formName;
        }

        /**
         * Set formName
         **/
        public void setFormName(String formName) {
            this.formName = formName;
        }

        public PokemonFormDetailQueryParam formName(String formName) {
            this.formName = formName;
            return this;
        }

        /**
        * Get pokemon
        * @return pokemon
        **/
        @JsonProperty("pokemon")
        public PokemonSummary getPokemon() {
            return pokemon;
        }

        /**
         * Set pokemon
         **/
        public void setPokemon(PokemonSummary pokemon) {
            this.pokemon = pokemon;
        }

        public PokemonFormDetailQueryParam pokemon(PokemonSummary pokemon) {
            this.pokemon = pokemon;
            return this;
        }

        /**
        * Get sprites
        * @return sprites
        **/
        @JsonProperty("sprites")
        public String getSprites() {
            return sprites;
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

        public PokemonFormDetailQueryParam versionGroup(VersionGroupSummary versionGroup) {
            this.versionGroup = versionGroup;
            return this;
        }

        /**
        * Get formNames
        * @return formNames
        **/
        @JsonProperty("form_names")
        public List<PokemonFormDetailFormNamesInner> getFormNames() {
            return formNames;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<PokemonFormDetailFormNamesInner> getNames() {
            return names;
        }


        /**
        * Get types
        * @return types
        **/
        @JsonProperty("types")
        public List<PokemonFormDetailTypesInner> getTypes() {
            return types;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PokemonFormDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    order: ").append(toIndentedString(order)).append("\n");
            sb.append("    formOrder: ").append(toIndentedString(formOrder)).append("\n");
            sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
            sb.append("    isBattleOnly: ").append(toIndentedString(isBattleOnly)).append("\n");
            sb.append("    isMega: ").append(toIndentedString(isMega)).append("\n");
            sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
            sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
            sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
            sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
            sb.append("    formNames: ").append(toIndentedString(formNames)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
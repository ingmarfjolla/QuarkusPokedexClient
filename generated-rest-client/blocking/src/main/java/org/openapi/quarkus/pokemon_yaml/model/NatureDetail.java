package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NatureDetail  {

    private Integer id;
    private String name;
    private StatSummary decreasedStat;
    private StatSummary increasedStat;
    private BerryFlavorSummary likesFlavor;
    private BerryFlavorSummary hatesFlavor;
    private List<BerrySummary> berries = new ArrayList<>();
    private List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges = new ArrayList<>();
    private List<NatureBattleStylePreference> moveBattleStylePreferences = new ArrayList<>();
    private List<NatureName> names = new ArrayList<>();

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

    public NatureDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get decreasedStat
    * @return decreasedStat
    **/
    @JsonProperty("decreased_stat")
    public StatSummary getDecreasedStat() {
        return decreasedStat;
    }

    /**
     * Set decreasedStat
     **/
    public void setDecreasedStat(StatSummary decreasedStat) {
        this.decreasedStat = decreasedStat;
    }

    public NatureDetail decreasedStat(StatSummary decreasedStat) {
        this.decreasedStat = decreasedStat;
        return this;
    }

    /**
    * Get increasedStat
    * @return increasedStat
    **/
    @JsonProperty("increased_stat")
    public StatSummary getIncreasedStat() {
        return increasedStat;
    }

    /**
     * Set increasedStat
     **/
    public void setIncreasedStat(StatSummary increasedStat) {
        this.increasedStat = increasedStat;
    }

    public NatureDetail increasedStat(StatSummary increasedStat) {
        this.increasedStat = increasedStat;
        return this;
    }

    /**
    * Get likesFlavor
    * @return likesFlavor
    **/
    @JsonProperty("likes_flavor")
    public BerryFlavorSummary getLikesFlavor() {
        return likesFlavor;
    }

    /**
     * Set likesFlavor
     **/
    public void setLikesFlavor(BerryFlavorSummary likesFlavor) {
        this.likesFlavor = likesFlavor;
    }

    public NatureDetail likesFlavor(BerryFlavorSummary likesFlavor) {
        this.likesFlavor = likesFlavor;
        return this;
    }

    /**
    * Get hatesFlavor
    * @return hatesFlavor
    **/
    @JsonProperty("hates_flavor")
    public BerryFlavorSummary getHatesFlavor() {
        return hatesFlavor;
    }

    /**
     * Set hatesFlavor
     **/
    public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
        this.hatesFlavor = hatesFlavor;
    }

    public NatureDetail hatesFlavor(BerryFlavorSummary hatesFlavor) {
        this.hatesFlavor = hatesFlavor;
        return this;
    }

    /**
    * Get berries
    * @return berries
    **/
    @JsonProperty("berries")
    public List<BerrySummary> getBerries() {
        return berries;
    }


    /**
    * Get pokeathlonStatChanges
    * @return pokeathlonStatChanges
    **/
    @JsonProperty("pokeathlon_stat_changes")
    public List<NatureDetailPokeathlonStatChangesInner> getPokeathlonStatChanges() {
        return pokeathlonStatChanges;
    }


    /**
    * Get moveBattleStylePreferences
    * @return moveBattleStylePreferences
    **/
    @JsonProperty("move_battle_style_preferences")
    public List<NatureBattleStylePreference> getMoveBattleStylePreferences() {
        return moveBattleStylePreferences;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<NatureName> getNames() {
        return names;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NatureDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    decreasedStat: ").append(toIndentedString(decreasedStat)).append("\n");
        sb.append("    increasedStat: ").append(toIndentedString(increasedStat)).append("\n");
        sb.append("    likesFlavor: ").append(toIndentedString(likesFlavor)).append("\n");
        sb.append("    hatesFlavor: ").append(toIndentedString(hatesFlavor)).append("\n");
        sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
        sb.append("    pokeathlonStatChanges: ").append(toIndentedString(pokeathlonStatChanges)).append("\n");
        sb.append("    moveBattleStylePreferences: ").append(toIndentedString(moveBattleStylePreferences)).append("\n");
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
    public static class NatureDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("decreasedStat")
        private StatSummary decreasedStat;
        @jakarta.ws.rs.QueryParam("increasedStat")
        private StatSummary increasedStat;
        @jakarta.ws.rs.QueryParam("likesFlavor")
        private BerryFlavorSummary likesFlavor;
        @jakarta.ws.rs.QueryParam("hatesFlavor")
        private BerryFlavorSummary hatesFlavor;
        @jakarta.ws.rs.QueryParam("berries")
        private List<BerrySummary> berries = null;
        @jakarta.ws.rs.QueryParam("pokeathlonStatChanges")
        private List<NatureDetailPokeathlonStatChangesInner> pokeathlonStatChanges = null;
        @jakarta.ws.rs.QueryParam("moveBattleStylePreferences")
        private List<NatureBattleStylePreference> moveBattleStylePreferences = null;
        @jakarta.ws.rs.QueryParam("names")
        private List<NatureName> names = null;

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

        public NatureDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get decreasedStat
        * @return decreasedStat
        **/
        @JsonProperty("decreased_stat")
        public StatSummary getDecreasedStat() {
            return decreasedStat;
        }

        /**
         * Set decreasedStat
         **/
        public void setDecreasedStat(StatSummary decreasedStat) {
            this.decreasedStat = decreasedStat;
        }

        public NatureDetailQueryParam decreasedStat(StatSummary decreasedStat) {
            this.decreasedStat = decreasedStat;
            return this;
        }

        /**
        * Get increasedStat
        * @return increasedStat
        **/
        @JsonProperty("increased_stat")
        public StatSummary getIncreasedStat() {
            return increasedStat;
        }

        /**
         * Set increasedStat
         **/
        public void setIncreasedStat(StatSummary increasedStat) {
            this.increasedStat = increasedStat;
        }

        public NatureDetailQueryParam increasedStat(StatSummary increasedStat) {
            this.increasedStat = increasedStat;
            return this;
        }

        /**
        * Get likesFlavor
        * @return likesFlavor
        **/
        @JsonProperty("likes_flavor")
        public BerryFlavorSummary getLikesFlavor() {
            return likesFlavor;
        }

        /**
         * Set likesFlavor
         **/
        public void setLikesFlavor(BerryFlavorSummary likesFlavor) {
            this.likesFlavor = likesFlavor;
        }

        public NatureDetailQueryParam likesFlavor(BerryFlavorSummary likesFlavor) {
            this.likesFlavor = likesFlavor;
            return this;
        }

        /**
        * Get hatesFlavor
        * @return hatesFlavor
        **/
        @JsonProperty("hates_flavor")
        public BerryFlavorSummary getHatesFlavor() {
            return hatesFlavor;
        }

        /**
         * Set hatesFlavor
         **/
        public void setHatesFlavor(BerryFlavorSummary hatesFlavor) {
            this.hatesFlavor = hatesFlavor;
        }

        public NatureDetailQueryParam hatesFlavor(BerryFlavorSummary hatesFlavor) {
            this.hatesFlavor = hatesFlavor;
            return this;
        }

        /**
        * Get berries
        * @return berries
        **/
        @JsonProperty("berries")
        public List<BerrySummary> getBerries() {
            return berries;
        }


        /**
        * Get pokeathlonStatChanges
        * @return pokeathlonStatChanges
        **/
        @JsonProperty("pokeathlon_stat_changes")
        public List<NatureDetailPokeathlonStatChangesInner> getPokeathlonStatChanges() {
            return pokeathlonStatChanges;
        }


        /**
        * Get moveBattleStylePreferences
        * @return moveBattleStylePreferences
        **/
        @JsonProperty("move_battle_style_preferences")
        public List<NatureBattleStylePreference> getMoveBattleStylePreferences() {
            return moveBattleStylePreferences;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<NatureName> getNames() {
            return names;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NatureDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    decreasedStat: ").append(toIndentedString(decreasedStat)).append("\n");
            sb.append("    increasedStat: ").append(toIndentedString(increasedStat)).append("\n");
            sb.append("    likesFlavor: ").append(toIndentedString(likesFlavor)).append("\n");
            sb.append("    hatesFlavor: ").append(toIndentedString(hatesFlavor)).append("\n");
            sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
            sb.append("    pokeathlonStatChanges: ").append(toIndentedString(pokeathlonStatChanges)).append("\n");
            sb.append("    moveBattleStylePreferences: ").append(toIndentedString(moveBattleStylePreferences)).append("\n");
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
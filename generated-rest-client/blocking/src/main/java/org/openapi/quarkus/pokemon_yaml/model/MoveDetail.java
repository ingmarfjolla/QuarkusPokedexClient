package org.openapi.quarkus.pokemon_yaml.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveDetail  {

    private Integer id;
    private String name;
    private Integer accuracy;
    private Integer effectChance;
    private Integer pp;
    private Integer priority;
    private Integer power;
    private MoveDetailContestCombos contestCombos;
    private ContestTypeSummary contestType;
    private ContestEffectSummary contestEffect;
    private MoveDamageClassSummary damageClass;
    private List<MoveEffectEffectText> effectEntries = new ArrayList<>();
    private List<MoveEffectChange> effectChanges = new ArrayList<>();
    private GenerationSummary generation;
    private MoveMeta meta;
    private List<MoveName> names = new ArrayList<>();
    private List<MoveChange> pastValues = new ArrayList<>();
    private List<MoveDetailStatChangesInner> statChanges = new ArrayList<>();
    private SuperContestEffectSummary superContestEffect;
    private MoveTargetSummary target;
    private TypeSummary type;
    private List<MoveDetailMachinesInner> machines = new ArrayList<>();
    private List<MoveFlavorText> flavorTextEntries = new ArrayList<>();
    private List<PokemonSummary> learnedByPokemon = new ArrayList<>();

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

    public MoveDetail name(String name) {
        this.name = name;
        return this;
    }

    /**
    * Get accuracy
    * minimum: -2147483648
    * maximum: 2147483647
    * @return accuracy
    **/
    @JsonProperty("accuracy")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getAccuracy() {
        return accuracy;
    }

    /**
     * Set accuracy
     **/
    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public MoveDetail accuracy(Integer accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
    * Get effectChance
    * @return effectChance
    **/
    @JsonProperty("effect_chance")
    public Integer getEffectChance() {
        return effectChance;
    }

    /**
     * Set effectChance
     **/
    public void setEffectChance(Integer effectChance) {
        this.effectChance = effectChance;
    }

    public MoveDetail effectChance(Integer effectChance) {
        this.effectChance = effectChance;
        return this;
    }

    /**
    * Get pp
    * minimum: -2147483648
    * maximum: 2147483647
    * @return pp
    **/
    @JsonProperty("pp")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPp() {
        return pp;
    }

    /**
     * Set pp
     **/
    public void setPp(Integer pp) {
        this.pp = pp;
    }

    public MoveDetail pp(Integer pp) {
        this.pp = pp;
        return this;
    }

    /**
    * Get priority
    * minimum: -2147483648
    * maximum: 2147483647
    * @return priority
    **/
    @JsonProperty("priority")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPriority() {
        return priority;
    }

    /**
     * Set priority
     **/
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public MoveDetail priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
    * Get power
    * minimum: -2147483648
    * maximum: 2147483647
    * @return power
    **/
    @JsonProperty("power")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Integer getPower() {
        return power;
    }

    /**
     * Set power
     **/
    public void setPower(Integer power) {
        this.power = power;
    }

    public MoveDetail power(Integer power) {
        this.power = power;
        return this;
    }

    /**
    * Get contestCombos
    * @return contestCombos
    **/
    @JsonProperty("contest_combos")
    public MoveDetailContestCombos getContestCombos() {
        return contestCombos;
    }

    /**
     * Set contestCombos
     **/
    public void setContestCombos(MoveDetailContestCombos contestCombos) {
        this.contestCombos = contestCombos;
    }

    public MoveDetail contestCombos(MoveDetailContestCombos contestCombos) {
        this.contestCombos = contestCombos;
        return this;
    }

    /**
    * Get contestType
    * @return contestType
    **/
    @JsonProperty("contest_type")
    public ContestTypeSummary getContestType() {
        return contestType;
    }

    /**
     * Set contestType
     **/
    public void setContestType(ContestTypeSummary contestType) {
        this.contestType = contestType;
    }

    public MoveDetail contestType(ContestTypeSummary contestType) {
        this.contestType = contestType;
        return this;
    }

    /**
    * Get contestEffect
    * @return contestEffect
    **/
    @JsonProperty("contest_effect")
    public ContestEffectSummary getContestEffect() {
        return contestEffect;
    }

    /**
     * Set contestEffect
     **/
    public void setContestEffect(ContestEffectSummary contestEffect) {
        this.contestEffect = contestEffect;
    }

    public MoveDetail contestEffect(ContestEffectSummary contestEffect) {
        this.contestEffect = contestEffect;
        return this;
    }

    /**
    * Get damageClass
    * @return damageClass
    **/
    @JsonProperty("damage_class")
    public MoveDamageClassSummary getDamageClass() {
        return damageClass;
    }

    /**
     * Set damageClass
     **/
    public void setDamageClass(MoveDamageClassSummary damageClass) {
        this.damageClass = damageClass;
    }

    public MoveDetail damageClass(MoveDamageClassSummary damageClass) {
        this.damageClass = damageClass;
        return this;
    }

    /**
    * Get effectEntries
    * @return effectEntries
    **/
    @JsonProperty("effect_entries")
    public List<MoveEffectEffectText> getEffectEntries() {
        return effectEntries;
    }


    /**
    * Get effectChanges
    * @return effectChanges
    **/
    @JsonProperty("effect_changes")
    public List<MoveEffectChange> getEffectChanges() {
        return effectChanges;
    }


    /**
    * Get generation
    * @return generation
    **/
    @JsonProperty("generation")
    public GenerationSummary getGeneration() {
        return generation;
    }

    /**
     * Set generation
     **/
    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    public MoveDetail generation(GenerationSummary generation) {
        this.generation = generation;
        return this;
    }

    /**
    * Get meta
    * @return meta
    **/
    @JsonProperty("meta")
    public MoveMeta getMeta() {
        return meta;
    }


    /**
    * Get names
    * @return names
    **/
    @JsonProperty("names")
    public List<MoveName> getNames() {
        return names;
    }


    /**
    * Get pastValues
    * @return pastValues
    **/
    @JsonProperty("past_values")
    public List<MoveChange> getPastValues() {
        return pastValues;
    }


    /**
    * Get statChanges
    * @return statChanges
    **/
    @JsonProperty("stat_changes")
    public List<MoveDetailStatChangesInner> getStatChanges() {
        return statChanges;
    }


    /**
    * Get superContestEffect
    * @return superContestEffect
    **/
    @JsonProperty("super_contest_effect")
    public SuperContestEffectSummary getSuperContestEffect() {
        return superContestEffect;
    }

    /**
     * Set superContestEffect
     **/
    public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
        this.superContestEffect = superContestEffect;
    }

    public MoveDetail superContestEffect(SuperContestEffectSummary superContestEffect) {
        this.superContestEffect = superContestEffect;
        return this;
    }

    /**
    * Get target
    * @return target
    **/
    @JsonProperty("target")
    public MoveTargetSummary getTarget() {
        return target;
    }

    /**
     * Set target
     **/
    public void setTarget(MoveTargetSummary target) {
        this.target = target;
    }

    public MoveDetail target(MoveTargetSummary target) {
        this.target = target;
        return this;
    }

    /**
    * Get type
    * @return type
    **/
    @JsonProperty("type")
    public TypeSummary getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(TypeSummary type) {
        this.type = type;
    }

    public MoveDetail type(TypeSummary type) {
        this.type = type;
        return this;
    }

    /**
    * Get machines
    * @return machines
    **/
    @JsonProperty("machines")
    public List<MoveDetailMachinesInner> getMachines() {
        return machines;
    }


    /**
    * Get flavorTextEntries
    * @return flavorTextEntries
    **/
    @JsonProperty("flavor_text_entries")
    public List<MoveFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }


    /**
    * Get learnedByPokemon
    * @return learnedByPokemon
    **/
    @JsonProperty("learned_by_pokemon")
    public List<PokemonSummary> getLearnedByPokemon() {
        return learnedByPokemon;
    }


    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveDetail {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
        sb.append("    effectChance: ").append(toIndentedString(effectChance)).append("\n");
        sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    power: ").append(toIndentedString(power)).append("\n");
        sb.append("    contestCombos: ").append(toIndentedString(contestCombos)).append("\n");
        sb.append("    contestType: ").append(toIndentedString(contestType)).append("\n");
        sb.append("    contestEffect: ").append(toIndentedString(contestEffect)).append("\n");
        sb.append("    damageClass: ").append(toIndentedString(damageClass)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pastValues: ").append(toIndentedString(pastValues)).append("\n");
        sb.append("    statChanges: ").append(toIndentedString(statChanges)).append("\n");
        sb.append("    superContestEffect: ").append(toIndentedString(superContestEffect)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
        sb.append("    learnedByPokemon: ").append(toIndentedString(learnedByPokemon)).append("\n");
        
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
    public static class MoveDetailQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private Integer id;
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        @jakarta.ws.rs.QueryParam("accuracy")
        private Integer accuracy;
        @jakarta.ws.rs.QueryParam("effectChance")
        private Integer effectChance;
        @jakarta.ws.rs.QueryParam("pp")
        private Integer pp;
        @jakarta.ws.rs.QueryParam("priority")
        private Integer priority;
        @jakarta.ws.rs.QueryParam("power")
        private Integer power;
        @jakarta.ws.rs.QueryParam("contestCombos")
        private MoveDetailContestCombos contestCombos;
        @jakarta.ws.rs.QueryParam("contestType")
        private ContestTypeSummary contestType;
        @jakarta.ws.rs.QueryParam("contestEffect")
        private ContestEffectSummary contestEffect;
        @jakarta.ws.rs.QueryParam("damageClass")
        private MoveDamageClassSummary damageClass;
        @jakarta.ws.rs.QueryParam("effectEntries")
        private List<MoveEffectEffectText> effectEntries = null;
        @jakarta.ws.rs.QueryParam("effectChanges")
        private List<MoveEffectChange> effectChanges = null;
        @jakarta.ws.rs.QueryParam("generation")
        private GenerationSummary generation;
        @jakarta.ws.rs.QueryParam("meta")
        private MoveMeta meta;
        @jakarta.ws.rs.QueryParam("names")
        private List<MoveName> names = null;
        @jakarta.ws.rs.QueryParam("pastValues")
        private List<MoveChange> pastValues = null;
        @jakarta.ws.rs.QueryParam("statChanges")
        private List<MoveDetailStatChangesInner> statChanges = null;
        @jakarta.ws.rs.QueryParam("superContestEffect")
        private SuperContestEffectSummary superContestEffect;
        @jakarta.ws.rs.QueryParam("target")
        private MoveTargetSummary target;
        @jakarta.ws.rs.QueryParam("type")
        private TypeSummary type;
        @jakarta.ws.rs.QueryParam("machines")
        private List<MoveDetailMachinesInner> machines = null;
        @jakarta.ws.rs.QueryParam("flavorTextEntries")
        private List<MoveFlavorText> flavorTextEntries = null;
        @jakarta.ws.rs.QueryParam("learnedByPokemon")
        private List<PokemonSummary> learnedByPokemon = null;

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

        public MoveDetailQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
        * Get accuracy
        * minimum: -2147483648
        * maximum: 2147483647
        * @return accuracy
        **/
        @JsonProperty("accuracy")
        public Integer getAccuracy() {
            return accuracy;
        }

        /**
         * Set accuracy
         **/
        public void setAccuracy(Integer accuracy) {
            this.accuracy = accuracy;
        }

        public MoveDetailQueryParam accuracy(Integer accuracy) {
            this.accuracy = accuracy;
            return this;
        }

        /**
        * Get effectChance
        * @return effectChance
        **/
        @JsonProperty("effect_chance")
        public Integer getEffectChance() {
            return effectChance;
        }

        /**
         * Set effectChance
         **/
        public void setEffectChance(Integer effectChance) {
            this.effectChance = effectChance;
        }

        public MoveDetailQueryParam effectChance(Integer effectChance) {
            this.effectChance = effectChance;
            return this;
        }

        /**
        * Get pp
        * minimum: -2147483648
        * maximum: 2147483647
        * @return pp
        **/
        @JsonProperty("pp")
        public Integer getPp() {
            return pp;
        }

        /**
         * Set pp
         **/
        public void setPp(Integer pp) {
            this.pp = pp;
        }

        public MoveDetailQueryParam pp(Integer pp) {
            this.pp = pp;
            return this;
        }

        /**
        * Get priority
        * minimum: -2147483648
        * maximum: 2147483647
        * @return priority
        **/
        @JsonProperty("priority")
        public Integer getPriority() {
            return priority;
        }

        /**
         * Set priority
         **/
        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public MoveDetailQueryParam priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
        * Get power
        * minimum: -2147483648
        * maximum: 2147483647
        * @return power
        **/
        @JsonProperty("power")
        public Integer getPower() {
            return power;
        }

        /**
         * Set power
         **/
        public void setPower(Integer power) {
            this.power = power;
        }

        public MoveDetailQueryParam power(Integer power) {
            this.power = power;
            return this;
        }

        /**
        * Get contestCombos
        * @return contestCombos
        **/
        @JsonProperty("contest_combos")
        public MoveDetailContestCombos getContestCombos() {
            return contestCombos;
        }

        /**
         * Set contestCombos
         **/
        public void setContestCombos(MoveDetailContestCombos contestCombos) {
            this.contestCombos = contestCombos;
        }

        public MoveDetailQueryParam contestCombos(MoveDetailContestCombos contestCombos) {
            this.contestCombos = contestCombos;
            return this;
        }

        /**
        * Get contestType
        * @return contestType
        **/
        @JsonProperty("contest_type")
        public ContestTypeSummary getContestType() {
            return contestType;
        }

        /**
         * Set contestType
         **/
        public void setContestType(ContestTypeSummary contestType) {
            this.contestType = contestType;
        }

        public MoveDetailQueryParam contestType(ContestTypeSummary contestType) {
            this.contestType = contestType;
            return this;
        }

        /**
        * Get contestEffect
        * @return contestEffect
        **/
        @JsonProperty("contest_effect")
        public ContestEffectSummary getContestEffect() {
            return contestEffect;
        }

        /**
         * Set contestEffect
         **/
        public void setContestEffect(ContestEffectSummary contestEffect) {
            this.contestEffect = contestEffect;
        }

        public MoveDetailQueryParam contestEffect(ContestEffectSummary contestEffect) {
            this.contestEffect = contestEffect;
            return this;
        }

        /**
        * Get damageClass
        * @return damageClass
        **/
        @JsonProperty("damage_class")
        public MoveDamageClassSummary getDamageClass() {
            return damageClass;
        }

        /**
         * Set damageClass
         **/
        public void setDamageClass(MoveDamageClassSummary damageClass) {
            this.damageClass = damageClass;
        }

        public MoveDetailQueryParam damageClass(MoveDamageClassSummary damageClass) {
            this.damageClass = damageClass;
            return this;
        }

        /**
        * Get effectEntries
        * @return effectEntries
        **/
        @JsonProperty("effect_entries")
        public List<MoveEffectEffectText> getEffectEntries() {
            return effectEntries;
        }


        /**
        * Get effectChanges
        * @return effectChanges
        **/
        @JsonProperty("effect_changes")
        public List<MoveEffectChange> getEffectChanges() {
            return effectChanges;
        }


        /**
        * Get generation
        * @return generation
        **/
        @JsonProperty("generation")
        public GenerationSummary getGeneration() {
            return generation;
        }

        /**
         * Set generation
         **/
        public void setGeneration(GenerationSummary generation) {
            this.generation = generation;
        }

        public MoveDetailQueryParam generation(GenerationSummary generation) {
            this.generation = generation;
            return this;
        }

        /**
        * Get meta
        * @return meta
        **/
        @JsonProperty("meta")
        public MoveMeta getMeta() {
            return meta;
        }


        /**
        * Get names
        * @return names
        **/
        @JsonProperty("names")
        public List<MoveName> getNames() {
            return names;
        }


        /**
        * Get pastValues
        * @return pastValues
        **/
        @JsonProperty("past_values")
        public List<MoveChange> getPastValues() {
            return pastValues;
        }


        /**
        * Get statChanges
        * @return statChanges
        **/
        @JsonProperty("stat_changes")
        public List<MoveDetailStatChangesInner> getStatChanges() {
            return statChanges;
        }


        /**
        * Get superContestEffect
        * @return superContestEffect
        **/
        @JsonProperty("super_contest_effect")
        public SuperContestEffectSummary getSuperContestEffect() {
            return superContestEffect;
        }

        /**
         * Set superContestEffect
         **/
        public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
            this.superContestEffect = superContestEffect;
        }

        public MoveDetailQueryParam superContestEffect(SuperContestEffectSummary superContestEffect) {
            this.superContestEffect = superContestEffect;
            return this;
        }

        /**
        * Get target
        * @return target
        **/
        @JsonProperty("target")
        public MoveTargetSummary getTarget() {
            return target;
        }

        /**
         * Set target
         **/
        public void setTarget(MoveTargetSummary target) {
            this.target = target;
        }

        public MoveDetailQueryParam target(MoveTargetSummary target) {
            this.target = target;
            return this;
        }

        /**
        * Get type
        * @return type
        **/
        @JsonProperty("type")
        public TypeSummary getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(TypeSummary type) {
            this.type = type;
        }

        public MoveDetailQueryParam type(TypeSummary type) {
            this.type = type;
            return this;
        }

        /**
        * Get machines
        * @return machines
        **/
        @JsonProperty("machines")
        public List<MoveDetailMachinesInner> getMachines() {
            return machines;
        }


        /**
        * Get flavorTextEntries
        * @return flavorTextEntries
        **/
        @JsonProperty("flavor_text_entries")
        public List<MoveFlavorText> getFlavorTextEntries() {
            return flavorTextEntries;
        }


        /**
        * Get learnedByPokemon
        * @return learnedByPokemon
        **/
        @JsonProperty("learned_by_pokemon")
        public List<PokemonSummary> getLearnedByPokemon() {
            return learnedByPokemon;
        }


        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class MoveDetailQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
            sb.append("    effectChance: ").append(toIndentedString(effectChance)).append("\n");
            sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
            sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
            sb.append("    power: ").append(toIndentedString(power)).append("\n");
            sb.append("    contestCombos: ").append(toIndentedString(contestCombos)).append("\n");
            sb.append("    contestType: ").append(toIndentedString(contestType)).append("\n");
            sb.append("    contestEffect: ").append(toIndentedString(contestEffect)).append("\n");
            sb.append("    damageClass: ").append(toIndentedString(damageClass)).append("\n");
            sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
            sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
            sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
            sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
            sb.append("    names: ").append(toIndentedString(names)).append("\n");
            sb.append("    pastValues: ").append(toIndentedString(pastValues)).append("\n");
            sb.append("    statChanges: ").append(toIndentedString(statChanges)).append("\n");
            sb.append("    superContestEffect: ").append(toIndentedString(superContestEffect)).append("\n");
            sb.append("    target: ").append(toIndentedString(target)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
            sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
            sb.append("    learnedByPokemon: ").append(toIndentedString(learnedByPokemon)).append("\n");
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
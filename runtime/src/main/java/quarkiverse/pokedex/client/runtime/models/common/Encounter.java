package quarkiverse.pokedex.client.runtime.models.common;

import quarkiverse.pokedex.client.runtime.models.encounters.encounterconditionvalues.EncounterConditionValue;
import quarkiverse.pokedex.client.runtime.models.encounters.encountermethods.EncounterMethod;

import java.util.List;

public class Encounter {
    private Integer minLevel;
    private Integer maxLevel;
    private List<NamedApiResource<EncounterConditionValue>> conditionValues;
    private Integer chance;
    private NamedApiResource<EncounterMethod> method;

    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    public List<NamedApiResource<EncounterConditionValue>> getConditionValues() {
        return conditionValues;
    }

    public void setConditionValues(List<NamedApiResource<EncounterConditionValue>> conditionValues) {
        this.conditionValues = conditionValues;
    }

    public Integer getChance() {
        return chance;
    }

    public void setChance(Integer chance) {
        this.chance = chance;
    }

    public NamedApiResource<EncounterMethod> getMethod() {
        return method;
    }

    public void setMethod(NamedApiResource<EncounterMethod> method) {
        this.method = method;
    }
}

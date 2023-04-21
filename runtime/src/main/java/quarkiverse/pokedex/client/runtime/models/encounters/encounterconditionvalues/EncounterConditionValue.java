package quarkiverse.pokedex.client.runtime.models.encounters.encounterconditionvalues;

import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.encounters.encounterconditions.EncounterCondition;

import java.util.List;

public class EncounterConditionValue {
    private Integer id;
    private String name;
    private NamedApiResource<EncounterCondition> condition;
    private List<Name> names;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NamedApiResource<EncounterCondition> getCondition() {
        return condition;
    }

    public void setCondition(NamedApiResource<EncounterCondition> condition) {
        this.condition = condition;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }
}

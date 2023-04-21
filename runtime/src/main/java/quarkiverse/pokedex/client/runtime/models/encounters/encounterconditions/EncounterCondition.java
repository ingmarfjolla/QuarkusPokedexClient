package quarkiverse.pokedex.client.runtime.models.encounters.encounterconditions;

import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.encounters.encounterconditionvalues.EncounterConditionValue;

import java.util.List;

public class EncounterCondition {
    private Integer id;
    private String name;
    private List<Name> names;
    private List<NamedApiResource<EncounterConditionValue>> values;

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

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<NamedApiResource<EncounterConditionValue>> getValues() {
        return values;
    }

    public void setValues(List<NamedApiResource<EncounterConditionValue>> values) {
        this.values = values;
    }
}

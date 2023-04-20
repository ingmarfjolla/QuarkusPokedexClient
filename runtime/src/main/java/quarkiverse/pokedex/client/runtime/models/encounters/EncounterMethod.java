package quarkiverse.pokedex.client.runtime.models.encounters;

import quarkiverse.pokedex.client.runtime.models.common.Name;

import java.util.List;

public class EncounterMethod {
    private Integer id;
    private String name;
    private Integer order;
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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }
}

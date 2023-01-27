package quarkiverse.pokedex.client.runtime.models.berries;

import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.contests.ContestType;

import java.util.List;

public class BerryFlavor {
    private Integer id;
    private String name;
    private List<BerryFlavorMap> barries;
    private NamedApiResource<ContestType> contestType;
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

    public List<BerryFlavorMap> getBarries() {
        return barries;
    }

    public void setBarries(List<BerryFlavorMap> barries) {
        this.barries = barries;
    }

    public NamedApiResource<ContestType> getContestType() {
        return contestType;
    }

    public void setContestType(NamedApiResource<ContestType> contestType) {
        this.contestType = contestType;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }
}

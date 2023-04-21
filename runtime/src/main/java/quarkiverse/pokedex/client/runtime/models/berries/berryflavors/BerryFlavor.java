package quarkiverse.pokedex.client.runtime.models.berries.berryflavors;

import quarkiverse.pokedex.client.runtime.models.berries.berries.BerryFlavorMap;
import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.contests.contesttypes.ContestType;

import java.util.List;

public class BerryFlavor {
    private Integer id;
    private String name;
    private List<BerryFlavorMap> berries;
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
        return berries;
    }

    public void setBarries(List<BerryFlavorMap> berries) {
        this.berries = berries;
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

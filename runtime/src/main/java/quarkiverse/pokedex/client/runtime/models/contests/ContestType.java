package quarkiverse.pokedex.client.runtime.models.contests;

import quarkiverse.pokedex.client.runtime.models.berries.BerryFlavor;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;

import java.util.List;

public class ContestType {
    private Integer id;
    private String name;
    private NamedApiResource<BerryFlavor> berryFlavor;
    private List<ContestName> names;

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

    public NamedApiResource<BerryFlavor> getBerryFlavor() {
        return berryFlavor;
    }

    public void setBerryFlavor(NamedApiResource<BerryFlavor> berryFlavor) {
        this.berryFlavor = berryFlavor;
    }

    public List<ContestName> getNames() {
        return names;
    }

    public void setNames(List<ContestName> names) {
        this.names = names;
    }
}

package quarkiverse.pokedex.client.runtime.models.berries;

import quarkiverse.pokedex.client.runtime.models.common.Name;

import java.util.List;

public class BerryFlavor {
    private Integer id;
    private String name;
    private List<BerryFlavorMap> barries;
    private NamedApiResource<ContestType> contestType;
    private List<Name> names;
}

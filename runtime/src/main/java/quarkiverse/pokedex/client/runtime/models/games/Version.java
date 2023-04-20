package quarkiverse.pokedex.client.runtime.models.games;

import quarkiverse.pokedex.client.runtime.models.common.Name;

import java.util.List;

public class Version {
    private Integer id;
    private String name;
    private List<Name> names;
    private NamedApiResource<VersionGroup> versionGroup;
}

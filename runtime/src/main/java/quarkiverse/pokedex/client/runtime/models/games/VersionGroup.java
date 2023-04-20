package quarkiverse.pokedex.client.runtime.models.games;

import quarkiverse.pokedex.client.runtime.models.Pokedex;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.locations.Region;

import java.util.List;

public class VersionGroup {
    private Integer id;
    private String name;
    private Integer order;
    private NamedApiResource<Generation> generation;
    private List<NamedApiResource<MoveLearnMethod>> moveLearnMethods;
    private List<NamedApiResource<Pokedex>> pokedexes;
    private List<NamedApiResource<Region>> regions;
    private List<NamedApiResource<Version>> versions;
}

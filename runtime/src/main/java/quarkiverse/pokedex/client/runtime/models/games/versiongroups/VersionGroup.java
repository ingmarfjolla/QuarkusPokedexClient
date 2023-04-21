package quarkiverse.pokedex.client.runtime.models.games.versiongroups;

import quarkiverse.pokedex.client.runtime.models.games.pokedexes.Pokedex;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.games.generations.Generation;
import quarkiverse.pokedex.client.runtime.models.games.version.Version;
import quarkiverse.pokedex.client.runtime.models.locations.regions.Region;
import quarkiverse.pokedex.client.runtime.models.moves.movelearnmethods.MoveLearnMethod;

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

    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }

    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    public List<NamedApiResource<MoveLearnMethod>> getMoveLearnMethods() {
        return moveLearnMethods;
    }

    public void setMoveLearnMethods(List<NamedApiResource<MoveLearnMethod>> moveLearnMethods) {
        this.moveLearnMethods = moveLearnMethods;
    }

    public List<NamedApiResource<Pokedex>> getPokedexes() {
        return pokedexes;
    }

    public void setPokedexes(List<NamedApiResource<Pokedex>> pokedexes) {
        this.pokedexes = pokedexes;
    }

    public List<NamedApiResource<Region>> getRegions() {
        return regions;
    }

    public void setRegions(List<NamedApiResource<Region>> regions) {
        this.regions = regions;
    }

    public List<NamedApiResource<Version>> getVersions() {
        return versions;
    }

    public void setVersions(List<NamedApiResource<Version>> versions) {
        this.versions = versions;
    }
}

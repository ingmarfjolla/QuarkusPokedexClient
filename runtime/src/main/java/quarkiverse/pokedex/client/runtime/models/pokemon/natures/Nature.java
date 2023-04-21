package quarkiverse.pokedex.client.runtime.models.pokemon.natures;

import quarkiverse.pokedex.client.runtime.models.berries.berryflavors.BerryFlavor;
import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.pokemon.stats.Stat;

import java.util.List;

public class Nature {
    private Integer id;
    private String name;
    private NamedApiResource<Stat> decreasedStat;
    private NamedApiResource<Stat> increasedStat;
    private NamedApiResource<BerryFlavor> hatesFlavor;
    private NamedApiResource<BerryFlavor> likesFlavor;
    private List<NatureStatChange> pokeathlonStatChanges;
    private List<MoveBattleStylePreference> moveBattleStylePreferences;
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

    public NamedApiResource<Stat> getDecreasedStat() {
        return decreasedStat;
    }

    public void setDecreasedStat(NamedApiResource<Stat> decreasedStat) {
        this.decreasedStat = decreasedStat;
    }

    public NamedApiResource<Stat> getIncreasedStat() {
        return increasedStat;
    }

    public void setIncreasedStat(NamedApiResource<Stat> increasedStat) {
        this.increasedStat = increasedStat;
    }

    public NamedApiResource<BerryFlavor> getHatesFlavor() {
        return hatesFlavor;
    }

    public void setHatesFlavor(NamedApiResource<BerryFlavor> hatesFlavor) {
        this.hatesFlavor = hatesFlavor;
    }

    public NamedApiResource<BerryFlavor> getLikesFlavor() {
        return likesFlavor;
    }

    public void setLikesFlavor(NamedApiResource<BerryFlavor> likesFlavor) {
        this.likesFlavor = likesFlavor;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<NatureStatChange> getPokeathlonStatChanges() {
        return pokeathlonStatChanges;
    }

    public void setPokeathlonStatChanges(List<NatureStatChange> pokeathlonStatChanges) {
        this.pokeathlonStatChanges = pokeathlonStatChanges;
    }

    public List<MoveBattleStylePreference> getMoveBattleStylePreferences() {
        return moveBattleStylePreferences;
    }

    public void setMoveBattleStylePreferences(List<MoveBattleStylePreference> moveBattleStylePreferences) {
        this.moveBattleStylePreferences = moveBattleStylePreferences;
    }
}

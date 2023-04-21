package quarkiverse.pokedex.client.runtime.models.moves;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.pokemon.stats.Stat;

public class MoveStatChange {
    private Integer change;
    private NamedApiResource<Stat> stat;

    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    public NamedApiResource<Stat> getStat() {
        return stat;
    }

    public void setStat(NamedApiResource<Stat> stat) {
        this.stat = stat;
    }
}

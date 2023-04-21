package quarkiverse.pokedex.client.runtime.models.pokemon.natures;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;

public class NatureStatChange {
    private Integer maxChange;
    private NamedApiResource<PokeAthlonStat> pokeathlonStat;

    public Integer getMaxChange() {
        return maxChange;
    }

    public void setMaxChange(Integer maxChange) {
        this.maxChange = maxChange;
    }

    public NamedApiResource<PokeAthlonStat> getPokeathlonStat() {
        return pokeathlonStat;
    }

    public void setPokeathlonStat(NamedApiResource<PokeAthlonStat> pokeathlonStat) {
        this.pokeathlonStat = pokeathlonStat;
    }
}

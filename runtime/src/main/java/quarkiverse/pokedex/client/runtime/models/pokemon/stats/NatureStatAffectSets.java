package quarkiverse.pokedex.client.runtime.models.pokemon.stats;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.pokemon.natures.Nature;

import java.util.List;

public class NatureStatAffectSets {
    private List<NamedApiResource<Nature>> increase;
    private List<NamedApiResource<Nature>> decrease;

    public List<NamedApiResource<Nature>> getIncrease() {
        return increase;
    }

    public void setIncrease(List<NamedApiResource<Nature>> increase) {
        this.increase = increase;
    }

    public List<NamedApiResource<Nature>> getDecrease() {
        return decrease;
    }

    public void setDecrease(List<NamedApiResource<Nature>> decrease) {
        this.decrease = decrease;
    }
}

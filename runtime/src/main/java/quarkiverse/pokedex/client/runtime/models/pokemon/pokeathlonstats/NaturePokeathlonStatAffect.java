package quarkiverse.pokedex.client.runtime.models.pokemon.pokeathlonstats;

import io.smallrye.graphql.api.Scalar;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.pokemon.natures.Nature;

public class NaturePokeathlonStatAffect {
    private Integer maxChange;
    private NamedApiResource<Nature> nature;

    public Integer getMaxChange() {
        return maxChange;
    }

    public void setMaxChange(Integer maxChange) {
        this.maxChange = maxChange;
    }

    public NamedApiResource<Nature> getNature() {
        return nature;
    }

    public void setNature(NamedApiResource<Nature> nature) {
        this.nature = nature;
    }
}

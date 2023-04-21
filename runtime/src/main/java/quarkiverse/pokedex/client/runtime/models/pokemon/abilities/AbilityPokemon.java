package quarkiverse.pokedex.client.runtime.models.pokemon.abilities;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.pokemon.pokemon.Pokemon;

public class AbilityPokemon {
    private Boolean isHidden;
    private Integer slot;
    private NamedApiResource<Pokemon> pokemon;

    public Boolean getHidden() {
        return isHidden;
    }

    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }


}

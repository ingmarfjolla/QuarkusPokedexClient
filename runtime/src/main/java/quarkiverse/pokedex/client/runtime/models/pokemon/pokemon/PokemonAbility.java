package quarkiverse.pokedex.client.runtime.models.pokemon.pokemon;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.pokemon.abilities.Ability;

public class PokemonAbility {
    private Boolean isHidden;
    private Integer slot;
    private NamedApiResource<Ability> ability;

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

    public NamedApiResource<Ability> getAbility() {
        return ability;
    }

    public void setAbility(NamedApiResource<Ability> ability) {
        this.ability = ability;
    }
}

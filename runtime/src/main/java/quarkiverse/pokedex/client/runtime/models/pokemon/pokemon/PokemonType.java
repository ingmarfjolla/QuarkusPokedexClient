package quarkiverse.pokedex.client.runtime.models.pokemon.pokemon;

import quarkiverse.pokedex.client.runtime.models.pokemon.types.Type;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;

public class PokemonType {
    private Integer slot;
    private NamedApiResource<Type> type;

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public NamedApiResource<Type> getType() {
        return type;
    }

    public void setType(NamedApiResource<Type> type) {
        this.type = type;
    }
}

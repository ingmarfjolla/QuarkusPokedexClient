package quarkiverse.pokedex.client.runtime.models.pokemon.pokemon;

import quarkiverse.pokedex.client.runtime.models.Item;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;

public class PokemonHeldItem {
    private NamedApiResource<Item> item;
    private List<PokemonHeldItemVersion> versionDetails;

    public NamedApiResource<Item> getItem() {
        return item;
    }

    public void setItem(NamedApiResource<Item> item) {
        this.item = item;
    }

    public List<PokemonHeldItemVersion> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
        this.versionDetails = versionDetails;
    }
}

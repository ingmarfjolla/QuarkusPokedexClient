package quarkiverse.pokedex.client.runtime.models.pokemon.pokemon;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.games.version.Version;

public class PokemonHeldItemVersion {
    private NamedApiResource<Version> version;
    private Integer rarity;

    public NamedApiResource<Version> getVersion() {
        return version;
    }

    public void setVersion(NamedApiResource<Version> version) {
        this.version = version;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }
}

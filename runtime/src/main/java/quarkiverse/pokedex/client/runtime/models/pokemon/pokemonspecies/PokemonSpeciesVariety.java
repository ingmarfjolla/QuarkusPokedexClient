package quarkiverse.pokedex.client.runtime.models.pokemon.pokemonspecies;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.pokemon.pokemon.Pokemon;

public class PokemonSpeciesVariety {
    private Boolean isDefault;
    private NamedApiResource<Pokemon> pokemon;

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public NamedApiResource<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedApiResource<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
}

package quarkiverse.pokedex.client.runtime.models.pokemon.pokemonspecies;

import quarkiverse.pokedex.client.runtime.models.games.pokedexes.Pokedex;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;

public class PokemonSpeciesDexEntry {
    private Integer entryNumber;
    private NamedApiResource<Pokedex> pokedex;

    public Integer getEntryNumber() {
        return entryNumber;
    }

    public void setEntryNumber(Integer entryNumber) {
        this.entryNumber = entryNumber;
    }

    public NamedApiResource<Pokedex> getPokedex() {
        return pokedex;
    }

    public void setPokedex(NamedApiResource<Pokedex> pokedex) {
        this.pokedex = pokedex;
    }
}

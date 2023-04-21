package quarkiverse.pokedex.client.runtime.models.pokemon.genders;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.pokemon.pokemonspecies.PokemonSpecies;

public class PokemonSpeciesGender {
    private Integer rate;
    private NamedApiResource<PokemonSpecies> pokemonSpecies;

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public NamedApiResource<PokemonSpecies> getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(NamedApiResource<PokemonSpecies> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }
}

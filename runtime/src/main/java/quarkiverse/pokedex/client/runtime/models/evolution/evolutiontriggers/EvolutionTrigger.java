package quarkiverse.pokedex.client.runtime.models.evolution.evolutiontriggers;

import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.pokemon.pokemonspecies.PokemonSpecies;

import java.util.List;

public class EvolutionTrigger {
    private Integer id;
    private String name;
    private List<Name> names;
    private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
        return pokemonSpecies;
    }

    public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
        this.pokemonSpecies = pokemonSpecies;
    }
}

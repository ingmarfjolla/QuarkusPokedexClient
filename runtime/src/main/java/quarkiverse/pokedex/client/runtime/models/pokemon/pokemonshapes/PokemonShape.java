package quarkiverse.pokedex.client.runtime.models.pokemon.pokemonshapes;

import quarkiverse.pokedex.client.runtime.models.common.Name;

import java.util.List;

public class PokemonShape {
    private Integer id;
    private String name;
    private List<AwesomeName> awesomeNames;
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

    public List<AwesomeName> getAwesomeNames() {
        return awesomeNames;
    }

    public void setAwesomeNames(List<AwesomeName> awesomeNames) {
        this.awesomeNames = awesomeNames;
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

package quarkiverse.pokedex.client.runtime.models.evolution.evolutionchains;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.pokemon.pokemonspecies.PokemonSpecies;

import java.util.List;

public class ChainLink {

    private Boolean isBaby;
    private NamedApiResource<PokemonSpecies> species;
    private List<EvolutionDetail> evolutionDetails;
    private List<ChainLink> evolvesTo;

    public Boolean getBaby() {
        return isBaby;
    }

    public void setBaby(Boolean baby) {
        isBaby = baby;
    }

    public NamedApiResource<PokemonSpecies> getSpecies() {
        return species;
    }

    public void setSpecies(NamedApiResource<PokemonSpecies> species) {
        this.species = species;
    }

    public List<EvolutionDetail> getEvolutionDetails() {
        return evolutionDetails;
    }

    public void setEvolutionDetails(List<EvolutionDetail> evolutionDetails) {
        this.evolutionDetails = evolutionDetails;
    }

    public List<ChainLink> getEvolvesTo() {
        return evolvesTo;
    }

    public void setEvolvesTo(List<ChainLink> evolvesTo) {
        this.evolvesTo = evolvesTo;
    }
}

package quarkiverse.pokedex.client.runtime.models.pokemon.abilities;

import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.common.VerboseEffect;
import quarkiverse.pokedex.client.runtime.models.games.generations.Generation;

import java.util.List;

public class Ability {
    private Integer id;
    private String name;
    private Boolean isMainSeries;
    private NamedApiResource<Generation> generation;
    private List<Name> names;
    private List<VerboseEffect> effectEntries;
    private List<AbilityEffectChange> effectChanges;
    private List<AbilityFlavorText> flavorTextEntries;
    private List<AbilityPokemon> pokemon;

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

    public Boolean getMainSeries() {
        return isMainSeries;
    }

    public void setMainSeries(Boolean mainSeries) {
        isMainSeries = mainSeries;
    }

    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }

    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    public List<AbilityEffectChange> getEffectChanges() {
        return effectChanges;
    }

    public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
        this.effectChanges = effectChanges;
    }

    public List<AbilityFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    public List<AbilityPokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<AbilityPokemon> pokemon) {
        this.pokemon = pokemon;
    }
}

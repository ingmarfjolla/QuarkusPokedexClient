package quarkiverse.pokedex.client.runtime.models.locations.locationareas;

import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.locations.locations.Location;

import java.util.List;

public class LocationArea {
    private Integer Id;
    private String name;
    private Integer gameIndex;
    private List<EncounterMethodRate> encounterMethodRates;
    private NamedApiResource<Location> location;
    private List<Name> names;
    private List<PokemonEncounter> pokemonEncounters;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGameIndex() {
        return gameIndex;
    }

    public void setGameIndex(Integer gameIndex) {
        this.gameIndex = gameIndex;
    }

    public List<EncounterMethodRate> getEncounterMethodRates() {
        return encounterMethodRates;
    }

    public void setEncounterMethodRates(List<EncounterMethodRate> encounterMethodRates) {
        this.encounterMethodRates = encounterMethodRates;
    }

    public NamedApiResource<Location> getLocation() {
        return location;
    }

    public void setLocation(NamedApiResource<Location> location) {
        this.location = location;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<PokemonEncounter> getPokemonEncounters() {
        return pokemonEncounters;
    }

    public void setPokemonEncounters(List<PokemonEncounter> pokemonEncounters) {
        this.pokemonEncounters = pokemonEncounters;
    }
}

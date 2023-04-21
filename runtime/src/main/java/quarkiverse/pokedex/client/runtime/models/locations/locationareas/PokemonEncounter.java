package quarkiverse.pokedex.client.runtime.models.locations.locationareas;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.common.VersionEncounterDetail;
import quarkiverse.pokedex.client.runtime.models.pokemon.pokemon.Pokemon;

import java.util.List;

public class PokemonEncounter {
    private NamedApiResource<Pokemon> pokemon;
    private List<VersionEncounterDetail> versionDetails;

    public NamedApiResource<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedApiResource<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public List<VersionEncounterDetail> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }
}

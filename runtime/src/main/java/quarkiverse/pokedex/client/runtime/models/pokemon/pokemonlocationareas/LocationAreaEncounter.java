package quarkiverse.pokedex.client.runtime.models.pokemon.pokemonlocationareas;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.common.VersionEncounterDetail;
import quarkiverse.pokedex.client.runtime.models.locations.locationareas.LocationArea;

import java.util.List;

public class LocationAreaEncounter {
    private NamedApiResource<LocationArea> locationArea;
    private List<VersionEncounterDetail> versionDetails;

    public NamedApiResource<LocationArea> getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(NamedApiResource<LocationArea> locationArea) {
        this.locationArea = locationArea;
    }

    public List<VersionEncounterDetail> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
        this.versionDetails = versionDetails;
    }
}

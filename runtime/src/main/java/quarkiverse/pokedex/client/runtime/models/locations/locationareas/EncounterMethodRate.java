package quarkiverse.pokedex.client.runtime.models.locations.locationareas;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.encounters.encountermethods.EncounterMethod;
import quarkiverse.pokedex.client.runtime.models.locations.locationareas.EncounterVersionDetails;

import java.util.List;

public class EncounterMethodRate {

    private NamedApiResource<EncounterMethod> encounterMethod;
    private List<EncounterVersionDetails> versionDetails;

    public NamedApiResource<EncounterMethod> getEncounterMethod() {
        return encounterMethod;
    }

    public void setEncounterMethod(NamedApiResource<EncounterMethod> encounterMethod) {
        this.encounterMethod = encounterMethod;
    }

    public List<EncounterVersionDetails> getVersionDetails() {
        return versionDetails;
    }

    public void setVersionDetails(List<EncounterVersionDetails> versionDetails) {
        this.versionDetails = versionDetails;
    }
}

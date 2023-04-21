package quarkiverse.pokedex.client.runtime.models.common;

import quarkiverse.pokedex.client.runtime.models.games.versiongroups.VersionGroup;
import quarkiverse.pokedex.client.runtime.models.machines.Machine;

public class MachineVersionDetail {
    private ApiResource<Machine> machine;
    private NamedApiResource<VersionGroup> versionGroup;

    public ApiResource<Machine> getMachine() {
        return machine;
    }

    public void setMachine(ApiResource<Machine> machine) {
        this.machine = machine;
    }

    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }
}

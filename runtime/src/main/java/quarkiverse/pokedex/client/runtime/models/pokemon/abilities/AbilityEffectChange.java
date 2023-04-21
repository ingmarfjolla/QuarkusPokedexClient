package quarkiverse.pokedex.client.runtime.models.pokemon.abilities;

import quarkiverse.pokedex.client.runtime.models.common.Effect;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.games.versiongroups.VersionGroup;

import java.util.List;

public class AbilityEffectChange {
    private List<Effect> effectEntries;
    private NamedApiResource<VersionGroup> versionGroup;

    public List<Effect> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<Effect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }
}

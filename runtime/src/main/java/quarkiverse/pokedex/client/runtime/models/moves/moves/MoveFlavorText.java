package quarkiverse.pokedex.client.runtime.models.moves.moves;

import quarkiverse.pokedex.client.runtime.models.common.Language;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.games.versiongroups.VersionGroup;

public class MoveFlavorText {
    private String flavorText;
    private NamedApiResource<Language> language;
    private NamedApiResource<VersionGroup> versionGroup;

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public NamedApiResource<Language> getLanguage() {
        return language;
    }

    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }

    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }
}

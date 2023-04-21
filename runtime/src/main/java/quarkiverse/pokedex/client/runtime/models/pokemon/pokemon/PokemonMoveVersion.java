package quarkiverse.pokedex.client.runtime.models.pokemon.pokemon;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.games.versiongroups.VersionGroup;
import quarkiverse.pokedex.client.runtime.models.moves.movelearnmethods.MoveLearnMethod;

public class PokemonMoveVersion {
    private NamedApiResource<MoveLearnMethod> moveLearnMethod;
    private NamedApiResource<VersionGroup> versionGroup;
    private Integer levelLearnedAt;

    public NamedApiResource<MoveLearnMethod> getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(NamedApiResource<MoveLearnMethod> moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }

    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }
}

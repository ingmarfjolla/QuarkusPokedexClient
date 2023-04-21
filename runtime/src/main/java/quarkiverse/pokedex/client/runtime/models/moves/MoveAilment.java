package quarkiverse.pokedex.client.runtime.models.moves;

import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;

import java.util.List;

public class MoveAilment {
    private String name;
    private List<NamedApiResource<Move>> moves;
    private List<Name> names;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NamedApiResource<Move>> getMoves() {
        return moves;
    }

    public void setMoves(List<NamedApiResource<Move>> moves) {
        this.moves = moves;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }
}

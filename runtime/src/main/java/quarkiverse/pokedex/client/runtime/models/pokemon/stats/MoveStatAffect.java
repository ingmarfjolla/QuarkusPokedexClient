package quarkiverse.pokedex.client.runtime.models.pokemon.stats;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.moves.moves.Move;

public class MoveStatAffect {
    private Integer change;
    private NamedApiResource<Move> move;

    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    public NamedApiResource<Move> getMove() {
        return move;
    }

    public void setMove(NamedApiResource<Move> move) {
        this.move = move;
    }
}

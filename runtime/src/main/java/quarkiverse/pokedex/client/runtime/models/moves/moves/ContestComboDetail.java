package quarkiverse.pokedex.client.runtime.models.moves.moves;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.moves.moves.Move;

import java.util.List;

public class ContestComboDetail {
    private List<NamedApiResource<Move>> userBefore;
    private List<NamedApiResource<Move>> userAfter;

    public List<NamedApiResource<Move>> getUserBefore() {
        return userBefore;
    }

    public void setUserBefore(List<NamedApiResource<Move>> userBefore) {
        this.userBefore = userBefore;
    }

    public List<NamedApiResource<Move>> getUserAfter() {
        return userAfter;
    }

    public void setUserAfter(List<NamedApiResource<Move>> userAfter) {
        this.userAfter = userAfter;
    }
}

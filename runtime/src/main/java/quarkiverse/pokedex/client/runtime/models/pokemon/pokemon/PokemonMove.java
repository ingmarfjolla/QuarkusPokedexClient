package quarkiverse.pokedex.client.runtime.models.pokemon.pokemon;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.moves.moves.Move;

import java.util.List;

public class PokemonMove {
    private NamedApiResource<Move> move;
    private List<PokemonMoveVersion> versionGroupDetails;

    public NamedApiResource<Move> getMove() {
        return move;
    }

    public void setMove(NamedApiResource<Move> move) {
        this.move = move;
    }

    public List<PokemonMoveVersion> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    public void setVersionGroupDetails(List<PokemonMoveVersion> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }
}

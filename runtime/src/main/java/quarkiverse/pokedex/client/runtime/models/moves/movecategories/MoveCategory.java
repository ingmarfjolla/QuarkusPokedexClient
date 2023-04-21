package quarkiverse.pokedex.client.runtime.models.moves.movecategories;

import quarkiverse.pokedex.client.runtime.models.common.Description;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.moves.moves.Move;

import java.util.List;

public class MoveCategory {
    private Integer id;
    private String name;
    private List<NamedApiResource<Move>> moves;
    private List<Description> descriptions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }
}

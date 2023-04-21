package quarkiverse.pokedex.client.runtime.models.pokemon.pokeathlonstats;

import quarkiverse.pokedex.client.runtime.models.common.Name;

import java.util.List;

public class PokeAthlonStat {
    private Integer id;
    private String name;
    private List<Name> names;
    private NaturePokeathlonStatAffectSets affectingNatures;

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

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public NaturePokeathlonStatAffectSets getAffectingNatures() {
        return affectingNatures;
    }

    public void setAffectingNatures(NaturePokeathlonStatAffectSets affectingNatures) {
        this.affectingNatures = affectingNatures;
    }
}

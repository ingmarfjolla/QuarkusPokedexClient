package quarkiverse.pokedex.client.runtime.models.ability;

import quarkiverse.pokedex.client.runtime.models.common.Name;

import java.util.List;

public class Ability {
    private Integer id;
    private String name;
    private Boolean isMainSeries;
    private NamedApiResource<Generation> generation;
    private List<Name> names;
    private List<VerboseEffect> effectEntries;
    private List<AbilityEffectChange> effectChanges;
    private List<AbilityFlavorText> flavorTextEntries;
    private List<AbilityPokemon> pokemon;
}

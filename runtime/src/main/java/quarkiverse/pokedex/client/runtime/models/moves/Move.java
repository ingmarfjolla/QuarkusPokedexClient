package quarkiverse.pokedex.client.runtime.models.moves;

import quarkiverse.pokedex.client.runtime.models.Type;
import quarkiverse.pokedex.client.runtime.models.ability.AbilityEffectChange;
import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.contests.ContestType;
import quarkiverse.pokedex.client.runtime.models.games.Generation;

import java.util.List;

public class Move {
    private Integer id;
    private String name;
    private Integer accuracy;
    private Integer effectChance;
    private Integer pp;
    private Integer priority;
    private Integer power;
    private ContestComboSets contestCombos;
    private NamedApiResource<ContestType> contestType;
    private ApiResource<ContestEffect> contestEffect;
    private NamedApiResource<MoveDamageClass> damageClass;
    private List<VerboseEffect> effectEntries;
    private List<AbilityEffectChange> effectChanges;
    private List<MoveFlavorText> flavorTextEntries;
    private NamedApiResource<Generation> generation;
    private List<MachineVersionDetail> machines;
    private MoveMetaData meta;
    private List<Name> names;
    private List<PastMoveStatValues> pastValues;
    private List<MoveStatChange> statChanges;
    private ApiResource<SuperContestEffect> superContestEffect;
    private NamedApiResource<MoveTarget> target;
    private NamedApiResource<Type> type;
}

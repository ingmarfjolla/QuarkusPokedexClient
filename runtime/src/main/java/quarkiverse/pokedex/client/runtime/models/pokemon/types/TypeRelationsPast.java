package quarkiverse.pokedex.client.runtime.models.pokemon.types;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.games.generations.Generation;

public class TypeRelationsPast {
    private NamedApiResource<Generation> generation;
    private TypeRelations damageRelations;

    public NamedApiResource<Generation> getGeneration() {
        return generation;
    }

    public void setGeneration(NamedApiResource<Generation> generation) {
        this.generation = generation;
    }

    public TypeRelations getDamageRelations() {
        return damageRelations;
    }

    public void setDamageRelations(TypeRelations damageRelations) {
        this.damageRelations = damageRelations;
    }
}

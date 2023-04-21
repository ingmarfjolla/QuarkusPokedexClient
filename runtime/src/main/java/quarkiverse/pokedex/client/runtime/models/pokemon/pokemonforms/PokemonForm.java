package quarkiverse.pokedex.client.runtime.models.pokemon.pokemonforms;

import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.games.version.VersionGroup;
import quarkiverse.pokedex.client.runtime.models.pokemon.pokemon.Pokemon;

import java.util.List;

public class PokemonForm {
    private Integer id;
    private String name;
    private Integer order;
    private Integer formOrder;
    private Boolean isDefault;
    private Boolean isBattleOnly;
    private String formName;
    private NamedApiResource<Pokemon> pokemon;
    private PokemonFormSprites sprites;
    private NamedApiResource<VersionGroup> versionGroup;
    private List<Name> names;
    private List<Name> formNames;

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

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getFormOrder() {
        return formOrder;
    }

    public void setFormOrder(Integer formOrder) {
        this.formOrder = formOrder;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Boolean getBattleOnly() {
        return isBattleOnly;
    }

    public void setBattleOnly(Boolean battleOnly) {
        isBattleOnly = battleOnly;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public NamedApiResource<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(NamedApiResource<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public PokemonFormSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonFormSprites sprites) {
        this.sprites = sprites;
    }

    public NamedApiResource<VersionGroup> getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(NamedApiResource<VersionGroup> versionGroup) {
        this.versionGroup = versionGroup;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public List<Name> getFormNames() {
        return formNames;
    }

    public void setFormNames(List<Name> formNames) {
        this.formNames = formNames;
    }
}

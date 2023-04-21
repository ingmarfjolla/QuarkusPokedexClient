package quarkiverse.pokedex.client.runtime.models.items.itemflingeffects;

import quarkiverse.pokedex.client.runtime.models.common.Effect;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.items.item.Item;

import java.util.List;

public class ItemFlingEffect {
    private Integer id;
    private String name;
    private List<Effect> effectEntries;
    private List<NamedApiResource<Item>> items;

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

    public List<Effect> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<Effect> effectEntries) {
        this.effectEntries = effectEntries;
    }

    public List<NamedApiResource<Item>> getItems() {
        return items;
    }

    public void setItems(List<NamedApiResource<Item>> items) {
        this.items = items;
    }
}

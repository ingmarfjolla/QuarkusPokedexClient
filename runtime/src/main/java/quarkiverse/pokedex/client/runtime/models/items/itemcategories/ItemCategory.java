package quarkiverse.pokedex.client.runtime.models.items.itemcategories;

import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.items.item.Item;
import quarkiverse.pokedex.client.runtime.models.items.itempockets.ItemPocket;

import java.util.List;

public class ItemCategory {
    private Integer id;
    private String name;
    private List<NamedApiResource<Item>> items;
    private List<Name> names;
    private NamedApiResource<ItemPocket> pocket;

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

    public List<NamedApiResource<Item>> getItems() {
        return items;
    }

    public void setItems(List<NamedApiResource<Item>> items) {
        this.items = items;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }

    public NamedApiResource<ItemPocket> getPocket() {
        return pocket;
    }

    public void setPocket(NamedApiResource<ItemPocket> pocket) {
        this.pocket = pocket;
    }
}

package quarkiverse.pokedex.client.runtime.models.items.itempockets;

import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.items.itemcategories.ItemCategory;

import java.util.List;

public class ItemPocket {
    private Integer id;
    private String name;
    private List<NamedApiResource<ItemCategory>> categories;
    private List<Name> names;

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

    public List<NamedApiResource<ItemCategory>> getCategories() {
        return categories;
    }

    public void setCategories(List<NamedApiResource<ItemCategory>> categories) {
        this.categories = categories;
    }

    public List<Name> getNames() {
        return names;
    }

    public void setNames(List<Name> names) {
        this.names = names;
    }
}

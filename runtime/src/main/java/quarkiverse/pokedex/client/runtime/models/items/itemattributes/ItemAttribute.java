package quarkiverse.pokedex.client.runtime.models.items.itemattributes;

import quarkiverse.pokedex.client.runtime.models.common.Description;
import quarkiverse.pokedex.client.runtime.models.common.Name;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.items.item.Item;
import java.util.List;

public class ItemAttribute {
    private Integer id;
    private String name;
    private List<NamedApiResource<Item>> items;
    private List<Name> names;
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

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }
}

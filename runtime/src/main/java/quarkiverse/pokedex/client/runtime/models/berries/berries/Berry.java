package quarkiverse.pokedex.client.runtime.models.berries.berries;
import java.util.List;

import quarkiverse.pokedex.client.runtime.models.berries.berryfirmnesses.BerryFirmness;
import quarkiverse.pokedex.client.runtime.models.pokemon.types.Type;
import quarkiverse.pokedex.client.runtime.models.items.item.Item;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;


public class Berry {
    public Integer id;
    public String name;
    public Integer growthTime;
    public Integer maxHarvest;
    public Integer naturalGiftPower;
    public Integer size;
    public Integer smoothness;
    public Integer soilDryness;
    public NamedApiResource<BerryFirmness> berryFirmness;
    public List<BerryFlavorMap> flavors;
    public NamedApiResource<Item> item;
    public NamedApiResource<Type> naturalGiftType;

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

    public Integer getGrowthTime() {
        return growthTime;
    }

    public void setGrowthTime(Integer growthTime) {
        this.growthTime = growthTime;
    }

    public Integer getMaxHarvest() {
        return maxHarvest;
    }

    public void setMaxHarvest(Integer maxHarvest) {
        this.maxHarvest = maxHarvest;
    }

    public Integer getNaturalGiftPower() {
        return naturalGiftPower;
    }

    public void setNaturalGiftPower(Integer naturalGiftPower) {
        this.naturalGiftPower = naturalGiftPower;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSmoothness() {
        return smoothness;
    }

    public void setSmoothness(Integer smoothness) {
        this.smoothness = smoothness;
    }

    public Integer getSoilDryness() {
        return soilDryness;
    }

    public void setSoilDryness(Integer soilDryness) {
        this.soilDryness = soilDryness;
    }

    public NamedApiResource<BerryFirmness> getBerryFirmness() {
        return berryFirmness;
    }

    public void setBerryFirmness(NamedApiResource<BerryFirmness> berryFirmness) {
        this.berryFirmness = berryFirmness;
    }

    public List<BerryFlavorMap> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<BerryFlavorMap> flavors) {
        this.flavors = flavors;
    }

    public void setItem(NamedApiResource<Item> item) {
        this.item = item;
    }

    public NamedApiResource<Item> getItem() {
        return item;
    }

    public NamedApiResource<Type> getNaturalGiftType() {
        return naturalGiftType;
    }

    public void setNaturalGiftType(NamedApiResource<Type> naturalGiftType) {
        this.naturalGiftType = naturalGiftType;
    }
}

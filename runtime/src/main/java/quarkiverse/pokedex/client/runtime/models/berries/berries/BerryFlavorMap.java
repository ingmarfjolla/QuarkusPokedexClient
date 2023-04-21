package quarkiverse.pokedex.client.runtime.models.berries.berries;


import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;

public class BerryFlavorMap {
    private Integer potency;
    private NamedApiResource<Berry> berry;

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public NamedApiResource<Berry> getBerry() {
        return berry;
    }

    public void setBerry(NamedApiResource<Berry> berry) {
        this.berry = berry;
    }
}

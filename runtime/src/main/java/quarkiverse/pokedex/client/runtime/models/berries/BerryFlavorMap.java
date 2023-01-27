package quarkiverse.pokedex.client.runtime.models.berries;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;

public class BerryFlavorMap {
    private Integer potency;
    private NamedApiResource<BerryFlavor> berryFlavor;

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public NamedApiResource<BerryFlavor> getBerryFlavor() {
        return berryFlavor;
    }

    public void setBerryFlavor(NamedApiResource<BerryFlavor> berryFlavor) {
        this.berryFlavor = berryFlavor;
    }


}

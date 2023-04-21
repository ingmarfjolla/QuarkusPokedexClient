package quarkiverse.pokedex.client.runtime.models.pokemon.pokemonspecies;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;

public class PalParkEncounterArea {
    private Integer baseScore;
    private Integer rate;
    private NamedApiResource<PalParkArea> area;

    public Integer getBaseScore() {
        return baseScore;
    }

    public void setBaseScore(Integer baseScore) {
        this.baseScore = baseScore;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public NamedApiResource<PalParkArea> getArea() {
        return area;
    }

    public void setArea(NamedApiResource<PalParkArea> area) {
        this.area = area;
    }
}

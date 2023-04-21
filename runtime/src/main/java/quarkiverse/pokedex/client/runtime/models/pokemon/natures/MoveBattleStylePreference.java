package quarkiverse.pokedex.client.runtime.models.pokemon.natures;

import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;
import quarkiverse.pokedex.client.runtime.models.moves.movebattlestyles.MoveBattleStyle;

public class MoveBattleStylePreference {
    private Integer lowHpPreference;
    private Integer highHpPreference;
    private NamedApiResource<MoveBattleStyle> moveBattleStyle;

    public Integer getLowHpPreference() {
        return lowHpPreference;
    }

    public void setLowHpPreference(Integer lowHpPreference) {
        this.lowHpPreference = lowHpPreference;
    }

    public Integer getHighHpPreference() {
        return highHpPreference;
    }

    public void setHighHpPreference(Integer highHpPreference) {
        this.highHpPreference = highHpPreference;
    }

    public NamedApiResource<MoveBattleStyle> getMoveBattleStyle() {
        return moveBattleStyle;
    }

    public void setMoveBattleStyle(NamedApiResource<MoveBattleStyle> moveBattleStyle) {
        this.moveBattleStyle = moveBattleStyle;
    }
}

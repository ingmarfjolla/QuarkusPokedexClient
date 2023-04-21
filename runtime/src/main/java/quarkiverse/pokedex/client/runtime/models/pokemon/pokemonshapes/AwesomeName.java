package quarkiverse.pokedex.client.runtime.models.pokemon.pokemonshapes;

import quarkiverse.pokedex.client.runtime.models.common.Language;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;

public class AwesomeName {
    private String awesomeName;
    private NamedApiResource<Language> language;

    public String getAwesomeName() {
        return awesomeName;
    }

    public void setAwesomeName(String awesomeName) {
        this.awesomeName = awesomeName;
    }

    public NamedApiResource<Language> getLanguage() {
        return language;
    }

    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }
}

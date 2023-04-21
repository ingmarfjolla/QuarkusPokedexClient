package quarkiverse.pokedex.client.runtime.models.pokemon.pokemonspecies;

import quarkiverse.pokedex.client.runtime.models.common.Language;
import quarkiverse.pokedex.client.runtime.models.common.NamedApiResource;

public class Genus {
    private String genus;
    private NamedApiResource<Language> language;

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public NamedApiResource<Language> getLanguage() {
        return language;
    }

    public void setLanguage(NamedApiResource<Language> language) {
        this.language = language;
    }
}


package quarkiverse.pokedex.client.runtime.models.common;

public class NamedApiResource<T> {
    private String name;
    private String url;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}

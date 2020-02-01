package com.rebosura.oop;

public class Weblink extends Bookmark{
    private String url;

    public Weblink(String title, String url) {
        super(title);
        this.url = url;
    }

    public Weblink(String title, String description, String url) {
        super(title, description);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Weblink{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

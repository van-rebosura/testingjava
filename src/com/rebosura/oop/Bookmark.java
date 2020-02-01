package com.rebosura.oop;

public abstract class Bookmark {
    protected String title;
    protected String description;

    public Bookmark() {}

    public Bookmark(String title) {
        this.title = title;
    }

    public Bookmark(String title, String description) {
        this(title);
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

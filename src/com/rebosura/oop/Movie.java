package com.rebosura.oop;

public class Movie extends Bookmark{
    private String releaseDate;

    public Movie(String title, String releaseDate) {
        super(title);
        this.releaseDate = releaseDate;
    }

    public Movie(String title, String description, String releaseDate) {
        super(title, description);
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "releaseDate='" + releaseDate + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

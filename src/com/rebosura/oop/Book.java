package com.rebosura.oop;

public class Book extends Bookmark implements Shareable{
    private String publicationDate;

    public Book(String title, String publicationDate) {
        super(title);
        this.publicationDate = publicationDate;
    }

    public Book(String title, String description, String publicationDate) {
        super(title, description);
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publicationDate='" + publicationDate + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public void share() {
        System.out.println("Book: share()");
    }
}

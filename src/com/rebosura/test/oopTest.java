package com.rebosura.test;


import com.rebosura.oop.Book;
import com.rebosura.oop.Bookmark;
import com.rebosura.oop.Movie;
import com.rebosura.oop.Shareable;

public class oopTest {
    public static void main(String[] args) {
        Shareable book1 = new Book("bookName", "bookDesc", "date");
        System.out.println(book1);
        book1.share();
        Bookmark movie1 = new Movie("movieName", "movieDesc", "releaseDate");
        System.out.println(movie1);
    }
}

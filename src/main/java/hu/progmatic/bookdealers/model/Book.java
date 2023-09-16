package hu.progmatic.bookdealers.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class Book {
        String author;
        String title;



    public Book() {
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

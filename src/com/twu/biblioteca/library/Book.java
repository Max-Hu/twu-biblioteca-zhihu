package com.twu.biblioteca.library;

public class Book {

    private int id;
    private String name;
    private String author;
    private String yearPublish;

    public Book(int id, String name, String author, String yearPublish) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.yearPublish = yearPublish;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearPublish() {
        return yearPublish;
    }

    @Override
    public String toString() {
        return name + " | " + author + " | " + yearPublish;
    }
}

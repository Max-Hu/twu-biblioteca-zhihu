package com.twu.biblioteca.book;

public class Book {

    private String name;
    private String author;
    private String year_publish;

    public Book(String name, String author, String year_publish) {
        this.name = name;
        this.author = author;
        this.year_publish = year_publish;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear_publish() {
        return year_publish;
    }
}

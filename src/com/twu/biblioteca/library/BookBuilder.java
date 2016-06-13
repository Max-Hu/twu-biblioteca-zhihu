package com.twu.biblioteca.library;

public class BookBuilder {

    private int id;
    private String name;
    private String author;
    private String yearPublish;

    public static BookBuilder newBook() {
        return new BookBuilder();
    }

    public BookBuilder id(int id) {
        this.id = id;
        return this;
    }

    public BookBuilder bookName(String name) {
        this.name = name;
        return this;
    }

    public  BookBuilder author(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder yearPublish(String yearPublish) {
        this.yearPublish = yearPublish;
        return this;
    }

    public Book build() {
        return new Book(id, name, author, yearPublish);
    }

}

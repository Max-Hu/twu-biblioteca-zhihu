package com.twu.biblioteca.library;

import java.util.HashMap;
import java.util.Map;

public class BookAdministrator {

    private Map<Integer, Book> bookMap;

    public BookAdministrator(Map<Integer, Book> bookMap) {
        this.bookMap = bookMap;
    }

    public Map<Integer, Book> getBookMap() {
        return this.bookMap;
    }

    public Book getBookById(int id) {
        return bookMap.get(id);
    }

    public boolean removeBookById(int id) {
        if (bookMap.containsKey(id)) {
            bookMap.remove(id);
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book) {
        if (!bookMap.containsKey(book.getId())) {
            bookMap.put(book.getId(), book);
            return true;
        }
        return false;
    }

}

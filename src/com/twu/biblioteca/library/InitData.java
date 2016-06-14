package com.twu.biblioteca.library;

import java.util.HashMap;
import java.util.Map;

public class InitData {

    public Map<Integer, Book> initBookMap() {
        Map<Integer, Book> bookMap = new HashMap<Integer, Book>();
        bookMap.put(1, BookBuilder.newBook().id(1).bookName("Head First Python").author("Paul Barry").yearPublish("2015").build());
        bookMap.put(2, BookBuilder.newBook().id(2).bookName("Head First Design Patterns").author("Eric Freeman").yearPublish("2004").build());
        bookMap.put(3, BookBuilder.newBook().id(3).bookName("Head First Java, 2nd Edition").author("Kathy Sierra").yearPublish("2005").build());
        bookMap.put(4, BookBuilder.newBook().id(4).bookName("Head First JavaScript Programming").author("Eric T. Freeman").yearPublish("2014").build());
        bookMap.put(5, BookBuilder.newBook().id(5).bookName("Head First Android Development").author("Dawn Griffiths").yearPublish("2015").build());
        bookMap.put(6, BookBuilder.newBook().id(6).bookName("Head First Ruby").author("Jay McGavren").yearPublish("2015").build());
        return bookMap;
    }

}

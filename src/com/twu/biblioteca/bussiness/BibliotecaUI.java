package com.twu.biblioteca.bussiness;

import com.twu.biblioteca.library.Book;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class BibliotecaUI {

    private String SEGMENTATION = "#################################################";

    public void printWelcomeMessage() {
        System.out.println("--------------------------------");
        System.out.println("|   Welcome to BibliotecaApp   |");
        System.out.println("--------------------------------");
    }

    public void printMainMenu() {
        String[] opetions = {"List Book"};
        for (int i = 0; i < opetions.length; i++) {
            System.out.println(i + 1 + " => " + opetions[i]);
        }
        System.out.println(SEGMENTATION);
        System.out.println("Please Select a Option:");

    }

    public void printBookList(Map<String, Book> bookMap) {

        Iterator entries = bookMap.entrySet().iterator();

        System.out.println("ID | Book Name | Author | Year Published");

        while (entries.hasNext()) {
            Entry book = (Entry) entries.next();
            System.out.println(book.getKey() + " : " + book.getValue().toString());
        }
        System.out.println(SEGMENTATION);
        System.out.println("Please input the ID for checking out:");
    }

    public void printCheckOutSuccessful() {
        System.out.println("Thank you! Enjoy the book. :)");
    }

    public void printCheckOutvalid() {
        System.out.println("That book is not available. :(");
    }

    public void printReturnSuccessful() {
        System.out.println("Thank you for returning the book. :)");
    }

    public void printReturnvalid() {
        System.out.println("That is not a valid book to return. :(");
    }

}

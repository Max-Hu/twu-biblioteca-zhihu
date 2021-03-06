package com.twu.biblioteca.bussiness;

import com.twu.biblioteca.library.Book;
import com.twu.biblioteca.library.BookAdministrator;
import com.twu.biblioteca.library.InitData;

import java.util.Map;

public class BookRelatedBusiness {

    private BookAdministrator bookAdministrator;

    private Map<Integer, Book> bookDirectory;

    private BibliotecaUI bibliotecaUI;

    public BookRelatedBusiness(InitData initData) {
        this.bookAdministrator = new BookAdministrator(initData.initBookMap());
        this.bookDirectory = initData.initBookMap();
        this.bibliotecaUI = new BibliotecaUI();
    }

    public Map<Integer, Book> getBookInventory() {
        return bookAdministrator.getBookMap();
    }

    public void checkOutBook(int id) {
        if (bookAdministrator.removeBookById(id)) {
            bibliotecaUI.printCheckOutSuccessful();
        } else {
            bibliotecaUI.printCheckOutvalid();
        }
    }

    public void returnBook(int id) {
        if (bookDirectory.containsKey(id)) {
            if (bookAdministrator.returnBook(bookDirectory.get(id))) {
                bibliotecaUI.printReturnSuccessful();
                return;
            }
        }
        bibliotecaUI.printReturnvalid();

    }
}

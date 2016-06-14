package com.twu.biblioteca;

import com.twu.biblioteca.bussiness.BibliotecaUI;
import com.twu.biblioteca.bussiness.BookRelatedBusiness;
import com.twu.biblioteca.bussiness.InputListener;
import com.twu.biblioteca.library.InitData;

public class BibliotecaApp {

    private BibliotecaUI bibliotecaUI = new BibliotecaUI();
    private InitData initData = new InitData();
    private BookRelatedBusiness bookRelatedBusiness = new BookRelatedBusiness(initData);
    private String[] opetions = {"List Book"};


    public String[] getOpetions() {
        return opetions;
    }


    public boolean checkVaildOptions(int number) {
        if (number < opetions.length && number > 0) return true;
        return false;
    }

    public boolean checkVaildNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception exception) {
            bibliotecaUI.printInvalidMessage();
            return false;
        }
    }


    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        InputListener inputListener = new InputListener();
        app.bibliotecaUI.printWelcomeMessage();
        app.bibliotecaUI.holdOn(1000);

        while (true) {
            app.bibliotecaUI.printMainMenu(app.getOpetions());
            String input = inputListener.input();
            app.quite(input);
            if (app.checkVaildNumber(input) ) {
                switch (Integer.parseInt(input)) {
                    case 1: app.bibliotecaUI.printBookList(app.bookRelatedBusiness.getBookInventory());
                            app.bookManger(inputListener.input());
                            continue;
                    default: continue;
                }

            }
        }
    }

    public void bookManger(String input) {
        if (checkVaildNumber(input)) {
            int bookid = Integer.parseInt(input);
            if (bookRelatedBusiness.getBookInventory().containsKey(bookid)) bookRelatedBusiness.checkOutBook(bookid);
            else bookRelatedBusiness.returnBook(bookid);
        }
    }

    public void quite(String message) {
        if (message.toLowerCase().equals("quite")) {
            bibliotecaUI.printGoodByeMessage();
            System.exit(0);
        }

    }




}

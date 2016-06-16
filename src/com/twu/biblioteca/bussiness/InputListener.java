package com.twu.biblioteca.bussiness;

import java.util.Scanner;

public class InputListener {

    private Scanner scanner = new Scanner(System.in);

    public String input() {
        return scanner.nextLine();
    }

}

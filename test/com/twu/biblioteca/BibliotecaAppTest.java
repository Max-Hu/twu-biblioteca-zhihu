package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    private BibliotecaUI ui;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setup(){
        ui = new BibliotecaUI();
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void welcomeMessageTest() {
        ui.printWelcomeMessage();
        assertEquals("Welcome to BibliotecaApp !!!!\n", outContent.toString());
    }


    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}

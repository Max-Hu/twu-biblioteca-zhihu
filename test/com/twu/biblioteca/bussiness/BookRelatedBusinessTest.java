package com.twu.biblioteca.bussiness;

import com.twu.biblioteca.library.InitData;
import com.twu.biblioteca.utils.InitTestData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BookRelatedBusinessTest {

    private BookRelatedBusiness bookRelatedBusiness;
    private ByteArrayOutputStream outContent;

    @Before
    public void setup() {
        bookRelatedBusiness = new BookRelatedBusiness(new InitTestData());
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCheckOutBookSuccessfully() throws Exception {
        bookRelatedBusiness.checkOutBook(2);
        assertEquals("Thank you! Enjoy the book. :)\n", outContent.toString());
    }

    @Test
    public void testCheckOutBookNotInBookList() throws Exception {
        bookRelatedBusiness.checkOutBook(10);
        assertEquals("That book is not available. :(\n", outContent.toString());
    }

    @Test
    public void testReturnBookSuccessfully() throws Exception {
        bookRelatedBusiness.checkOutBook(4);
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bookRelatedBusiness.returnBook(4);
        assertEquals("Thank you for returning the book. :)\n", outContent.toString());
    }

    @Test
    public void testReturnBookUnsuccessfully() throws Exception {
        bookRelatedBusiness.returnBook(4);
        assertEquals("That is not a valid book to return. :(\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
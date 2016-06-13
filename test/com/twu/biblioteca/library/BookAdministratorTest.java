package com.twu.biblioteca.library;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BookAdministratorTest {

    private BookAdministrator bookAdministrator;

    @Before
    public void setup() {
        bookAdministrator = new BookAdministrator();
    }

    @Test
    public void testGetBookById() throws Exception {
        Book testBook = BookBuilder.newBook().id(3).bookName("Head First Java, 2nd Edition").author("Kathy Sierra").yearPublish("2005").build();
        Book book = bookAdministrator.getBookById(3);
        assertThat(book.toString(), is(testBook.toString()));
    }

    @Test
    public void testRemoveBookById() throws Exception {
        int originalBookSize = bookAdministrator.getBookMap().size();
        assertThat(bookAdministrator.removeBookById(1), is(true));

        int removedBookSize = bookAdministrator.getBookMap().size();
        assertThat(originalBookSize, is(removedBookSize + 1));
    }

    @Test
    public void testFindByNotExistedId() throws Exception {
        Book book = bookAdministrator.getBookById(12);
        assertThat(book == null, is(true));
    }

    @Test
    public void testRemoveByNotExistedId() throws Exception {
        assertThat(bookAdministrator.removeBookById(12), is(false));
    }
}
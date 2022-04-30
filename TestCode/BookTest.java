package Tester;

import LibraryManagement.Book;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * @author Israt Jahan Tonni
 */

public class BookTest {
    
    Book b;

    @Before
    public void setUp() throws Exception{
        b = Mockito.mock(Book.class);
    }

    @Test
    public void testConnect() {
        System.out.println("Connect");
        doNothing().when(b).Connect();
        b.Connect();
        verify(b,times(1)).Connect();
    }

    @Test
    public void testCategory() {
        System.out.println("Category");
        doNothing().when(b).Category();
        b.Category();
        verify(b,times(1)).Category();
    }

    @Test
    public void testAuthor() {
        System.out.println("Author");
        doNothing().when(b).Author();
        b.Author();
        verify(b,times(1)).Author();
    }

    @Test
    public void testPublisher() {
        System.out.println("Publisher");
        doNothing().when(b).Publisher();
        b.Publisher();
        verify(b,times(1)).Publisher();
    }

    @Test
    public void testBookLoad() {
        System.out.println("BookLoad");
        doNothing().when(b).BookLoad();
        b.BookLoad();
        verify(b,times(1)).BookLoad();
    }
    
}

package Tester;

import LibraryManagement.Borrow;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * @author Israt Jahan Tonni
 */

public class BorrowTest {
    
    Borrow b;
    
    @Before
    public void setUp() throws Exception{
        b = Mockito.mock(Borrow.class);
    }

    @Test
    public void testConnect() {
        System.out.println("Connect");
        doNothing().when(b).Connect();
        b.Connect();
        verify(b,times(1)).Connect();
    }
    
    @Test
    public void testBook() {
        System.out.println("Book");
        doNothing().when(b).Book();
        b.Book();
        verify(b,times(1)).Book();
    }

    @Test
    public void testBorrowLoad() {
        System.out.println("BorrowLoad");
        doNothing().when(b).BorrowLoad();
        b.BorrowLoad();
        verify(b,times(1)).BorrowLoad();
    }
   
}

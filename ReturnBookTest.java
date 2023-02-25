package Tester;

import LibraryManagement.ReturnBook;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * @author Israt Jahan Tonni
 */

public class ReturnBookTest {
    
    ReturnBook r;
    ReturnBook rb;
    
    @Before
    public void setUp() throws Exception{
        r = new ReturnBook();
        rb = Mockito.mock(ReturnBook.class);
    }

    @Test
    public void testConnect() {
        System.out.println("Connect");
        doNothing().when(rb).Connect();
        rb.Connect();
        verify(rb,times(1)).Connect();
    }

    @Test
    public void testReturnLoad() {
        System.out.println("ReturnLoad");
        doNothing().when(rb).ReturnLoad();
        rb.ReturnLoad();
        verify(rb,times(1)).ReturnLoad();
    }

    @Test
    public void testCalculateFine() {
        System.out.println("calculateFine");
        int elaped = 5;
        int fee = 10;
        int expResult = 50;
        int result = r.calculateFine(elaped, fee);
        assertEquals(expResult, result);
    }

}

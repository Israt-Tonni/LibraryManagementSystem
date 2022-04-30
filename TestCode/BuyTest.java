package Tester;

import LibraryManagement.Buy;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * @author Israt Jahan Tonni
 */

public class BuyTest {
    
    Buy b;
    Buy bm;

    @Before
    public void setUp() throws Exception{
        b = new Buy();
        bm = Mockito.mock(Buy.class);
    }
    
    @Test
    public void testConnect() {
        System.out.println("Connect");
        doNothing().when(bm).Connect();
        bm.Connect();
        verify(bm,times(1)).Connect();
    }

    @Test
    public void testBookLoad() {
        System.out.println("BookLoad");
        doNothing().when(bm).BookLoad();
        bm.BookLoad();
        verify(bm,times(1)).BookLoad();
    }

    @Test
    public void testCalculateTotal() {
        System.out.println("calculateTotal");
        float price = 15;
        int quantity = 2;
        float expResult = 30;
        float result = b.calculateTotal(price, quantity);
        assertEquals(expResult, result, 0.0);
    }
    
}

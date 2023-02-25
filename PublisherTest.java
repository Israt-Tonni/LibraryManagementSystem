package Tester;

import LibraryManagement.Publisher;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * @author Israt Jahan Tonni
 */

public class PublisherTest {
    
    Publisher p;
    
    @Before
    public void setUp() throws Exception{
        p = Mockito.mock(Publisher.class);
    }

    @Test
    public void testConnect() {
        System.out.println("Connect");
        doNothing().when(p).Connect();
        p.Connect();
        verify(p,times(1)).Connect();
    }

    @Test
    public void testPublisherLoad() {
        System.out.println("PublisherLoad");
        doNothing().when(p).PublisherLoad();
        p.PublisherLoad();
        verify(p,times(1)).PublisherLoad();
    }
    
}

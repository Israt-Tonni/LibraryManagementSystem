package Tester;

import LibraryManagement.Author;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * @author Israt Jahan Tonni
 */

public class AuthorTest {
    
    Author a;
    
    @Before
    public void setUp() throws Exception{
        a = Mockito.mock(Author.class);
    }

    @Test
    public void testConnect() {
        System.out.println("Connect");
        doNothing().when(a).Connect();
        a.Connect();
        verify(a,times(1)).Connect();
    }

    @Test
    public void testAuthorLoad() {
        System.out.println("AuthorLoad");
        doNothing().when(a).AuthorLoad();
        a.AuthorLoad();
        verify(a,times(1)).AuthorLoad();
    }
    
}

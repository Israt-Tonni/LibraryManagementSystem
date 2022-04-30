package Tester;

import LibraryManagement.Login;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * @author Israt Jahan Tonni
 */

public class LoginTest {
    
    Login l;

    @Before
    public void setUp() throws Exception{
        l = new Login();
    }
    
    @Test
    public void testLoginFlag() {
        System.out.println("loginFlag");
        String username = "barha";
        String password = "barha";
        boolean expResult = true;
        boolean result = l.loginFlag(username, password);
        assertEquals(expResult, result);
    }
    
}

package Tester;

import LibraryManagement.Category;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * @author Israt Jahan Tonni
 */

public class CategoryTest {
    
    Category c;

    @Before
    public void setUp() throws Exception{
        c = Mockito.mock(Category.class);
    }

    @Test
    public void testConnect() {
        System.out.println("Connect");
        doNothing().when(c).Connect();
        c.Connect();
        verify(c,times(1)).Connect();
    }

    @Test
    public void testCategoryLoad() {
        System.out.println("CategoryLoad");
        doNothing().when(c).CategoryLoad();
        c.CategoryLoad();
        verify(c,times(1)).CategoryLoad();
    }
    
}

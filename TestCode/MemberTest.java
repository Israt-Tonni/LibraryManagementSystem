package Tester;

import LibraryManagement.Member;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * @author Israt Jahan Tonni
 */

public class MemberTest {
    
    Member m;
    
    @Before
    public void setUp() throws Exception{
        m = Mockito.mock(Member.class);
    }

    @Test
    public void testConnect() {
        System.out.println("Connect");
        doNothing().when(m).Connect();
        m.Connect();
        verify(m,times(1)).Connect();
    }

    @Test
    public void testMemberLoad() {
        System.out.println("MemberLoad");
        doNothing().when(m).MemberLoad();
        m.MemberLoad();
        verify(m,times(1)).MemberLoad();
    }
    
}
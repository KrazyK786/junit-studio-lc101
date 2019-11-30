package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets test_class;

    @Before
    public void setBalancedBrackets(){
        test_class = new BalancedBrackets();
    }

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testOnlyBracketsReturnsTrue(){
        assertTrue(test_class.hasBalancedBrackets("[]"));
    }

    @Test
    public void testWordWrapedBracketsReturnsTrue(){
        assertTrue(test_class.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void testWordWrappedBracketsInStringReturnsTrue(){
        assertTrue(test_class.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testBracketsBeforeStringReturnsTrue(){
        assertTrue(test_class.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void testNoBracketsReturnsTrue(){
        assertTrue(test_class.hasBalancedBrackets(""));
    }

    @Test
    public void testMultiplePairedBracketsReturnTrue(){
        assertTrue(test_class.hasBalancedBrackets("[][][]"));
    }

    @Test
    public void testStringWithOneBracketReturnsFalse(){
        assertFalse(test_class.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testUnbalancedBracketsInStringReturnsFalse(){
        assertFalse(test_class.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testOneBracketReturnFalse(){
        assertFalse(test_class.hasBalancedBrackets("["));
    }

    @Test
    public void testBackwardsBracketsReturnsFalse(){
        assertFalse(test_class.hasBalancedBrackets("]["));
    }

    @Test
    public void testBrokenBracketPairsReturnFalse(){
        assertFalse(test_class.hasBalancedBrackets("[[]]"));
    }

}

package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void openedAndClosedBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public  void stringInsideBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Vasilika"));
    }

    @Test
    public void nestedBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void onlyOpenBracketRetrunsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void bracketsInWrongOrderReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}

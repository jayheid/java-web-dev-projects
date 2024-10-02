package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void ReturnsTrueWithOtherChar () {
        assertTrue(BalancedBrackets.hasBalancedBrackets( "[word]"));
    }
    @Test
    public void RetunrsFalseWithOtherChar () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]word["));
    }
    @Test
    public void MultipleBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] [] []"));
    }
    @Test
    public void FalseMultipleBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][ ][ ]["));
    }
    @Test
    public void MixMatchBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void MixedBrackets () {
        assertFalse((BalancedBrackets.hasBalancedBrackets("[]]")));
    }
    @Test
    public void  StringNoBracker () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("word"));
    }
    @Test
    public void OneClosing () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void OneOpening () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void StringOpening () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("word]"));
    }
    @Test
    public void StringClosing () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[word"));
    }
    @Test
    public void MixStringBracket () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[wo][rd"));
    }
}

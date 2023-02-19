package test.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {
    ValidPalindrome checker;
    @Before
    public void init(){
        checker = new ValidPalindrome();
    }
    @Test
    public void isPalindrome_WithEmptyString_Test() {
        String text = "";
        assertTrue(checker.isPalindrome(text));
    }
    @Test
    public void isPalindrome_WithOneLetter_Test() {
        String text = "A";
        assertTrue(checker.isPalindrome(text));
    }
    @Test
    public void isPalindrome_WithOneSpace_Test() {
        String text = " ";
        assertTrue(checker.isPalindrome(text));
    }

    @Test
    public void isPalindrome_WithOnlySpaces_Test() {
        String text = "        ";
        assertTrue(checker.isPalindrome(text));
    }
    @Test
    public void isPalindrome_WithOnlyNotLetters_Test() {
        String text = ">#$!%@^$#!@!";
        assertTrue(checker.isPalindrome(text));
    }
    @Test
    public void isPalindrome_WithNumbers_Test() {
        String text = "1234321";
        assertTrue(checker.isPalindrome(text));
    }
    @Test
    public void isPalindrome_WithPolindromeText_Test() {
        String text = "a man, a plan, a canal: panama";
        assertTrue(checker.isPalindrome(text));
    }
    @Test
    public void isPalindrome_WithNotPolindromeText_Test() {
        String text = "race, a car";
        assertFalse(checker.isPalindrome(text));
    }
    @Test
    public void isPalindrome_WithMixedTextCases_Test() {
        String text = "anotherREHTONA";
        assertTrue(checker.isPalindrome(text));
    }
}
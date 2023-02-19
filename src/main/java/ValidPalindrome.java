package main.java;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String originalOnlyLettersAndNumbers = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversed = new StringBuilder(originalOnlyLettersAndNumbers).reverse().toString().toLowerCase();
        return originalOnlyLettersAndNumbers.equals(reversed);
    }
}

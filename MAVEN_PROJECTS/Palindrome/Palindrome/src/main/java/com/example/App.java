package com.example;

/**
 * Palindrome Number Check
 */
public class App {
    public static void main(String[] args) {
        int num = 12321; // Number to check
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }
    }
}


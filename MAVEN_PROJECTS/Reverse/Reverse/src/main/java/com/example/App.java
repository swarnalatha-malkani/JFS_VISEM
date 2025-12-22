package com.example;

/**
 * Reverse Number Example
 */
public class App {
    public static void main(String[] args) {
        int num = 12345; // Number to reverse
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // Get last digit
            reversed = reversed * 10 + digit; // Add digit to reversed
            num = num / 10; // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}

package com.example;

/**
 * Fibonacci Series Example
 */
public class App {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + n + " numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}


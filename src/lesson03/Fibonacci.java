package lesson03;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.print("Fibonacci for -1: ");
        printFibonacciNumbers(-1);
        System.out.print("Fibonacci for 0: ");
        printFibonacciNumbers(0);
        System.out.print("Fibonacci for 1: ");
        printFibonacciNumbers(1);
        System.out.print("Fibonacci for 4: ");
        printFibonacciNumbers(4);
        System.out.print("Fibonacci for 7: ");
        printFibonacciNumbers(7);

    }
    public static void printFibonacciNumbers(int num) {

             if ((num == -1) | (num == 0))
                 System.out.println("Please enter a positive number more than 0");
             else {

             int fib = 0;
             int fib1 = 0;
             int fib2 = 1;
             System.out.print(fib1 + ", ");
                 for (int i = 1; i < num; i++) {
                     fib = fib2 + fib1;
                     System.out.print(fib + ", ");
                     fib2 = fib1;
                     fib1 = fib;
                 }
             }
    }
}

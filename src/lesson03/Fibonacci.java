package lesson03;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Please enter a positive number more than 0: ");
          num = scanner.nextInt();
        } while (num <= 0);
        printFibonacciNumbers(num);
    }

    public static void printFibonacciNumbers(int num) {

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

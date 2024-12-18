package Basics;

import java.util.*;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return fib(n - 1) + fib(n - 2);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = fib(n);
        System.out.println(result);
        scanner.close();

    }

}
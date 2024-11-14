//Factorial of a number

package Basics;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial=1;
        while(n>0){
            factorial *= n;
            n--;
        }

        System.out.println("Factorial of 5 is: "+factorial);
        sc.close();
    }
}

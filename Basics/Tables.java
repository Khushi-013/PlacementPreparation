package Basics;

import java.util.*;

public class Tables {
    static void printTable(int n){
        int multiplier=10;
        while(multiplier>0){
            System.out.print(n*multiplier+" ");
            multiplier = multiplier-1;
        }

        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTable(n);
        sc.close();
    }
}

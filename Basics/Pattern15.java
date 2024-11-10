//reverse letter triangle pattern

package Basics;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0; i<n; i++){
            for(char ch='A'; ch<='A'+(n-i-1); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
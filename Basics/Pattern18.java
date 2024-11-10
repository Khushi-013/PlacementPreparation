//alpha-triangle pattern

package Basics;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // for(int i=0; i<n; i++){
        //     for(char ch=(char)(int)('A'+n-1-i); ch<=(char)(int)('A'+n-1); ch++){
        //         System.out.print(ch+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=1; i<=n; i++){
            char ch=(char)('A'+n);
            for(int j=1; j<=i; j++){
                ch--;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
package Array;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Taking input for the array elements
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println(isSorted(a, n));
    }
    static boolean isSorted(int a[], int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[j]<a[i]){
                    return false;
                }

            }
        }
                return true;
    }
}

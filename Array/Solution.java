package Array;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
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

        // Getting the second largest and second smallest elements
        int[] result = getSecondOrderElements(n, a);
        System.out.println("Second Largest: " + result[0]);
        System.out.println("Second Smallest: " + result[1]);

        scanner.close();
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        int slargest = secondLargest(n, a);
        int ssmallest = secondSmallest(n, a);
        return new int[]{slargest, ssmallest};
    }

    // Function to find the second largest element
    public static int secondLargest(int n, int[] a) {
        int largest = a[0];
        int slargest = -1;

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                slargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > slargest) {
                slargest = a[i];
            }
        }
        return slargest;
    }

    // Function to find the second smallest element
    public static int secondSmallest(int n, int[] a) {
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                ssmallest = smallest;
                smallest = a[i];
            } else if (a[i] != smallest && a[i] < ssmallest) {
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }
}

package BinaryTree;

import java.util.*;

public class BinarySearch {

    public static int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) return -1; //Base case.

        // Perform the steps:
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) return mid;
        else if (target > nums[mid])
            return binarySearch(nums, mid + 1, high, target);
        return binarySearch(nums, low, mid - 1, target);
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static void main(String[] args) {
        
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        if(sc.hasNextInt()){
            n = sc.nextInt();
        }

        int[] arr = new int[n];
        
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
            }
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        int ind = search(arr, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);

            sc.close();
    }
}
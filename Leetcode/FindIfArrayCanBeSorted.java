// You are given a 0-indexed array of positive integers nums.

// In one operation, you can swap any two adjacent elements if they have the same number of 
// set bits
// . You are allowed to do this operation any number of times (including zero).

// Return true if you can sort the array, else return false.


// A set bit refers to a bit in the binary representation of a number that has a value of 1.

package Leetcode;

import java.util.Scanner;

class Solution {
    public boolean canSortArray(int[] nums) {
        int prevMax = Integer.MIN_VALUE;  // Maximum of previous set bit group
        int currMax = nums[0];            // Maximum of current set bit group
        int currMin = nums[0];            // Minimum of current set bit group
        int setBits = Integer.bitCount(nums[0]); // Set bits of current group

        for (int i = 1; i < nums.length; i++) {
            if (setBits == Integer.bitCount(nums[i])) {
                // If in the same set bit group, update min and max
                currMax = Math.max(currMax, nums[i]);
                currMin = Math.min(currMin, nums[i]);
            } else {
                // Check if the previous group's max is greater than current group's min
                if (currMin < prevMax) return false;
                
                // Move to the new set bit group
                prevMax = currMax;
                setBits = Integer.bitCount(nums[i]);
                currMin = nums[i];
                currMax = nums[i];
            }
        }
        
        // Final check for last set bit group
        return currMin > prevMax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();  // Size of the array
        int[] nums = new int[n];    // Initialize the array

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();  // Read each element
        }

        Solution solution = new Solution();
        boolean result = solution.canSortArray(nums);

        if (result) {
            System.out.println("The array can be sorted.");
        } else {
            System.out.println("The array cannot be sorted.");
        }

        scanner.close();
    }
}

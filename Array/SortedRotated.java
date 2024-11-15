package Array;

import java.util.Scanner;

public class SortedRotated {

    private static boolean check(int[] nums){
            int count = 0;
            for(int i=1; i<nums.length; i++){
                if(nums[i]<nums[i-1]){
                    count++;
                }
            }
            if(nums[nums.length-1]>nums[0]){
                count++;
            }
            return count<=1;
        }
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            System.out.println("Enter the elements of the array:");
            int nums[] = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
    
            scanner.close();
    
            System.out.println(check(nums));
    }
}

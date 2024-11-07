// Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.

package BinaryTree;

import java.util.*;

public class upperBound {
    public static int ub(int[] arr, int x, int n){
        int low=0, high=n-1;
        int ans=n;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        
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

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        int ind = ub(arr, x, n);
        System.out.println("The upper bound is the index: "+ind);
    }
}

package BinaryTree;

import java.util.Scanner;

public class lastOccurrence {
    public static int solve(int n, int key, int[] arr){
        int low=0, high=n-1;
        int res=-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                res=mid;
                low=mid+1;
            }else if(key<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
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

        System.out.println("Enter the value of key: ");
        int key = sc.nextInt();

        System.out.println(solve(n, key, arr));
    }
}

package Array;

import java.util.Scanner;

class SecondLargest{
    static private void getElements(int[] arr, int n){
        if(n==0||n==1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for(i=0; i<n; i++){
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for(i=0; i<n; i++){
            if(arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];
            }
            if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }
        }
        System.out.println("Second smallest is "+second_small);
        System.out.println("Second largest is "+second_large);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
        }
        getElements(arr, n);
        sc.close();
    }
}
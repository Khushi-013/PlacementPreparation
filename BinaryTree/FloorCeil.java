package BinaryTree;

import java.util.*;

public class FloorCeil {
    static int findFloor(int[] arr, int n, int x){
        int low=0, high=n-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    static int findCeil(int[] arr, int n, int x){
        int low=0, high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static int[] getFloorAndCeil(int[] arr, int n, int x){
        int f = findFloor(arr, n, x);
        int c = findCeil(arr, n, x);
        return new int[] {f,c};
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

        int[] ans = getFloorAndCeil(arr, n, x);
        System.out.println("The floor and ceil are: "+ans[0]+" "+ans[1]);
    }
}

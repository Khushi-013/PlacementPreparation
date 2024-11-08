package Basics;

public interface LoopOptimization {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int target=6;

        for(int num:numbers){
            if(num==target){
                System.out.println("Target found: "+target);
                break;
            }
            System.out.println("Checking: "+num);
        }

        for(int num: numbers){
            if(num%2==0){
                continue;
            }
            System.out.println("Odd number: "+num);
        }
    }
}
    
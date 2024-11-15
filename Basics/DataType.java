package Basics;

import java.util.*;
class DataType{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.close();
        while(T-- > 0){
            sc.nextLine();
            String s = sc.next();
            int ans = Solution.dataTypeSize(s);
            String Character = "Character";
            if(Character.equals(s) && ans==2){
                ans=1;
            }
            System.out.println(ans);
System.out.println("~");
        }
    }
}
class Solution {
    static int dataTypeSize(String str) {
        // code here
        if(str.equals("Character")) return 1;
        else if(str.equals("Integer")||str.equals("Float")) return 4;
        else if(str.equals("Long")||str.equals("Double")) return 8;
        else return -1;
    }
}
package Day_3;

import java.util.Stack;

//URL : https://leetcode.com/problems/132-pattern/
public class P132Pattern {
    public static boolean find132pattern(int[] nums) {
        Stack<Integer> stk =new Stack<Integer>();
        int k = Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--)  {
            if(nums[i]<k) {
                return true;
            }
            while(!stk.isEmpty() && stk.peek()<nums[i]) {
                k = stk.pop();
            }
            stk.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(find132pattern(new int[] {1,2,3,4})); //false
        System.out.println(find132pattern(new int[] {3,1,4,2})); //true
        System.out.println(find132pattern(new int[] {-1,3,2,0})); // true
    }
}

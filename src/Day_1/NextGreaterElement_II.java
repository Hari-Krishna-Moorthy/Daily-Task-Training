package Day_1;
//URL : https://leetcode.com/problems/next-greater-element-ii/

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement_II {
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length-1 ; i >= 0 ; i--)
            stack.push(nums[i]);
        int[] res = new int[nums.length];
        for(int i = nums.length-1 ; i >= 0 ; i--){
            if(stack.isEmpty()) res[i] = -1;
            else if(stack.peek() > nums[i]) res[i] = stack.peek();
            else {
                while(!stack.isEmpty() && stack.peek() <= nums[i]) stack.pop();
                if(stack.isEmpty()) res[i] = -1;
                else res[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElements(new int[] {1,2,1})));
        System.out.println(Arrays.toString(nextGreaterElements(new int[] {1,2,3,4,3})));
    }
}

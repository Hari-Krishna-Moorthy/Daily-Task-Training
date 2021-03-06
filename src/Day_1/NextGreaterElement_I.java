package Day_1;

//URL : https://leetcode.com/problems/next-greater-element-i/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement_I {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<Integer>();
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();

        stk.push(0);
        for(int i=1;i<nums2.length;i++) {
            while(!stk.empty() && nums2[i] > nums2[stk.peek()]) {
                values.put(nums2[stk.pop()], nums2[i]);
            }
            stk.push(i);
        }
        while(!stk.empty()) {
            values.put(nums2[stk.pop()], -1);
        }
        for(int i=0;i<nums1.length;i++) {
            nums1[i] = values.get(nums1[i]);
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] res = null;

        res = nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2});
        System.out.println(Arrays.toString(res));

        res = nextGreaterElement(new int[] {2,4}, new int[] {1,2,3,4});
        System.out.println(Arrays.toString(res));

    }
}

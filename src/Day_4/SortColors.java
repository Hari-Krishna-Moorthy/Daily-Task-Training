package Day_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public static void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 0);
        map.put(2, 0);
        for(int num : nums) {
            map.put(num, map.get(num)+1);
        }
        int i=0;
        for(;i<map.get(0);i++)
            nums[i] = 0;
        for(;i<map.get(0)+map.get(1);i++)
            nums[i] = 1;
        for(;i<map.get(0)+map.get(1)+map.get(2);i++)
            nums[i] = 2;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{2, 0, 1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

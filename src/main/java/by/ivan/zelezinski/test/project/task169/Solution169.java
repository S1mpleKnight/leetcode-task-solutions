package by.ivan.zelezinski.test.project.task169;

import java.util.HashMap;
import java.util.Map;

public class Solution169 {
    public int majorityElement(int[] nums) {
        if (nums.length < 3) {
            return nums[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }
}

// easiest solution
//class Solution {
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }
//}
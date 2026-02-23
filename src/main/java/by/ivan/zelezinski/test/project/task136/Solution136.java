package by.ivan.zelezinski.test.project.task136;

import java.util.HashMap;

public class Solution136 {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        HashMap<Integer, Boolean> map = new HashMap<>((nums.length / 2) + 1);
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, true);
            } else {
                map.put(num, false);
            }
        }
        return map.entrySet().stream().filter(entry -> !entry.getValue()).findFirst().get().getKey();
    }

//      XOR solution
//    public int singleNumber(int[] nums) {
//        int index=0;
//        for(int i=0;i<nums.length;i++){
//            index=index^nums[i];
//        }
//
//        return index;
//    }

}

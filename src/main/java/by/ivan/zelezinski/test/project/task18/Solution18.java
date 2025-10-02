package by.ivan.zelezinski.test.project.task18;

import java.util.*;

public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[k];
                    if (sum == target) {
                        result.add(List.of(nums[i], nums[j], nums[l], nums[k]));
                        k++;
                    }
                    if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return result.stream().toList();
    }
}

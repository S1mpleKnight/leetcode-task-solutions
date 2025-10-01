package by.ivan.zelezinski.test.project.task16;

import java.util.Arrays;

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int result = Integer.MAX_VALUE;
        int lastDifference = Integer.MAX_VALUE;
        for (int k = 0; k < nums.length - 1; k++) {
            int i = k + 1;
            int j = nums.length - 1;

            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];
                int difference = target - sum;
                if (Math.abs(difference) < Math.abs(lastDifference)) {
                    result = sum;
                    lastDifference = difference;
                }
                if (sum < target){
                    i++;
                } else {
                    j--;

                }

            }
        }
        return  result;
    }
}

package by.ivan.zelezinski.test.project.task35;

public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (target <= nums[0]) {
                return 0;
            } else {
                return 1;
            }
        }
        if (target <= nums[0]) {
            return 0;
        }
        if (target == nums[nums.length - 1]) {
            return nums.length - 1;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int pivot = (l + r) / 2;
            if (target == nums[pivot]) {
                return pivot;
            }
            if (target < nums[pivot + 1] && target > nums[pivot]) {
                return pivot + 1;
            }
            if (target > nums[pivot]) {
                l = pivot;
            } else {
                r = pivot;
            }
        }
        return -1;
    }
}

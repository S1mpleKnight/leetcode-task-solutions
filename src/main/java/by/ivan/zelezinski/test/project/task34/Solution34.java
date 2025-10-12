package by.ivan.zelezinski.test.project.task34;

public class Solution34 {

    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[]{ -1, -1};
        }

        if (nums.length == 1) {
            return nums[0] == target
                    ? new int[]{0, 0}
                    : new int[]{-1, -1};
        }

        int l = 0, r = nums.length - 1;
        int index = -1;
        while (l <= r) {
            int pivot = (l + r) / 2;
            if (target == nums[pivot]) {
                index = pivot;
                break;
            } else if (target > nums[pivot]) {
                l = pivot + 1;
            } else {
                r = pivot - 1;
            }
        }

        if (index == -1) {
            return new int[] {-1, -1};
        }

        int start = index;
        int end = index;

        while (start >= 0 && nums[start] == target) {
            start--;
        }
        start++;

        while (end <= nums.length - 1 && nums[end] == target) {
            end++;
        }
        end--;

        return new int[] {start, end};
    }
}

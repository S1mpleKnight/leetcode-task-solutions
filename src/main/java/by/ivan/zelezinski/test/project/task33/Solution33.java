package by.ivan.zelezinski.test.project.task33;

public class Solution33 {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        int k = findK(nums, 0, nums.length-1);

        if (k == -1) {
            return binarySearch(nums, target, 0, nums.length-1);
        } else {
            int left = binarySearch(nums, target, 0, k - 1);
            return left == -1
                    ? binarySearch(nums, target, k, nums.length-1)
                    : left;

        }
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        int l = left, r = right;
        while (l <= r) {
            if (nums[l] > target) {
                return -1;
            }
            if (nums[r] < target) {
                return -1;
            }
            int pivot = (l + r) / 2;
            if (nums[pivot] == target) {
                return pivot;
            } else if (nums[pivot] > target) {
                r = pivot - 1;
            } else {
                l = pivot + 1;
            }
        }
        return -1;
    }

    private int findK(int[] nums, int left, int right) {
        if (left >= right) {
            return -1;
        }
        int pivot = (left + right) / 2;
        if (nums[pivot] > nums[pivot + 1]) {
            return pivot + 1;
        }
        if (left + 1 == right) {
            return -1;
        }
        int leftPart = findK(nums, left, pivot);
        if (leftPart != -1) {
            return leftPart;
        }
        return findK(nums, pivot, right);
    }
}

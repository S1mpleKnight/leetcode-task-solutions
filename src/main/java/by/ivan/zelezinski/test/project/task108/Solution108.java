package by.ivan.zelezinski.test.project.task108;

import by.ivan.zelezinski.test.project.task100.TreeNode;

public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        return build(nums, 0, nums.length - 1);

    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;

        TreeNode build = build(nums, left, mid - 1);
        TreeNode build1 = build(nums, mid + 1, right);

        return new TreeNode(nums[mid],build, build1);
    }
}


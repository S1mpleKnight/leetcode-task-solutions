package by.ivan.zelezinski.test.project.task112;

import by.ivan.zelezinski.test.project.task100.TreeNode;

public class Solution112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return checkSum(root, targetSum);
    }

    private boolean checkSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return Math.abs(targetSum - root.val) == 0;
        } else {
            boolean b = checkSum(root.left, targetSum - root.val);
            boolean b1 = checkSum(root.right, targetSum - root.val);
            return b || b1;
        }
    }
}

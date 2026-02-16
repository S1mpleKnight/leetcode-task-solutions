package by.ivan.zelezinski.test.project.task110;

import by.ivan.zelezinski.test.project.task100.TreeNode;

public class Solution110 {
    public static boolean check = true;

    public boolean isBalanced(TreeNode root) {
        check = true;
        if (root == null || (root.left == null && root.right == null)) {
            return check;
        }
        int amount = difAmount(root);
        return check;
    }

    private int difAmount(TreeNode node) {
        if (!check) {
            return -1;
        }
        if (node == null) {
            return 0;
        }
        int leftDif = difAmount(node.left);
        int rightDif = difAmount(node.right);
        if (Math.abs(leftDif - rightDif) > 1) {
            check = false;
        }
        return Math.max(leftDif, rightDif) + 1;
    }

}

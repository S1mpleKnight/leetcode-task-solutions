package by.ivan.zelezinski.test.project.task111;

import by.ivan.zelezinski.test.project.task100.TreeNode;

public class Solution111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return calculateMin(root, 0);
    }

    private int calculateMin(TreeNode treeNode, int pointer) {
        if (treeNode == null) {
            return 0;
        }
        if (treeNode.right == null && treeNode.left == null) {
            return pointer + 1;
        }

        int i = calculateMin(treeNode.left, pointer);
        int j = calculateMin(treeNode.right, pointer);
        if (i == 0 && j == 0) {
            return 1;
        }
        if (i == 0) {
            return j + 1;
        } else if (j == 0){
            return i + 1;
        }
        return Math.min(i, j) + 1;

    }
}
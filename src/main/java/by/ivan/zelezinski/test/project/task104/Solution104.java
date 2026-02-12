package by.ivan.zelezinski.test.project.task104;

import by.ivan.zelezinski.test.project.task100.TreeNode;

public class Solution104 {
    public int maxDepth(TreeNode root) {
        return calculateMaxSize(root, 0);
    }

    private int calculateMaxSize(TreeNode node, int currentAmount) {
        if (node == null) {
            return currentAmount;
        }
        currentAmount++;
        int leftSize = calculateMaxSize(node.left, currentAmount);
        int rightSize = calculateMaxSize(node.right, currentAmount);
        return Math.max(leftSize, rightSize);
    }
}

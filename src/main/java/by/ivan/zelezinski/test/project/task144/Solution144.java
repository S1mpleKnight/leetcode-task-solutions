package by.ivan.zelezinski.test.project.task144;

import by.ivan.zelezinski.test.project.task100.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        ArrayList<Integer> integers = new ArrayList<>();
        visitNode(root, integers);
        return integers;
    }

    private void visitNode(TreeNode node, List<Integer> numbers) {
        if (node == null) {
            return;
        }
        numbers.add(node.val);
        visitNode(node.left, numbers);
        visitNode(node.right, numbers);
    }
}

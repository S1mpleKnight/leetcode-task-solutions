package by.ivan.zelezinski.test.project.task145;

import by.ivan.zelezinski.test.project.task100.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
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
        visitNode(node.left, numbers);
        visitNode(node.right, numbers);
        numbers.add(node.val);
    }
}

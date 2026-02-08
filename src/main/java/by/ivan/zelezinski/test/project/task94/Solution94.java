package by.ivan.zelezinski.test.project.task94;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        checkChild(root, integers);
        return integers;
    }

    private void checkChild(TreeNode node, ArrayList<Integer> integers) {
        if (Objects.isNull(node)) {
            return;
        }
        if (node.left != null) {
            checkChild(node.left, integers);
        }
        integers.add(node.val);
        if (node.right != null) {
            checkChild(node.right, integers);
        }
    }
}

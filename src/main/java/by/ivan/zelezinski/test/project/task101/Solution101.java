package by.ivan.zelezinski.test.project.task101;

import by.ivan.zelezinski.test.project.task100.TreeNode;

import java.util.Objects;

public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isNodeEqual(root.right, root.left);
    }

    private boolean isNodeEqual(TreeNode p, TreeNode q) {
        boolean pNu = Objects.isNull(p);
        boolean aN = Objects.isNull(q);
        if (pNu != aN) {
            return false;
        }
        if (!pNu) {
            if (p.val != q.val) {
                return false;
            } else {
                return isNodeEqual(p.left, q.right) && isNodeEqual(p.right, q.left);
            }
        } else {
            return true;
        }
    }
}

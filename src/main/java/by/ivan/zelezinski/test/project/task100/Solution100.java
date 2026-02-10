package by.ivan.zelezinski.test.project.task100;

import java.util.Objects;

public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isNodeEqual(p, q);
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
                return isNodeEqual(p.left, q.left) && isNodeEqual(p.right, q.right);
            }
        } else {
            return true;
        }
    }

}

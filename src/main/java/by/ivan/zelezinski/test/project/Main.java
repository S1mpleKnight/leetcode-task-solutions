package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task100.TreeNode;
import by.ivan.zelezinski.test.project.task101.Solution101;

public class Main {
    public static void main(String[] args) {
        TreeNode f = new TreeNode(3);
        TreeNode s = new TreeNode(3);
        TreeNode t = new TreeNode(4);
        TreeNode fo = new TreeNode(4);
        TreeNode fi = new TreeNode(2, t, f);
        TreeNode si = new TreeNode(2, fo, s);
        TreeNode se = new TreeNode(1, si, fi);
        Solution101 solution101 = new Solution101();
        solution101.isSymmetric(se);

    }
}
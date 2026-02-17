package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task100.TreeNode;
import by.ivan.zelezinski.test.project.task111.Solution111;
import by.ivan.zelezinski.test.project.task112.Solution112;

public class Main {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        TreeNode treeNode1 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(8, null, treeNode1);
        TreeNode treeNode3 = new TreeNode(9, treeNode, treeNode2);

        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5, null, treeNode4);
        TreeNode treeNode6 = new TreeNode(1);
        TreeNode treeNode7 = new TreeNode(2, null, treeNode6);
        TreeNode treeNode8 = new TreeNode(3, treeNode5, treeNode7);
        TreeNode treeNode9 = new TreeNode(6, treeNode3, treeNode8);
        System.out.println(new Solution112().hasPathSum(treeNode9, 11));
    }
}
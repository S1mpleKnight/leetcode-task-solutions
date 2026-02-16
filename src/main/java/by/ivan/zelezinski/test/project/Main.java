package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task100.TreeNode;
import by.ivan.zelezinski.test.project.task110.Solution110;

public class Main {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(7);
        TreeNode treeNode1 = new TreeNode(15);
        TreeNode treeNode2 = new TreeNode(20, treeNode, treeNode1);
        TreeNode treeNode3 = new TreeNode(9);
        TreeNode treeNode4 = new TreeNode(3, treeNode3, treeNode2);
//        System.out.println(new Solution110().isBalanced(treeNode4));

        System.out.println(new Solution110().isBalanced(new TreeNode(1, new TreeNode(2), null)));
    }
}
package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task100.TreeNode;
import by.ivan.zelezinski.test.project.task111.Solution111;

public class Main {

    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(7);
//        TreeNode treeNode1 = new TreeNode(15);
//        TreeNode treeNode2 = new TreeNode(20, treeNode, treeNode1);
//        TreeNode treeNode3 = new TreeNode(9);
//        TreeNode treeNode4 = new TreeNode(3, treeNode3, treeNode2);
//        System.out.println(new Solution111().minDepth(treeNode4));
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(3, treeNode, null);
        TreeNode treeNode2 = new TreeNode(4, treeNode1, null);
        TreeNode treeNode3 = new TreeNode(5, treeNode2, null);
        TreeNode treeNode4 = new TreeNode(6, treeNode3, null);
        TreeNode treeNode5 = new TreeNode(7, treeNode4, null);
        System.out.println(new Solution111().minDepth(treeNode5));
    }
}
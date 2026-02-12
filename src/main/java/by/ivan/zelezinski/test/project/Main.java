package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task100.TreeNode;
import by.ivan.zelezinski.test.project.task108.Solution108;

public class Main {
    public static void main(String[] args) {
        Solution108 solution108 = new Solution108();
        int[] array = new int[] {
                -10,-9,-8,-7,-6,-5,-4,-3,-2,-1
        };
        TreeNode treeNode = solution108.sortedArrayToBST(array);
        System.out.println(treeNode);
    }
}
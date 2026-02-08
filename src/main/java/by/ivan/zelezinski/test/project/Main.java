package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task88.Solution88;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums11 = new int[]{2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0};
        int[] nums12 = new int[]{1,1,1,1,1,1,1,1,3};
        int m = 8;
        int n = 9;
        Solution88 solution88 = new Solution88();
        solution88.merge(nums11,m, nums12, n);
        System.out.println(Arrays.toString(nums11));
        System.out.println(Arrays.toString(nums12));
    }
}
package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task31.Solution31;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        int[] array = new int[] {
               5,1,1
        };
        System.out.println(Arrays.toString(array));
        solution31.nextPermutation(array);
        System.out.println(Arrays.toString(array));
        solution31.nextPermutation(array);
        System.out.println(Arrays.toString(array));
    }
}
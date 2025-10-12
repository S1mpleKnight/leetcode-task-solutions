package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task34.Solution34;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();

        int[] array = new int[] {
                5,10
        };
        int target = 10;
        System.out.println(Arrays.toString(solution34.searchRange(array, target)));
    }
}
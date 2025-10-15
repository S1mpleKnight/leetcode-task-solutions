package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task40.Solution40;

public class Main {
    public static void main(String[] args) {
        Solution40 solution40 = new Solution40();

        int[] candidates = new int[] {

                10,1,2,7,6,1,5        };
        int target = 8;

        System.out.println(solution40.combinationSum2(candidates, target));
    }
}
package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task39.Solution39;

public class Main {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();

        int[] candidates = new int[] {
                8,6,7,9
        };
        int target = 5;

        System.out.println(solution39.combinationSum(candidates, target));
    }
}
package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task35.Solution35;

public class Main {
    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        int[] array = new int[] {
                1,3,5,6,10,12,14,20,35,80
        };
        int target = 23;
        System.out.println(solution35.searchInsert(array, target));
    }
}
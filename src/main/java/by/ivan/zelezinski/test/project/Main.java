package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task26.Solution26;

public class Main {
    public static void main(String[] args) {

        Solution26 solution26 = new Solution26();
        int[] array = new int[] {
                1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 7
        };
        System.out.println(solution26.removeDuplicates(array));
    }
}
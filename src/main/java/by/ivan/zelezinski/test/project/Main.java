package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task27.Solution27;

public class Main {
    public static void main(String[] args) {

        Solution27 solution27 = new Solution27();
        int[] array = new int[] {
//                1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 7
                3,2,2,3
        };
        System.out.println(solution27.removeElement(array, 3));
    }
}
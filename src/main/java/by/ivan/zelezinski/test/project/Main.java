package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task41.Solution41;

public class Main {
    public static void main(String[] args) {
        Solution41 solution41 = new Solution41();
        int[] ints = {
                1,2,2,1,3,1,0,4,0
        };

        System.out.println(solution41.firstMissingPositive(ints));

    }
}
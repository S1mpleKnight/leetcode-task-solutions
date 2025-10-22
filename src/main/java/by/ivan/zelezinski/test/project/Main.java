package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task42.Solution42;

public class Main {
    public static void main(String[] args) {

        Solution42 solution42 = new Solution42();
        int[] trap = new int[]{
                0,1,0,2,1,0,1,3,2,1,2,1
        };
        System.out.println(solution42.trap(trap));
    }
}
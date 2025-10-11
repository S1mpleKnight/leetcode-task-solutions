package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task32.Solution32;

public class Main {
    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();
        String s = "((()((())";
        System.out.println(solution32.longestValidParentheses(s));
    }
}
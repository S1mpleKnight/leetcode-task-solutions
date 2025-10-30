package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task43.Solution43;
import by.ivan.zelezinski.test.project.task44.Solution44;

public class Main {
    public static void main(String[] args) {

        Solution44 solution44 = new Solution44();
        String s ="a";
        String p ="*a*";
        System.out.println(solution44.isMatch(s, p));
    }
}
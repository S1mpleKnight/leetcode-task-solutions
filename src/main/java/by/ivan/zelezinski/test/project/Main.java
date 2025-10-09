package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task30.Solution30;

public class Main {
    public static void main(String[] args) {
        Solution30 solution30 = new Solution30();

        String s = "wordgoodgoodgoodbestword";
        String[] words = new String[] {
                "word","good","best","good"
        };

        System.out.println(solution30.findSubstring(s, words));
    }
}
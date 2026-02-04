package by.ivan.zelezinski.test.project.task58;

public class Solution58 {
    public int lengthOfLastWord(String s) {

        if (s.length() == 1) {
            return s.equals(" ") ? 0 : 1;
        }
        short counter = 0;
        short pointer = (short) (s.length() - 1);
        while (pointer >= 0 && s.charAt(pointer) == ' ') {
            pointer--;
        }
        if (pointer == -1) return 0;
        while (pointer >= 0 && s.charAt(pointer) != ' ') {
            counter++;
            pointer--;
        }
        return counter;
    }
}

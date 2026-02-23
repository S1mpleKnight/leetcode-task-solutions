package by.ivan.zelezinski.test.project.task125;

public class Solution125 {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        String lowerCase = s.toLowerCase();
        short i = 0;
        short j = (short) (s.length() - 1);
        while (i <= j) {
            while (i < s.length() && !isValidLetter(lowerCase.charAt(i))) {
                i++;
            }
            while (j >=0 && !isValidLetter(lowerCase.charAt(j))) {
                j--;
            }
            if (i >= j) {
                return true;
            } else {
                if (lowerCase.charAt(i) != lowerCase.charAt(j)) {
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return true;
    }

    private boolean isValidLetter(char symbol) {
        return (symbol >= 48 && symbol <= 57)
                || (symbol >= 97 && symbol <= 122);
    }
}

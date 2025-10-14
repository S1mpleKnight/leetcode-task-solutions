package by.ivan.zelezinski.test.project.task38;

public class Solution38 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        return RLE("11", 3, n);
    }

    private String RLE(String input, int currentPointer, int endPoiner) {
        String currentInput = input;
        while (currentPointer <= endPoiner) {
            currentInput = calculatePart(currentInput);
            currentPointer++;
        }
        return currentInput;
    }

    private String calculatePart(String input) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char currentChar = 0;
        int currentCharCounter = 0;
        while (i < input.length()) {
            char c = input.charAt(i);
            if (currentChar == 0) {
                currentChar = c;
                currentCharCounter++;
            } else if (currentChar == c){
                currentCharCounter++;
            } else {
                sb.append(currentCharCounter).append(currentChar);
                currentChar = c;
                currentCharCounter = 1;
            }
            i++;
        }
        sb.append(currentCharCounter).append(currentChar);
        return sb.toString();

    }
}

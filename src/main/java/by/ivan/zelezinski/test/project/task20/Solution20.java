package by.ivan.zelezinski.test.project.task20;

import java.util.Stack;

public class Solution20 {


    public boolean isValid(String s) {
        boolean result = true;

        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < s.length() && result; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                characters.push(c);
            } else {
                if (characters.isEmpty()) {
                    return false;
                }
                if (c == ')') {
                    if (characters.peek() == '(') {
                        characters.pop();
                    } else {
                        result = false;
                    }
                } else if (c == '}') {
                    if (characters.peek() == '{') {
                        characters.pop();
                    } else {
                        result = false;
                    }
                } else {
                    if (characters.peek() == '[') {
                        characters.pop();
                    } else {
                        result = false;
                    }

                }
            }
        }

        result = characters.isEmpty();

        return result;
    }
}

package by.ivan.zelezinski.test.project.task22;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {

        ArrayList<String> result = new ArrayList<>();

        calculateParantheses(0, 0, n, "", result);
        return result;

    }


    private void calculateParantheses(int open, int closed, int max, String result, List<String> box) {
        if (closed == max) {
            box.add(result);
            return;
        }
        if (open < max && open == closed) {
            calculateParantheses(open + 1, closed, max, result.concat("("), box);
        }
        if (open < max && open > closed) {
            calculateParantheses(open + 1, closed, max, result.concat("("), box);
            calculateParantheses(open, closed + 1, max, result.concat(")"), box);
        }
        if (open == max && closed < max) {
            calculateParantheses(open, closed + 1, max, result.concat(")"), box);
        }
    }
}

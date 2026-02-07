package by.ivan.zelezinski.test.project.task70;

import java.util.HashMap;
import java.util.Map;

public class Solution70 {

    private final static Map<Integer, Integer> stepValueMap = new HashMap<>();

    //note: getOrDefault method calculates default value even if get key exists XD, this behavior costs me attempt, and this is the reason i've used if-else blocks
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        stepValueMap.put(1, 1);
        return checkStep(n);
    }

    private int checkStep(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        Integer first;
        if (stepValueMap.containsKey(n -2)){
            first =  stepValueMap.get(n-2);
        } else {
            first = checkStep(n-2);
        }
        Integer second;
        if (stepValueMap.containsKey(n -1)){
            second =  stepValueMap.get(n-1);
        } else {
            second = checkStep(n-1);
        }
        stepValueMap.put(n, first + second);
        return first + second;
    }
}

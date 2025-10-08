package by.ivan.zelezinski.test.project.task29;

public class Solution29 {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        int tempResult = 0;
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        if (dividend == Integer.MIN_VALUE && divisor == Integer.MIN_VALUE) {
            return 1;
        }
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == 1) {
                return Integer.MIN_VALUE;
            }
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
            if (divisor < 0) {
                dividend -= divisor;
                tempResult++;
            } else {
                dividend += divisor;
                tempResult++;
                dividend = ~dividend + 1;
            }
        }
        if (divisor == Integer.MIN_VALUE) {
            return 0;
        }

        int dividendAbs = Math.abs(dividend);
        int divisorAbs = Math.abs(divisor);

        if(divisor == 1) {
            return dividend;
        } else if (divisor == -1) {
            return ~dividend + 1;
        }

        if (dividendAbs < divisorAbs) {
            return isNegative ? ~tempResult + 1 : tempResult;
        }
        if (dividendAbs == divisorAbs) {
            return isNegative ? -1 : 1;
        }

        int temp = 0;

        while (dividendAbs - temp >= divisorAbs) {
            temp += divisorAbs;
            tempResult++;
        }

        if (isNegative) {
            tempResult = ~tempResult + 1;
        }
        return tempResult;
    }
}

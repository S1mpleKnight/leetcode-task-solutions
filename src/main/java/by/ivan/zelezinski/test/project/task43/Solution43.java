package by.ivan.zelezinski.test.project.task43;

public class Solution43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];


        for (int i = n - 1; i >= 0; i--) {
            int a = num1.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                int mul = a * b + result[i + j + 1];

                result[i + j + 1] = mul % 10;
                result[i + j] += mul / 10;
            }
        }


        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < result.length && result[i] == 0) i++;
        for (; i < result.length; i++) sb.append(result[i]);

        return sb.isEmpty() ? "0" : sb.toString();
    }
}

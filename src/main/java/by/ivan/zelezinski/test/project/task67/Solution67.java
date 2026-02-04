package by.ivan.zelezinski.test.project.task67;

public class Solution67 {
    public String addBinary(String a, String b) {
        if (a.equals("0")) return b;
        if (b.equals("0")) return a;
        short counterA = (short) (a.length() - 1);
        short counterB = (short) (b.length() - 1);
        StringBuilder stringBuilder = new StringBuilder();
        byte isNextPlusOne = 0;
        while (counterA >= 0 || counterB >= 0) {
            byte i = counterA < 0 ? 0 : (byte) (a.charAt(counterA) - '0');
            byte j = counterB < 0 ? 0 : (byte) (b.charAt(counterB) - '0');

            counterA--;
            counterB--;

            stringBuilder.append((i + j + isNextPlusOne) % 2);
            isNextPlusOne = (byte) ((i + j + isNextPlusOne) / 2);
        }
        if (isNextPlusOne != 0) {
            stringBuilder.append(isNextPlusOne);
        }
        return stringBuilder.reverse().toString();
    }
}

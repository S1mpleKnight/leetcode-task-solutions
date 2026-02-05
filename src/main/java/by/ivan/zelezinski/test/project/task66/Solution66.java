package by.ivan.zelezinski.test.project.task66;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        if (digits.length == 1) {
            if (digits[0] == 9) {
                return new int[]{1, 0};
            } else {
                digits[0] += 1;
                return digits;
            }
        }
        byte counter = (byte) (digits.length - 1);
        boolean isPlusOne = false;
        while (counter >= 0 ) {
            if (counter == digits.length - 1) {
                byte i = (byte) (digits[counter] + 1);
                if (i == 10) {
                    digits[counter] = 0;
                    isPlusOne = true;
                } else {
                    digits[counter] = i;
                    return digits;
                }
            } else {
                byte j = (byte) digits[counter];
                if (isPlusOne) {
                    j += 1;
                    if (j == 10) {
                        digits[counter] = 0;
                    } else {
                        digits[counter] = j;
                        return digits;
                    }
                }
            }
            counter--;
        }
        int[] ints = new int[digits.length + 1];
        System.arraycopy(digits, 0, ints, 1, digits.length);
        ints[0] = 1;
        return ints;
    }
}

package by.ivan.zelezinski.test.project.task191;

public class Solution191 {
    public int hammingWeight(int n) {

        int count = 0;
        while (n > 0) {
            boolean isOne = (n & 1) == 1;
            if (isOne) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}
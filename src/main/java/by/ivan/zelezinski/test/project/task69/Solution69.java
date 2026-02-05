package by.ivan.zelezinski.test.project.task69;

public class Solution69 {

    public int mySqrt(int x) {
        int low = 0, high = x, ans = -1;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid == x)
                return (int)mid;
            else if (mid * mid > x)
                high = (int)mid - 1;
            else {
                ans = (int)mid;
                low = (int)mid + 1;
            }
            System.out.printf("%d %d %d\n", low, high, mid);
        }

        return ans;
    }
}

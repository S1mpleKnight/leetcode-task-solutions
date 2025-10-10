package by.ivan.zelezinski.test.project.task31;

public class Solution31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return;
        }
        if (n == 2) {
            swapPositions(0, 1, nums);
            return;
        }
        int currentPointer = n - 1;
        while (currentPointer > 0 && nums[currentPointer] <= nums[currentPointer - 1]) {
            currentPointer--;
        }
        if (currentPointer == 0) {
            reverseOrder(currentPointer, nums);
        } else {
            reverseOrder(currentPointer, nums);
            int leastClose = getLeastClosePos(nums[currentPointer - 1], currentPointer, nums);

            swapPositions(currentPointer - 1, leastClose, nums);

        }
    }

    private static int getLeastClosePos(int target, int from, int[] array) {
        int tempDif = Integer.MAX_VALUE;
        int tempRes = from;
        for (int i = from; i < array.length; i++) {
            if (tempDif > Math.abs(target - array[i]) && (array[i] - target) > 0) {
                tempDif = Math.abs(target - array[i]);
                tempRes = i;
            }
        }
        return tempRes;
    }

    private static void reverseOrder(int l, int[] array) {
        int r = (array.length - l) / 2;
        for (int k = 0; k < r; k++) {
            swapPositions(l + k, array.length - (1 + k), array);
        }
    }

    private static void swapPositions(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

package by.ivan.zelezinski.test.project.task27;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            if (nums[0] == val) {
                nums[0] = -1;
                return 0;
            } else {
                return 1;
            }
        }
        int i = 0;
        int k = 0;
        while (i < nums.length) {
            while (i < nums.length && nums[i] == val) {
                i++;
            }
            if (i >= nums.length) {
                break;
            }
            nums[k] = nums[i];
            k++;
            i++;
        }

        return k;
    }
}

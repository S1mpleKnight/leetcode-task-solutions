package by.ivan.zelezinski.test.project.task26;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int k = 0;
        int i = 1;
        while (i < nums.length) {
            while (i < nums.length && nums[k] == nums[i]) {
                i++;
            }
            k++;
            if (i >= nums.length) {
                break;
            }
            nums[k] = nums[i];
        }
        return k;
    }
}

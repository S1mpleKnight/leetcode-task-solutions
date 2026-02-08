package by.ivan.zelezinski.test.project.task88;

import java.util.Arrays;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        }
        int[] nums1Copy = Arrays.copyOf(nums1, m);
        byte firstPointer = 0;
        byte secondPointer = 0;
        while (true) {
            if (firstPointer >= m) {
                System.arraycopy(nums2, secondPointer, nums1, firstPointer + secondPointer, n - secondPointer);
                break;
            }
            if (secondPointer >= n) {
                System.arraycopy(nums1Copy, firstPointer, nums1, firstPointer + secondPointer, m - firstPointer);
                break;
            }
            if (nums1Copy[firstPointer] > nums2[secondPointer]) {
                nums1[firstPointer + secondPointer] = nums2[secondPointer];
                secondPointer++;
            } else {
                nums1[firstPointer + secondPointer] = nums1Copy[firstPointer];
                firstPointer++;
            }
        }
    }
}

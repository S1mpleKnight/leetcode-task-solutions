package by.ivan.zelezinski.test.project.task11;

class Solution11 {
    public int maxArea(int[] height) {

        int maxSquare = 0;

        int i = 0;
        int j = height.length - 1;
        while (i != j) {
            int square = Math.min(height[i], height[j]) * Math.abs(i - j);

            if (maxSquare < square) {
                maxSquare = square;
            }
            if (height[i] >= height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return maxSquare;
    }
}
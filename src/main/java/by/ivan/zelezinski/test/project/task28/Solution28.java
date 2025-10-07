package by.ivan.zelezinski.test.project.task28;

public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int currentHeadPointer = 0;
        while (currentHeadPointer <= haystack.length() - needle.length()) {
            int haystackPointer = currentHeadPointer;
            int needlePointer = 0;

            while (needlePointer < needle.length()) {
                if (needle.charAt(needlePointer) == haystack.charAt(haystackPointer)) {
                    haystackPointer++;
                    needlePointer++;
                } else {
                    break;
                }
            }
            if (needlePointer == needle.length()) {
                return currentHeadPointer;
            } else {
                currentHeadPointer++;
            }
        }
        return -1;
    }

}

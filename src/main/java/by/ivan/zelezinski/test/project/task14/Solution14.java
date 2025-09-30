package by.ivan.zelezinski.test.project.task14;

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String first = strs[0];
        boolean isEnd = false;
        String substring = "";
        for (int i = 0; i < first.length() && !isEnd; i++) {
            substring = first.substring(0, i + 1);
            for (int j = 0; j < strs.length && !isEnd; j++) {
                if (!strs[j].startsWith(substring)) {
                    isEnd = true;
                    substring = substring.substring(0, i);
                }
            }
        }
        return substring;
    }
}

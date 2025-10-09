package by.ivan.zelezinski.test.project.task30;

import java.util.*;

public class Solution30 {
    public List<Integer> findSubstring(String s, String[] words) {
        int wordLength = words[0].length();
        if (s.length() < wordLength) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<Integer> result = new ArrayList<>();

        int concatStringLength = wordLength * words.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(String word : words) {
            if (map.containsKey(word.hashCode())) {
                map.put(word.hashCode(), map.get(word.hashCode()) + 1);
            } else {
                map.put(word.hashCode(), 1);
            }
        }


        for (int i = 0; i <= s.length() - concatStringLength; i++) {
            if (isStringConcatenated(s.substring(i, i+ concatStringLength), (HashMap<Integer, Integer>) map.clone(),
                    wordLength))
            {
                result.add(i);
            }
        }

        return result;
    }

    private boolean isStringConcatenated(String substring, HashMap<Integer, Integer> map, int wordLength) {
        for (int i = 0; i <= substring.length() - wordLength; i += wordLength) {
            int key = substring.substring(i, i+ wordLength).hashCode();
            if (map.containsKey(key)) {
                if (map.get(key) == 0) {
                    return false;
                } else {
                    map.put(key, map.get(key) - 1);
                }
            } else {
                return false;
            }
        }
        Optional<Integer> reduce = map.values().stream().reduce((integer, integer2) -> integer + integer);
        return reduce.filter(integer -> integer == 0).isPresent();
    }
}

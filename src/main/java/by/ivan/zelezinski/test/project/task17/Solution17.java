package by.ivan.zelezinski.test.project.task17;

import java.util.*;
import java.util.stream.Collectors;

public class Solution17 {

    private static final String[][] table = {
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"},
            {"j", "k", "l"},
            {"m", "n", "o"},
            {"p", "q", "r", "s"},
            {"t", "u", "v"},
            {"w", "x", "y", "z"},
    };

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (digits.length() == 1) {
            return Arrays.stream(table[Integer.parseInt(digits) - 2]).toList();
        }

        List<Integer> list = Arrays
                .stream(digits.split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toCollection(ArrayList::new));

        return getResult(new ArrayList<>(), list);
    }

    private List<String> getResult(List<String> box, List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return box;
        }
        Integer first = numbers.getFirst();
        numbers.removeFirst();

        List<String> letters = Arrays.stream(table[first - 2]).toList();

        if (box.isEmpty()) {
            box.addAll(letters);
            return getResult(box, numbers);
        } else {
            ArrayList<String> strings = new ArrayList<>();
            for (String item : box) {
                for (String letter : letters) {
                    strings.add(item.concat(letter));
                }
            }
            return getResult(strings, numbers);
        }
    }
}

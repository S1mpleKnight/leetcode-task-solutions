package by.ivan.zelezinski.test.project.task39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (target == 1) {
            return Collections.emptyList();
        }
        int pos = candidates.length - 1;
        while (pos > 0 && candidates[pos] > target) {
            pos--;
        }
        if (pos < 0) {
            return Collections.emptyList();
        }

        return getLists(candidates, target, pos).stream().map(l -> ((List<Integer>) l)).toList();

    }

    private ArrayList<ArrayList<Integer>> getLists(int[] candidates, int target, int pos) {
        if (pos == 0) {
            if (candidates[0] > target) {
                return new ArrayList<>();
            } else {
                if (target % candidates[0] == 0) {
                    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.addAll(Collections.nCopies(target / candidates[0], candidates[0]));
                    result.add(integers);
                    return result;
                } else {
                    return new ArrayList<>();
                }
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = pos; i >= 0; i--) {
            int candidate = candidates[i];
            int div = target / candidate;
            for (int j = div; j > 0; j--) {
                int difference = target - (j * candidate);
                if (difference != 0) {
                    ArrayList<ArrayList<Integer>> lists = getLists(candidates, difference, i - 1);
                    for (ArrayList<Integer> list : lists) {
                        list.addAll(Collections.nCopies(j, candidate));
                        result.add(list);
                    }
                } else {
                    ArrayList<Integer> integers = new ArrayList<>();
                    integers.addAll(Collections.nCopies(j , candidate));
                    result.add(integers);
                }
            }

        }
        return result;

    }
}

package by.ivan.zelezinski.test.project.task40;

import java.util.*;

public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        searchCombination(candidates, target, 0, new ArrayList<>(), res);

        return res;

    }


    private void searchCombination(
            int[] candidates, int target, int pos, List<Integer> comb, List<List<Integer>> result
    ) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            result.add(new ArrayList<>(comb));
            return;
        }

        for (int i = pos; i < candidates.length; i++) {
            if (i > pos && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            comb.add(candidates[i]);
            searchCombination(candidates, target - candidates[i], i + 1, comb, result);
            comb.removeLast();
        }
    }

}

package by.ivan.zelezinski.test.project.task118;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrayLists = new ArrayList<>();
        for (int x = 0; x < numRows; x++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i <= x; i ++) {
                if (i == 0) {
                    list.add(1);
                } else {
                    list.add(list.get(i - 1) * ((x) + 1 - i) / i);
                }
            }
            arrayLists.add(list);
        }
        return arrayLists;
    }
}

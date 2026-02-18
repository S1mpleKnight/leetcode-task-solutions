package by.ivan.zelezinski.test.project.task119;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i ++) {
            if (i == 0) {
                list.add(1);
            } else {
                list.add((int) (list.get(i - 1)  * (((long) rowIndex) + 1 - i) / i));
            }
        }
        return list;
    }
}

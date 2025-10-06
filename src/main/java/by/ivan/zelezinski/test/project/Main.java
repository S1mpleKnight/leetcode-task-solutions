package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task25.ListNode;
import by.ivan.zelezinski.test.project.task25.Solution25;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();

        String first = "1,2,3,4,5,6,7,8,9,10,11,12";
        String second = "13";
        List<ListNode> list = Arrays.stream(first.split(","))
                .map(Integer::valueOf)
                .map(ListNode::new)
                .toList();

        ListNode listNode = list.get(0);
        for (int i =1; i < list.size(); i++){
            listNode.next = list.get(i);
            listNode = listNode.next;
        }

        System.out.println(solution25.reverseKGroup(list.get(0), Integer.valueOf(second)));
    }
}
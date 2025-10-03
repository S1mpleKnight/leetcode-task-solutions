package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task21.ListNode;
import by.ivan.zelezinski.test.project.task21.Solutiuon21;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String first = "1,2,4";
        String second = "1,3,4";
        List<ListNode> list = Arrays.stream(first.split(","))
                .map(Integer::valueOf)
                .map(ListNode::new)
                .toList();

        ListNode listNode = list.get(0);
        for (int i =1; i < list.size(); i++){
            listNode.next = list.get(i);
            listNode = listNode.next;
        }

        List<ListNode> list1 = Arrays.stream(second.split(","))
                .map(Integer::valueOf)
                .map(ListNode::new)
                .toList();

        ListNode listNode1 = list1.get(0);
        for (int i =1; i < list1.size(); i++){
            listNode1.next = list1.get(i);
            listNode1 = listNode1.next;
        }
        Solutiuon21 solutiuon21 = new Solutiuon21();
        System.out.println(solutiuon21.mergeTwoLists(list.get(0), list1.get(0)));
    }
}
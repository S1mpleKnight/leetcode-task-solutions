package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task83.ListNode;
import by.ivan.zelezinski.test.project.task83.Solution83;

public class Main {
    public static void main(String[] args) {
        Solution83 solution83 = new Solution83();

        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(3, listNode3);
        ListNode last = new ListNode(2, listNode2);
        ListNode listNode = new ListNode(1, last);
        ListNode listNode1 = new ListNode(1, listNode);
        System.out.println(solution83.deleteDuplicates(listNode1));
    }
}
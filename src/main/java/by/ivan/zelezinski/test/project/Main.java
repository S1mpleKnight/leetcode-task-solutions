package by.ivan.zelezinski.test.project;


import by.ivan.zelezinski.test.project.task19.Solution19;
import by.ivan.zelezinski.test.project.task19.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();

        String data = "1,2";
        String[] split = data.split(",");

        ListNode head = new ListNode(Integer.parseInt(split[0]));
        ListNode currentNode = head;

        if (split.length > 1) {
            for (int i = 1; i < split.length; i++) {
                currentNode.next = new ListNode(Integer.parseInt(split[i]));
                currentNode = currentNode.next;
            }
        }

        System.out.println(solution19.removeNthFromEnd(head, 2));
    }
}
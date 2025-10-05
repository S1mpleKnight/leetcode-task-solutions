package by.ivan.zelezinski.test.project.task24;

public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        return changeNodes(head);
    }

    private ListNode changeNodes(ListNode node) {
        if (node == null) {
            return null;
        }
        if (node.next == null) {
            return node;
        }
        ListNode nextNode = node.next;
        ListNode aheadNode = nextNode.next;

        node.next = changeNodes(aheadNode);
        nextNode.next = node;
        return nextNode;
    }
}

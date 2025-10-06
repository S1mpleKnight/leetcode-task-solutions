package by.ivan.zelezinski.test.project.task25;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        if (k == 1) {
            return head;
        }

        return reorderList(k, head);
    }

    private ListNode reorderList(int max, ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode tempPointer = node;
        int i = 1;
        ListNode tempHead = tempPointer;
        while (i < max && tempPointer != null) {
            tempPointer = tempPointer.next;
            i++;
        }
        if (i == max && tempPointer != null) {
            ListNode nextPart = reorderList(max, tempPointer.next);
            ListNode swapNodes = swapElements(tempHead, max);
            tempHead.next = nextPart;
            return swapNodes;
        }
        return tempHead;
    }

    private ListNode swapElements(ListNode node, int amount) {
        ArrayDeque<ListNode> listNodes = new ArrayDeque<>();

        ListNode cur = node;
        int i = 0;
        while (i < amount) {
            i++;
            listNodes.add(cur);
            cur = cur.next;
        }
        Iterator<ListNode> listNodeIterator = listNodes.descendingIterator();

        ListNode head = listNodeIterator.next();
        cur = head;

        while (listNodeIterator.hasNext()) {
            cur.next = listNodeIterator.next();
            cur = cur.next;
        }
        return head;
    }
}

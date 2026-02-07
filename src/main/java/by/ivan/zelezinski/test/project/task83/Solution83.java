package by.ivan.zelezinski.test.project.task83;

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }

        ListNode firstPointer = head;
        ListNode prevpointer = head;
        int currentValue = Integer.MIN_VALUE;
        while (firstPointer != null) {
            if (currentValue != firstPointer.val) {
                currentValue = firstPointer.val;
                prevpointer = firstPointer;
                firstPointer = firstPointer.next;
            } else {
                while (firstPointer != null && firstPointer.val == currentValue) {
                    firstPointer = firstPointer.next;
                }
                if (firstPointer == null) {
                    prevpointer.next = null;
                    break;
                } else {
                    prevpointer.next = firstPointer;
                }
            }
        }
        return head;
    }
}
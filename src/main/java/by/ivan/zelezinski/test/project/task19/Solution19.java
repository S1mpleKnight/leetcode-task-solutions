package by.ivan.zelezinski.test.project.task19;

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        ListNode resultHead = head;

        ListNode aheadPointer = head;
        for (int i = 0; i < n; i++) {
            aheadPointer = aheadPointer.next;
        }

        ListNode currentPointer = head;
        boolean isEnd = false;
        while (!isEnd) {
            if (aheadPointer == null) {
                resultHead = resultHead.next;
                break;
            }
            if (aheadPointer.next == null) {
                currentPointer.next = currentPointer.next.next;
                isEnd = true;
            }
            aheadPointer = aheadPointer.next;
            currentPointer = currentPointer.next;
        }

        return resultHead;
    }
}

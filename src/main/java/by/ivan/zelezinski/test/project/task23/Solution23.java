package by.ivan.zelezinski.test.project.task23;

public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }

        return getOrderedList(lists);
    }

    private ListNode getOrderedList(ListNode[] list) {
        if (list.length == 1) {
            return list[0];
        } else if (list.length == 2) {
            return mergeTwoLists(list[0], list[1]);
        } else {
            int pivot = Math.ceilDiv(list.length, 2);
            ListNode[] leftPart = new ListNode[pivot];
            ListNode[] rightPart = new ListNode[list.length - pivot];
            System.arraycopy(list, 0, leftPart, 0, pivot);
            System.arraycopy(list, pivot, rightPart, 0, list.length - pivot);
            ListNode leftOrdered = getOrderedList(leftPart);
            ListNode rightOrdered = getOrderedList(rightPart);
            return mergeTwoLists(leftOrdered, rightOrdered);
        }
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode firstPointer = list1.val <= list2.val
                ? list1
                : list2;
        ListNode secondPointer = firstPointer == list1 ? list2 : list1;

        ListNode result = null;
        ListNode resultPointer = result;

        boolean isEnd = false;

        while (!isEnd) {
            while (firstPointer != null && firstPointer.val <= secondPointer.val) {
                if (resultPointer == null) {
                    result = new ListNode(firstPointer.val);
                    resultPointer = result;
                } else {
                    resultPointer.next = new ListNode(firstPointer.val);
                    resultPointer = resultPointer.next;
                }
                firstPointer = firstPointer.next;
            }
            if (firstPointer == null) {
                resultPointer.next = secondPointer;
                isEnd = true;
            }
            ListNode temp = firstPointer;
            firstPointer = secondPointer;
            secondPointer = temp;
        }
        return result;
    }
}

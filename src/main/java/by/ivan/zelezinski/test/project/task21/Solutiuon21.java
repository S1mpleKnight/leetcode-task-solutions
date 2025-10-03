package by.ivan.zelezinski.test.project.task21;

public class Solutiuon21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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

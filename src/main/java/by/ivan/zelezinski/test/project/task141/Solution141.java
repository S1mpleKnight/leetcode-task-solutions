package by.ivan.zelezinski.test.project.task141;

import by.ivan.zelezinski.test.project.task83.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution141 {


    public boolean hasCycle(ListNode head) {
        Set<Integer> set = new HashSet<>();
        if (head == null) {
            return false;
        }
        if (head.next == null) {
             return false;
        }
        while (head != null) {
            int i = head.hashCode();
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
            head = head.next;
        }
        return false;
    }
}



// best solution of this problem - slow and fast pointers
//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//
//            if (fast == slow) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//}
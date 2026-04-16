package by.ivan.zelezinski.test.project.task160;

import by.ivan.zelezinski.test.project.task83.ListNode;

import java.util.HashMap;

// bug found on leetcode, wait until answer
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        boolean isEnd = false;
        while (!isEnd) {
            if (headA != null) {
                int aHash = headA.hashCode();
                if (map.containsKey(aHash)) {
                    return map.get(aHash);
                } else {
                    map.put(aHash, headA);
                }
                headA = headA.next;
            }
            if (headB != null) {
                int bHash = headB.hashCode();
                if (map.containsKey(bHash)) {
                    return map.get(bHash);
                } else {
                    map.put(bHash, headB);
                }
                headB = headB.next;
            }
            if (headA == null & headB == null) {
                isEnd = true;
            }
        }
        return null;
    }
}

//valid solution
//public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode lista = headA;
//        ListNode listb = headB;
//
//        while (lista != listb) {
//            lista = (lista != null) ? lista.next : headB;
//            listb = (listb != null) ? listb.next : headA;
//        }
//
//        return lista;
//    }
//}

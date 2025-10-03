package by.ivan.zelezinski.test.project.task21;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        ListNode current = this;

        String result = "";

        while (current != null) {
            result = result.concat(String.valueOf(current.val));
            current = current.next;
        }

        return result;
    }
}


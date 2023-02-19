package LinkedList;

import Util.ListNode;

public class PartitionLinkedList {
    public ListNode partition(ListNode head, int target) {
        ListNode small = new ListNode(-1);
        ListNode large = new ListNode(-1);

        ListNode s = small, l = large;

        while (head != null) {
            if (head.value < target) {
                s.next = head;
                s = s.next;
            } else {
                l.next = head;
                l = l.next;
            }
            head = head.next;
        }

        s.next = large.next;
        l.next = null;

        return small.next;
    }
}

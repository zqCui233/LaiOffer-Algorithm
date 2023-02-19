package LinkedList;

import Util.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null) {
            if (cur.next.value == val) {
                cur.next = cur.next.next;
            }
            else cur = cur.next;
        }

        return dummy.next;
    }
}

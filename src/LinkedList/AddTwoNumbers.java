package LinkedList;

import Util.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int val = 0;

        while (l1 != null || l2 != null || val != 0) {
            if (l1 != null) {
                val += l1.value;
                l1 = l1.next;
            }
            if (l2 != null) {
                val += l2.value;
                l2 = l2.next;
            }
            cur.next = new ListNode(val % 10);
            cur = cur.next;
            val = val / 10;
        }

        return dummy.next;
    }
}

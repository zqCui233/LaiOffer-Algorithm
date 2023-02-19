package LinkedList;

import Util.ListNode;

public class MergeTwoSortedLinkedLists {
    public ListNode merge(ListNode one, ListNode two) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (one != null && two != null) {
            if (one.value <= two.value) {
                cur.next = one;
                one = one.next;
            } else {
                cur.next = two;
                two = two.next;
            }
            cur = cur.next;
        }

        if (one != null) cur.next = one;
        if (two != null) cur.next = two;

        return dummy.next;
    }
}

package LinkedList;

import Util.ListNode;

public class ReOrderLinkedList {
    public ListNode reorder(ListNode head) {
        if (head == null) return null;
        ListNode mid = new MiddleNodeOfLinkedList().middleNode(head);
        ListNode two = mid.next;
        mid.next = null;
        two = new ReverseLinkedListIterative().reverse(two);
        return merge(head, two);
    }

    private ListNode merge(ListNode one, ListNode two) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while (one != null && two != null) {
            cur.next = one;
            one = one.next;
            cur.next.next = two;
            two = two.next;
            cur = cur.next.next;
        }
        if (one != null) cur.next = one;
        return dummy.next;
    }
}

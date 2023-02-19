package LinkedList;

import Util.ListNode;

public class CheckIfLinkedListHasACycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode fast = head, slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return true;
        }

        return false;
    }
}

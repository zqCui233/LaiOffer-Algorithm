package RecursionII;

import Util.ListNode;
public class ReverseLinkedListInPairs {
    public ListNode reverseInPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = head.next;
        head.next = reverseInPairs(head.next.next);
        newHead.next = head;
        return newHead;
    }
}

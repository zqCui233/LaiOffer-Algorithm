package LinkedList;

import Util.ListNode;

public class CheckIfLinkedListIsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode mid = new MiddleNodeOfLinkedList().middleNode(head);
        ListNode one = head, two = mid.next;
        mid.next = null;
        two = new ReverseLinkedListIterative().reverse(two);


        while (two != null) {
            if (one.value != two.value) return false;
            one = one.next;
            two = two.next;
        }

        return true;
    }
}

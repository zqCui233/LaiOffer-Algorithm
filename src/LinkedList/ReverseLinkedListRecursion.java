package LinkedList;

import Util.ListNode;

public class ReverseLinkedListRecursion {
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
//        ListNode.printLinkedList(newHead);
        System.out.println(newHead.value);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        ListNode head = ListNode.createLinkedList(array);
        ListNode res = new ReverseLinkedListRecursion().reverse(head);
//        ListNode.printLinkedList(res);
    }
}

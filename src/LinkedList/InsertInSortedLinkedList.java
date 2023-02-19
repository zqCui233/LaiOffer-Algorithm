package LinkedList;

import Util.ListNode;

public class InsertInSortedLinkedList {
    public ListNode insert(ListNode head, int value) {
        ListNode newNode = new ListNode(value);

        if (head == null || head.value >= value) {
            newNode.next = head;
            return newNode;
        }

        ListNode cur = head;
        while (cur.next != null && cur.next.value <= value) {
            cur = cur.next;
        }

        newNode.next = cur.next;
        cur.next = newNode;
        return head;
    }

    public ListNode insert2(ListNode head, int value) {
        ListNode dummy = new ListNode(-1);
        ListNode newNode = new ListNode(value);

        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.value <= value) cur = cur.next;

        newNode.next = cur.next;
        cur.next = newNode;
        return dummy.next;
    }


}

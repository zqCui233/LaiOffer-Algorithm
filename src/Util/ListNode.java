package Util;

public class ListNode {
    public int value;

    public ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode createLinkedList(int[] array) {
        if (array == null || array.length == 0) return null;
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        for (int i = 0; i < array.length; i++) {
            ListNode cur = new ListNode(array[i]);
            head.next = cur;
            head = head.next;
        }

        return dummy.next;
    }
}

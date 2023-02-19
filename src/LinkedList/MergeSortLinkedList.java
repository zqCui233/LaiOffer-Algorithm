package LinkedList;

import Util.ListNode;

public class MergeSortLinkedList {
    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode mid = new MiddleNodeOfLinkedList().middleNode(head);
        ListNode one = head, two = mid.next;
        mid.next = null;
        one = mergeSort(one);
        two = mergeSort(two);

        return new MergeTwoSortedLinkedLists().merge(one, two);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,6,3,7,4,9,22,-19};
        ListNode head = ListNode.createLinkedList(array);
        ListNode res = new MergeSortLinkedList().mergeSort(head);
        ListNode.printLinkedList(res);
    }

}

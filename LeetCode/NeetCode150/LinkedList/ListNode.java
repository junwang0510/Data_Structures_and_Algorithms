package LeetCode.NeetCode150.LinkedList;

/**
 * A node in a singly linked-list
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
        new ListNode(0, null);
    }

    public ListNode(int val) {
        new ListNode(val, null);
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
package LeetCode.NeetCode150.LinkedList;

public class ReverseLinkedList {
    // Approach 1: Iterative
    // Runtime: O(n)
    // Space: O(1)
    public ListNode reverseList(ListNode head) {
        // base case
        if (head == null || head.next == null) return head;

        // normal case
        ListNode prev = null;
        ListNode curr = head;
        while (curr.next != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr.next = prev;

        return curr;
    }

    // Approach 2: Recursive
    // Runtime: O(n)
    // Space: O(n)
    public ListNode reverseList2(ListNode head) {
        // Base case
        if (head == null || head.next == null) return head;

        // Recursive case
        ListNode curr = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }


    /**
     * A node in a singly-linked list
     */
    private static class ListNode {
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
}

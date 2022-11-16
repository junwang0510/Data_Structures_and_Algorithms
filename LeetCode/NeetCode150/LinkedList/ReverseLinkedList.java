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
        // 0 or 1 node is "naturally reversed"; no work need to be done
        if (head == null || head.next == null) return head;

        // Recursive case
        // Simplifying the list until the base case
        // Stop adding function call to the call stack when head.next == null or head.next.next == null
        ListNode curr = reverseList2(head.next);
        // Make my next element point to myself
        head.next.next = head;
        // Stop myself from pointing forward
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

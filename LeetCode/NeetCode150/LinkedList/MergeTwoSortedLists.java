package LeetCode.NeetCode150.LinkedList;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Runtime: O(n + m)
        // Space: O(1)

        // Simple Case
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        // Normal Case (list1 != null && list2 != null)
        ListNode result = new ListNode(-1); // dummy node in the front
        ListNode curr = result;

        // compare and build curr
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // handle trailing nodes
        curr.next = list1 == null ? list2 : list1;

        return result.next; // skip the dummy node
    }
}

package LeetCode.NeetCode150.ArrraysAndHashing;

import java.util.Set;
import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Runtime:
        // Space: O(n)

        // Idea: Add elements until encountering a duplicate element (if any)

        // Any collection would work
        // Hashing for average O(1) runtime for .contains()
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }
}

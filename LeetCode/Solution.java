package LeetCode;

import java.util.*;

// Solutions from LeetCode Practices / Contests

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Time: O(n)
        // Space: O(m); m = # of unique words in s

        String[] arr = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        Set<String> mapped = new HashSet<>();

        if (arr.length != pattern.length())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = arr[i];

            // if there is no previous mapping for the character
            if (!map.containsKey(c)) {
                if (mapped.contains(str)) {
                    return false;
                }
                mapped.add(str);
                map.put(c, str);
            } else {
                // if the previous mapping if not equal to the current string
                if (!map.get(c).equals(str)) {
                    return false;
                }
            }
        }

        return true;
    }
}
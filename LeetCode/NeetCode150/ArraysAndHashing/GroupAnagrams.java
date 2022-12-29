package LeetCode.NeetCode150.ArraysAndHashing;

import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Time: O(n)
        // Space: O(n)

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        // separate into groups based on anagrams
        for (String s : strs) {
            char[] curr = s.toCharArray();
            Arrays.sort(curr);
            String sorted = new String(curr);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }

        // fill the result list
        for (String key : map.keySet()) {
            result.add(map.get(key));
        }

        return result;
    }
}
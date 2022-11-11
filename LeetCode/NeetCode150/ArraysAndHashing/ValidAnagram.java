package LeetCode.NeetCode150.ArraysAndHashing;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // Runtime: O(n)
        // Space: O(n)

        // simple check
        if (s.length() != t.length()) return false;

        // track the count of each letter in String
        int[] letters = new int[26];

        // check whether the occurrences of letters match
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) return false;
        }

        return true;
    }
}

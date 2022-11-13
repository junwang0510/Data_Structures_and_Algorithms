package LeetCode;

// Solutions from LeetCode Practices / Contests

class Solution {
    /**
     * Select a set of non-overlapping substrings from the string s that satisfy the following conditions:
     * 1. The length of each substring is at least k.
     * 2. Each substring is a palindrome.
     *
     * @param s the input String
     * @param k minimum length of each substring
     * @return the maximum number of substrings in an optimal selection
     */
    public int maxPalindromes(String s, int k) {
        StringBuilder curr = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            curr.append(s.charAt(i));
            if (curr.length() >= k) {
                // get the minimum-requirement substring for the current String
                for (int j = 0; j < curr.length(); j++) {
                    String sub = curr.substring(j);
                    if (sub.length() >= k && isPalindrome(sub)) {
                        count++;
                        curr = new StringBuilder();
                    }
                }
            }
        }

        return count;
    }

    /**
     * Check if a given String is a palindrome
     *
     * @param s the input String
     * @return true if s is a palindrome; false otherwise
     */
    private boolean isPalindrome(String s) {
        if (s.length() == 1) return true;

        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}

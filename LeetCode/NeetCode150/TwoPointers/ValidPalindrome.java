package LeetCode.NeetCode150.TwoPointers;

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // Runtime: O(n)
        // Space: O(1)

        // base case
        if (s.length() == 1) return true;

        // left and right pointers
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            // skip invalid characters (non-alphanumeric)
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

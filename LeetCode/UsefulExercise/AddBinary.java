package LeetCode.UsefulExercise;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        // Starting from the end (the least significant digit)
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        // Track whether we need to carry over to the next digit
        // (in the case of "1" + "1")
        int carry = 0;

        while (aIndex >= 0 || bIndex >= 0) {
            int sum = carry;
            if (aIndex >= 0) sum += a.charAt(aIndex) - '0';
            if (bIndex >= 0) sum += b.charAt(bIndex) - '0';

            result.append(sum % 2);
            carry = sum / 2;
            aIndex--;
            bIndex--;
        }

        // Potential leftover value to carry over
        if (carry != 0) result.append(carry);
        return result.reverse().toString();
    }
}

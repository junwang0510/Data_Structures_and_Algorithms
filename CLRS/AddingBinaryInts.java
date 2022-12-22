package CLRS;

// 2.1.4
public class AddingBinaryInts {
    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 0, 1}; // 1010
        int[] b = new int[]{0, 0, 1, 1}; // 1100
        int[] c = add(a, b);
        for (int i = c.length - 1; i >= 0; i--) System.out.print(c[i]);
    }

    public static int[] add(int[] a, int[] b) {
        int[] c = new int[Math.max(a.length, b.length) + 1];
        int carry = 0;
        for (int i = 0; i < c.length - 1; i++) {
            c[i] = (a[i] + b[i] + carry) % 2;
            if (a[i] + b[i] + carry >= 2) {
                carry = 1;
            } else {
                carry = 0;
            }
        }
        c[c.length - 1] = carry;
        return c;
    }
}

package h2;

import java.util.Arrays;

public class H2_main {

    public static int[] change(int[] a, int[] b, int start, int end) {

        if (end <= start) {
            return new int[0];
        }

        if (Arrays.compare(a, b) != 0) {
            return Arrays.copyOf(a, a.length);
        }

        Arrays.sort(a);
        return Arrays.copyOfRange(a, start, end);
    }

    public static void main(String[] args) {

        int[] x = {2, 7, 1, 9};
        int[] y = {2, 7, 1, 9};

        System.out.println(Arrays.toString(change(x, y, 2, 4))); // [7, 9]
    }
}

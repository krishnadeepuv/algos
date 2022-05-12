package visa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ParkingRoof {
    public static int minRoof(int[] roof, int k) {

        int end = k - 1;
        int start = 0;

        int result = Integer.MAX_VALUE;
        Arrays.sort(roof);
        for (end = k - 1; end < roof.length; end++, start++) {
            result = Math.min(result, roof[end] - roof[start]);
        }

        return result + 1;
    }

    public static void main(String[] args) {
        System.out.println(minRoof(new int[] { 2, 10, 8, 17 }, 3));
    }
}

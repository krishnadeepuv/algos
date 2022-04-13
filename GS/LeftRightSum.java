package GS;

public class LeftRightSum {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int total2 = 0;
        for (int i = 0; i < nums.length; i++) {

            total -= nums[i];
            if (total == total2)
                return i;
            System.out.println(total + ", " + total2);
            total2 += nums[i];

        }

        return -1;
    }
}

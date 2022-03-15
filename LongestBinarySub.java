import java.util.HashMap;

public class LongestBinarySub {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> hs = new HashMap<>();
        int runningSum = 0;
        hs.put(0, -1);
        int max_sub = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                runningSum += 1;
            else
                runningSum -= 1;

            if (hs.containsKey(runningSum)) {
                max_sub = Math.max(max_sub, i - hs.get(runningSum));
            } else {
                hs.put(runningSum, i);
            }
        }

        return max_sub;
    }
}

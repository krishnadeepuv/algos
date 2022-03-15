import java.util.HashMap;

public class SubKsums {
    public int subarraySum(int[] nums, int k) {

        int subsCount = 0;
        int runningSum = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();

        hs.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];

            if (hs.containsKey(runningSum - k)) {
                subsCount += hs.get(runningSum - k);
            }
            if (hs.containsKey(runningSum))
                hs.put(runningSum, hs.get(runningSum) + 1);
            else
                hs.put(runningSum, 1);
        }
        return subsCount;
    }
}

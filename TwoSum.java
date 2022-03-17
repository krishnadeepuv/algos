import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        ArrayList<Integer> ar = new ArrayList<Integer>();
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.containsKey(nums[i])) {
                hs.put(nums[i], hs.get(nums[i]) + 1);
            } else
                hs.put(nums[i], 1);
        }

        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];

            if (hs.containsKey(dif)) {
                if (dif == nums[i] && hs.get(nums[i]) > 1)
                    ar.add(i);
                else if (dif != nums[i])
                    ar.add(i);
            }
        }

        return ar.stream().mapToInt(i -> i).toArray();
    }

}

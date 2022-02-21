import java.util.jar.Attributes.Name;

public class HouseRobber {
    public int rob(int[] nums) {
        return helper(nums, 0, 0);
    }

    public int helper(int[] nums, int index, int maxTotal) {
        if (nums.length <= index)
            return maxTotal;

        // choose case
        int choose = helper(nums, index + 2, maxTotal + nums[index]);

        // not choose case
        int nochoose = helper(nums, index + 1, maxTotal);

        return Integer.max(choose, nochoose);

    }
}

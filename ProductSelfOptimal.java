public class ProductSelfOptimal {
    public int[] productExceptSelf(int[] nums) {

        if (nums == null || nums.length == 0)
            return new int[0];

        int rprod = 1;

        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = rprod;
            rprod *= nums[i];
        }

        rprod = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rprod;

            rprod *= nums[i];
        }

        return result;
    }
}

public class ProductSelf {
    public int[] productExceptSelf(int[] nums) {

        if (nums == null || nums.length <= 0)
            return new int[0];

        int res[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    prod *= nums[j];
                }
            }

            res[i] = prod;
        }

        return res;
    }
}

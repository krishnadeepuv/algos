public class MinArrRotated {

    public int findMin(int[] nums) {

        if (nums == null || nums.length == 0)
            return -1;

        int l = 0;
        int h = nums.length - 1;

        int min = Integer.MAX_VALUE;

        if (nums[l] <= nums[h])
            return nums[l];

        while (l <= h) {
            int pivot = l + (h - l) / 2;

            if (nums[l] <= nums[pivot]) {
                min = min < nums[l] ? min : nums[l];
                ;
                l = pivot + 1;
            } else {
                min = min < nums[pivot] ? min : nums[pivot];
                h = pivot - 1;
            }

        }

        return min;
    }

    public static void main(String[] args) {
        MinArrRotated mar = new MinArrRotated();

        // [5,1,2,3,4]
        int c[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(mar.findMin(c));
        int a[] = { 3, 4, 5, 1, 2 };
        System.out.println(mar.findMin(a));

        int b[] = { 11, 13, 15, 17 };
        System.out.println(mar.findMin(b));
    }
}

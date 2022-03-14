public class FindPeek {

    public int findPeakElement(int[] nums) {

        if (nums == null || nums.length == 0)
            return -1;
        if (nums.length == 1)
            return 0;

        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if ((mid == 0 || nums[mid] > nums[mid - 1]) &&
                    (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (mid > 0 && nums[mid - 1] > nums[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return 888;
    }

}

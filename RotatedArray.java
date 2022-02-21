public class RotatedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        int h = nums.length - 1;
        int l = 0;

        while (l <= h) {

            int pivot = l + (h - l) / 2;

            if (nums[pivot] == target)
                return pivot;
            else if (nums[pivot] <= nums[h]) {
                if (target >= nums[pivot] && target <= nums[h])
                    l = pivot + 1;
                else
                    h = pivot - 1;
            } else {
                if (target >= nums[l] && target <= nums[pivot])
                    h = pivot - 1;
                else
                    l = pivot + 1;
            }
        }
        return -1;
    }
}

public class FirstLast {

    public int[] searchRange(int[] nums, int target) {

        int[] result = { -1, -1 };

        if (nums == null)
            return result;
        else if (nums.length == 1 && target == nums[0])
            return new int[] { 0, 0 };
        // find the beginning range
        int l = 0;
        int h = nums.length - 1;

        int begin = first(nums, target, l, h);
        int end = end(nums, target, l, h);

        result[0] = begin;
        result[1] = end;
        return result;
    }

    public static int first(int[] nums, int target, int l, int h) {

        int f = -1;
        while (l <= h) {

            int pivot = l + (h - l) / 2;
            if (target == nums[pivot]) {
                f = pivot;
                h = pivot - 1;
                if (h < 0 || nums[h] < target)
                    return f;
            } else if (target >= nums[l] && target <= nums[pivot]) {
                h = pivot - 1;
            } else
                l = pivot + 1;
        }
        return f;
    }

    public static int end(int[] nums, int target, int l, int h) {
        int s = -1;

        while (l <= h) {
            int pivot = l + (h - l) / 2;

            if (nums[pivot] == target) {
                s = pivot;
                l = pivot + 1;

                if (l > nums.length - 1 || nums[l] > target)
                    return s;
            } else if (target >= nums[l] && target <= nums[pivot]) {
                h = pivot - 1;
            } else
                l = pivot + 1;

        }
        return s;
    }

    public static void main(String[] args) {
        FirstLast fl = new FirstLast();

        int[] rs;
        // rs = fl.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8);

        // System.out.println(rs[0] + "," + rs[1]);

        // rs = fl.searchRange(new int[] { 5, 7, 7, 8, 8, 8, 8, 8, 10 }, 8);
        // System.out.println(rs[0] + "," + rs[1]);

        rs = fl.searchRange(new int[] { 2, 2 }, 2);
        System.out.println(rs[0] + "," + rs[1]);

        rs = fl.searchRange(new int[] { 2, 2 }, 1);
        System.out.println(rs[0] + "," + rs[1]);
    }
}

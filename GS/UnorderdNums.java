package GS;

public class UnorderdNums {

    public int unOrderCounter(int[] nums) {

        if (nums == null || nums.length == 0)
            return -1;

        int resCount = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] > nums[i] || nums[i] > nums[i + 1]) {
                resCount++;
                i++;
            }
        }

        return resCount;
    }

    public static void main(String[] args) {
        UnorderdNums un = new UnorderdNums();

        System.out.println(un.unOrderCounter(new int[] { 1, 2, 4, 3, 7, 6, 7, 8 }));
        System.out.println(un.unOrderCounter(new int[] { 1, 2, 2, 3, 7, 6, 7, 8, 11, 10 }));
    }
}

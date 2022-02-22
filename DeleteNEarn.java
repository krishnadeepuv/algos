public class DeleteNEarn {

    public int deleteAndEarn(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }

        int dp_arr[] = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            dp_arr[nums[i]] += nums[i];
        }
        int choose = 0;
        int nochoose = 0;
        int temp = 0;
        for (int i = 0; i < dp_arr.length; i++) {
            temp = nochoose + dp_arr[i];
            nochoose = Integer.max(choose, nochoose);
            choose = temp;
        }

        return Integer.max(choose, nochoose);

    }

    public static void main(String[] args) {
        DeleteNEarn dne = new DeleteNEarn();

        int[] a = { 3, 4, 2 };
        System.out.println(dne.deleteAndEarn(a));
    }
}

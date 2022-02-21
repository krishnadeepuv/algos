public class HouseRobberDP {

    public int rob(int[] nums) {
        int choose = 0;
        int nochoose = 0;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr = nochoose + nums[i];
            nochoose = Integer.max(choose, nochoose);
            nochoose = curr;
        }

        return Integer.max(choose, nochoose);
    }

    public static void main(String[] args) {

    }
}

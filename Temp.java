import java.util.*;

class temp {

    public static int isIsomorphic(int[] nums, int k) {
        int running_sum = 0;
        int max_subs = 0;
        HashMap<Integer, Integer> repeats = new HashMap<>();

        repeats.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            running_sum += nums[i];
            if (repeats.containsKey(running_sum - k))
                max_subs += repeats.get(running_sum - k);
            if (repeats.containsKey(running_sum))
                repeats.put(running_sum, repeats.get(running_sum) + 1);
            else
                repeats.put(running_sum, 1);

        }

        return max_subs;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic(new int[] { 0, 0 }, 0));

    }
}
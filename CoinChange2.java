
public class CoinChange2 {

    public int change(int amount, int[] coins) {

        return helper(amount, coins, 0, 0);
    }

    public int helper(int amount, int[] coins, int index, int sum) {

        if (sum > amount || index >= coins.length)
            return 0;
        if (sum == amount)
            return 1;

        // choose
        int case1 = helper(amount, coins, index, sum + coins[index]);
        // not choose
        int case2 = helper(amount, coins, index + 1, sum);

        return case1 + case2;

    }

    public static void main(String[] args) {

    }
}

import java.util.Arrays;

public class CoinChange2 {

    public int change(int amount, int[] coins) {
        if (coins == null || coins.length <= 0 || amount <= 0)
            return 0;
        int maxWays = 0;

        for (int i = coins.length; i > 0; i++) {
            maxWays += helper(amount, Arrays.copyOfRange(coins, 0, i), 0, 0, 0);
        }
        return maxWays;
    }

    public int helper(int amount, int[] coins, int index, int sumValue, int crrWays) {
        if (index < 0)
            return crrWays;
    }

    public static void main(String[] args) {

    }
}

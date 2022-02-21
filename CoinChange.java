public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        if (coins == null || amount == 0)
            return 0;

        return coinSelector(coins, amount, 0, 0);
    }

    public int coinSelector(int[] coins, int amount, int coinIndex, int minCount) {
        if (amount < 0 || coinIndex >= coins.length)
            return -1;
        if (amount == 0)
            return minCount;

        int nochoose = coinSelector(coins, amount, coinIndex + 1, minCount);
        int choose = coinSelector(coins, amount - coins[coinIndex], coinIndex, minCount + 1);

        if (nochoose == -1)
            return choose;
        else if (choose == -1)
            return nochoose;
        else
            return Math.min(choose, nochoose);

    }

    public static void main(String[] args) {

    }
}

public class CoinChangeTable {

    static int coinChange(int[] coins, int amount) {

        int[][] memoTable = new int[coins.length + 1][amount + 1];

        for (int i = 1; i < memoTable[0].length; i++) {
            memoTable[0][i] = Integer.MAX_VALUE - 1;
        }
        for (int i = 0; i < memoTable.length; i++) {
            memoTable[i][0] = 0;
        }
        int current = Integer.MAX_VALUE - 1;
        int previous = 0;
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] > j) {
                    memoTable[i][j] = memoTable[i - 1][j];
                } else {
                    current = memoTable[i][j - coins[i - 1]] + 1;
                    previous = memoTable[i - 1][j];
                    memoTable[i][j] = Integer.min(current, previous);
                }
            }
        }

        for (int i = 0; i < memoTable.length; i++) {
            for (int j = 0; j < memoTable[i].length; j++) {
                System.out.print(memoTable[i][j] + " ");
            }
            System.out.println("");
        }
        return memoTable[coins.length][amount] < Integer.MAX_VALUE - 1 ? memoTable[coins.length][amount] : -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5 };
        int[] arr1 = { 2 };
        System.out.println(coinChange(arr1, 3));
    }
}

/*
 * else if (j % coins[i] != 0) {
 * current = Integer.MAX_VALUE;
 * previous = memoTable[i - 1][j];
 * memoTable[i][j] = Integer.max(current, previous);
 * }
 */
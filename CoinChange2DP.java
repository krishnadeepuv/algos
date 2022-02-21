public class CoinChange2DP {

    public int change(int amount, int[] coins) {

        int dptable[][] = new int[coins.length + 1][amount + 1];

        for (int i = 0; i < dptable[0].length; i++) {
            if (i == 0)
                dptable[0][i] = 1;
            else
                dptable[0][i] = 0;
        }

        for (int i = 1; i < dptable.length; i++) {
            for (int j = 0; j < dptable[0].length; j++) {
                if (j < coins[i - 1])
                    dptable[i][j] = dptable[i - 1][j];
                else {
                    dptable[i][j] = dptable[i - 1][j] + dptable[i][j - coins[i - 1]];
                }
            }
        }

        // for (int i = 0; i < dptable.length; i++) {
        // for (int j = 0; j < dptable[i].length; j++) {
        // System.out.print(dptable[i][j] + " ");
        // }
        // System.out.println("");
        // }

        return dptable[coins.length][amount];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5 };
        int[] arr1 = { 2 };
        CoinChange2DP cdp = new CoinChange2DP();
        System.out.println(cdp.change(5, arr));
    }
}

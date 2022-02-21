public class ColorHouseDP {

    public int minCost(int[][] costs) {
        for (int i = costs.length - 2; i >= 0; i--) {
            for (int j = 0; j < costs[0].length; j++) {
                if (j == 0) {
                    costs[i][j] += Math.min(costs[i + 1][j + 1], costs[i + 1][j + 2]);
                } else if (j == 1) {
                    costs[i][j] += Math.min(costs[i + 1][j - 1], costs[i + 1][j + 1]);
                } else {
                    costs[i][j] += Math.min(costs[i + 1][j - 1], costs[i + 1][j - 2]);
                }
            }
        }

        return Math.min(costs[0][0], Math.min(costs[0][1], costs[0][2]));
    }

    public static void main(String[] args) {
        int costs[][] = { { 12, 5, 2 }, { 14, 3, 1 }, { 16, 4, 31 } };
        int costs1[][] = { { 17, 2, 17 }, { 16, 16, 3 }, { 14, 1, 19 } };
        int costs2[][] = { { 17, 5, 13 }, { 14, 2, 5 }, { 16, 4, 31 } };
        int costs3[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        ColorHouseDP objCh = new ColorHouseDP();
        System.out.println(objCh.minCost(costs));
        System.out.println(objCh.minCost(costs1));
        System.out.println(objCh.minCost(costs2));
        System.out.println(objCh.minCost(costs3));
    }
}

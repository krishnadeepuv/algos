public class ColorHouses {

    public int minCost(int[][] costs) {

        int case1 = helper(costs, 1, 0, costs[0][0]);
        int case2 = helper(costs, 1, 1, costs[0][1]);
        int case3 = helper(costs, 1, 2, costs[0][2]);

        return Math.min(case1, Math.min(case2, case3));
    }

    public int helper(int[][] costs, int house, int reserved, int minCost) {
        if (house >= costs.length)
            return minCost;
        int next1 = -1;
        int next2 = -1;
        if (reserved == 0) {
            next1 = 1;
            next2 = 2;
        } else if (reserved == 1) {
            next1 = 0;
            next2 = 2;
        } else {
            next1 = 0;
            next2 = 1;
        }
        int case2 = helper(costs, house + 1, next1, minCost + costs[house][next1]);
        int case3 = helper(costs, house + 1, next2, minCost + costs[house][next2]);
        return Math.min(case2, case3);
    }

    public static void main(String[] args) {
        int costs[][] = { { 12, 5, 2 }, { 14, 3, 1 }, { 16, 4, 31 } };
        int costs1[][] = { { 17, 2, 17 }, { 16, 16, 3 }, { 14, 1, 19 } };
        int costs2[][] = { { 17, 5, 13 }, { 14, 2, 5 }, { 16, 4, 31 } };
        int costs3[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        ColorHouses objCh = new ColorHouses();
        System.out.println(objCh.minCost(costs));
        System.out.println(objCh.minCost(costs1));
        System.out.println(objCh.minCost(costs2));
        System.out.println(objCh.minCost(costs3));
    }
}

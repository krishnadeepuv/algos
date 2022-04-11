public class StockChange {
    public int minChnage(int[] prices) {
        if (prices == null || prices.length == 0)
            return -1;

        int min = Integer.MAX_VALUE;

        int total_sum = 0;

        for (int i = 0; i < prices.length; i++) {

        }

        return min;
    }

    public int findMaximum(int[] input1, String input2, int input3) {

        if (input1.length != input2.length())
            return 0;
        if (input1 == null || input2 == null || input1.length == 0 || input2.length() == 0)
            return 0;

        int result = 0;
        for (int i = 0; i < input1.length; i++) {
            char ch = input2.charAt(i);
            if (ch == 'P')
                result += input1[i];
            else if (ch == 'N')
                result -= input1[i];
        }

        return Math.abs(100 * result);
    }

    public static void main(String[] args) {
        float a = 0;
        float b = 1;
        float c = 1;

        while (c < 10) {
            b = b * c;
            a = a + (b / c);
            c = c + 1;
        }
        StockChange sc = new StockChange();
        System.out.println(sc.findMaximum(new int[] { 4, 3, 5 }, "PNP", 3));
        System.out.println(sc.findMaximum(new int[] { 2, 3 }, "PN", 2));
    }
}

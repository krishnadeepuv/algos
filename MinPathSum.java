public class MinPathSum {

    public int minFallingPathSum(int[][] matrix) {
        for (int i = matrix.length - 2; i >= 0; i--) {
            for (int j = 0; j < matrix[0].length; j++) {
                int a = j - 1 >= 0 ? matrix[i + 1][j - 1] : Integer.MAX_VALUE;
                int b = matrix[i + 1][j];
                int c = j + 1 < matrix[0].length ? matrix[i + 1][j + 1] : Integer.MAX_VALUE;

                matrix[i][j] += Integer.min(a, Integer.min(b, c));

            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix[0].length; i++) {
            if (min > matrix[0][i]) {
                min = matrix[0][i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[][] arr = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };

        MinPathSum a = new MinPathSum();
        System.out.println(a.minFallingPathSum(arr));
    }
}

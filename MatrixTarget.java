public class MatrixTarget {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0)
            return false;

        int tRow = -1;

        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[0].length - 1])
                tRow = i;
        }
        if (tRow < 0)
            return false;

        int l = matrix[tRow].length - 1;
        int r = 0;
        int[] arr = matrix[tRow];

        for (int i = 0; i < matrix[tRow].length; i++) {
            int pivot = r + (l - r) / 2;

            if (matrix[tRow][pivot] == target)
                return true;
            if (target >= arr[r] && target <= arr[pivot]) {
                l = pivot;
            } else if (arr[pivot] >= arr[r] && arr[target] <= arr[l]) {
                r = pivot;
            }
        }
        return false;
    }
}

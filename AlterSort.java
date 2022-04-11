
import java.util.*;

public class AlterSort {

    public static void sortAlter(int[] arr) {
        Arrays.sort(arr);
        int[] res = new int[arr.length];

        int j = arr.length;
        int k = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                res[i] = arr[--j];
            else
                res[i] = arr[++k];

        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 7, 1, 2, 3, 4, 5, 6 };
        sortAlter(arr);

        System.out.println("\n++++++++++++");
        sortAlter(new int[] { 1, 6, 9, 4, 3, 7, 8, 2 });
    }
}

package amazon;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Memo {
    public static int minimizeMemory(List<Integer> processes, int m) {
        // Write your code here

        if (processes == null || processes.size() == 0 || m == 0)
            return 0;

        int totalSum = 0;

        for (int i = m; i < processes.size(); i++) {
            totalSum += processes.get(i);

        }

        int result = totalSum;

        for (int i = m; i < processes.size(); i++) {
            totalSum -= processes.get(i);
            totalSum += processes.get(i - m);

            if (result > totalSum)
                result = totalSum;
        }
        return result;
    }

    public static void main(String[] args) {
        Integer temp[] = { 10, 4, 8, 13, 20 };
        List<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(temp));
        System.out.println(minimizeMemory(lst, 2));
    }
}

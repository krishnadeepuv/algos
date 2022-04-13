package GS;

import java.util.*;

public class High5 {
    public int[][] highFive(int[][] items) {
        HashMap<Integer, ArrayList<Integer>> hs = new HashMap<>();

        for (int i = 0; i < items.length; i++) {
            int student = items[i][0];
            int score = items[i][1];
            if (hs.containsKey(student)) {
                ArrayList<Integer> lst = hs.get(student);
                lst.add(score);
                hs.put(student, lst);
            } else {
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(score);
                hs.put(student, lst);
            }
        }

        int result[][] = new int[hs.size()][2];
        int count = 0;
        for (Integer student : hs.keySet()) {
            ArrayList<Integer> temp = hs.get(student);
            Collections.sort(temp, Collections.reverseOrder());
            int total = 0;
            for (int i = 0; i < 5; i++) {
                total += temp.get(i);
            }
            result[count][0] = student;
            result[count][1] = total / 5;
            count++;
        }

        return result;
    }
}

import java.util.*;

public class ClassScheduling {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> freups = new HashMap<>();

        int pre_need_count[] = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
            pre_need_count[prerequisites[i][0]] += 1;
            if (freups.containsKey(prerequisites[i][1])) {
                List<Integer> l = freups.get(prerequisites[i][1]);
                l.add(prerequisites[i][0]);
                freups.put(prerequisites[i][1], l);
            } else {
                List<Integer> l = new ArrayList<>();
                l.add(prerequisites[i][0]);
                freups.put(prerequisites[i][1], l);
            }
        }

        Queue<Integer> q = new LinkedList<>();
        int independent = -1;
        for (int i = 0; i < numCourses; i++) {
            if (pre_need_count[i] == 0)
                q.add(i);
        }

        if (q.isEmpty())
            return false;

        while (!q.isEmpty()) {
            int curr = q.poll();
            numCourses--;
            List<Integer> l = freups.get(curr);
            // System.out.println(curr);
            if (l != null) {
                for (int i = 0; i < l.size(); i++) {
                    pre_need_count[l.get(i)] -= 1;
                    if (pre_need_count[l.get(i)] == 0)
                        q.add(l.get(i));
                }
            }

        }

        if (numCourses <= 0)
            return true;
        else
            return false;
    }
}

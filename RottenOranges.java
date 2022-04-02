import java.util.*;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                }
                if (grid[i][j] == 1)
                    fresh++;
            }
        }

        int size = q.size();

        int min = 0;
        int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        while (!q.isEmpty()) {
            for (int j = 0; j < size; j++) {
                int[] rot_pos = q.poll();
                for (int[] dir : dirs) {
                    int f, k;
                    f = rot_pos[0] + dir[0];
                    k = rot_pos[1] + dir[1];
                    if (f >= 0 && f < grid.length
                            && k < grid[0].length && k >= 0) {
                        if (grid[f][k] == 1) {
                            grid[f][k] = 2;
                            q.add(new int[] { f, k });

                            fresh--;
                        }
                    }
                }
            }
            min++;
            size = q.size();

        }
        if (fresh <= 0)
            return --min;
        else
            return -1;
    }
}

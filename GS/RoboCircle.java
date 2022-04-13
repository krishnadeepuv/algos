package GS;

public class RoboCircle {
    public boolean isRobotBounded(String instructions) {
        int dirs[][] = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };
        int curr = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < instructions.length(); i++) {
            char ch = instructions.charAt(i);
            if (ch == 'L')
                curr = (curr + 1) % 4;
            else if (ch == 'R')
                curr = (curr + 3) % 4;
            else {
                x += dirs[curr][0];
                y += dirs[curr][1];
            }

        }

        return (x == 0 && y == 0) || curr != 0;
    }
}

public class ReachingPointsExpo {

    int px = -1;
    int py = -1;

    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        px = tx;
        py = ty;
        return helper(sx, sy);
    }

    public boolean helper(int sx, int sy) {
        if (sx == px && sy == py) {
            return true;
        } else if (sx > px || sy > py)
            return false;

        // case1
        boolean x = helper(sx + sy, sy);

        // case2
        boolean y = helper(sx, sy + sx);

        return x || y;
    }
}

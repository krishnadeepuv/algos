public class ReachingPointsBT {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {

        while (sx < tx && sy < ty) {
            if (tx < ty) {
                ty %= tx;
            } else {
                tx %= ty;
            }
        }

        if (tx == sx && sy <= ty && (ty - sy) % sx == 0)
            return true;

        return (ty == sy && sx <= tx && (tx - sx) % sy == 0);
    }

}

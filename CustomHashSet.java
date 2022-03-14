/**
 * HashSet
 * Take square root of the max range given for hashing
 */
public class CustomHashSet {

    boolean[][] store;

    public CustomHashSet() {
        store = new boolean[1000][];
    }

    public void add(int key) {
        int index1 = key % 1000;
        int index2 = key / 1000;

        if (store[index1] == null) {
            store[index1] = new boolean[index1 == 0 ? 1001 : 1000];
        }

        store[index1][index2] = true;

    }

    public void remove(int key) {
        int index1 = key % 1000;
        int index2 = key / 1000;
        if (store[index1] != null)
            store[index1][index2] = false;
    }

    public boolean contains(int key) {
        int index1 = key % 1000;
        int index2 = key / 1000;
        if (store[index1] != null) {
            return store[index1][index2];
        }
        return false;
    }

}
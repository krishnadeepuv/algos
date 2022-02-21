public class HashMapCust {
    private final int[][] hashStore;

    HashMapCust() {
        hashStore = new int[90000][];
    }

    public void put(int key, int value) {

        int index = genHash(key) + 31 + key % 7;

        if (hashStore[index] == null)
            hashStore[index] = new int[] { key, value };
        else
            hashStore[index][1] = value;

    }

    public int genHash(int key) {
        return key % 20;
    }

    public int get(int key) {
        int index = genHash(key) + 31 + key % 7;

        if (hashStore[index] != null)
            return hashStore[index][1];
        else
            return -1;
    }

    public void remove(int key) {
        int index = genHash(key) + 31 + key % 7;

        hashStore[index] = null;
    }

    public static void main(String[] args) {
        HashMapCust objHs = new HashMapCust();
        objHs.remove(5);
        System.out.println(objHs.get(5));

        objHs.put(2, 3);
        objHs.put(2, 6);
        objHs.put(55, 3243);
        objHs.put(58, 71);
        objHs.put(99847, 3);
        System.out.println(2 + " - " + objHs.get(2));
        System.out.println(56 + " - " + objHs.get(56));
        System.out.println(55 + " - " + objHs.get(55));
        System.out.println(99847 + " - " + objHs.get(99847));

    }

}

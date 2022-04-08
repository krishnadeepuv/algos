public class MemoryProcess {
    public int removeMem(int[] memos, int m) {

        if (memos == null || memos.length == 0 || m == 0)
            return -1;

        int result = Integer.MAX_VALUE;
        int totalSum = 0;
        for (int i = 0; i < memos.length; i++) {
            totalSum += memos[i];
        }

        for (int i = 0; i < memos.length; i++) {
            int currSum = 0;
            for (int j = i; (j < memos.length && j < i + m); j++) {
                currSum += memos[j];
            }

            result = Math.min(result, totalSum - currSum);
        }

        return result;
    }

    public static void main(String[] args) {
        MemoryProcess objm = new MemoryProcess();

        System.out.println(objm.removeMem(new int[] { 10, 4, 8, 13, 20 }, 2));
        System.out.println(objm.removeMem(new int[] { 10, 4, 8, 1 }, 2));
    }
}

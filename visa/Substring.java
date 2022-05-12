package visa;

public class Substring {

    public static int findSubString(String str, String l) {

        if (str == null || l == null || str.length() == 0 || l.length() == 0)
            return -1;
        String lim[] = l.split("\\*", 2);
        if (!str.contains(lim[0]) || !str.contains(lim[1])) {
            return -1;
        }
        int startSub = str.indexOf(lim[0]) + lim[0].length();
        int endSub = str.indexOf(lim[1]); // + lim[1].length();

        if (endSub - startSub == 1)
            return str.indexOf(lim[0]);
        else
            return -1;
    }

    public static void main(String[] args) {
        // String sx = "sdkjfhsabbbaskljdhf";
        String sx = "sdkabjabfhsabbbaskljdhf";
        String test = "ab*ba";
        System.out.println(findSubString(sx, test));
        // System.out.println(sx.indexOf("how"));

        String subtest = test.split("\\*")[0];
        int startIndex = sx.indexOf(subtest);
        while (startIndex > 0) {
            System.out.println(startIndex);
            startIndex = sx.indexOf(subtest, startIndex + subtest.length());
        }
    }
}

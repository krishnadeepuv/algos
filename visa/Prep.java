package visa;

public class Prep {

    // s is the test striung
    // x is the format
    public static int findFormat(String s, String x) {

        if (s == null || x == null || s.length() == 0 || x.length() == 0)
            return 0;

        String limitter[] = x.split("\\*");

        if (s.indexOf(limitter[0]) < 0 || s.indexOf(limitter[1]) < 0)
            return -1;

        int res_index = s.indexOf(limitter[0]);
        while (res_index > 0) {
            int temp = res_index + limitter[0].length();
            String second = s.substring(temp + 1, temp + limitter[1].length() + 1);

            if (second.equals(limitter[1]))
                return res_index;

            res_index = s.indexOf(limitter[0], res_index + limitter[0].length());
        }

        return -1;
    }

    public static int balPar(String str) {

        int left = 0;
        int right = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')')
                if (left == 0)
                    right++;
                else
                    left--;
            else
                left++;
        }

        System.out.println(left + "," + right);
        return right + left;
    }

    public static void main(String[] args) {
        // System.out.println(findFormat("sjdurtlabkfiabkbadsffifk", "ab*ba"));

        System.out.println(balPar("()()()"));
        System.out.println(balPar("(((())))((((()"));
        System.out.println(balPar("(()()())((())"));
        System.out.println(balPar("(()()())"));
        System.out.println(balPar("()))(("));

    }
}
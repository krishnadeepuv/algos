public class CondenceString {
    public int compress(char[] chars) {

        if (chars == null || chars.length == 0)
            return 0;
        if (chars.length == 1)
            return 1;

        int newel = -1;
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                chars[++newel] = chars[i - 1];
                if (count > 1) {
                    for (int j = 0; j < ("" + count).length(); j++) {
                        chars[++newel] = ("" + count).charAt(j);
                    }
                }
                count = 1;
            }
        }
        chars[++newel] = chars[chars.length - 1];
        if (count > 1) {
            for (int j = 0; j < ("" + count).length(); j++) {
                chars[++newel] = ("" + count).charAt(j);
            }
        }

        return ++newel;

    }
}

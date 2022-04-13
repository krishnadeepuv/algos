package GS;

import java.util.HashMap;

public class MaxChar {

    public char maxchar(String s) {

        if (s == null || s.length() == 0)
            return Character.MIN_VALUE;

        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (hs.containsKey(c)) {
                hs.put(c, hs.get(c) + 1);
            } else
                hs.put(c, 1);
        }

        int max = Integer.MIN_VALUE;
        char res = '1';
        for (Character key : hs.keySet()) {
            if (hs.get(key) > max) {
                max = hs.get(key);
                res = key;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        MaxChar mc = new MaxChar();
        System.out.println(mc.maxchar("aaaaksjdhfnhhhfjusjdfhlkndvifjjjjjjjjjvnvh"));
    }
}

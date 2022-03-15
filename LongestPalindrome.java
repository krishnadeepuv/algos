import java.util.HashMap;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hs.containsKey(ch)) {
                if (hs.get(ch) + 1 == 2) {
                    max += 2;
                    hs.remove(ch);
                }
            } else {
                hs.put(ch, 1);
            }
        }

        if (hs.keySet().size() > 0)
            max++;
        return max;
    }
}

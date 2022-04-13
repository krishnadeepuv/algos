package GS;

import java.util.LinkedHashMap;

public class FirstUnique {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> hs = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (hs.containsKey(ch)) {
                hs.put(ch, -1);
            } else {
                hs.put(ch, i);
            }
        }
        for (Character key : hs.keySet()) {
            if (hs.get(key) >= 0)
                return hs.get(key);
        }

        return -1;
    }
}

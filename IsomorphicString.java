
/**
 * IsomorphicString
 */

import java.util.*;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {

        if (s == null || t == null)
            return false;
        else if (s.length() == 0 && t.length() == 0)
            return true;
        else if (s.length() != t.length())
            return false;

        HashMap<Character, Character> store1 = new HashMap<>();
        HashMap<Character, Character> store2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);

            if (store1.get(key) == null && store2.get(value) == null) {
                store1.put(key, value);
                store2.put(value, key);
            } else {
                if (store1.get(key) == null || store2.get(value) == null)
                    return false;
                else if (store1.get(key) != value || store2.get(value) != key)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
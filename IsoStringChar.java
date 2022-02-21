import java.util.*;

public class IsoStringChar {

    static public boolean wordPattern(String pattern, String s) {

        if (s == null || pattern == null)
            return false;
        else if (s.length() == 0 && pattern.length() == 0)
            return true;
        else if (s.split(" ").length != pattern.length())
            return false;
        String str[] = s.split(" ");
        HashMap<Character, String> mapper = new HashMap<>();
        HashMap<String, Character> mapper2 = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            Character key = pattern.charAt(i);
            String value = str[i];
            if (mapper.get(key) == null && mapper2.get(value) == null) {
                mapper.put(key, value);
                mapper2.put(value, key);
            } else if (mapper.get(key) == null || mapper2.get(value) == null)
                return false;
            else if (!mapper.get(key).equals(value) || !mapper2.get(value).equals(key))
                return false;

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
}

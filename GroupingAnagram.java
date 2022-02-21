import java.util.*;

public class GroupingAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Character, Integer> alphas = new HashMap<>();
        int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101 };

        HashMap<Long, ArrayList<String>> res = new HashMap<>();

        Character alpha[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };

        for (int i = 0; i < primes.length; i++) {
            alphas.put(alpha[i], primes[i]);
        }

        for (int i = 0; i < strs.length; i++) {
            Long product = (long) 1;
            for (int j = 0; j < strs[i].length(); j++) {
                char temp = strs[i].charAt(j);
                product *= alphas.get(temp);
            }
            if (res.get(product) != null)
                res.get(product).add(strs[i]);
            else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                res.put(product, temp);
            }
        }

        List<List<String>> result = new ArrayList<List<String>>();
        for (Long key : res.keySet()) {
            result.add(res.get(key));
        }

        return result;

    }

    public static void main(String[] args) {
        String[] strs = { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        GroupingAnagram obj = new GroupingAnagram();
        obj.groupAnagrams(strs);
    }
}

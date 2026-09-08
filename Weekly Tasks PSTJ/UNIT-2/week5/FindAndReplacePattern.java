import java.util.*;

public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String w : words) if (match(w, pattern)) res.add(w);
        return res;
    }
    private boolean match(String w, String p) {
        Map<Character, Character> m1 = new HashMap<>(), m2 = new HashMap<>();
        for (int i = 0; i < w.length(); i++) {
            char wChar = w.charAt(i), pChar = p.charAt(i);
            if (!m1.containsKey(wChar)) m1.put(wChar, pChar);
            if (!m2.containsKey(pChar)) m2.put(pChar, wChar);
            if (m1.get(wChar) != pChar || m2.get(pChar) != wChar) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new FindAndReplacePattern().findAndReplacePattern(
            new String[]{"abc","deq","mee","aqq","dkd","ccc"}, "abb"));
    }
}
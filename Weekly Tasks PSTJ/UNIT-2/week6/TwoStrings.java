public class TwoStrings {
    public static String twoStrings(String s1, String s2) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1) return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        System.out.println(twoStrings("hello", "world"));
    }
}
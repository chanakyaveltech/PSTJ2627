public class NaivePatternSearching {
    public static void search(String txt, String pat) {
        int m = pat.length(), n = txt.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) break;
            }
            if (j == m) System.out.println("Pattern found at index " + i);
        }
    }
    public static void main(String[] args) {
        search("AABAACAADAABAABA", "AABA");
    }
}
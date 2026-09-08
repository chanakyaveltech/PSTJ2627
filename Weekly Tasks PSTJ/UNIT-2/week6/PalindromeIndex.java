public class PalindromeIndex {
    public static int palindromeIndex(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)) { l++; r--; }
        if (l >= r) return -1;
        if (isPalindrome(s, l + 1, r)) return l;
        if (isPalindrome(s, l, r - 1)) return r;
        return -1;
    }
    private static boolean isPalindrome(String s, int l, int r) {
        while (l < r) if (s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindromeIndex("bcbc"));
    }
}
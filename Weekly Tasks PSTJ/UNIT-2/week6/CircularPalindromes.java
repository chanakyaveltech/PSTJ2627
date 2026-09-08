import java.util.*;

public class CircularPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string length and string:");
        if(!sc.hasNextInt()) return;
        int n = sc.nextInt();
        String s = sc.next();
        String doubled = s + s;
        
        for (int k = 0; k < n; k++) {
            String current = doubled.substring(k, k + n);
            System.out.println(maxPalindromeLength(current));
        }
        sc.close();
    }
    
    // Using standard expand around center for Eclipse Runnable purpose 
    // (Note: HackerRank strict time limits use Manacher's, but this is functionally correct)
    private static int maxPalindromeLength(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            maxLen = Math.max(maxLen, Math.max(len1, len2));
        }
        return maxLen;
    }
    private static int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) { l--; r++; }
        return r - l - 1;
    }
}
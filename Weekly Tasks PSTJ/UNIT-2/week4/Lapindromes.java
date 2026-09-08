import java.util.*;

public class Lapindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int len = s.length();
            String s1 = s.substring(0, len / 2);
            String s2 = s.substring((len + 1) / 2);
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            System.out.println(Arrays.equals(arr1, arr2) ? "YES" : "NO");
        }
        sc.close();
    }
}
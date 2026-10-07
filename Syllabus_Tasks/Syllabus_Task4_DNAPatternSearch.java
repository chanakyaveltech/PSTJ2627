package Syllabus_Tasks;

import java.util.*;

public class Syllabus_Task4_DNAPatternSearch {
    static int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
        return lps;
    }

    static List<Integer> kmpSearch(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        int[] lps = buildLPS(pattern);
        int i = 0, j = 0;
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    result.add(i - j);
                    j = lps[j - 1];
                }
            } else if (j != 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        String pattern = sc.nextLine().trim();

        List<Integer> indices = kmpSearch(text, pattern);
        StringBuilder sb = new StringBuilder();
        for (int idx : indices) {
            sb.append(idx).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}

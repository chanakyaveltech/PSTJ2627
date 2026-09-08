import java.util.*;

public class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count++;
            if (vowels.indexOf(s.charAt(s.length() / 2 + i)) != -1) count--;
        }
        return count == 0;
    }
    public static void main(String[] args) {
        System.out.println(new DetermineIfStringHalvesAreAlike().halvesAreAlike("book"));
    }
}
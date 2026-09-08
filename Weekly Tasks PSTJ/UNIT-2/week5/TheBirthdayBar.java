import java.util.*;

public class TheBirthdayBar {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) sum += s.get(i + j);
            if (sum == d) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(1,2,1,3,2), 3, 2));
    }
}
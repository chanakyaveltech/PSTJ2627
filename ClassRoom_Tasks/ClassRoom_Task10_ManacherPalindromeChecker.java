package ClassRoom_Tasks;

class Manacher {
    int[] p;

    String ms;

    Manacher(String s) {
        ms = "@";
        for (char c : s.toCharArray()) {
            ms += "#" + c;
        }
        ms += "#$";

        runManacher();
    }

    void runManacher() {
        int n = ms.length();
        p = new int[n];
        int l = 0, r = 0;

        for (int i = 1; i < n - 1; ++i) {
            int mirror = l + r - i;

            if (i < r)
                p[i] = Math.min(r - i, p[mirror]);

            while (ms.charAt(i + 1 + p[i]) == ms.charAt(i - 1 - p[i])) {
                ++p[i];
            }

            if (i + p[i] > r) {
                l = i - p[i];
                r = i + p[i];
            }
        }
    }

    int getLongest(int cen, int odd) {
        int pos = 2 * cen + 2 + (odd == 0 ? 1 : 0);
        return p[pos];
    }

    boolean check(int l, int r) {
        int len = r - l + 1;
        int cen = (l + r) / 2;
        return len <= getLongest(cen, len % 2);
    }
}

public class ClassRoom_Task10_ManacherPalindromeChecker {
    public static void main(String[] args) {
        String s = "ababa";
        Manacher manacher = new Manacher(s);

        System.out.println("Input: " + s);
        System.out.println("check(0, 4) -> " + manacher.check(0, 4));
        System.out.println("check(1, 3) -> " + manacher.check(1, 3));
        System.out.println("check(0, 2) -> " + manacher.check(0, 2));
        System.out.println("check(1, 2) -> " + manacher.check(1, 2));
        System.out.println("check(0, 1) -> " + manacher.check(0, 1));
        System.out.println("getLongest(cen=2, odd=1) -> " + manacher.getLongest(2, 1));
    }
}

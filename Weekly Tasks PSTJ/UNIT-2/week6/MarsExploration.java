public class MarsExploration {
    public static int marsExploration(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != "SOS".charAt(i % 3)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
    }
}
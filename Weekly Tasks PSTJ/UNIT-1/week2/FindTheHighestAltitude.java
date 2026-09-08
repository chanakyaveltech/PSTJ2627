public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0, current = 0;
        for (int g : gain) {
            current += g;
            max = Math.max(max, current);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(new FindTheHighestAltitude().largestAltitude(new int[]{-5,1,5,0,-7}));
    }
}
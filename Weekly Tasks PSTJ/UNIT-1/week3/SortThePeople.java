import java.util.*;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < names.length; i++) map.put(heights[i], names[i]);
        return map.values().toArray(new String[0]);
    }
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(new SortThePeople().sortPeople(names, heights)));
    }
}
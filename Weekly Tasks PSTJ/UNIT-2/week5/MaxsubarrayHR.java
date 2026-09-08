import java.util.*;

public class MaxsubarrayHR {
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxContig = arr.get(0), currentSum = arr.get(0);
        int maxNonContig = 0, maxVal = arr.get(0);
        boolean hasPositive = false;
        
        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            if (i > 0) {
                currentSum = Math.max(val, currentSum + val);
                maxContig = Math.max(maxContig, currentSum);
            }
            if (val > 0) { maxNonContig += val; hasPositive = true; }
            maxVal = Math.max(maxVal, val);
        }
        if (!hasPositive) maxNonContig = maxVal;
        return Arrays.asList(maxContig, maxNonContig);
    }
    public static void main(String[] args) {
        System.out.println(maxSubarray(Arrays.asList(1, 2, 3, -4, 5, 6)));
    }
}
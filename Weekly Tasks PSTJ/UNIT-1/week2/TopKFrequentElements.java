import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) count.put(n, count.getOrDefault(n, 0) + 1);
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));
        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) heap.poll();
        }
        return heap.stream().mapToInt(Number::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TopKFrequentElements().topKFrequent(new int[]{1,1,1,2,2,3}, 2)));
    }
}
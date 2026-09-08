import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N and M followed by the array elements:");
        if(!in.hasNextInt()) return;
        int n = in.nextInt();
        int m = in.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int max = 0;
        
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if (deque.size() == m) {
                max = Math.max(max, set.size());
                int first = deque.removeFirst();
                if (!deque.contains(first)) set.remove(first);
            }
        }
        System.out.println(max);
        in.close();
    }
}
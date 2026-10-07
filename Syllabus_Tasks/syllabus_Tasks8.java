import java.util.*;
import java.util.stream.*;

public class task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> graph = new HashMap<>();

        IntStream.rangeClosed(1, n)
                .forEach(i -> graph.put(i, new ArrayList<>()));

        IntStream.range(0, m).forEach(i -> {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        });

        int source = sc.nextInt();
        int destination = sc.nextInt();

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            graph.get(current).stream()
                    .filter(next -> !visited.contains(next))
                    .forEach(next -> {
                        visited.add(next);
                        queue.add(next);
                    });
        }

        System.out.println(
                visited.contains(destination) ? "YES" : "NO"
        );

        sc.close();
    }
}
// output
// 5 4
// 2 1
// 3 4
// 1 4
// 5 4
// 2 4
// YES
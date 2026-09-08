import java.util.*;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        if(!in.hasNextInt()) return;
        int n = in.nextInt();
        List<List<Integer>> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < d; j++) list.add(in.nextInt());
            lines.add(list);
        }
        System.out.println("Enter number of queries:");
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            if (x < lines.size() && y < lines.get(x).size()) System.out.println(lines.get(x).get(y));
            else System.out.println("ERROR!");
        }
        in.close();
    }
}
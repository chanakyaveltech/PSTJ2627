import java.util.*;
import java.util.stream.*;

public class task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> hashtags = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            hashtags.add(sc.next());
        }

        hashtags.stream()
                .collect(Collectors.groupingBy(
                        h -> h,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .forEach((hashtag, count) ->
                        System.out.println(hashtag + " " + count));
    }
}
// output
// 5
// java
// python
// ai
// alml
// aids
// java 1
// python 1
// ai 1
// alml 1
// aids 1
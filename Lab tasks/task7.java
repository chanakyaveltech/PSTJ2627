import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashtagFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();       
        Map<String, Integer> hashtagCounts = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String hashtag = scanner.next();
            hashtagCounts.put(hashtag, hashtagCounts.getOrDefault(hashtag, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : hashtagCounts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        scanner.close();
    }
}

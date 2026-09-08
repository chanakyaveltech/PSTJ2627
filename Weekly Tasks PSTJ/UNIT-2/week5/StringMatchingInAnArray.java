import java.util.*;

public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(new StringMatchingInAnArray().stringMatching(new String[]{"mass","as","hero","superhero"}));
    }
}
import java.util.*;

public class DesignBrowserHistory {
    List<String> history;
    int curr;

    public DesignBrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        curr = 0;
    }
    
    public void visit(String url) {
        // Clear all forward history
        while (history.size() > curr + 1) {
            history.remove(history.size() - 1);
        }
        history.add(url);
        curr++;
    }
    
    public String back(int steps) {
        curr = Math.max(0, curr - steps);
        return history.get(curr);
    }
    
    public String forward(int steps) {
        curr = Math.min(history.size() - 1, curr + steps);
        return history.get(curr);
    }

    public static void main(String[] args) {
        DesignBrowserHistory bh = new DesignBrowserHistory("leetcode.com");
        bh.visit("google.com");
        bh.visit("facebook.com");
        System.out.println(bh.back(1)); // returns "google.com"
        System.out.println(bh.back(1)); // returns "leetcode.com"
        System.out.println(bh.forward(1)); // returns "google.com"
    }
}
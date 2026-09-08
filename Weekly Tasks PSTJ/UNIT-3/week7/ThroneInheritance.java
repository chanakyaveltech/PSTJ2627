import java.util.*;

public class ThroneInheritance {
    String king;
    Map<String, List<String>> family;
    Set<String> dead;

    public ThroneInheritance(String kingName) {
        this.king = kingName;
        family = new HashMap<>();
        dead = new HashSet<>();
        family.put(king, new ArrayList<>());
    }
    
    public void birth(String parentName, String childName) {
        family.computeIfAbsent(parentName, k -> new ArrayList<>()).add(childName);
    }
    
    public void death(String name) {
        dead.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        dfs(king, order);
        return order;
    }
    
    private void dfs(String curr, List<String> order) {
        if (!dead.contains(curr)) {
            order.add(curr);
        }
        if (family.containsKey(curr)) {
            for (String child : family.get(curr)) {
                dfs(child, order);
            }
        }
    }

    public static void main(String[] args) {
        ThroneInheritance t = new ThroneInheritance("king");
        t.birth("king", "andy");
        t.birth("king", "bob");
        t.birth("king", "catherine");
        t.birth("andy", "matthew");
        t.birth("bob", "alex");
        t.birth("bob", "asha");
        System.out.println("Before death: " + t.getInheritanceOrder()); // [king, andy, matthew, bob, alex, asha, catherine]
        t.death("bob");
        System.out.println("After bob dies: " + t.getInheritanceOrder()); // [king, andy, matthew, alex, asha, catherine]
    }
}
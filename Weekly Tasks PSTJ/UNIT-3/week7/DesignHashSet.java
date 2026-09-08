public class DesignHashSet {
    boolean[] set;

    public DesignHashSet() {
        set = new boolean[1000001]; // Fits maximum LeetCode constraint
    }
    
    public void add(int key) {
        set[key] = true;
    }
    
    public void remove(int key) {
        set[key] = false;
    }
    
    public boolean contains(int key) {
        return set[key];
    }

    public static void main(String[] args) {
        DesignHashSet myHashSet = new DesignHashSet();
        myHashSet.add(1);      
        myHashSet.add(2);      
        System.out.println(myHashSet.contains(1)); // returns true
        System.out.println(myHashSet.contains(3)); // returns false, (not found)
        myHashSet.add(2);      
        System.out.println(myHashSet.contains(2)); // returns true
        myHashSet.remove(2);   
        System.out.println(myHashSet.contains(2)); // returns false, (already removed)
    }
}
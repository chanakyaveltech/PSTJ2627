import java.util.*;

class StudentPQ implements Comparable<StudentPQ> {
    int id; String name; double cgpa;
    public StudentPQ(int id, String name, double cgpa) { this.id = id; this.name = name; this.cgpa = cgpa; }
    public int getID() { return id; }
    public String getName() { return name; }
    public double getCGPA() { return cgpa; }
    public int compareTo(StudentPQ o) {
        if (this.cgpa == o.cgpa) {
            if (this.name.equals(o.name)) return Integer.compare(this.id, o.id);
            return this.name.compareTo(o.name);
        }
        return Double.compare(o.cgpa, this.cgpa);
    }
}

public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of events:");
        if(!scan.hasNextInt()) return;
        int n = scan.nextInt();
        PriorityQueue<StudentPQ> pq = new PriorityQueue<>();
        while (n-- > 0) {
            String event = scan.next();
            if (event.equals("ENTER")) pq.add(new StudentPQ(scan.nextInt(), scan.next(), scan.nextDouble()));
            else if (event.equals("SERVED") && !pq.isEmpty()) pq.poll();
        }
        if (pq.isEmpty()) System.out.println("EMPTY");
        else while (!pq.isEmpty()) System.out.println(pq.poll().getName());
        scan.close();
    }
}
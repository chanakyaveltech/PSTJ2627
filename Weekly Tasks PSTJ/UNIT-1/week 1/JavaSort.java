import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) { super(); this.id = id; this.fname = fname; this.cgpa = cgpa; }
    public int getId() { return id; }
    public String getFname() { return fname; }
    public double getCgpa() { return cgpa; }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of students:");
        if(!in.hasNextInt()) return;
        int testCases = Integer.parseInt(in.nextLine());
        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            studentList.add(new Student(id, fname, cgpa));
            testCases--;
        }
        studentList.sort(Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getFname).thenComparing(Student::getId));
        for(Student st: studentList) { System.out.println(st.getFname()); }
        in.close();
    }
}
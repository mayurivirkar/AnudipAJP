import java.util.HashSet;

public class Student {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public String toString() {
        return "\n id: " + id + " name: " + name + " \n";
    }

    public static void main(String[] args) {

        Student s = new Student(1, "swapnil");

        HashSet<Student> hs = new HashSet<Student>();

        hs.add(new Student(1, "Swapnil"));
        hs.add(new Student(2, "om"));
        hs.add(new Student(3, "Prachi"));
        hs.add(new Student(3, "Mayuri"));
        

        System.out.println(hs);
    }

}

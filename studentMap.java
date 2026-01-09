import java.util.HashMap;

class student {
    int id;
    String name;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "\n id: " + id + " name: " + name + " \n";
    }

}

public class studentMap {
    public static void main(String[] args) {
        student s = new student(1, "Mayuri");

        HashMap<Integer, student> hm = new HashMap<Integer, student>();
        hm.put(1, s);
        hm.put(2, new student(2, "Prachi"));

        System.out.println(hm);

    }
}
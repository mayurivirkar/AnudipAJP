import java.util.HashMap;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "\n id: " + id + " name: " + name + " \n";
    }

    public static void main(String[] args) {
        Employee e = new Employee(1, "Mayuri");
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Mayuri");
        hm.put(2, "Prachi");

        System.out.println(hm);
        System.out.println(hm.get(1));
        System.out.println(hm.containsKey(2));
    }
}
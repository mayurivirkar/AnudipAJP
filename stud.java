public class stud {
    int id;
    String name;

    public stud(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "\n id: " + id + " name: " + name + " \n";
    }

    public static void main(String[] args) {
        stud s = new stud(1, "swapnil");
        System.out.println(s);
    }
}
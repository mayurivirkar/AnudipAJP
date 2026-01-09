import java.util.Scanner;

interface convater {
    void m1(String a);
}

public class lambda_expressions_strings {

    public static void main(String[] args) {

        convater upper = (String a) -> {

            String up = a.toUpperCase();
            System.out.println("Upper case: " + up);
        };
        convater lower = (String a) -> {
            System.out.println("Lower case: " + a.toLowerCase());
        };

        convater reverse = (String a) -> {

            String s = new StringBuilder(a).reverse().toString();
            System.out.println("Reverse String: " + s);
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr String: ");
        String s = sc.nextLine();

        upper.m1(s);
        lower.m1(s);
        reverse.m1(s);

    }

}

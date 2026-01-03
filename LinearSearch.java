import java.util.Scanner;

class LinearSearch {
    public static void main(String args[]) {
        int count = 0;
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            count = count + arr[i];

        }
        // System.out.println("sum of array : "+count);
        System.out.println("Enter Element to Search: ");
        int elemen = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (elemen == arr[i]) {
                System.out.println("index:" + i);
                System.out.println("Element found");
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Element not found");

        }
    }

}

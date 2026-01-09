import java.util.*;
public class Addevennum {
	public static void main(String args[]) {
		
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		
		for(int i = 0; i<size;i++) {
			arr[i] =sc.nextInt(); 
			if(arr[i]%2 == 0) {
			count = count+arr[i];
			}			
			
		}
		System.out.println("sum of array : "+count);
		
		
		//Reverse the string
		String s = "Hello";

        char[] str = s.toCharArray();

        for (int i = str.length - 1; i >= 0; i--)
            System.out.print(str[i]);
	}

}

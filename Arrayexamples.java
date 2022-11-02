package Arrayex;
import java.util.*;
public class Arrexamples {
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
		
		
		String[]arr2 = new String[3];
		arr2[0] = "kanika";
		arr2[1] = "tyagi";
		arr2[2] = "tyagi1";
		System.out.println(Arrays.toString(arr2));
		
		
	}
}


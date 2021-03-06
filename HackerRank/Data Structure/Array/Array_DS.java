import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Array_DS {
	
	  private static final Scanner scanner = new Scanner(System.in);
	  
	static int[] reverseArray(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; ++i) {
			
			if (i <= a.length-(i+1)) 
			{
			b[i] = a[a.length - (i+1)];
			b[a.length - (i+1)] = a[i];
			}
			else {
				break;
			}
		}
		return b;
		
	}
	public static void main(String[] args) {
		int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);
        System.out.println(Arrays.toString(res));
		

	}
}

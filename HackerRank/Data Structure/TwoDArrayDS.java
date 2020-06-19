import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArrayDS {
	private static final Scanner scanner = new Scanner(System.in);
	
	static int hourglassSum(int[][] arr) {
		int maxval = Integer.MIN_VALUE;
		
		for (int i = 0; i<4;++i)
		{
			
			for (int j = 1; j < 5; ++j) 
			{
				int val = arr[i][j-1] + arr[i][j] +arr[i][j+1] +arr[i+1][j] +arr[i+2][j-1] +arr[i+2][j] +arr[i+2][j+1];
				
				if (maxval < val) {
					
					maxval = val;
				}
			}
		}
		
		return maxval;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        //scanner.close();
	}

}

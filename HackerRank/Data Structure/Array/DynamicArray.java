import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        int lastAns = 0;
        
        /* Create 2-D ArrayList */
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lists.add(new ArrayList<Integer>());
        }
        
        /* Perform Q Queries */
        for (int i = 0; i < Q; i++) {
            int q = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> seq = lists.get((x ^ lastAns) % N);
            if (q == 1) {
                seq.add(y);
            } else if (q == 2) {
                lastAns = seq.get(y % seq.size());
                System.out.println(lastAns);
            }
        }
        
        scan.close();
	}

}
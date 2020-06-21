import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            lists.add(new ArrayList<Integer>());
        }
        ArrayList<Integer> seq = lists.get(0);
        seq.add(3);
        System.out.println(seq);
        System.out.println(lists.get(0));
	}

}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PrintLinkedList {
	
	public static void printLList(SinglyLinkedListNode head) {
        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;

        }

    }

 

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     
    	SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        printLList(llist.head);

        scanner.close();
    }
	

	       
	

}

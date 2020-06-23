import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class InsertTailLinkedList {

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

    	SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    	if (head == null) 
    	{
    		head = newNode;
    	}
    	else
    	{
    		SinglyLinkedListNode last = head;
    		while(last.next != null) {
    			
    			last = last.next;
    		}
    		last.next = newNode;
    		
    	}
    	return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        	
          SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);

          llist.head = llist_head;
        }
       

        PrintLinkedList.printLList(llist.head);

       // printSinglyLinkedList(llist.head, "\n", bufferedWriter);
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }

}
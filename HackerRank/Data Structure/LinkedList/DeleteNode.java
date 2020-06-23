import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DeleteNode {
	
	static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
		SinglyLinkedListNode delval = head;
		if (position == 0)
		{
			head = delval.next;
			delval = null;
			
		}
		else
		{
			SinglyLinkedListNode prev = head;
			for (int i = 0; i < position; ++i)
			{
				delval = delval.next;
				
				if (i != position -1 )
				{
					prev = prev.next;
					
				}
				
			}
			prev.next = delval.next;
			delval = null;
		
		}
		return head;

    }
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);
        PrintLinkedList.printLList(llist1);
        /*printSinglyLinkedList(llist1, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }
}

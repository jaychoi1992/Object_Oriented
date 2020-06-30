import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MergePoint {

	static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode ptr1 = head1;
        SinglyLinkedListNode ptr2 = head2;
        while (ptr1 != ptr2) {

            if (ptr1.next == null)
            {
                ptr1 = head2;
            }
            else {
                ptr1 = ptr1.next;
            }
            if (ptr2.next == null)
            {
                ptr2 = head1;
            }
            else {

                ptr2 = ptr2.next;
            }
        }
        return ptr2.data;

}

private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int tests = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int testsItr = 0; testsItr < tests; testsItr++) {
        int index = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedList llist1 = new SinglyLinkedList();

        int llist1Count = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llist1Count; i++) {
            int llist1Item = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist1.insertNode(llist1Item);
        }
      
      	SinglyLinkedList llist2 = new SinglyLinkedList();

        int llist2Count = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llist2Count; i++) {
            int llist2Item = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist2.insertNode(llist2Item);
        }
      
      	SinglyLinkedListNode ptr1 = llist1.head;
        SinglyLinkedListNode ptr2 = llist2.head;

        for (int i = 0; i < llist1Count; i++) {
            if (i < index) {
                ptr1 = ptr1.next;
            }
        }

        for (int i = 0; i < llist2Count; i++) {
            if (i != llist2Count-1) {
                ptr2 = ptr2.next;
            }
        }

        ptr2.next = ptr1;

        int result = findMergeNode(llist1.head, llist2.head);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
    }

    bufferedWriter.close();

    scanner.close();
}

}

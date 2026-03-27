import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // 1. Read the number of elements
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            // 2. Read N integers and add to the LinkedList
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            // 3. Get the ListIterator
            ListIterator<Integer> it = list.listIterator();

            // 4. Forward Traversal
            System.out.print("Forward:");
            while (it.hasNext()) {
                System.out.print(" " + it.next());
            }
            System.out.println();

            // 5. Backward Traversal
            // Note: The iterator 'it' is currently at the end of the list
            System.out.print("Backward:");
            while (it.hasPrevious()) {
                System.out.print(" " + it.previous());
            }
            System.out.println();
        }
        
        sc.close();
    }
}

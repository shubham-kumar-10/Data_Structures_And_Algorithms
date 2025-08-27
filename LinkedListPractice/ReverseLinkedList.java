package Data_Structures_And_Algorithms.LinkedListPractice;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    public static Node reverseLinkedList(Node head) {
         Node prev = null;
         Node current = head;
         Node next = null;
         while (current != null) {
              next = current.next; // Store next node
              current.next = prev; // Reverse current node's pointer
              prev = current;      // Move pointers one position ahead
              current = next;
         }
         return prev; // New head of the reversed list
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
   public static void main(String[] args) {
    // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    System.out.println("Original Linked List:");
    printList(head);

    head = reverseLinkedList(head);

    System.out.println("Reversed Linked List:");
    printList(head);
   } 
}

// Time Complexity: O(N) where N is the number of nodes in the linked list
// Space Complexity: O(1) as we are using only a constant amount of extra space
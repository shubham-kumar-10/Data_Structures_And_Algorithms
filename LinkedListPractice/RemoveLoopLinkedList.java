package Data_Structures_And_Algorithms.LinkedListPractice;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class RemoveLoopLinkedList {

    public static void detectAndRemoveLoop(Node head){
        if(head==null || head.next==null)
          return;
        
        Node slow=head,fast=head;
        boolean loopExists=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                loopExists=true;
                break;
            }
        }

        if(loopExists){
            slow=head;
            if(slow==fast){ // when loop starts from head itself
                while(fast.next!=slow)
                  fast=fast.next;
            } else {
                while(slow.next!=fast.next){
                    slow=slow.next;
                    fast=fast.next;
                }
            }
            fast.next=null; // remove the loop
        }
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        //head.next.next.next.next.next=head.next; // Creating a loop for testing purpose
        head.next.next.next.next.next=head;
        detectAndRemoveLoop(head);  // 1->2->3->4->5 (cycles to 2)
        System.out.println("Linked list after removing loop:");
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }   
     // Test case for cycle pointing to head
    }
}

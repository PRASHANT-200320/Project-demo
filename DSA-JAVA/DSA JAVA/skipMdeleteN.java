import java.util.*;

public class skipMdeleteN {


public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}


public static void skipMdeleteN(Node head,int M,int N){
Node curr = head;
Node t;
int count;


while(curr!=null){

    for(count=1;count<M && curr!=null; count++){

        curr=curr.next;
    }
        if(curr == null){
            return;
        }
        t = curr.next;
    

    for(count=1;count<=N && t!=null; count++){

        t = t.next;
    }

    curr.next=t;
    curr =t;
   }
}


 public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }




    public static void main(String[] args) {
        // Creating the linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original Linked List:");
        printList(head);

        // Skipping 2 nodes and deleting 3 nodes
        skipMdeleteN(head, 2, 3);

        System.out.println("Modified Linked List:");
        printList(head);
    }


}
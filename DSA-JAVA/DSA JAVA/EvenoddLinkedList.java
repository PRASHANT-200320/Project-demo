import java.util.*;

public class EvenoddLinkedList {


public class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public static Node head;
public static Node tail;



public class segregateEvenOdd(ListNode head) {

    if(head == null || head.next == null){
        return head;
    }

    Node evenhead  = new Node(0);
    Node oddhead  = new Node(0);

    Node evenTail = evenhead;
    Node oddTail = oddhead;
    Node current = head;


    while(current! = null){
        if(current.data % 2 ==0){
            evenTail.next = current;
            evenTail = evenTail.next;
        }
        else{
            oddTail.next = current;
            oddTail = oddTail.next;
        }
        current = current.next;
    }

    evenTail.next = oddhead.next;
    oddTail.next = null;

    return evenhead.next;
}


// Method to add nodes to the list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


 // Method to print the linked list
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }




 public static void main(String[] args) {

        EvenoddLinkedList list = new EvenoddLinkedList();

 // Adding some nodes
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        System.out.println("Original List:");
        list.printList(list.head);

        list.head = list.segregateEvenOdd(list.head);

        System.out.println("Segregated List:");
        list.printList(list.head);
    }

}
































}
import java.util.*;


public class cycleLL {



public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public static Node head;
public static Node tail;


//cycle

public static boolean iscycle() {

    Node slow =head;
    Node fast = head;

    while(fast!=null && fast.next != null) {
        slow =slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }
    }
    return false;
}



//remove cycle




public static void removecycle() {

    Node slow =head;
    Node fast = head;

    while(fast!=null && fast.next != null) {
        slow =slow.next;
        fast = fast.next.next;
        if(slow == fast){
            break;
        }
    }
  if(fast == null && fast.next == null){
    return;
  }

    slow = head;
   Node prev = null;

   while(slow!=fast){
     prev=fast;
    slow =slow.next;
    fast = fast.next;
   }

   prev.next=null;
}




public static void main(String[] args) {
    cycleLL list = new cycleLL();

    // Adding elements to the list
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(2);
    head.next.next.next = new Node(1);

      head.next.next.next.next = head.next;


    System.out.println(iscycle());
    removecycle();
      System.out.println(iscycle());
}









}
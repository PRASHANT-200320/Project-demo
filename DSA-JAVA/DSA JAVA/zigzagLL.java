import java.util.*;


public class zigzagLL {



public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}


    public static Node head;


public void zigzag() {

    //find mid

    Node slow =head;
    Node fast = head;

    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid =slow;

    //reverse 2nd half

    Node curr =mid.next;
    mid.next=null;
    Node prev =null;
    Node next;


    while(curr!=null){
       next = curr.next;
       curr.next =prev;
       prev =curr;
       curr =next;
    }

    Node left =head;
    Node right=prev;
    Node nextL,nextR;


    //alternate zig-zag

    while(left!=null && right!=null){

      nextL =  left.next;
      left.next =right;
      nextR =right.next;
      right.next =nextL;

      left =nextL;
      right=nextR;
    }

}



public void print(Node head){
    if(head==null){
        System.out.print("LL is empty");
        return;
    }
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println();
}



public static void main(String args[]){


 zigzagLL li = new zigzagLL();

        // Create linked list
        li.head = new Node(4);
        li.head.next = new Node(2);
        li.head.next.next = new Node(1);
        li.head.next.next.next = new Node(3);

        System.out.println("Original List:");
        li.print(li.head);

        // Sort the list
       li.zigzag();

        System.out.println("zigzag List:");
        li.print(li.head);

}

}
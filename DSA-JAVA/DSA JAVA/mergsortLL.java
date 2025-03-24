import java.util.*;

public class mergsortLL {


public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}


    public Node head;



public Node getmid(Node head) {

    Node slow =head;
    Node fast = head.next;

    while(fast!=null && fast.next!=null){

        slow =slow.next;
        fast = fast.next.next;
    }
    return slow;
}


public Node merge(Node head1,Node head2){

    Node mergell =new Node(-1);

    Node temp = mergell;

    while(head1!=null &&  head2!=null){
        if(head1.data <= head2.data){
             temp.next = head1;
             head1 = head1.next;
             temp = temp.next;
        }
        else{

             temp.next = head2;
             head2 = head2.next;
             temp = temp.next;
        }
    }


    while(head1!=null){
             temp.next = head1;
             head1 = head1.next;
             temp = temp.next;
    }

    
    while(head2!=null){
             temp.next = head2;
             head2 = head2.next;
             temp = temp.next;
    }

return mergell.next;


}


public Node mergsort(Node head) {
    if(head == null || head.next == null){
        return head;
    }

    //find mid

    Node mid = getmid(head);

    //left && right

    Node righthead =mid.next;
    mid.next = null;

    Node newleft = mergsort(head);
    Node newright = mergsort(righthead);

    //merge

     return merge(newleft,newright);

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


 mergsortLL li = new mergsortLL();

        // Create linked list
        li.head = new Node(4);
        li.head.next = new Node(2);
        li.head.next.next = new Node(1);
        li.head.next.next.next = new Node(3);

        System.out.println("Original List:");
        li.print(li.head);

        // Sort the list
        li.head = li.mergsort(li.head);

        System.out.println("Sorted List:");
        li.print(li.head);

}





}
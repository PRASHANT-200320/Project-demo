import java.util.*;

public class GetIntersectionNode {


public static class Node{

    int data;
    Node next;

    public  Node(int data){
        this.data = data;
        this.next = null;
    }
}


public Node GetIntersectionNode(Node head1,Node head2){

    while(head2!=null){

        Node temp =head1;
        while(temp!=null){
            if(head2 == temp){
                return head2;
            }
            temp = temp.next;
        }
        head2 =head2.next;
    }
    return null;
}


public static void main(String agrs[]) {

    GetIntersectionNode li =new GetIntersectionNode();
   

  // Creating two linked lists
        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        Node intersection = new Node(15);
        head1.next.next.next = intersection;
        intersection.next = new Node(30);

        Node head2 = new Node(10);
        head2.next = intersection; // Intersection point

        // Finding the intersection node
        Node result = li.GetIntersectionNode(head1, head2);

        if (result != null) {
            System.out.println("The intersection point is: " + result.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}





























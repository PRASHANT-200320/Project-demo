import java.util.*;

public class LLpalindrome {


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
public static int size;


public Node findmid(Node head){
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}

public boolean checkpalindrom(){

    if(head == null || head.next==null){

        return true;

    }

// step1-findmid

    Node midNode = findmid(head);

    //step2-reverse

    Node prev =null;
    Node curr =midNode;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    } 
    
    Node Right = prev;
    Node left=head;


    //step3-check left & right

    while(Right!=null){
        if(left.data !=Right.data){
            return false;
        }
        left=left.next;
        Right=Right.next;
    }
    return true;
}


public void print(){
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

public static void main(String[] args) {
    LLpalindrome list = new LLpalindrome();

    // Adding elements to the list
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(2);
    head.next.next.next = new Node(1);

    list.print();
    System.out.println("Is Palindrome: " + list.checkpalindrom());
}


}
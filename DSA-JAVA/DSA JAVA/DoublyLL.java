import java.util.*;

public class DoublyLL {


public static class Node {
    int data;
    Node next;
    Node prev;


    public Node(int data){
        this.data =data;
        this.next =null;
        this.prev =null;
    }

}

public static Node head;
public static Node tail;
public static int size;


//addfirst

public void addfirst(int data) {

    Node newnode =new Node(data);
   size++;
    if(head == null){
        head = tail = newnode;
        return;
    }

    newnode.next = head;
    head.prev =newnode;
    head =newnode;
}

//addlast


public void addlast(int data){
    Node newnode = new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    tail.next=newnode;
    newnode.prev=tail;
    tail=newnode;
}


//add index


public void addindex(int idx,int data){
    if(idx == 0){
        addfirst(data);
        return;
    }
     Node newnode = new Node(data);
     size++;
     Node temp =head;
     int i =0;
     while(i<idx-1){
        temp = temp.next;
        i++;
     }
     newnode.next =temp.next;
     newnode.prev=temp;
     if(temp.next!=null){
           
        temp.next.prev=newnode;   
     }
     temp.next = newnode;
}


//remove first


public static int removefirst() {

    if(size == 0){
        System.out.print("LL is empty");
        return -1;
    }
    else if(size == 1){
        int val = head.data;
        head=tail=null;
        size=0;
        return val;
    }

    int val =head.data;
     head = head.next;
     head.prev=null;
     size--;
     return val;
}


//remove last


public static int removelast() {

    if(size == 0){
        System.out.print("LL is empty");
        return -1;
    }
    else if(size == 1){
        int val = head.data;
        head=tail=null;
        size=0;
        return val;
    }
    Node prev=tail.prev;
  int val = tail.data;
  prev.next=null;
  tail=prev;
     size--;
     return val;
}


// removeAtIndex



public void removeAtIndex(int index) {
    if (head == null) {
        System.out.println("LL is empty");
        return;
    }

    // If the index is 0, remove the first node
    if (index == 0) {
       removefirst();
        return;
    }

    Node temp = head;
    int count = 0;

    // Traverse to the node just before the target index
    while (temp != null && count < index - 1) {
        temp = temp.next;
        count++;
    }

    // Check if index is valid (e.g., index is out of bounds)
    if (temp == null || temp.next == null) {
        System.out.println("Invalid index");
        return;
    }

    // If the removed node was the tail, update the tail reference
    if (temp.next == tail) {
        tail=temp;
        tamp.next = null;
    }
    else{
       temp.next = temp.next.next;
       temp.next.prev = temp;
    }
    size--;
}

}
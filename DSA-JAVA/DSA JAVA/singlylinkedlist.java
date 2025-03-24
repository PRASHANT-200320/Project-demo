import java.util.*;

public class singlylinkedlist {


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



//add


public void addfirst(int data){
    Node newnode = new Node(data);
     size++;
    if(head == null){
        head = tail = newnode;
        return;
    }
    newnode.next =head;
    head=newnode;
}

public void addlast(int data){
    Node newnode = new Node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    tail.next=newnode;
    tail=newnode;
}

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
     temp.next = newnode;
}



//remove




public static int removefirst() {

    if(size == 0){
        System.out.print("LL is empty");
    }
    else if(size == 1){
        int val = head.data;
        head=tail=null;
        size=0;
        return val;
    }

    int val =head.data;
     head = head.next;
     size--;
     return val;
}




public static int removelast() {

    if(size == 0){
        System.out.print("LL is empty");
    }
    else if(size == 1){
        int val = head.data;
        head=tail=null;
        size=0;
        return val;
    }
    Node prev=head;

    for(int i=0;i<size-2;i++){
        prev = prev.next;
    }
    int val =prev.next.data;
     prev.next=null;
     tail=prev;
     size--;
     return val;
}

public void removeAtIndex(int index) {
    if (head == null) {
        System.out.println("LL is empty");
        return;
    }

    // If the index is 0, remove the first node
    if (index == 0) {
        head = head.next;
        if (head == null) {
            tail = null; // If the list is now empty, update the tail
        }
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

    // Skip the target node
    temp.next = temp.next.next;

    // If the removed node was the tail, update the tail reference
    if (temp.next == null) {
        tail = temp;
    }
}

//search



  //iterative

public int itsearch(int key){
    Node temp =head;
    int i=0;

    while(temp!=null){
        if(temp.data == key){
            return i;
        }
        temp =temp.next;
        i++;
    }
    return -1;
}


//recursion

public int Recsearch(int key){
  
   return helper(head,key);
}


public int helper(Node head,int key){
    if(head == null){
        return -1;
    }
    if(head.data ==key){
        return 0;
    }
    int idx =helper(head.next,key);
     if(idx == -1){
        return -1;
     }
     return idx+1;
}




//reverse


public void reverse() {
    Node prev=null;
    Node curr=tail=head;
    Node next;


    while(curr!=null){
        next = curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}



//remove Nth node for end


public void deleteNthforend(int n) {
    int size=0;
    Node temp = head;
    while(temp!=null){
        temp=temp.next;
        size++;
    }

    if(n==size){
        head=head.next;
        return;
    }
    int i=1;
    int itofind=size-n;
    Node prev =head;
    while(i<itofind){
        prev = prev.next;
        i++;
    }
    prev.next =prev.next.next;
    return;
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


public static void main (String agrs[]){
    
    singlylinkedlist li = new singlylinkedlist();

    li.addfirst(2);
    li.addfirst(3);
    li.addlast(1);
    li.addindex(1,5);
    li.removefirst();
    li.removelast();
    li.removeAtIndex(1);
    li.itsearch(2);
    li.Recsearch(3);
    li.reverse();
    li.deleteNthforend(1);
    li.print();
}

}
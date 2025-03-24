import java.util.*;

public class circularLL {



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


//add first


public void addfirst(int data){
    Node newnode = new Node(data);
size++;
    if(head == null){
        head = newnode;
        head.next = head;
    }

    else{
        Node temp = head;
        while(temp.next!= head){
            temp =temp.next;
        }
        newnode.next = head;
        temp.next = newnode;
        head =newnode;
    }
}



//add last



public void addlast(int data){
    Node newnode = new Node(data);
size++;
    if(head == null){
        head = newnode;
        head.next = head;
    }

    else{
        Node temp = head;
        while(temp.next!= head){
            temp =temp.next;
        }
        temp.next = newnode;
        newnode.next = head;
    }
}


//add at index


public void addAtindex(int data,int idx){
    
    if(idx == 0){
       addfirst(data);
       return;
    }

    Node newnode = new Node(data);
    size++;
    Node temp =head;

    for(int i=0;i<idx-1;i++){
    if(temp.next == head){
    return;
        }
     temp =temp.next;
    }
    newnode.next = temp.next;
    temp.next = newnode;
}


//remove first




public void removefirst(){
    if(head == null){
        return;
    }

    if(head.next == head){
        head = null;
        size--;
        return;
    }
    else{
        Node temp = head;
        while(temp.next!= head){
            temp =temp.next;
        }
        temp.next = head.next;
        head = head.next;
        size--;
    }
}


//remove last




public void removelast(){
    if(head == null){
        return;
    }

    if(head.next == head){
        head = null;
        size--;
        return;
    }
    else{
        Node temp = head;
        while(temp.next!= head){
            temp =temp.next;
        }
        temp.next = head;
   
    }
    size--;
}

//remove at index



public void removeAtindex(int idx){
    if(head == null){
        return;
    }

    if(idx == 0){
        removefirst();
        return;
    }
    Node temp =head;

for(int i=0;i<idx-1;i++){
    if(temp.next == head){
        return;
    }
     temp = temp.next;
}
Node toRemove = temp.next;
temp.next =toRemove.next;

if(toRemove.next == head){
    temp.next =head;
}
size--;
}


public void print() {
    if (head == null) {
        System.out.println("LL is empty");
        return;
    }
    Node temp = head;
    do {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    } while (temp != head);
    System.out.println("HEAD");
     System.out.println("Size: " + size);
}




public static void main(String[] args) {
    circularLL li = new circularLL();
    li.addfirst(10);
    li.addlast(20);
    li.addfirst(5);
    li.addAtindex(15, 2); // Add at index 2
    li.print(); // Output: 5 -> 10 -> 15 -> 20 -> HEAD

    li.removefirst();
    li.print(); // Output: 10 -> 15 -> 20 -> HEAD

    li.removelast();
    li.print(); // Output: 10 -> 15 -> HEAD

    li.removeAtindex(1);
    li.print(); // Output: 10 -> HEAD
}


}
import java.util.*;

public class swapNode {


public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public static Node head;

public void swapNode(int x,int y){

if(x == y){
    return;
}

Node prevX =null,currX = head;

while(currX != null && currX.data != x){
    prevX = currX;
    currX = currX.next;
}

Node prevY =null, currY =head;

while(currY != null && currY.data != y){
    prevY = currX;
    currY = currY.next;
}


if(currX == null && currY == null){
    return;
}

if(prevX!=null){
    prevX.next = currY;
}
else{
    head = currY;
}


if(prevY!=null){
    prevY.next = currX;
}
else{
    head = currX;
}


Node temp = currX.next;
currX.next = currY.next;
currY.next =temp;

}


public void printlist(){
    
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println();
}




    public static void main(String[] args) {

        swapNode list = new swapNode();

        // Creating the linked list
       list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);


 System.out.println("original list");
 list.printlist();
 list.swapNode(2,4);
 System.out.println("after swaping list");
 list.printlist();


}
}
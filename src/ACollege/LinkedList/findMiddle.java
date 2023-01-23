package ACollege.LinkedList;

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class findMiddle {
    Node head;
    public void pushBeg(int data) {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void pushEnd(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            newNode.next=head;
            head=newNode;
        }
        else {
            Node temp=head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void print() {

        if(head==null){
            System.out.print("List is empty.");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        System.out.println();
    }
    public void findMidlle() {
        if(head==null) {
            System.out.println("List is empty.");
        }
        else {
            Node slowNode=head;
            Node fastNode=head;
            while(fastNode!=null && fastNode.next!=null) {
                fastNode=fastNode.next.next;
                slowNode=slowNode.next;
            }
            System.out.println("The middle element is: "+slowNode.data);
        }
    }
    public void deleteMid() {
        if(head==null) {
            System.out.println("The list is empty.");
        }
        else {
            Node slowNode=head;
            Node fastNode=head;
            Node prev=head;
            while(fastNode!=null && fastNode.next!=null) {
                fastNode=fastNode.next.next;
                prev=slowNode;
                slowNode=slowNode.next;
            }
            prev.next=slowNode.next;
        }
    }
    public void reverseLL(){
        Stack<Node> s = new Stack<>();
        Node temp = head;
        while (temp.next != null) {
            s.add(temp);
            temp = temp.next;
        }
        head = temp;
        while (!s.isEmpty()) {
            temp.next = s.peek();
            s.pop();
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void main(String[] args) {
        findMiddle list=new findMiddle();
        for(int i=1; i<=10; i++) {
            list.pushEnd(i);
        }
        list.print();
        list.pushBeg(15);
        list.pushEnd(20);
        list.print();
        list.findMidlle();
        list.deleteMid();
        list.print();
        list.reverseLL();
        list.print();

    }

}

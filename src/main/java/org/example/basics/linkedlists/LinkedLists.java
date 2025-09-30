package org.example.basics.linkedlists;
class Node {
    int data;
    Node next;
}
public class LinkedLists {
    Node head;
    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(head == null){
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
    }

    public void insertAfter(int dataToFind, int nextData) throws Exception {
        Node newNode = new Node();
        newNode.data = nextData;

        Node temp = head;
        while(temp.next != null && temp.data != dataToFind){
            temp = temp.next;
        }

        if(temp.data == dataToFind){
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            throw new Exception("Data not found: ");
        }
    }

    public void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}

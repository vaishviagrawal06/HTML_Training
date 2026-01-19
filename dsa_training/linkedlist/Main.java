import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class Main {

    static Node first = null;

    
    static void createFirst(int val) {
        first = new Node(val);
    }

    static void insertAtLast(int val){
        Node newNode= new Node(val);
        if(first==null){
            first = newNode;
        }
    }
    static void deleteAtLast(){
        if(first==null){
        System.out.println("list is empty");
        }
        if(first.next == null){
            first =  null;
        }
        if(first!=null){
            Node temp = first;
            while(temp.next.next!=null){
                temp = temp.next;
            }
        }
    }

    
    static void addNode(int val) {
        Node temp = first;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(val);
    }

    
    static void display() {
        Node temp = first;
        System.out.println("Linked List:");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("enter no. od nodes");
     int n = sc.nextInt();
     System.out.println("enter value of nodes");
     for(int i = 0;i<n;i++){
        int val = sc.nextInt();
        if(i ==0){
            createFirst(val);

        }
        else{
            addNode(val);
        }

     }
     System.out.println("before deletion");
     display();
     deleteAtLast();
     System.out.println("after deletion");
     display();
     sc.close();
     
}
}

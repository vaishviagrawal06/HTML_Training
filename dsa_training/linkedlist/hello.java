class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
    public class Main {
    public static void main(String[] args) {

        Node first = new Node(10);   
        System.out.println(first.data);  
    }
}
public class hello{
    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);

        first.next = second;   

        System.out.println(first.data);        
        System.out.println(first.next.data);   
    }
}

}

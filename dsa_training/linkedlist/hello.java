// delete a node in the linked list (delete last node)
public class hello {

    static class node {
        int data;
        node next;

        node(int val) {
            data = val;
            next = null;
        }
    }

    static node first = null;

    static void createFirst(int val) {
        first = new node(val);
    }

    static void deleteAtLast() {
        if (first == null) {
            System.out.println("list is empty");
            return;
        }

        if (first.next == null) {
            first = null;
            return;
        }

        node temp = first;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void addNode(int val) {
        node temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new node(val);
    }

    void display() {
        node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        createFirst(10);

        hello h = new hello();
        h.addNode(20);
        h.addNode(30);
        h.addNode(40);

        h.display();

        deleteAtLast();

        h.display();
    }
}

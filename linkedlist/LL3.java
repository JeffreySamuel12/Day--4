// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL3 {
    Node head;

    public void addNodeToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to detect a cycle using Floyd's cycle-finding algorithm
    public boolean hasCycle() {
        if (head == null) {
            return false;
        }

        Node tortoise = head;
        Node hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next; // Move tortoise one step
            hare = hare.next.next; // Move hare two steps

            if (tortoise == hare) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }

    public static void main(String[] args) {
        LL3 list = new LL3();
        list.addNodeToEnd(1);
        list.addNodeToEnd(2);
        list.addNodeToEnd(3);

        // Creating a cycle for testing
        list.head.next.next.next = list.head;

        System.out.println("Cycle detected: " + list.hasCycle()); 
}}

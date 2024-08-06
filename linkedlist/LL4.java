// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL4 {
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

    public Node findMiddleNode() {
        if (head == null) {
            return null; // List is empty
        }

        Node slow = head;   //pointers
        Node fast = head;   //pointers

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps
        }

        return slow; // Slow pointer will be at the middle node
    }
    public void displayNodes() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LL4 list = new LL4();
        list.addNodeToEnd(1);
        list.addNodeToEnd(2);
        list.addNodeToEnd(3);
        list.addNodeToEnd(4);

       list.displayNodes(); 
        Node middleNode = list.findMiddleNode();
        System.out.println("Middle node: " + (middleNode != null ? middleNode.data : "List is empty")); // 
        
}}

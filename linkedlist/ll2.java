// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LL2 {
    Node head;

    
    public void addNodeToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;   //Traverse to the last node
            }
            current.next = newNode;       // Link the last node to the new node
        }
    }

    
    public void reverseList() {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; // Store the next node
            current.next = previous; // Reverse the current node's pointer
            previous = current; // Move the previous node to the current node
            current = next; // Move to the next node
        }
        head = previous; // Update the head to the new first node
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
        LL2 list = new LL2();
        list.addNodeToEnd(1);
        list.addNodeToEnd(2);
        list.addNodeToEnd(3);
        list.displayNodes(); 

        list.reverseList();
        list.displayNodes(); 
    }
}

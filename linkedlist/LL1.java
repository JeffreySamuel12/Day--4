// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LL1 {
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

    
    public void deleteNodeFromBeginning() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("List is empty.");
        }
    }

    // Method to display all nodes in the list
    public void displayNodes() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("end");
        }
    }

    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addNodeToEnd(1);
        list.addNodeToEnd(2);
        list.addNodeToEnd(3);
        list.displayNodes(); 

        list.deleteNodeFromBeginning();
        list.displayNodes(); 
    }
}

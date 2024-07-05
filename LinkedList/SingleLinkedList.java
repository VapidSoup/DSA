package LinkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Create a linked list
    public Node createSingleLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert into linked list
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traverse linked list
    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("Linked list does not exist!");
            return;
        }
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

    // Search for a node in linked list
    public boolean searchNode(int nodeValue) {
        if (head == null) {
            System.out.println("Linked list does not exist!");
            return false;
        }
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.value == nodeValue) {
                System.out.println("Found the node at location: " + i);
                return true;
            }
            tempNode = tempNode.next;
        }
        System.out.println("Node not found!");
        return false;
    }

    // Delete a node from linked list
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Linked list does not exist!");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Delete entire linked list
    public void deleteLinkedList() {
        head = null;
        tail = null;
        System.out.println("Linked list deleted successfully!");
    }
}

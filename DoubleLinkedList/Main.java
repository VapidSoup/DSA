package DoubleLinkedList;

public class Main {
    public static void Main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertInDLL(5, 0);
        doubleLinkedList.insertInDLL(10, 1);
        doubleLinkedList.insertInDLL(20, 2);
        doubleLinkedList.searchNode(10);
        doubleLinkedList.traverseDLL();
        doubleLinkedList.deleteNode(1);
        doubleLinkedList.deleteDLL();
    }
}

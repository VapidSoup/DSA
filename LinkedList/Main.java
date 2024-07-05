package LinkedList;

public class Main {
    public static void Main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.createSingleLinkedList(5);
        sll.insertInLinkedList(10, 1);
        sll.insertInLinkedList(20, 2);
        sll.insertInLinkedList(30, 2);
        sll.insertInLinkedList(40, 1);
        sll.traverseLinkedList();
    }
}

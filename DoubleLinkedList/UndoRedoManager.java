package DoubleLinkedList;

/**
 * Undo/Redo Functionality: In applications that support undo/redo functionality, a doubly linked list can be used to
 * maintain a sequence of states. Each state change is stored as a node in the list, allowing easy navigation between
 * previous and next states, enabling undoing and redoing of actions.
 * null<>1
 *1<>2<>3<>4<>5
 *     1
 * */


public class UndoRedoManager {
   private class Node {
       private int value;
       private Node next;
       private Node prev;

       private Node(int value) {
           this.value = value;
       }
   }

    private Node current;

    public UndoRedoManager(int value) {
        current = new Node(value);
    }

    public void undo() {
        if (current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current.next != null) {
            current = current.next;
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }

    public int getCurrentValue() {
        return current.value;
    }

    public static void main(String[] args) {
        UndoRedoManager manager = new UndoRedoManager(1);
        manager.add(2);
        manager.add(3);
        System.out.println(manager.getCurrentValue()); // 3
        manager.undo();
        System.out.println(manager.getCurrentValue()); // 2
        manager.redo();
        System.out.println(manager.getCurrentValue()); // 3
    }


}

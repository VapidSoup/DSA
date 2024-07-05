package DoubleLinkedList;
import DoubleLinkedList.DoubleNode;


public class DoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;
    int size;

    //create DLL
    public DoubleNode createDLL(int value){
        head = new DoubleNode();
        DoubleNode node = new DoubleNode();
        node.value = value;
        node.next = null;
        node.prev = null;
        head = tail = node;
        size = 1;
        return head;
    }

    //insert into DLL
    public void insertInDLL(int value, int location){
        DoubleNode node = new DoubleNode();
        node.value = value;
        if(head == null){
            createDLL(value);
            return;
        }else if(location == 0){
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }else if(location >= size){
            node.next = null;
            tail.next = node;
            node.prev = tail;
            tail = node;
        }else{
            DoubleNode tempNode = head;
            int index = 0;
            while(index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            node.prev = tempNode;
            tempNode.next = node;
            node.next.prev = node;
        }
        size++;
    }

    //traverse DLL
    public void traverseDLL(){
        if(head == null){
            System.out.println("DLL does not exist!");
            return;
        }
        DoubleNode tempNode = head;
        for(int i = 0; i < size; i++){
            System.out.print(tempNode.value);
            if(i != size - 1){
                System.out.print(" <-> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    //search in DLL
    public boolean searchNode(int nodeValue){
        if(head == null){
            return false;
        }
        DoubleNode tempNode = head;
        for(int i = 0; i < size; i++){
            if(tempNode.value == nodeValue){
                System.out.println("Found " + nodeValue + " at location " + i);
                return true;
            }
            tempNode = tempNode.next;
        }
        System.out.println(nodeValue + " not found in DLL");
        return false;
    }

    //delete node from DLL
    public void deleteNode(int location){
        if(head == null){
            System.out.println("DLL does not exist!");
            return;
        }else if(location == 0){
            if(size == 1){
                head = tail = null;
                size--;
                return;
            }
            head = head.next;
            head.prev = null;
            size--;
        }else if(location >= size){
            DoubleNode tempNode = tail.prev;
            if(tempNode == head){
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else{
            DoubleNode tempNode = head;
            for(int i = 0; i < location - 1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    //delete entire DLL
    public void deleteDLL(){
        DoubleNode tempNode = head;
        for(int i = 0; i < size; i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = tail = null;
        size = 0;
        System.out.println("DLL deleted successfully!");
    }
}

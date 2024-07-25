package Stacks;

class node{
    int value;
    node next;

    public node(int value){
        this.value = value;
        this.next = null;
    }
}

public class StackLinkedList {
    node top;

    public StackLinkedList(){
        this.top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(int value){
        node newNode = new node(value);
        if(isEmpty()){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        int result = top.value;
        top = top.next;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.value;
    }

    public void deleteStack(){
        top = null;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        node temp = top;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

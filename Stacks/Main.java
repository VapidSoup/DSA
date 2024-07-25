package Stacks;

public class Main {
    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.isEmpty();
        stackArrays.isFull();
        System.out.println("Peek: " + stackArrays.peek());
        stackArrays.pop();
        stackArrays.pop();
        stackArrays.pop();
        System.out.println("Palindrome 'racecar' is: " + StackArrays.isPalindrome("racecar"));
        System.out.println("Palindrome 'no' is: " + StackArrays.isPalindrome("no"));
        stackArrays.deleteStack();

        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        System.out.println("Peek: " + stackLinkedList.peek());
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.deleteStack();
    }
}

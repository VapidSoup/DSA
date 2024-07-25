package Stacks;

public class StackArrays {
    int [] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }
    //Check if it is empty

    public boolean isEmpty(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    //check if stack is Full
    public boolean isFull(){
        if (topOfStack == arr.length -1){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    //implement a push method
    public void push(int value){
        if (isFull()){
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    //implement pop method
    public void pop(){
        if (isEmpty()){
            System.out.println("The stack is empty");
        } else {
            System.out.println("The value is successfully deleted");
            arr[topOfStack] = Integer.MIN_VALUE;
            topOfStack--;
        }
    }

    //implement peek
    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
        } else {
            System.out.println("The value at the top of the stack is: " + arr[topOfStack]);
        }
        return arr[topOfStack];
    }

    //implement delete a stack
    public void deleteStack(){
        arr = null;
        System.out.println("The stack is successfully deleted");
    }
    // use the stack datastructure to check whether a word is a palindrome or not
    public static boolean isPalindrome(String word){
        StackArrays stackArrays = new StackArrays(word.length());
        for (char c : word.toCharArray()){
            stackArrays.push(c);
        }
        for (char c : word.toCharArray()){
            if (stackArrays.arr[stackArrays.topOfStack] != c){
                return false;
            }
            stackArrays.pop();
        }
        return true;
    }
}

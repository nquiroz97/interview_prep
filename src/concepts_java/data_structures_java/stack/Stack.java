package concepts_java.data_structures_java.stack;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char j){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            top++;
            stackArray[top] = j;
        }
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }else{
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public char peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize - 1 == top);
    }

    
}

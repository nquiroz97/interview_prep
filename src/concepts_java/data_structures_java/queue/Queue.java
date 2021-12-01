package concepts_java.data_structures_java.queue;

public class Queue {
    private int maxSize; //initializes the set number of slots
    private long[] queueArray; //slots to maintain the data
    private int front; //index of element in front
    private int rear; //index of element in rear
    private int nItems; //number of elements

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0;
        rear = - 1;
        nItems = 0;
    }

    public void insert(long i){
        if(rear == maxSize - 1){
            System.out.println("Queue is maxed out");
        }else{
            rear++;
            queueArray[rear] = i;
            nItems++;
        }
    }

    public long remove(){
        //remove item from front
        long temp = queueArray[front];
        front++;
        if(front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }
    
    public long peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view(){
        System.out.println("[ ");
        for(int i = 0;i< queueArray.length;i++){
            System.out.println(queueArray[i] + " ");
        }
        System.out.println("]");
    }
    
}

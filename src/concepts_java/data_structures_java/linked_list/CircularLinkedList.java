package concepts_java.data_structures_java.linked_list;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    //use to insert beginning of list 
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            last = newNode;
        }
        newNode.nextNode = first;
        first = newNode;
    }

    //delete
    public int deleteFirst(){
        int temp = first.data;
        if(first.nextNode == null){
            last = null;
        }
        first = first.nextNode; // first will point to old's next value
        return temp;
    }
    
    //more efficient than SinglyLinkedList
    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
       if(isEmpty()){
           first = newNode;
       }else{
           last.nextNode = newNode; // the next value of the last node will point to the new node
           last = newNode.nextNode; // make the new node created to be last one on the list
       }
    }

    public void displayList(){
        System.out.println("List(first ---> last)");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.nextNode;
        }
        System.out.println();
    }
    
}

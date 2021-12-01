package concepts_java.data_structures_java.linked_list;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    //use to insert beginning of list 
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            last = newNode;// if empty, last will refer to the new node being created
        }else{
            first.previousNode = newNode;
        }
        newNode.nextNode = first; // new node's next field will point to the old
        this.first = newNode;
    }

    //more efficient than SinglyLinkedList
    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;
       if(isEmpty()){
           first = newNode;
       }else{
           last.nextNode = newNode; // the next value of the last node will point to the new node
           newNode.previousNode = last; //old last will be new node's previous
       }
       last = newNode; // last field should point to new node
    }

    // assume non-empty list
    public Node deleteFirst(){
        Node temp = first;
        if(first.nextNode == null){ //there is only one item
            last = null;
        }else{
            first.nextNode.previousNode = null; //list's first node will point to null
        }

        first = first.nextNode; 
        return temp; //returns deleted old node
    }

    //assume non-empty list
    //not actually deleting, just removing the pointer to the object
    public Node deleteLast(){
        Node temp = last;
        if(first.nextNode == null){//we only have one node
            first = null;
        }else{
            last.previousNode.nextNode = null; //the last node's previous node's next field will point to null
        }
        last = last.previousNode;
        return temp;


    }

    //assume a non-empty list
    public boolean insertAfter(int key, int data){
        Node current = first; //start from beginning of list
        while (current.data != key){ //run until we have not found key in a particular node
            current = current.nextNode;
            if(current == null){
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;
        if(current == last){
            current.nextNode = null;
            last = newNode;
        }else{
            newNode.nextNode = current.nextNode; // new node's next field should point to the field ahead of current node
            current.nextNode.previousNode = newNode; // the node ahead of current, it's previous field should point to the new node
        }

        newNode.previousNode = current;
        current.nextNode = newNode;

        return true;
    }

    //assume non-empty list 
    public Node deleteKey(int key){
        Node current = first; //start from beginning
        while (current.data != key){ //run until we have not found key in a particular node
            current = current.nextNode;
            if(current == null){
                return null;
            }
        }

        if(current == first){
            first = current.nextNode; //make the first field point to the node following current since current will be deleted
        }else{
            current.previousNode.nextNode = current.nextNode;
        }
        if(current == last){
            last =current.previousNode;
        }else{
            current.nextNode.previousNode = current.previousNode;
        }

        return current;

    }

    public void displayForward(){
        System.out.println("List(first ---> last)");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.nextNode;
        }
        System.out.println();
    }

    public void displayBackward(){
        System.out.println("List(last ---> first)");
        Node current = last;
        while(current != null){
            current.displayNode();
            current = current.previousNode;
        }
        System.out.println();
    }
    
}

package concepts_java.data_structures_java.linked_list;

//singly linked list
public class LinkedList {
    private Node first;

    public boolean isEmpty(){
        return (first == null);
    }

    //use to insert beginning of list 
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = first;
        first = newNode;
    }

    //delete
    public Node deleteFirst(){
        Node temp = first;
        first = first.nextNode;
        return temp;
    }

    //not an efficient way since looping through entire list, will depend on list size
    public void insertLast(int data){
        Node current = first;
        while(current.nextNode != null){
            current = current.nextNode;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.nextNode = newNode;
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

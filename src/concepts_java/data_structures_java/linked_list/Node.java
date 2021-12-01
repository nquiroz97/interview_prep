package concepts_java.data_structures_java.linked_list;

public class Node {
    public int data;
    public Node nextNode;
    public Node previousNode; //only used for doubly linked list

    public Node(){
    }

    public void displayNode(){
        System.out.println("{" + data + "}");
    }
    
}

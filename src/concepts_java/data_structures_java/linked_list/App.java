package concepts_java.data_structures_java.linked_list;

public class App {
    
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertLast(21);
        myList.displayList();

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(100);
        circularLinkedList.insertFirst(50);
        circularLinkedList.insertFirst(99);
        circularLinkedList.insertLast(21);
        circularLinkedList.displayList();

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(100);
        doublyLinkedList.insertFirst(50);
        doublyLinkedList.insertFirst(99);
        doublyLinkedList.insertLast(21);
        doublyLinkedList.insertLast(58);
        doublyLinkedList.displayForward();
        doublyLinkedList.displayBackward();
        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteLast();
        doublyLinkedList.deleteKey(50);
        doublyLinkedList.displayForward();
        doublyLinkedList.insertAfter(100, 27);
        doublyLinkedList.displayForward();


    }
    
}

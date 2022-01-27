package concepts_java.data_structures_java.binary_search_tree;

public class Example {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        //insertion
        tree.insert(10, "Ten");
        tree.insert(20, "Twenty");
        tree.insert(30, "Thirty");
        tree.remove(10);

        //deletion
        //In Java, when the object reference is deleted/removed, then garbage collection kicks in
        //C++ you have to manually delete the address in memory 

        System.out.println(tree.findMin().key);
        System.out.println(tree.findMax().key);
    }
    
}

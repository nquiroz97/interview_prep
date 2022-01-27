package concepts_java.data_structures_java.binary_search_tree;

public class BinarySearchTree {

    private Node root;

    public void insert(int key, String value){
        Node newNode = new Node(key, value);
        if(root == null){
            root = newNode;
        }else{
            //current is the traversing/changing variable
            Node current = root;
            Node parent;

            while(true){
                parent = current;
                if(key < current.key){
                    current = current.leftChild;
                    if(current == null){
                        //current's parent is the leaf node
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    current = current.rightChild;
                    if(current == null){
                        //current's parent is the leaf node
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }

    public Node findMin(){
        Node current = root;
        Node last = null;

        while(current != null){
            last = current;
            //traversing the left-most path, until current becomes null, 
            //i.e it's the last node on left path, has no children
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax(){
        Node current = root;
        Node last = null;

        while(current != null){
            last = current;
            //traversing the right-most path, until current becomes null, 
            //i.e it's the last node on right path, has no children
            current = current.rightChild;
        }
        return last;
    }

    public boolean remove(int key){
        //start with root, since traversing whole tree
        Node currentNode = root;
        Node parentNode = root;

        boolean isLeftChild = false;

        //searching to find node with key to delete
        while(currentNode.key != key){
            parentNode = currentNode;
            if(key < currentNode.key){
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            }else{
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }
            //if key is not found in tree
            if(currentNode == null){
                return false;
            }
        }//once while loop breaks, node to be deleted has been found

        Node nodeToDelete = currentNode;

        //check if node is leaf
        if(nodeToDelete.leftChild == null && nodeToDelete.rightChild == null){
            //just has one node(root node)
            if(nodeToDelete == root){
                root = null;
            }else if(isLeftChild){
                parentNode.leftChild = null;
            }else{
                parentNode.rightChild = null;
            }
        }else if(nodeToDelete.rightChild == null){ //has left child only
            if(nodeToDelete == root){
                root = nodeToDelete.leftChild;
            }else if(isLeftChild){
                parentNode.leftChild = nodeToDelete.leftChild;
            }else{
                parentNode.rightChild = nodeToDelete.leftChild;
            }
        }else if(nodeToDelete.leftChild == null){ //has right child only
            if(nodeToDelete == root){
                root = nodeToDelete.rightChild;
            }else if(isLeftChild){
                parentNode.leftChild = nodeToDelete.rightChild;
            }else{
                parentNode.rightChild = nodeToDelete.rightChild;
            }
        }else{ //if node has two children

            //helper method for traversing tree on left path
            Node successor = getSuccessor(nodeToDelete);

            //connect parent of nodeToDelete to succesor
            if(nodeToDelete == root){
                root = successor;
            }else if(isLeftChild){
                parentNode.leftChild = successor;
            }else{ //must be right child
                parentNode.rightChild = successor;
            }

            //doing the actual replacement/swap
            successor.leftChild = nodeToDelete.leftChild;


        }


        return true;
    }

    private Node getSuccessor(Node nodeToDelete) {
        Node succesorParent = nodeToDelete;
        Node succesor = nodeToDelete;

        Node temp = nodeToDelete.rightChild; //right child

        while(temp != null){ //traverses down left path of tree until temp has no left child
            succesorParent = succesor;
            succesor = temp;
            temp = temp.leftChild;
        }

        //if successor is not a right child
        if(succesor != nodeToDelete.rightChild){
            succesorParent.leftChild = succesor.rightChild;
            succesor.rightChild = nodeToDelete.rightChild;
        }
        return succesor;
    }

    public void displayTree(){
        
    }

    
}

package concepts_java.data_structures_java;

import concepts_java.data_structures_java.linked_list.Node;
import concepts_java.data_structures_java.stack.Stack;

public class DataStructureExample {
    public static void main(String[] args) {
        /*Stack theStack = new Stack(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.push(100);
        theStack.push(120);
        theStack.push(140);
        theStack.push(160);
        theStack.push(180);
        theStack.push(200);
        theStack.push(220);

        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.println(value);
        }*/
        Node n1 = new Node();
        n1.data = 4;
        Node n2 = new Node();
        n2.data = 2;
        Node n3 = new Node();
        n3.data = 1;
        Node n4 = new Node();
        n4.data = 6;

        //we're assigning a reference, not a value, since the key is pointing to the object
        n1.nextNode = n2;
        n2.nextNode = n3;
        n3.nextNode = n4;

        System.out.println(listLength(n1));

        System.out.println(reverseString("Tomorrow"));
        
    }

    public static int listLength(Node node){
        int count = 0;
        Node currentNode = node;
        while(currentNode != null){
            count ++;
            currentNode = currentNode.nextNode;
        }
        return count;
    }

    //one of the advantages of using a stack
    public static String reverseString(String string){
        int stackSize = string.length();
        Stack theStack = new Stack(stackSize);
        for(int i = 0; i < string.length(); i++){
            theStack.push(string.charAt(i));
        }
        String result = "";
        while(!theStack.isEmpty()){
            result = result + theStack.pop();
        }
        return result;
    } 
    
}

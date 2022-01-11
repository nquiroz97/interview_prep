package data_structures_and_algos_java.sort_algos.insertion_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        /* for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i -1];
            }
            intArray[i] = newElement;
        } */

        insertionRecursive(intArray, intArray.length);
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        
    }

    public static void insertionRecursive(int[] input, int items){
        if(items < 2){
            return;
        }

        insertionRecursive(input, items - 1);

        int newElement = input[items - 1];
            int i;
            for(i = items - 1; i > 0 && input[i - 1] > newElement; i--){
                input[i] = input[i -1];
            }
            input[i] = newElement;
    }
    
}

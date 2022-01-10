package data_structures_and_algos_java.sort_algos.selection_sort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //assuming entire array is unsorted
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largest] ){
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        
    }

    public static void swap(int[] array, int startIndex, int nextIndex){
        if(startIndex == nextIndex){
            return;
        }
        //save value as temp
        int temp = array[startIndex];
        //overwrite startIndex value with nextIndex value
        array[startIndex] = array[nextIndex];
        array[nextIndex] = temp;
    }
    
}

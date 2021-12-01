package concepts_java.algorithms.sorting;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] myArray = selectionSort(new int[] {9,8,3,18,87,12,99});
        int[] my2Array = insertionSort(new int[] {10,8,21,18,87,12,99});
        int[] my3Array = {9,7,3,1,6,3,2,6,8,9,2,3,0};
        int[] my4Array = new int[] {9,7,3,1,6,3,2,6,8,9,2,3,0};
        MergeSort sorter = new MergeSort();

        sorter.sort(my3Array);
        quickSort(my4Array, 0, my4Array.length - 1);

        
        for(int i = 0;i< myArray.length; i++){
            System.out.println(myArray[i]);
        }
        for(int i = 0;i< my2Array.length; i++){
            System.out.println(my2Array[i]);
        }
        for(int i = 0;i< my3Array.length; i++){
            System.out.println(my3Array[i]);
        }

        System.out.println(Arrays.toString(my4Array));

        
    }

    public static int[] selectionSort(int[] array){
        for(int i = 0;i< array.length - 1; i++){
            int minimum = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[minimum]){//only if smaller value is found
                    minimum = j;
                }
            }
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
        return array;
    }

    //takes in an unsorted array
    public static int[] insertionSort(int[] array){
        for(int i = 1;i< array.length; i++){
            int element = array[i]; //element variable contains the data we intend on bringing over to the sorted section
            int j = i-1; //always points to the last index of the sorted area
            while(j >= 0 && array[j] > element){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
        return array;
    }

    public static void quickSort(int[] inputArray, int start, int end){
        if(start < end ){
            int partitionPoint = partition(inputArray, start, end);
            quickSort(inputArray, start, partitionPoint - 1); //sorts the left half of the range
            quickSort(inputArray, partitionPoint + 1, end); //sorts the right half of the range

        }
     }

    private static int partition(int[] inputArray, int start, int end) {
        int pivot = inputArray[end];
        //first iteration, counterIndex starts from -1
        int counterIndex = start - 1;

        for(int j = start; j <= end - 1; j++){
            if(inputArray[j] <= pivot){
                counterIndex++;
                int counterValue = inputArray[counterIndex];
                int jValue = inputArray[j];
                inputArray[counterIndex] = jValue;
                inputArray[j] = counterValue;
            }
        }
        //put the pivot value in the next slot
        int afterPivot = inputArray[counterIndex + 1];
        inputArray[end] = afterPivot;
        inputArray[counterIndex + 1] = pivot; //pivot value is placed in the correct slot of array
        return counterIndex + 1;
    }
    
}

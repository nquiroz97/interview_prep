package data_structures_and_algos_java.sort_algos.quick_sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        
    }

    public static void quickSort(int[] array, int startIndex, int endIndex){
        if(endIndex - startIndex < 2){
            return;
        }

        int pivotIndex = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, pivotIndex);
        quickSort(array, pivotIndex + 1, endIndex);
    }

    //returns correct position of pivot
    public static int partition(int[] array, int startIndex, int endIndex){
        int pivot = array[startIndex];
        int i = startIndex;
        int j = endIndex;

        //j will be used to look for elements that are less than the pivot
        while(i < j){
            //note: empty loop body
            //loop is used for decrementing j until we either find an element 
            // that's less the pivot or crosses i
            while(i < j && array[--j] >= pivot);
            if(i < j){
                array[i] = array[j];
            }
            //note: empty loop body
            //moves left to right looking for value that greater than pivot, and will be moved
            //to right of pivot
            while(i < j && array[++i] <= pivot);
            if(i < j){
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;

    }
}


package data_structures_and_algos_java.sort_algos.merge_sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    //this will be a recursive method
    public static void mergeSort(int[] array, int start, int end){
        //base case: when array has one element
        if(end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        //merges left array
        mergeSort(array, start, mid);
        //merges right array
        mergeSort(array, mid, end);
        //merge left and right partitions
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        /* left partition is already sorted, so if last element is less than first element
           of right partition, all elements of left are less than first element of right. and 
           all other elements of right partition are greater than first element of right */
        if(array[mid - 1] <= array[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end -start];
        while(i < mid && j < end){
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        System.arraycopy(array, i, array, start + tempIndex, mid - i);

    }
}

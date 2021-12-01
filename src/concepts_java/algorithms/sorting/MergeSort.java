package concepts_java.algorithms.sorting;

public class MergeSort {

    public void sort(int[] inputArray){
        sort(inputArray, 0, inputArray.length - 1);
    }

    private static void sort(int[] inputArray, int start, int end) {
        if(end <= start){
            return; //we're done traversing the array
        }

        int mid = (start + end)/2;
        sort(inputArray, start, mid); //sort left half
        sort(inputArray, mid+1, end); //sort right half
        merge(inputArray, start, mid, end); //merge sorted results into input array
    }

    private static void merge(int[] inputArray, int start, int mid, int end) {
        int[] tempArray = new int[end - start + 1];

        int leftSlot = start; //index position of the first slot on the left
        int rightSlot = mid + 1; //index position of the first slot on the right
        int k = 0;

        while(leftSlot <= mid && rightSlot <= end){
            if(inputArray[leftSlot] < inputArray[rightSlot]){
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
            }else{
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
            }
            k++;
        }
        //when above loop is completed, left side and right side has been sorted
        
        if(leftSlot <= mid){//consider right side done being sorted
            while(leftSlot <= mid){
                tempArray[k] = inputArray[leftSlot];
                leftSlot++;
                k++;
            }
        }else if(rightSlot <= end){
            while(rightSlot <= end){
                tempArray[k] = inputArray[rightSlot];
                rightSlot++;
                k++;
            }
        }

        //copy over temp array into appropriate slots of input array
        for(int i = 0; i < tempArray.length; i++){
            inputArray[start + i] = tempArray[i];
        }
    }
    
}

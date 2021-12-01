package concepts_java.algorithms.searching;


public class Searching {

    public static void main(String[] args) {
        int[] sampleArray = new int[] {1,2,3,4,5,6,7};
        System.out.println(binarySearch(sampleArray, 100));

        System.out.println(recursiveLinearSearch(sampleArray, 7, 0));

        System.out.println(recursiveBinarySearch(sampleArray, 2, 0, 8));

        //reduce_RECURSION(10);
        //will print -1,0,1,2,3,4,5,6,7,8,9,10 because of back tracing
        
    }


    //time complexity will be O(n)
    public static int linearSearch(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    //time complexity will be O(n)
    public static int binarySearch(int[] array, int value){
        int startingIndex = 0;
        int range = array.length - 1;
        while(startingIndex <= range){
            int midPoint = (startingIndex + range)/2;
            if(array[midPoint] == value){
                return midPoint;
            }
            if(array[midPoint] > value){
                range = midPoint - 1;
            }else{
                startingIndex = midPoint + 1;
            }
        }
        return -1;
    }

    //time complexity will be O(n)
    //process of elimination
    public static int binarySearch_MASTER(int[] array, int value){
        int startingIndex = 0;
        int range = array.length - 1;
        while(startingIndex <= range){
            int midPoint = (startingIndex + range)/2;
            if(value < array[midPoint]) range = midPoint - 1;
            else if(value > array[midPoint]) startingIndex = midPoint + 1;
            else return midPoint;
        }
        return -1;
    }

    public static void reduce_RECURSION(int n){
        if(n != 0){
           reduce_RECURSION(n - 1);
        }
        System.out.println("Completed call: " + n);
    }

    public static int recursiveLinearSearch(int[] array, int value, int index){
        if(index > array.length - 1){//if true, x was not found in the array
            return -1;
        }
        else if(array[index] == value) return index;
        else return recursiveLinearSearch(array, value, index + 1);
    }


    //assuming array is sorted
    public static int recursiveBinarySearch(int[] array, int value, int startingIndex, int range){
        if(startingIndex > range) return - 1;
        else{
            int midPoint = (startingIndex + range)/2;
            if(array[midPoint] == value) return midPoint;
            else if(array[midPoint] > value) return recursiveBinarySearch(array, value, startingIndex, midPoint - 1);
            else return recursiveBinarySearch(array, value, startingIndex + 1, range);
        }
    }

    
}

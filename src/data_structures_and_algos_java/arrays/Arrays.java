package data_structures_and_algos_java.arrays;

public class Arrays {
    public static void main(String[] args) {
        //must specify the size since arrays are not dynamic in Java
       int[] intArray = new int[7]; 

       intArray[0] = 20;
       intArray[1] = 35;
       intArray[2] = -15;
       intArray[3] = 7;
       intArray[4] = 55;
       intArray[5] = 1;
       intArray[6] = -22;

       for(int i=0; i<intArray.length; i++){
           if(intArray[i] == 7){
               System.out.println(i);
           }
       }
    }
    
}

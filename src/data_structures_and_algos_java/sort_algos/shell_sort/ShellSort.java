package data_structures_and_algos_java.sort_algos.shell_sort;
public class ShellSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int gap = intArray.length / 2; gap > 0; gap /= 2){
            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];
                int j = i;
                //while we haven't reached the front and gap position value is greater than newElement
                while(j >= gap && intArray[j - gap] > newElement){
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        
    }
    
}

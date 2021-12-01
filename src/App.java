import java.util.HashMap;

import algorithms.LongestWordClass;
import algorithms.RemoveDuplicateSortedArray;
import algorithms.StringSymmetryPoint;
import algorithms.UserNameValidation;
import data_structures.ArraysClass;

public class App {
    static final char[] ARRAY_1 = {'a', 1, 'c', 'x'};
    static final char[] ARRAY_2 = {'z', 1, 'i'};

    static final int targetSum = 9;
    static final int[] nums = {2, 7, 11, 15};

    static final int[] arrayWithDuplicates1 = new int[] { 1, 1, 1, 3, 5, 5, 7 };

   public static void main(String[] args) throws Exception {
        //System.out.println(containsCommonItem(ARRAY_1, ARRAY_2));

        /*
          - brute force
          int[] indices = TwoNumberSum.findTwoSum_BruteForce(nums, targetSum);
          - most efficient
          int[] indices = TwoNumberSum.findTwoSum_HashMap(nums, targetSum);
          - works when needing to return numbers instead of indexes
          int[] indices = TwoNumberSum.findTwoSum_Sorting(nums, targetSum); 

          if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
          } else {
            System.out.println("No solution found!");
          }
        */

        int newLength = RemoveDuplicateSortedArray.removeDuplicates(arrayWithDuplicates1);

        System.out.print("Array = ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arrayWithDuplicates1[i] + " ");
        }

        ArraysClass.arrayListMethod();

        System.out.println(StringSymmetryPoint.symmetryPoint_Naive("Hi my name is Neri"));

        System.out.println(LongestWordClass.LongestWord("hello world"));

        System.out.println(UserNameValidation.FirstFactorial(9));
    }

    public static boolean containsCommonItem(char[] arr1, char[] arr2){
        HashMap<Character, Boolean> hashMap = new HashMap<Character, Boolean>();

        for(int i = 0; i < arr1.length; i++){
            hashMap.put(arr1[i], true);
        }

        for(int j = 0; j < arr2.length; j++){
            if(hashMap.containsKey(arr2[j])){
                return true;
            }
        }

        return false;
    }
}
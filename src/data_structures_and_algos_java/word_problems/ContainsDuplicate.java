package data_structures_and_algos_java.word_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        
    }


    //less memory efficient, better time efficient
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsHash = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!(numsHash.add(nums[i]))){
                return true;
            }
        }
        return false;
    }
    

    //more memory efficient, less time efficient
    public boolean containsDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                return true;
            }
        }
        return false;
    }
    
}

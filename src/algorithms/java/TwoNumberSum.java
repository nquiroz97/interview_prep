package algorithms.java;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
   Given an array of integers, return the indices of the two numbers whose sum is 
   equal to a given target. You may assume that each input would have exactly 
   one solution, and you may not use the same element twice.
*/

public class TwoNumberSum {

    // Time complexity: O(n^2), but does not create new variable, which will help with memory issue
    public static int[] findTwoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    // Time complexity: O(n)
    /* 
      1. Initialize an empty HashMap.  
      2. Iterate over the elements of the array. 
    */
    public static int[] findTwoSum_HashMap(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            /* 
              IF, element exists in map, then check if it’s complement (target - element) also exists in the Map or not. 
                  if the complement exists then return the indices of the current element and the complement.
              ELSE, put the element in the Map, and move to the next iteration.
            */
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    // Time complexity: O(n*log(n))
    public static int[] findTwoSum_Sorting(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target) {
                return new int[] {nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
    
}

package algorithms.java;
public class RemoveDuplicateSortedArray {

    public static int removeDuplicates(int[] nums) {
    int n = nums.length;

    /*
     * This index will move only when we modify the array in-place to include a new
     * non-duplicate element.
     */
    int j = 0;

    for (int i = 0; i < n; i++) {
      /*
       * If the current element is equal to the next element, then skip the current
       * element because it's a duplicate.
       */
      if (i < n - 1 && nums[i] == nums[i + 1]) {
        continue;
      }

      nums[j++] = nums[i];
    }

    return j;
  }

  /* 
    Given a sorted array, remove the duplicates from the array in-place such that each 
    element appears at most twice, and return the new length. Do not allocate extra space 
    for another array, you must do this by modifying the input array in-place with O(1) extra memory.
  */
  public static int removeDuplicates2(int[] nums) {
    int n = nums.length;

    /*
     * This index will move when we modify the array in-place to include an element
     * so that it is not repeated more than twice.
     */
    int j = 0;

    for (int i = 0; i < n; i++) {
      /*
       * If the current element is equal to the element at index i+2, then skip the
       * current element because it is repeated more than twice.
       */
      if (i < n - 2 && nums[i] == nums[i + 2]) {
        continue;
      }

      nums[j++] = nums[i];
    }

    return j;
  }
    
}

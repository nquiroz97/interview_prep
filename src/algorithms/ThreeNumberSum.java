package algorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeNumberSum {

  // Brute-force: Time complexity: O(n^3)
  public static List<Integer[]> findThreeSum_BruteForce(int[] nums, int target) {
    List<Integer[]> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[i] + nums[j] + nums[k] == target) {
            result.add(new Integer[] { nums[i], nums[j], nums[k] });
          }
        }
      }
    }
    return result;
  }

  // Time complexity: O(n^2)
  public static List<Integer[]> findThreeSum_Sorting(int[] nums, int target) {
    List<Integer[]> result = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        if (nums[i] + nums[left] + nums[right] == target) {
          result.add(new Integer[] { nums[i], nums[left], nums[right] });
          left++;
          right--;
        } else if (nums[i] + nums[left] + nums[right] < target) {
          left++;
        } else {
          right--;
        }
      }
    }
    return result;
  }

  // Time complexity: O(n^2)
 static List<Integer[]> findThreeSum(int[] nums, int target) {
    List<Integer[]> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      int currentTarget = target - nums[i];
      Set<Integer> existingNums = new HashSet<>();
      for (int j = i + 1; j < nums.length; j++) {
        if (existingNums.contains(currentTarget - nums[j])) {
          result.add(new Integer[] { nums[i], nums[j], currentTarget - nums[j] });
        } else {
          existingNums.add(nums[j]);
        }
      }
    }
    return result;
  }
    
}

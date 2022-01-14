package data_structures_and_algos_java.word_problems;
import java.util.HashMap;
import java.util.Hashtable;

/*
Given an array of integers nums and an integer target, return 
indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you 
may not use the same element twice.

You can return the answer in any order.
*/

public class TwoSum {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ACE";
        minWindow(s, t);
    }

    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int left = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        String result = "";
        
        for(int i = 0; i < t.length(); i++) {
            int times = charCount.getOrDefault(t.charAt(i), 0) +  1;
            charCount.put(t.charAt(i), times);
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(charCount.containsKey(s.charAt(i))) {
                if (charCount.get(s.charAt(i)) - 1 >= 0) count++;
                int temp = charCount.get(s.charAt(i)) - 1;
                charCount.put(s.charAt(i), temp);
            }
            while(count == t.length()) {
                if(minLen > i - left + 1) {
                    minLen = i - left + 1;
                    result = s.substring(left, left+minLen);
                }
                if(charCount.containsKey(s.charAt(left))) {
                    if (charCount.get(s.charAt(left)) + 1 > 0) count--;
                    int temp = charCount.get(s.charAt(left)) + 1;
                    charCount.put(s.charAt(left), temp);
                }
                left++;
            }
        }
        return result;
    }

    public static String minWindowExplained(String s, String t) {
        /* 
            1. it is known that the window(s) has to have length greater than or equal to(t)
            2. valid window must contain all chars in t
            3. minimum window must be smallest length 
        */
        if (s.length() == 0 || t.length() == 0) {
          return "";
        }

        //create a hash table with t char keys and their occurences
        Hashtable<Character, Integer> charCount = new Hashtable<Character, Integer>(); 
        //populate hash table t with char keys and num of occurrences
        for(int i = 0; i < t.length(); i++) {
            int times = charCount.getOrDefault(t.charAt(i), 0) +  1;
            charCount.put(t.charAt(i), times);
        }  

        //two pointer approach: track left and right
        int left = 0, right = 0;

        // formed is used to keep track of how many unique characters in t
        // are present in the current window in its desired frequency.
        // e.g. if t is "AABC" then the window must have two A's, one B and one C.
        // Thus formed would be = 3 when all these conditions are met.
        int formed = 0;

        // ans list of the form (window length, left, right)
        int[] ans = {-1, 0, 0};

        // Number of unique characters in t, which need to be present in the desired window.
        int required = charCount.size();

        // Hash table which keeps a count of all the unique characters in the current window.
        Hashtable<Character, Integer> windowCounts = new Hashtable<Character, Integer>();

        while (right < s.length()) {
          // Add one character from the right to the window
          char c = s.charAt(right);
          int count = windowCounts.getOrDefault(c, 0);
          windowCounts.put(c, count + 1);

          // If the frequency of the current character added equals to the
          // desired count in t then increment the formed count by 1.
          if (charCount.containsKey(c) && windowCounts.get(c).intValue() == charCount.get(c).intValue()) {
              formed++;
          }

          // Try and contract the window till the point where it ceases to be 'desirable'.
          while (left <= right && formed == required) {
              c = s.charAt(left);
              // Save the smallest window until now.
              if (ans[0] == -1 || right - left + 1 < ans[0]) {
                  ans[0] = right - left + 1;
                  ans[1] = left;
                  ans[2] = right;
              }

              // The character at the position pointed by the
              // `Left` pointer is no longer a part of the window.
              windowCounts.put(c, windowCounts.get(c) - 1);
              if (charCount.containsKey(c) && windowCounts.get(c).intValue() < charCount.get(c).intValue()) {
                  formed--;
              }

              // Move the left pointer ahead, this would help to look for a new window.
              left++;
          }
          // Keep expanding the window once we are done contracting.
          right++;   
      }
      return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}

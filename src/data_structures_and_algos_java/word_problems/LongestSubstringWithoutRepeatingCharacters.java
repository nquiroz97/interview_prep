package data_structures_and_algos_java.word_problems;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        int answer = lengthOfLongestSubstring("abcabcbbjklopa");
        System.out.println(answer);
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        HashMap<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        System.out.println(map.values().toString());
        return ans;
    }
    
}

package algorithms.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/* You should find the first unique number in A. In other words, find the 
   unique number with the lowest position in A.
*/
public class FirstUniqueNumber {

    //Time complexity: O(N * log(N))
    public int fetchFirstUnique_Better(int[] A) {
        //LinkedHashSets will order the elements according to the original copy
        Set<Integer> uniqueNums = new LinkedHashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int i: A){
            //condition returns false if number already exists in uniqueSet
            if(!uniqueNums.add(i)){
                duplicates.add(i);
            }
        }
        
        uniqueNums.removeAll(duplicates);
        if(!uniqueNums.isEmpty()){
            //returns the first element of set
            return uniqueNums.iterator().next();
        }
        return -1;
        
        
    }

    //Time complexity: O(N * log(N))
    public int fetchFirstUnique_Efficient(int[] A) {
        //LinkedHashSets will order the elements according to the original copy
        ArrayList<Integer> integers = (ArrayList<Integer>) Arrays.stream(A).boxed().collect(Collectors.toList());
        LinkedHashSet<Integer> uniqueNums = new LinkedHashSet<>(integers);
       
        return uniqueNums.iterator().next();  
    }

    //Time complexity: O(N * log(N))
    public int fetchFirstUnique_BruteForce(int[] A) {
        //LinkedHashSets will order the elements according to the original copy
        Set<Integer> uniqueNums = new LinkedHashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int i: A){
            if(!uniqueNums.add(i)){
                duplicates.add(i);
            }
        }
        uniqueNums.removeAll(duplicates);
        //this will increase time and space comeplexity
        int[] uniqueNumbers = uniqueNums.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        if(uniqueNumbers.length > 0){
            return uniqueNumbers[0];
        }
        return -1;
        
    }
    
}

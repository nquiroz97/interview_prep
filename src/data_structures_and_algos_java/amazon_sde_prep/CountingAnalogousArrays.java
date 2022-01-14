package data_structures_and_algos_java.amazon_sde_prep;

/* 
An array is said to be analogous to the secret array if all of the following 
conditions are true:
 The length of the array is equal to the length of the secret array.
 Each integer in the array lies in the interval [lowerBound, upperBound].
 The difference between each pair of consecutive integers of the array must be equal to 
  the difference between the respective pair of consecutive integers in the secret array. 
  In other words, let the secret array be [s[0], s[1],...s[n-1]]and let the analogous array 
  be [a[0], a[1],...a[n- 1]], then (a[i-1] - a[i]) must be equal to (s[i-1] - s[i]) for 
  each i from 1 to n-1.

Given the value of the integers lowerBound and upperBound, inclusive, and the array 
of differences between each pair of consecutive integers of the secret array, find the 
number of arrays that are analogous to the secret array. If there is no array analogous to 
the secret array, return 0.

Example:
consecutiveDifference = [-2, -1, -2, 5]
lowerBound=3 upperBound=10

The logic to create an analogous array starting from the lower bound is: 
Start with a value of 3.
Subtract consecutiveDistances[0], 3 - (-2) = 5
Subtract consecutiveDistances[1], 5 - (-1) = 6
Subtract consecutiveDistances[2], 6 - (-2) = 8 
Subtract consecutiveDistances[3], 8 - 5 = 3

Note that none of the values is out of bounds. All possible analogous arrays are:
[3,5,6,8,3] 
[4,6,7,9,4] 
[5,7,8,10,5]
The answer is 3.

Function Description
Complete the function countAnalogousArrays in the editor below.
countAnalogousArrays has the following parameter(s):
int consecutiveDifference[n]: the differences between each pair of consecutive integers in the
secret array
int lowerBound: an integer int upperBound: an integer

Returns:
int: the number of arrays that are analogous to the secret array
Constraints
 -109 ≤ lowerBound ≤ upperBound ≤ 109
 1≤n≤105
 -2*109 ≤ consecutiveDifference[i] ≤ 2*109
*/

public class CountingAnalogousArrays {

    public static void main(String[] args) {
        int[] array = {-2, -1, -2, 5};
        //System.out.println(countAnalogousArrays(array, 3, 10));
        System.out.println(countAnalogousArrays2(array, 3, 10));
    }

    public static int countAnalogousArrays(int[] consecutiveDifference, int lowerBound, int upperBound){
        int count = 0;
        int min = lowerBound, max = lowerBound;
        int prev = lowerBound, curr = 0;
        for ( int i = 1; i<= consecutiveDifference.length; i++ ){
            curr = prev - consecutiveDifference[i - 1];
            //min = Math.min(min, curr);
            //max = Math.max(max, curr);
            prev = curr;
            System.out.println("prev: " + prev);
            System.out.println("current: " + curr);
            System.out.println();
        }
      
        while (max <= upperBound && min >= lowerBound ){
            count++;
            min = min + 1;
            max = max + 1;  
        }
        return count;
    }

    public static int countAnalogousArrays2(int[] consecutiveDifference, int lowerBound, int upperBound) {
	
	    if(consecutiveDifference == null || consecutiveDifference.length < 1 || upperBound < lowerBound) {
		    return 0;
	    }
	    int count = 0;
	    int n = consecutiveDifference.length;
	    for ( int start = lowerBound ; start <= upperBound; start++ )	{
		    //we have n+1 numbers for n differences
		    int[]  candidate = new int[n + 1];
		    // we fix the start
		    candidate[0] = start;
		    boolean valid = true;
		    for (int i = 1 ; i <=n ; i++ ) {
			    int temp = candidate[i-1] - consecutiveDifference[i - 1];
			    // check for lower and upper bound
			    if( temp < lowerBound || temp > upperBound) { 
				    valid = false;
				    break;
			    }else {
				    candidate[i] = temp;
			    }
		    }		
		    count += valid ? 1 : 0;		
	    }
	    return count;
    } 
    
}

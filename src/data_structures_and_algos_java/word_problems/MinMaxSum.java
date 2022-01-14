package data_structures_and_algos_java.word_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Given five positive integers, find the minimum and maximum values that can be calculated 
by summing exactly four of the five integers. Then print the respective minimum and 
maximum values as a single line of two space-separated long integers.

Example: arr[1,3,5,7,9]

The minimum sum is 1 + 3 + 5 + 7 = 16 and the maximum sum is 3 + 5 + 7 + 9 = 16. 
The function prints: 16 24

Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

arr: an array of 5 integers
Print

Print two space-separated integers on one line: the minimum sum and the 
maximum sum of 4 of 5 elements.

Input Format

A single line of five space-separated integers.

Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values 
that can be calculated by summing exactly four of the five integers. 
(The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are 1, 2, 3, 4, and 5. Calculate the following sums using four of the five 
integers:

Hints: Beware of integer overflow! Use 64-bit Integer.

*/

public class MinMaxSum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){
            {
                add(256741038);
                add(623958417);
                add(467905213);
                add(714532089);
                add(938071625);
            }
        };

        miniMaxSum(list);
    }
    
    public static void miniMaxSum(List<Integer> arr) {
        //since output can be greater than a 32-bit integer. int uses 32 and long uses 64
        long minSum = 0;
        long maxSum = 0;
        int size = arr.size();
        // sorts Lists so that lowerBound and upperBound are set
        Collections.sort(arr);
        for(int i = 0; i < size; i++){
            if(i == 0){
                minSum += arr.get(i);
            }else if(i == size - 1){
                maxSum += arr.get(i);
            }else{
                minSum += arr.get(i);
                maxSum += arr.get(i);
            }
        }

        System.out.println(minSum + " " + maxSum);
    }
    
}

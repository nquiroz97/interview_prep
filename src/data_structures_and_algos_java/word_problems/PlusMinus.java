package data_structures_and_algos_java.word_problems;

import java.util.ArrayList;
import java.util.List;

/*
   Given an array of integers, calculate the ratios of its elements that are positive, 
   negative, and zero. Print the decimal value of each fraction on a new line with 6 
   places after the decimal.
   
   Note: This challenge introduces precision problems. The test cases are scaled
   to six decimal places, though answers with absolute error of up to  are acceptable.
   
   Example: arr=[1,1,0,-1,-1]
   There are n = 5 elements, two positive, two negative and one zero. Their ratios are 2/5,  2/5 and 1/5. 
   Results are printed as:
    0.400000
    0.400000
    0.200000

    Function Description
    Complete the plusMinus function in the editor below.

    plusMinus has the following parameter(s):

    int arr[n]: an array of integers
    Print
    Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

Input Format

The first line contains an integer, , the size of the array.
The second line contains  space-separated integers that describe .

Constraints



Output Format

Print the following  lines, each to  decimals:

proportion of positive values
proportion of negative values
proportion of zeros

*/
public class PlusMinus {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(){
            {
                add(-4);
                add(3);
                add(-9);
                add(0);
                add(4);
                add(1);
            }
        };
        plusMinus(list);
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double posRatio = 0, negativeRatio = 0, zeroRatio = 0;
        double posCount = 0, negativeCount = 0, zeroCount = 0;
        int listSize = arr.size();
        
        for(int i = 0; i < listSize; i++){
            if(arr.get(i) > 0){
                posCount++;
            }else if(arr.get(i) < 0){
                negativeCount++;
            }else{
                zeroCount++;
            }
        }
        
        posRatio = posCount / listSize;
        negativeRatio = negativeCount / listSize;
        zeroRatio = zeroCount / listSize;
        
        System.out.println(String.format("%.6f", posRatio));
        System.out.println(String.format("%.6f", negativeRatio));
        System.out.println(String.format("%.6f", zeroRatio));
    }
    
}

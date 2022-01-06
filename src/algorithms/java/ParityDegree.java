package algorithms.java;

/* A positive integer N is given. The goal is to find the highest power of 2 that divides N. In other words, we have to find the maximum K for which N modulo 2^K is 0.

For example, given integer N = 24 the answer is 3, because 2^3 = 8 is the highest power of 2 that divides N.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the highest power of 2 that divides N.

For example, given integer N = 24, the function should return 3, as explained above.

Assume that:

N is an integer within the range [1..1,000,000,000]. */

public class ParityDegree {

    public static int solutionBrute(int n){
        int power = 0;

        //checks for even number, then will increment power
        //Space complexity: O(1) since no additional array/data struture is being created
        //Time complexity: O(logn) or O(n)?? since the iterations are incrementing based on n
        if(n % 2 == 0){
            while(n % Math.pow(2, power) == 0){
                power++;
            }
            return power - 1; 
        }
        return power;
    }

    //returns the product of 2 ^ power
    public static int solutionEfficient(int n){
        return (n & (~(n - 1)));
    }
    
}

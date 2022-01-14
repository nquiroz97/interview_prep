package data_structures_and_algos_java.word_problems;

import javax.naming.ldap.ManageReferralControl;

/* You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you 
climb to the top?



*/
public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }

    public static int climbStairs(int n){
        int prev1 = 1;
        int prev2 = 2;

        if(n == 0 || n == 1 || n == 2) return n;

        for (int i = 3; i <= n; i++) {
            int newValue = prev1 + prev2;
            prev1 = prev2;
            prev2 = newValue;
        }

        return prev2;
    }

    public static int climbStairsDP(int n){
        int[] numWays = new int[n + 1];
        numWays[0] = 1;
        numWays[1] = 1;

        for(int i = 2; i <= n; i++){
            //we can take two steps at most: one step before n or two steps before n
            numWays[i] = numWays[i - 1] + numWays[i - 2];
        }

        return numWays[n];
    }
    
}

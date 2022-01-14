package data_structures_and_algos_java.word_problems;

import java.util.List;

/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = 1 + 5 + 9 = 15. The right to left diagonal = 3 + 5 + 9. Their 
absolute difference is 15 - 17 = 2.

Function description

Complete the  function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers
Return

int: the absolute diagonal difference
Input Format

The first line contains a single integer, n, the number of rows and columns in the square matrix arr.
Each of the next n lines describes a row, arr[i], and consists of n space-separated integers 
arr[i][j].

Constraints
-100 <= arr[i][j] <= 100


*/

public class MatrixDiagonalDifference {
     /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftToRightSum = 0;
        int rightToLeftSum = 0;


        /* 2D array [row][column]
           Example: 1 2 3
                    4 5 6
                    9 8 9  
            [0][0] is 1, [0][2] is 3
        */
        for (int i = 0; i < arr.size(); i++) {
            leftToRightSum += arr.get(i).get(i);
            rightToLeftSum += arr.get(i).get(arr.size() - (1 + i));
        }
        
        return Math.abs(leftToRightSum - rightToLeftSum); 

    }
}

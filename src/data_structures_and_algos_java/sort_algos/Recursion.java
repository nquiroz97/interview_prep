package data_structures_and_algos_java.sort_algos;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(3));
    }

    //3! = 3 * 2 * 1 = 3 * 2!
    //4! = 4 * 3 * 2 * 1 = 4 * 3!

    //n! = n * (n - 1)!


    /* call stack:  
       recursiveFactorial(1) - pops off first: returns value 1
       ---------------------
       recursiveFactorial(2) - pops off second: returns value 2 * 1
       ---------------------
       recursiveFactorial(3) - pops off last: returns value 3 * 2

       ** take in mind using recursive functions may result in many more calls before it returns,
          which could lead to a ton of processing and blow the memory
          Java compiler does not perform tail recursion
    
     */
    public static int recursiveFactorial(int num){
        //base case to stop call stack
        if(num == 0){
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    //usually runs faster and does not use as much memory
    public static int iterativeFactorial(int num){
        if(num == 0){
            return 1;
        }
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }

        return factorial;
    }
    
}

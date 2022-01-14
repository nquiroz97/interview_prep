package data_structures_and_algos_java.word_problems;

import java.util.ArrayList;
import java.util.Collections;

public class Staircase {
    public static void main(String[] args) {
        staircaseClean(25);
    }

    public static void staircase(int n) {
        // Write your code here
        ArrayList<String> output = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            StringBuilder str = new StringBuilder();
            if(i < n){
                str.append(String.join("", Collections.nCopies(n - i, " ")));
            }
            str.append(String.join("", Collections.nCopies(i, "#")));
            output.add(str.toString());
        }

        output.forEach((str) -> System.out.println(str));

    }

    // Java 11+
    public static void staircaseClean(int n){
        for(int i = 1; i <= n; i++){
            StringBuilder str = new StringBuilder();
            if(i < n){
                str.append(String.valueOf(' ').repeat(n - i));
            }
            str.append(String.valueOf('#').repeat(i));

            System.out.println(str);
        }
    }
    
}

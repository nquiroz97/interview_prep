package algorithms.java;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordClass {

    public static String LongestWord(String string){
        String[] array = string.replaceAll("[^a-zA-Z0-9]", " ").split(" ");
        Arrays.sort(array, Comparator.comparingInt(String::length));
        if(array.length > 1){
            if(array.length == 2){
                    if(array[1].length() > array[0].length()){
                        return array[1];
                    }
            }else{
                for(int i = array.length - 1; i > 0; i--){
                    if(array[i].length() != array[i - 1].length()){
                        return array[i];
                    }
            
                }
            }
        }
        return array[0];
    }
    
}

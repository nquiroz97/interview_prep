package data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysClass {
    //4 items in array, 32 bit system has 4 octects(4 shelves)
    //4 * 4 = 16 bytes of storage

    public static void firstArrayMethod() {
        /*
          char[] strings = new char[] {'a', 'b', 'c', 'd'};
          an array's size cannot increase once it's intantiated, hence you cannot add/delete 
          elements from the array
        */  
    }

    //allows for modifying elements
    public static void arrayListMethod(){
        //initialize List using Stream, java 8 or higher
        List<String> list = Stream.of("a", "b", "c", "d").collect(Collectors.toList());

        //initialize ArrayList using .asList() method
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));

        //add element (defaults to end of list)
        arrayList.add("e"); //O(1) since not looping through anything 
        list.add("e"); //O(1) since not looping through anything

        //add element to specific index
        arrayList.add(0, "a"); //O(n)
        list.add(0, "a"); //O(n)

        //delete element
        arrayList.remove("a"); //O(1) since not looping through anything
        list.remove("a"); //O(1) since not looping through anything

        //delete element by index
        arrayList.remove(1); //O(n)
        list.remove(1); //O(n)

        System.out.println(arrayList);
        
    }
    
    
}

package algorithms;
public class StringSymmetryPoint {

    //time complexity: O(length + N)
    static public int symmetryPoint_Naive(String S){
        int length = S.length();
        if(length % 2 != 0 && length > 1){
            int middle = length/2;
            StringBuilder sbBuilder = new StringBuilder(S.substring(0, middle));
            if(S.substring(middle + 1, length).equals(sbBuilder.reverse().toString())){
                return middle;
            }
        }
        if(length == 1){
            return 0;
        }
        return - 1;

    }
    
}

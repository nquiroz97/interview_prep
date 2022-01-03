package algorithms.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidation {
    public static String CodelandUsernameValidation_Brute(String str) {
    int length = str.length();
    if(length >= 4 && length <= 25){
      if(Character.isAlphabetic(str.charAt(0))){
        if(str.charAt(length - 1) != '_' && str.charAt(0) != '_'){
            if(str.matches("[A-Za-z0-9_][_a-zA-Z0-9]*")){
                return "true";
            }
        }
      }
    }
    // code goes here  
    return "false";
  }

  public static String CodelandUsernameValidation_Efficient(String str) {
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
        Matcher matcher = p.matcher(str);
        return matcher.matches() ? "true" : "false";
    }

    public static int FirstFactorial(int num) {
        if (num >= 1)
            return num * FirstFactorial(num - 1);
        else
            return 1;
    }

}

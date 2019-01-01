package codingbat.com.String1;

public class lastChars {

//    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
//
//    lastChars("last", "chars") → "ls"
//    lastChars("yo", "java") → "ya"
//    lastChars("hi", "") → "h@"

    public String lastChars(String a, String b) {
        String aa = "";
        String bb = "";
        if (a.length()<1){
            aa = "@";
        } else {
            aa = a.substring(0,1);
        }
        if (b.length()<1){
            bb = "@";
        } else {
            bb = b.substring(b.length()-1,b.length());
        }
        return aa+bb;
    }


}

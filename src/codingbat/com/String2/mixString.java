package codingbat.com.String2;

public class mixString {

//    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
//
//    mixString("abc", "xyz") → "axbycz"
//    mixString("Hi", "There") → "HTihere"
//    mixString("xxxx", "There") → "xTxhxexre"

    public String mixString(String a, String b) {
        String word = "";
        for (int i = 0; i<a.length() && i<b.length(); i++){
            word = word + String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(i));
        }
        return (a.length()>b.length()) ? word+a.substring(b.length()) : word+b.substring(a.length());
    }

}

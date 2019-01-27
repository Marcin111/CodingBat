package codingbat.com.String2;

public class doubleChar {

//    Given a string, return a string where for every char in the original, there are two chars.
//
//    doubleChar("The") → "TThhee"
//    doubleChar("AAbb") → "AAAAbbbb"
//    doubleChar("Hi-There") → "HHii--TThheerree"

    public String doubleChar(String str) {
        String param = "";
        for (int i = 0; i<str.length(); i++){
            param = param+ String.valueOf(str.charAt(i))+ String.valueOf(str.charAt(i));
        }
        return param;
    }

}

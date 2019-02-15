package codingbat.com.String3;

public class sameEnds {

//    Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
//
//    sameEnds("abXYab") → "ab"
//    sameEnds("xx") → "x"
//    sameEnds("xxx") → "x"

    public String sameEnds(String string) {
        String word = "";
        for (int i  = 0; i<string.length()/2; i++){
            if (string. length()%2==0 && string.substring(0,string.length()/2-i).equals(string.substring(string.length()/2+i))){
                word = string.substring(0,string.length()/2-i);
                break;
            }
            if (string. length()%2!=0 && string.substring(0,string.length()/2-i).equals(string.substring(string.length()/2+i+1))){
                word = string.substring(0,string.length()/2-i);
                break;
            }
        }
        return word;
    }

}

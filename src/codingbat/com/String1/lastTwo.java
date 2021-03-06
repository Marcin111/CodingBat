package codingbat.com.String1;

public class lastTwo {

//    Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
//
//    lastTwo("coding") → "codign"
//    lastTwo("cat") → "cta"
//    lastTwo("ab") → "ba"

    public String lastTwo(String str) {
        if (str.length()>2){
            return str.substring(0,str.length()-2)+str.substring(str.length()-1,str.length())+str.substring(str.length()-2,str.length()-1);
        } else if (str.length()==2){
            return str.substring(1,2)+str.substring(0,1);
        } else {
            return str;
        }
    }

}

package codingbat.com.String2;

public class starOut {

//    Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
//
//    starOut("ab*cd") → "ad"
//    starOut("ab**cd") → "ad"
//    starOut("sm*eilly") → "silly"

    public String starOut(String str) {
        String word = "";
        if (!str.contains("*")){
            return str;
        }
        if(str.length()>2){
            if (str.charAt(0)!='*' && str.charAt(1)!='*'){
                word = word + String.valueOf(str.charAt(0));
            }
        }
        for (int i = 1; i<str.length()-1; i++){
            if (str.charAt(i)!='*' && str.charAt(i-1)!='*' && str.charAt(i+1)!='*'){
                word = word + String.valueOf(str.charAt(i));
            }
        }
        if(str.length()>2){
            if (str.charAt(str.length()-1)!='*' && str.charAt(str.length()-2)!='*'){
                word = word + String.valueOf(str.charAt(str.length()-1));
            }
        }
        return word;
    }

}

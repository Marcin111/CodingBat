package codingbat.com.Warmup2;

public class stringX {

//    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
//
//    stringX("xxHxix") → "xHix"
//    stringX("abxxxcd") → "abcd"
//    stringX("xabxxxcdx") → "xabcdx"

    public String stringX(String str) {
        String word = "";
        if (str.length()==0){
            return str;
        } else if (str.length()==1 && str.charAt(0)=='x'){
            return str;
        } else if (str.length()==2 && str.charAt(0)=='x' && str.charAt(1)=='x'){
            return str;
        } else if (!str.contains("x")){
            return str;
        } else if (str.length()>=3 && str.charAt(0)=='x' && str.charAt(str.length()-1)=='x'){
            for (int i = 1; i<str.length()-1; i++){
                if (str.charAt(i)!='x'){
                    word=word+str.charAt(i);
                }
            }
            return 'x'+word+'x';
        } else {
            for (int i = 0; i<str.length(); i++){
                if (str.charAt(i)!='x'){
                    word=word+str.charAt(i);
                }
            }
            return word;
        }
    }

}

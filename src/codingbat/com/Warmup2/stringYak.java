package codingbat.com.Warmup2;

public class stringYak {

//    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
//
//    stringYak("yakpak") → "pak"
//    stringYak("pakyak") → "pak"
//    stringYak("yak123ya") → "123ya"

    public String stringYak(String str) {
        String word = "";
        for (int i = 0; i<str.length(); i++){
            int end = i+3;
            if (end>str.length()){
                end  = str.length();
            }
            if (!str.substring(i,end).equals("yak")){
                word = word + str.charAt(i);
            }else{
                i=i+2;
            }
        }
        return word;

    }

}

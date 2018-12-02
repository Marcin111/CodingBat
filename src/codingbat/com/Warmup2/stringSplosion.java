package codingbat.com.Warmup2;

public class stringSplosion {

//    Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//    stringSplosion("Code") → "CCoCodCode"
//    stringSplosion("abc") → "aababc"
//    stringSplosion("ab") → "aab"

    public String stringSplosion(String str) {
        String word = "";
        for ( int i=0; i<str.length(); i++){
            word = word + str.substring(0,i+1);
        }
        return word;
    }


}

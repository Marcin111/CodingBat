package codingbat.com.Warmup2;

public class stringBits {

//    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//
//    stringBits("Hello") → "Hlo"
//    stringBits("Hi") → "H"
//    stringBits("Heeololeo") → "Hello"

    public String stringBits(String str) {
        String word = "";
        for ( int i = 0; i<str.length(); i = i+2){
            word = word + str.charAt(i);
        }
        return word;
    }


}

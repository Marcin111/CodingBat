package codingbat.com.String2;

public class repeatEnd {

//    Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
//
//    repeatEnd("Hello", 3) → "llollollo"
//    repeatEnd("Hello", 2) → "lolo"
//    repeatEnd("Hello", 1) → "o"

    public String repeatEnd(String str, int n) {
        String word = "";
        for (int i = 1; i<=n; i++){
            word = word + str.substring(str.length()-n);
        }
        return word;
    }

}

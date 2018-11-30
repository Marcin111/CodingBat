package codingbat.com.Warmup2;

public class stringTimes {

//    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
//    stringTimes("Hi", 2) → "HiHi"
//    stringTimes("Hi", 3) → "HiHiHi"
//    stringTimes("Hi", 1) → "Hi"

    public String stringTimes(String str, int n) {
        String word = "";
        for (int i=0;i<n;i++){
            word=word+str;
        }
        return word;
    }

}

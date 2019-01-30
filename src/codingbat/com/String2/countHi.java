package codingbat.com.String2;

public class countHi {

//    Return the number of times that the string "hi" appears anywhere in the given string.
//
//    countHi("abc hi ho") → 1
//    countHi("ABChi hi") → 2
//    countHi("hihi") → 2

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i+1<str.length(); i++){
            if(str.substring(i,i+2).equals("hi")){
                count=count+1;
            }
        }
        return count;
    }

}

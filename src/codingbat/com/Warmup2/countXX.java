package codingbat.com.Warmup2;

public class countXX {

//    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
//    countXX("abcxx") → 1
//    countXX("xxx") → 2
//    countXX("xxxx") → 3

    int countXX(String str) {
        int count = 0;
        String xx = "xx";
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)=='x'){
                count = count+1;
            }
        }
        if (count%2==0){
            return count/2;
        } else {
            return (count/2)+1;
        }

    }

}

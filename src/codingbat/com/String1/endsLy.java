package codingbat.com.String1;

public class endsLy {

//    Given a string, return true if it ends in "ly".
//
//    endsLy("oddly") → true
//    endsLy("y") → false
//    endsLy("oddy") → false

    public boolean endsLy(String str) {
        if(str.endsWith("ly")){
            return true;
        } else {
            return false;
        }
    }

}

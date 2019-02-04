package codingbat.com.String2;

public class xyzMiddle {

//    Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
//
//    xyzMiddle("AAxyzBB") → true
//    xyzMiddle("AxyzBB") → true
//    xyzMiddle("AxyzBBB") → false

    public boolean xyzMiddle(String str) {
        if (str.length()<3){
            return false;
        }
        int middle = str.length()/2;
        return (str.substring(middle-1,middle+2).equals("xyz")) ||
                (str.substring(middle-2,middle+1).equals("xyz") && str.length()%2==0);
    }

}

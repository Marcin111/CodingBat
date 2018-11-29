package codingbat.com.Warmup1;

public class in3050 {

//    Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
//
//    in3050(30, 31) → true
//    in3050(30, 41) → false
//    in3050(40, 50) → true

    public boolean in3050(int a, int b) {
        if (40>=a && a>=30 && 40>=b && b>=30){
            return true;
        }

        if (50>=a && a>=40 && 50>=b && b>=40){
            return true;
        }
        return false;
    }


}

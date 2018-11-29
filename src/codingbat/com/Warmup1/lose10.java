package codingbat.com.Warmup1;

public class lose10 {

//    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
//
//    close10(8, 13) → 8
//    close10(13, 8) → 8
//    close10(13, 7) → 0

    public int close10(int a, int b) {
        int a10 = Math.abs(a-10);
        int b10 = Math.abs(b-10);

        if (a10<b10){
            return a;
        } else if (a10==b10){
            return 0;
        } else {
            return b;
        }

    }

}
